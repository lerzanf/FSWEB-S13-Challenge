package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGiro(){
        return giro;
    }

    public String[] getDeveloperNames(){
        return developerNames;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGiro(double giro){
        this.giro = (giro < 0) ? 0 : giro;
    }

    public void setDeveloperNames(String[] developerNames){
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("Index " + index + " is already occupied by " + developerNames[index]);
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
