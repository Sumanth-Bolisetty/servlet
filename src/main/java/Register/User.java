package Register;

import java.sql.Date;

public class User
{
	String name;
	String email;
	String username;
	String password;
	long mobile;
	Date dob;
	String gender;
	String address;
	
	public String getName()	{	return name;	}
	public void setName(String name)	{	this.name=name;	}
	
	public String getEmail()	{	return email;	}
	public void setEmail(String email)	{	this.email=email;	}
	
	public String getUsername()	{	return username;	}
	public void setUsername(String username)	{	this.username=username;	}
	
	public String getPassword()	{	return password;	}
	public void setPassword(String password)	{	this.password=password;	}
	
	public long getMobile()	{	return mobile;	}
	public void setMobile(long mobile)	{	this.mobile=mobile;	}
	
	public Date getDOB()	{	return dob;	}
	public void setDOB(Date dob)	{	this.dob=dob;	}
	
	public String getGender()	{	return gender;	}
	public void setGender(String gender)	{	this.gender=gender;	}
	
	public String getAddress()	{	return address;	}
	public void setAddress(String address)	{	this.address=address;	}

}