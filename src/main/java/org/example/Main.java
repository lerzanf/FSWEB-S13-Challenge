package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Plan selectedPlan = Plan.BASIC;

        HealthPlan healthplan = new HealthPlan(1,"Health First", selectedPlan);
        System.out.println(healthplan);

        String[] devs = new String[3];
        Company company = new Company(101, "Company", 50000, devs);

    }
}