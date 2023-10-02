package ui;

import model.ObesityDegree;
import model.Person;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is the main class of the Gym Users application.
 * It contains the main method which starts the application.
 * For now it also contains very basic methods to test the Person class.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Gym users!");

        // a) & b)
        ArrayList<Person> gymUsers = new ArrayList<>();
        gymUsers.add(new Person("John Doe", 45));
        gymUsers.add(new Person("Jane Doe", 40, 1.60, 60.0, "F"));
        gymUsers.add(new Person("John Smith", 30, 1.80, 80.0, "M"));
        gymUsers.add(new Person("Jane Smith", 25, 1.40, 80, "F"));

        // c)
        ArrayList<String> descriptions = new ArrayList<>();
        for (Person gymUser : gymUsers) {
            descriptions.add(gymUser.toString());
        }

        System.out.println(descriptions);

        ArrayList<String> descriptions2 = new ArrayList<>();
        for (Person gymUser : gymUsers) {
            descriptions2.add(gymUser.toString()
                + "\n" + gymUser.calculateBMI()
                + "\n" + ObesityDegree.classifyBMI(gymUser.calculateBMI())
            );
        }

        System.out.println(descriptions2);

        ArrayList<String> descriptions3 = new ArrayList<>();
        for (Person gymUser : gymUsers) {
            if(!gymUser.isHealthy()){
                descriptions3.add(gymUser.getName()
                    + "\n" + ObesityDegree.classifyBMI(gymUser.calculateBMI())
                );
            }
        }

        System.out.println(descriptions3);

        // d)
        // I am not sure how to do this :(

        // e)
        gymUsers.get(0).setAge(gymUsers.get(1).getAge());

        // f)
        System.out.println("You are user: " + gymUsers.get(1).getName());
        System.out.println(gymUsers.get(0).isYounger(gymUsers.get(1).getAge()));

        // g)
        for (Person gymUser : gymUsers) {
            if(gymUser.getName().equals("John Doe")){
                System.out.println(gymUser.toString());
            }
        }

        //h
    }
}