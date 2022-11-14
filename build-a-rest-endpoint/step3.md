# Checking your work: Unit Testing

We're going to make a change to the software. 

But before we do that, let's get some confidence that the software works as is, as it stands now.

There are some unit tests, which we've been ignoring. But they're broken, and we need to fix them first.

    1. Start by having a read of the test code, and see if it makes any sense:
`test/java/tutorial/rest/resources/CatResourceTest.java`{{open}}

What does this do, exactly?
    
    @Test
    void itShouldReturnSomeCats() {
        ResponseEntity<List<Cat>> cats = catResource.getCats();
        assertEquals(5, cats.getBody().size());
    }


    2. Build the software, this time without skipping the tests. 

Stop the server running first.
`^C`{{execute ctrl-seq}}

`mvn install`{{execute}}

You'll see a bunch of errors in the terminal window.

They look something like this:

    [ERROR] Tests run: 5, Failures: 4, Errors: 0, Skipped: 0


    3. Look at the errors in the terminal. Do you understand what they mean?

For example:

    [ERROR] itShouldReturnSomeCatsWithSomeNamesPopulated  Time elapsed: 0.176 s  <<< FAILURE!
    org.opentest4j.AssertionFailedError: expected: <Luna> but was: <Oliver>


    4. Have a look at the test code 

See if you can work out why the tests are failing:
`test/java/tutorial/rest/resources/CatResourceTest.java`{{open}}
`main/java/tutorial/rest/resources/CatResource.java`{{open}}


    5. We've been told that CatResource.java is returning the correct results, so we need to make the test code (CatResourceTest.java) pass.

After every change you make, feel free to repeat step 1., above, to rebuild the code and rerun the tests.

You should see the number of test errors and failures reduce to zero.

