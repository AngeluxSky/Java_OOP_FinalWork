package ru.geekbrains.main.observer;

interface VacancyObserver {
    void updateVacancy(String nameCompany, int salary, JobType jobType);
}