package ru.geekbrains.main.observer;

public interface Observer {
    void receiveOffer(String nameCompany, int salary, JobType jobType);
}
