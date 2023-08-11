package ru.geekbrains.main.observer;
import java.util.ArrayList;
import java.util.List;
public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();
    List<VacancyObserver> vacancyObservers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary, JobType jobType) {
        for (Observer observer : observers) {
            observer.receiveOffer(companyName, salary, jobType);
        }
        for (VacancyObserver observer : vacancyObservers) {
            observer.updateVacancy(companyName, salary, jobType);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void registerVacancyObserver(VacancyObserver observer) {
        vacancyObservers.add(observer);
    }

    @Override
    public void removeVacancyObserver(VacancyObserver observer) {
        vacancyObservers.remove(observer);
    }
}

enum JobType {
    FULL_TIME,
    PART_TIME,
    FREELANCE
}


