package org.example;

import com.github.javafaker.Faker;
import org.example.classes.company.Company;
import org.example.classes.employee.Employee;
import org.example.classes.employee.EmployeePosition;
import org.example.classes.project.Project;
import org.example.classes.project.ProjectStatus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Scanner scanner = new Scanner(System.in);

        Project project1 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project2 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project3 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project4 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project5 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project6 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project7 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project8 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project9 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project10 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project11 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project12 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project13 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project14 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project15 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project16 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project17 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project18 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project19 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));
        Project project20 = new Project(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), faker.date().birthday(), faker.date().birthday(), faker.number().numberBetween(1000, 99999), faker.number().numberBetween(50, 150), ProjectStatus.IN_PROGRESS, faker.number().numberBetween(1, 200));

        Employee employee1 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee2 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee3 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee4 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee5 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee6 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee7 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee8 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee9 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);
        Employee employee10 = new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV);

        Company company1 = new Company(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), (int) faker.number().randomNumber(10, true), faker.name().fullName());
        Company company2 = new Company(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), (int) faker.number().randomNumber(10, true), faker.name().fullName());
        Company company3 = new Company(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), (int) faker.number().randomNumber(10, true), faker.name().fullName());
        Company company4 = new Company(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), (int) faker.number().randomNumber(10, true), faker.name().fullName());
        Company company5 = new Company(faker.number().numberBetween(1, 200), faker.name().nameWithMiddle(), (int) faker.number().randomNumber(10, true), faker.name().fullName());

        List<Project> projectList = new ArrayList<>();
        projectList.add(project1);
        projectList.add(project2);
        projectList.add(project3);
        projectList.add(project4);
        projectList.add(project5);
        projectList.add(project6);
        projectList.add(project7);
        projectList.add(project8);
        projectList.add(project9);
        projectList.add(project10);
        projectList.add(project11);
        projectList.add(project12);
        projectList.add(project13);
        projectList.add(project14);
        projectList.add(project15);
        projectList.add(project16);
        projectList.add(project17);
        projectList.add(project18);
        projectList.add(project19);
        projectList.add(project20);

        List<Company> companyList = new ArrayList<>();
        companyList.add(company1);
        companyList.add(company2);
        companyList.add(company3);
        companyList.add(company4);
        companyList.add(company5);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);

        while (true) {
            System.out.println("Co chcesz zrobic? ");
            System.out.println("a) Wyswietl pracownikow ");
            System.out.println("b) Wyswietl lsite projektow ");
            System.out.println("c) Wyswietl liste firm ");
            System.out.println("d) Dodowanie uyztkownika ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a': {
                    for (Employee e : employeeList) {
                        System.out.println(e.getId() + " | " + e.getFirstName() + " | " + e.getLastName() + " | " + e.getPesel() + " | " + e.getPhoneNumer() + " | " + e.getEmail() + " | " + e.getPosition());
                    }
                    System.out.println();
                    break;
                }
                case 'b': {
                    for (Project p : projectList) {
                        System.out.println(p.getId() + " | " + p.getProjectName() + " | " + p.getStartDate() + " | " + p.getEndDate() + " | " + p.getCost() + " | " + p.getRevenue() + " | " + p.getProjectStatus() + " | " + p.getSupervisorId());
                    }
                    System.out.println();
                    break;
                }
                case 'c': {
                    for (Company c : companyList) {
                        System.out.println(c.getId() + " | " + c.getName() + " | " + c.getNip() + " | " + c.getOwner());
                    }
                    System.out.println();
                    break;
                }
                case 'd': {
                    employeeList.add(new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV));
                    System.out.println("Dodano nowego uzytkownika");
                    System.out.println();
                    break;
                }
                case 'e': {
                    System.out.println("Podaj id uzytkownika, ktorego chcesz ususnac: ");
                    int employee_id = scanner.nextInt();
                    employeeList.remove(getEmployee(employee_id, employeeList));
                    System.out.println("Usunieto uzytkownika od id: " + employee_id);
                    System.out.println();
                    break;
                }
                case 'q': {
                    break;
                }


            }

        }

    }

    public static Employee getEmployee(int employee_id, List<Employee> employeeList) {
        return employeeList.stream()
                .filter(employee -> employee.getId() == employee_id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("NIe ma takiego pracownika"));
    }
}
