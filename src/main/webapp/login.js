function validateForm()
{
	var un=(document.getElementsByName("uname"))[0];
	var pw=(document.getElementsByName("passw"))[0];
	var unamec=/^[a-zA-Z0-9]{6,}$/;
	var passwc=/^[a-zA-Z0-9@#$%^*?!]{8,}$/;	

	if(!un.value.match(unamec))
	{
		alert("Enter Valid UserName");
		return false;
	}
	if(!pw.value.match(passwc))
	{
		alert("Password should be atleast 8 characters and should contain only Alphabets, Digits and Special Characters.");
		return false;
	}
}