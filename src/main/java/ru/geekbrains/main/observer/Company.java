package ru.geekbrains.main.observer;
import java.util.Random;
public class Company {

    private Random random = new Random();

    Publisher jobAgency;

    private String name;

    private int maxSalary;

    private JobType jobType;


    public Company(Publisher jobAgency, String name, int maxSalary, JobType jobType) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobType = jobType;
    }
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, jobType);
    }
}
