package model;

public class Person {
    public double height = 1.70, weight = 70.0;
    public String gender = "N", name = "John Doe";
    public int age = 45;
    public int instanceCounter = 0;


    public Person(){
        instanceCounter++;
    }

    public Person(String name, int age){
        setName(name);
        setAge(age);
        instanceCounter++;
    }

    /**
     * Creates an instance of the Person class.
     * A Person can be created with the following parameters:
     * @param name
     * @param age : age higher than 0
     * @param height : in meters
     * @param weight : in kilograms
     * @param gender
     */
    public Person(String name, int age, double height, double weight, String gender){
        setHeight(height);
        setWeight(weight);
        setGender(gender);
        setName(name);
        setAge(age);
        instanceCounter++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Calculates the BMI of a Person.
     * The formula is: weight / (height * height)
     * @return BMI
     */
    public double calculateBMI(){
        double bmi = weight/(height * height);
        return bmi;
    }

    /**
     * Calculates the difference in age between this Person and another Persons age given as a parameter.
     * The formula is: Age of this Person - given age
     * @param age : age of the other Person
     * @return integer : ageDifference
     */
    public int calculateAgeDifference(int age){
        int ageDifference = this.age - age;
        return ageDifference;
    }

    /**
     * Checks if the Person is healthy.
     * A Person is healthy if the BMI is {@link ObesityDegree#SAUDAVEL}.
     * @return boolean : isHealthy
     */
    public boolean isHealthy() {
        boolean isHealthy = false;
        double bmi = calculateBMI();
        if (ObesityDegree.classifyBMI(bmi).equals(ObesityDegree.SAUDAVEL)) {
            isHealthy = true;
        }
        return isHealthy;
    }

    /**
     * Checks if the age of the given Person is younger than the age of this Person.
     * @param age : age of the given Person
     * @return String : isYounger description
     */
    public String isYounger(int age){
        String isYounger = "You are younger than " + this.name;
        if (calculateAgeDifference(age) < 0) {
            isYounger = "You are older than " + this.name;
        } else if (calculateAgeDifference(age) == 0) {
            isYounger = "You are the same age as " + this.name;
        }
        return isYounger;
    }


    /**
     * Returns a string of the Person's attributes
     * No method results of the class are returned.
     */
    @Override
    public String toString() {
        return "A comprehensive overview of this Person:" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nGender:" + gender +
                "\nHeight: " + height +
                "\nWeight: " + weight + "\n";
    }
}
