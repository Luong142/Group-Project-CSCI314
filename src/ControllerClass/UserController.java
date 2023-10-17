package ControllerClass;

import Model.Login;

public class UserController {
    private Login logInModel;

    public UserController() {
        // Initialize the userAccount (data access layer)
        // userAccount = new userAccount();
    }

    /*
    public void createUser(UserAccount user) {
        // Validate user data
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username is required.");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password is required.");
        }

        // Check if the username already exists
        if (userAccount.exists(user.getUsername())) {
            throw new IllegalArgumentException("Username already exists.");
        }

        // Save the user in the database
        userAccount.save(user);
    }

    public UserAccount readUser(String username) {
        // Retrieve the user from the database
        return userAccount.findByUsername(username);
    }

    public void updateUser(User user) {
        // Validate user data
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username is required.");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password is required.");
        }

        // Check if the user exists
        if (!userAccount.exists(user.getUsername())) {
            throw new IllegalArgumentException("User does not exist.");
        }

        // Update the user in the database
        userAccount.update(user);
    }

    public void deleteUser(User user) {
        // Check if the user exists
        if (!userAccount.exists(user.getUsername())) {
            throw new IllegalArgumentException("User does not exist.");
        }

        // Delete the user from the database
        userAccount.delete(user);
    }



     */
}
