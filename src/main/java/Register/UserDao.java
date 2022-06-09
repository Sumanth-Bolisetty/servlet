package Register;

import java.sql.*;

import Database.DBController;

public class UserDao
{
	public boolean register(User user)
	{
		boolean status=false;
		Connection con=null;
		PreparedStatement ps;
		try
		{
			con=DBController.getDBConnection();
			ps=con.prepareStatement("INSERT INTO BOOKSTORE VALUES(?,?,?,?,?,?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getUsername());
			ps.setString(4, user.getPassword());
			ps.setLong(5, user.getMobile());
			ps.setDate(6, user.getDOB());
			ps.setString(7, user.getGender());
			ps.setString(8, user.getAddress());
			int x=ps.executeUpdate();
			if(x>0)
				status=true;
			else
				status=false;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return status;
	}
}