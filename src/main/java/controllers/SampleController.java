package controllers;

import services.SampleService;

/*
    Layer #1: Data Presentation
*/
public class SampleController {

    private SampleService sampleService;
    /*
      Dependency injection pattern, see:
      https://www.vogella.com/tutorials/DependencyInjection/article.html#:~:text=Dependency%20injection%20(DI)%20is%20the,an%20instance%20of%20this%20class
      In short, dependency injection is a pattern which is used in order to simplify management of state/dependencies
      In this case, "SampleService" is being injected into "SampleController" as a dependency, and "SampleController"
      manages state of the "SampleService".
    */
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    public void displayUsersWithLongUsernames() {
        // 1. Get users with long usernames
        String someDataFromDatabase = sampleService.getUsersWithLongUsername();
        // 2. Display the list of users in console
        System.out.println("Displaying data from database: " + someDataFromDatabase);
    }
}
