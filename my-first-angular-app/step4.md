# Getting more information about cats

Now we have a solid, *tested* API, let's change it.

Let's add some more additional information about cats.


    1. Open Cat.java

Add a new field to the Cat. Call it "dislikes".

`main/java/tutorial/rest/domain/Cat.java`{{open}}

<pre class="file" data-filename="domain/Cat.java" data-target="insert" data-marker="//TODO-insert">
private String dislikes;
</pre>

    2. Populate the new field with some data. You'll need to open and change CatResource.java

`main/java/tutorial/rest/resources/CatResource.java`{{open}}

Add a new value for dislikes for each Cat in the List.

    3. Stop the software
Press <kbd>Ctrl</kbd>+<kbd>C</kbd> on the keyboard. Or just click this:

`^C`{{execute ctrl-seq}}

    4. Rebuild the software:

`mvn install`{{execute}}

    5. Fix the compilation failures!

    6. Fix and extend the tests!

    7. Run the software:

`mvn spring-boot:run`{{execute}}

    8. Test the software by opening this webpage:

{{TRAFFIC_HOST1_8080}}/cats

    9. You can see the new "dislikes" field in the JSON response.