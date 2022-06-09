package Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    LoginDao loginDao;   
    public LoginServlet()
    {
        super();
        loginDao=new LoginDao();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("uname");
		String password = request.getParameter("passw");
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		if(loginDao.validateUser(login))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("SuccessLogin.html");
			dispatcher.forward(request, response);
		}
		else
		{
			PrintWriter p=response.getWriter();
			p.println("<p>Invalid Username/Password</p>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.forward(request, response);
		}
	}
}