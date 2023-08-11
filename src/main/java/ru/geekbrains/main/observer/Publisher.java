package ru.geekbrains.main.observer;

public interface Publisher {

    void sendOffer(String companyName, int salary, JobType jobType);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void registerVacancyObserver(VacancyObserver observer);

    void removeVacancyObserver(VacancyObserver observer);


}
