package ResetPassword;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResetPasswordServlet")
public class ResetPasswordServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private ResetDao resetDao;
	
    public ResetPasswordServlet()
    {
        super();
    	resetDao=new ResetDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
		String username=request.getParameter("uname");
		String password=request.getParameter("passw");
		ResetPassword resetPassword=new ResetPassword();
		resetPassword.setUsername(username);
		resetPassword.setPassword(password);
		
		if(resetDao.reset(resetPassword))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.forward(request, response);
		}
		else
		{
			PrintWriter p=response.getWriter();
			p.println("<p>Invalid User</p>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("resetpassword.html");
			dispatcher.forward(request, response);
		}
	}

}
