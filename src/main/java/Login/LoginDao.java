package Login;

import java.sql.*;
import Database.DBController;

public class LoginDao
{
	public boolean validateUser(Login login)
	{
		boolean status=false;
		Connection con=null;
		PreparedStatement ps;
		try
		{
			con=DBController.getDBConnection();
			ps = con.prepareStatement("SELECT * FROM BOOKSTORE WHERE USERNAME=? AND PASSWORD=?");
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());
			
			ResultSet rs=ps.executeQuery();
			
			status=rs.next();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}		
		return status;
	}
}