package ResetPassword;

import java.sql.*;
import Database.DBController;

public class ResetDao
{
	public boolean reset(ResetPassword resetPassword)
	{
		boolean status=false;
		Connection con=DBController.getDBConnection();
		PreparedStatement ps;
		int x = 0;
		try
		{
			ps = con.prepareStatement("UPDATE BOOKSTORE SET PASSWORD=? WHERE USERNAME=?");
			ps.setString(2, resetPassword.getUsername());
			ps.setString(1, resetPassword.getPassword());
			x=ps.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		if(x>0)
			status=true;
		else
			status=false;
		return status;
	}
}