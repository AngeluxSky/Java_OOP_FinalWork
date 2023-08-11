package ru.geekbrains.main.observer;
public class Master implements Observer {

    private String name;
    int salary = 80000;
    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, JobType jobType) {
        if (this.salary <= salary){
            System.out.printf("Master %s: Мне нужна эта работа! (company: %s; salary: %d)\n", name,
                    nameCompany, salary, jobType);
            this.salary = salary;
        }
        else {
            System.out.printf("Master %s: Я найду работу получше! (company: %s; salary: %d)\n", name,
                    nameCompany, salary, jobType);
        }
    }
}
