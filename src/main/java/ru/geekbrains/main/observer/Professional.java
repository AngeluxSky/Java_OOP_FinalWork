package ru.geekbrains.main.observer;

class Professional implements VacancyObserver {
    private String name;

    public Professional(String name) {
        this.name = name;
    }

    @Override
    public void updateVacancy(String nameCompany, int salary, JobType jobType) {
        System.out.printf("Professional %s: Рассмотрю предложение! (company: %s; salary: %d)\n", name,
                nameCompany, salary, jobType);
    }
}