package ru.geekbrains.main.observer;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 120000, JobType.FULL_TIME);
        Company yandex = new Company(jobAgency, "Yandex", 95000, JobType.PART_TIME);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000, JobType.FREELANCE);

        Student student = new Student("Petrov");
        Student student2 = new Student("Alexey");
        Master master = new Master("Ivanov");
        Master master2 = new Master("Sidorov");
        Professional professional = new Professional("Nikita");

        jobAgency.registerObserver(student);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(master);
        jobAgency.registerObserver(master2);
        jobAgency.registerVacancyObserver(professional);

        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

        jobAgency.removeObserver(master);
        jobAgency.removeVacancyObserver(professional);
    }
}
