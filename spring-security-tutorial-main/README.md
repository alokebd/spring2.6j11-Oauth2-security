# spring-security-tutorial
For Windows user - add new information in host file 
1. Press the Windows key.
2. Type Notepad in the search field.
3. In the search results, right-click Notepad and select Run as. administrator.
4. From Notepad, open the following file: c:\Windows\System32\Drivers\etc\hosts.

127.0.0.1 auth-server



#Open Browser and test
1. http://localhost:8080/api/hello  
a) Open in browser cognito mode
b) It redirects to log in page http://auth-server:9000/login 
c) user as email and password as created
d) when Whitelabel Error Page comes fire the url (http://127.0.0.1:8080/api/hello) again
e) Return response to browser

2. http://127.0.0.1:8080/api/users  --> resource authorization (accept the client verification on the browser)
a). login by user emial and password 
b). Accept client consent
c). Return repose to browser

#Open Postman and test
1. POST: http://localhost:8080/register

NOTE: After user creating, go to log file and collect the url for varification.
Example - http://localhost:8080/verifyRegistration?token=3fb1f455-aa3f-40b0-bc72-8b2143a27905


2. GET: http://localhost:8080/resendVerifyToken?token=afe114ea-dda0-48c7-8625-6123fac0a985
NOTE: If user was not veryfied (check user table with enable 0 value), then collect
the token from log, and used in postman 

3. GET: http://localhost:8080/resendVerifyToken?token=<token> 
NOTE: As shared in the response or applicaiton log


4. POST: http://localhost:8080/resetPassword (pass user model)
NOTE: user model in post man raw body 
{
"email":"june@gmail.com",
"oldPassword":"Pwd1",
"newPasswordl":"Pwd1"
}

5. http://localhost:8080/savePassword?token=<token> (pass token and user model)
NOTE: user model in post man raw body 
{
"email":"june@gmail.com",
"oldPassword":"Pwd1",
"newPasswordl":"Pwd1"
}

6. http://localhost:8080/changePassword (pass user model)
NOTE: user model in post man raw body 
{
"email":"june@gmail.com",
"oldPassword":"Pwd1",
"newPasswordl":"Pwd1"
}