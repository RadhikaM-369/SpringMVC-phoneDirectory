<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Home page</h1>
<span style="color : red;"> ${message}</span>

	<form action="click.do" method="post">
	
		<div><label>Name </label> <input type="text" name="name" /></div>
		<div><label>Mobile.No </label> <input type="text" name="mobile" /></div>
		<div><label>Address </label> 
		<textarea name="address" id="" cols="10" rows="10" maxlength="50"></textarea></div>		
		<div><label>Landmark </label> <input type="text" name="landmark" /></div>
		<div><label>LandlineNo </label> <input type="text" name="landlineNo" /></div>
		<div><label>City</label> 		
		<select name="city" id="city">
                <option value="">-SELECT-</option>
                <option value="BELGAUM">BELGAUM</option>
                <option value="BANGALORE">BANGALORE</option>
       </select>
		</div>
		<div><label>PIN code</label> 		
		<select name="pincode" id="pincode">
                <option value="">-Select-</option>
                <option value="590001">590001</option>
                <option value="560001">560001</option>
        </select>
		</div>
		
		<input type="submit" value="ADD CONTACT" />
		</form>
</body>
</html>