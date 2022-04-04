package main;

import controllers.SampleController;
import repositories.SampleRepository;
import services.SampleService;

// Main class containing main method, i.e. start of a Java application
public class App {
    public static void main( String... args ) {
        // 1. Creating Repository object to retrieve and handle data
        SampleRepository repository = new SampleRepository();
        // 2. Creating Service object to handle business logic
        SampleService service = new SampleService(repository);
        // 3. Creating Controller object to handle user input
        SampleController controller = new SampleController(service);

        // Displaying users from a database
        controller.displayUsersWithLongUsernames();
    }
}
