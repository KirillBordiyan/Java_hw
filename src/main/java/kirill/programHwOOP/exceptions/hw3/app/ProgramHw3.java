package kirill.programHwOOP.exceptions.hw3.app;

import kirill.programHwOOP.exceptions.hw3.controller.DBController;

public class ProgramHw3 {
    public static void main(String[] args) {
        DBController db = new DBController();
        db.start();
    }
}
