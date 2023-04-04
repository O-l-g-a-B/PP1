package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Ольга", "Ольгова", (byte) 20);
        userService.saveUser("Юлия", "Юрьева", (byte) 35);
        userService.saveUser("Борис", "Борисов", (byte) 40);
        userService.saveUser("Максим", "Максимов", (byte) 41);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
