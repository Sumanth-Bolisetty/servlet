package Register;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	UserDao userDao;
	
	public RegisterServlet()
	{
        super();
        userDao=new UserDao();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("fullname");
		String mail=request.getParameter("mail");
		String username=request.getParameter("username");
		String password=request.getParameter("passw");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		Date dob=Date.valueOf(request.getParameter("dob"));
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		
		User user=new User();
		user.setName(name);
		user.setEmail(mail);
		user.setUsername(username);
		user.setPassword(password);
		user.setMobile(mobile);
		user.setDOB(dob);
		user.setGender(gender);
		user.setAddress(address);
		
		if(userDao.register(user))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.forward(request, response);
		}
	}

}
