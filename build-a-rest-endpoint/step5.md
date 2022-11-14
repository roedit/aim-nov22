# Logging in to the Cat app

    1. Build the software, and run the tests:

`mvn install`{{execute}}


    2. Run the software:

`mvn spring-boot:run`{{execute}}


    3. Test the software:

* Send a correct password {{TRAFFIC_HOST1_8080}}/user/authenticate?email=bob&password=passw0rd
* Send an incorrect password {{TRAFFIC_HOST1_8080}}/user/authenticate?email=bob&password=wrong


    4. Test via the "dummy" frontend:

Open {{TRAFFIC_HOST1_8080}}/


    5. Now change the software - e.g. add other user accounts so more people can log in.

`main/java/tutorial/rest/resources/UserResource.java`{{open}}


    6. Stop the software
Press <kbd>Ctrl</kbd>+<kbd>C</kbd> on the keyboard. Or just click this:

`^C`{{execute ctrl-seq}}


    7. And restart it:

`mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dspring.profiles.active=local"`{{execute}}

    8. Test you can log in with the login details of the users you just added

Open {{TRAFFIC_HOST1_8080}}/