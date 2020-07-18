# spring-boot-with-https
Spring boot application with https

To generate the keystore go to bin directory of jdk/jre and fire up following command

keytool -keystore mykeys.jks -genkey -alias tomcat -keyalg RSA

Open the CMD in administrator mode, if any permission error occurs.

This will create mykeys.jks file in the bin directory.
After running this cmd, It will ask for some information like firstname, lastname, organization name etc. most of which are irrelevant questions.
But when asked for a password , be sure to remember what you choose.

Then open application.properties and fill up the details

server.port=8443
server.ssl.key-store=<location_to_mykeys.jks_file>
server.ssl.key-store-password=<password>
server.ssl.key-password=<password>
  
  
Start the server and navigate securely to:
https://localhost:8443

Depending on the browser you are using ,you may encounter a warning about the server not being able to verify its identity.
This is nothing to worrry about when serving from localhost during developement.


To login to the application, use 
username: user
password: password 

You can set the user/password in WebSecurityConfig.java file
