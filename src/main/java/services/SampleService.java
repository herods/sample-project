package services;

import java.util.List;

import repositories.SampleRepository;
import models.User;
/*
    Layer #2: Business Logic
*/
public class SampleService {
    private SampleRepository sampleRepository;
    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public String getUsersWithLongUsername() {
        // 1. Get all users
        List<User> users = sampleRepository.getUsers();
        // 2. Filter only those users that have username length bigger than 5 characters
        users.stream().filter(user -> user.username.length() > 5);
        // 3. Convert the result to string representation and return it
        return users.toString();
    }
}
