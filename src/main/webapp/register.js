function validateForm()
{
	var uname=(document.getElementsByName("username"))[0];
	var passw=(document.getElementsByName("passw"))[0];
	var cpassw=(document.getElementsByName("cpassw"))[0];
	var mail=(document.getElementsByName("mail"))[0];
	var mobile=(document.getElementsByName("mobile"))[0];
	
	var mailc=/^[a-zA-Z0-9]{6,}@[a-zA-Z]{4,}.com$/
	if(!mail.value.match(mailc))
	{
		alert("Email must be in the form xxxxxx@xxxx.com");
		return false;
	}

	var unamec=/^[a-zA-Z0-9]{6,}$/;
	if(!uname.value.match(unamec))
	{
		alert("Enter Valid Username");
		return false;
	}

	var passwc=/^[a-zA-Z0-9@#$%^*?!]{8,}$/;	
	if(!passw.value.match(passwc))
	{
		alert("Password should be atleast 8 characters and should contain only Alphabets, Digits and Special Characters.");
		return false;
	}

	if(passw.value!=cpassw.value)
	{
		alert("Password and Confirm Password fields must be Same.");
		return false;
	}
	
	var mobilec=/^[6-9][0-9]{9,}$/;
	if(!mobile.value.match(mobilec))
	{
		alert("Mobile must be of 10 digits and should start with 6 to 9");
		return false;
	}

	alert("Registered Successfully!! Login");
}