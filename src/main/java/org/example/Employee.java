package org.example;

public class Employee {
    private final long id;
    private final String name;
    private String phoneNumber;
    private int experienceAge;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperienceAge() {
        return experienceAge;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Employee(long id, String name, int experienceAge, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.experienceAge = experienceAge;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\n" + "id = " + id +
                ", name = " + name +
                ", phoneNumber = " + phoneNumber +
                ", experienceAge = " + experienceAge
                ;
    }
}
