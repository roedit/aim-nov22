This tutorial contains source code for a working REST API endpoint to retrieve data about cats for the Cats4Life website.

In the terminal type the following commands as you go through the steps. You can also just click the *black areas* and the corresponding commands will be run in the Terminal window to the right.

Follow the steps below to build and run the sofware.


    1. Build the software

This might take a minute or so, as it downloads lots of software libraries we're using in the tutorial:

`mvn clean install -DskipTests`{{execute}}


    2. Run the software

Again, this will take a few seconds.

`mvn spring-boot:run`{{execute}}

It will be ready to take requests once you see a line that looks similar to this:

    Started Main in 2.117 seconds (JVM running for 2.475)


    3. Test the software

Do this by opening the following webpage:

{{TRAFFIC_HOST1_8080}}/cats


    4. Have a look at where this data is coming from in the code. Use the file explorer in the editor to navigate to this file:

`assets/src/main/java/tutorial/rest/resources/CatResource.java`
