package org.example;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.example.classes.assignment.Assignment;
import org.example.classes.company.Company;
import org.example.classes.employee.Employee;
import org.example.classes.employee.EmployeePosition;
import org.example.classes.project.Project;
import org.example.classes.project.ProjectStatus;
import org.json.JSONArray;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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

        Assignment assignment1 = new Assignment(1, 1);
        Assignment assignment2 = new Assignment(2, 2);
        Assignment assignment3 = new Assignment(2, 3);
        Assignment assignment4 = new Assignment(2, 4);
        Assignment assignment5 = new Assignment(3, 5);

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

        List<Assignment> assignmentList = new ArrayList<>();
        assignmentList.add(assignment1);
        assignmentList.add(assignment2);
        assignmentList.add(assignment3);
        assignmentList.add(assignment4);
        assignmentList.add(assignment5);

        while (true) {
            System.out.println("Co chcesz zrobic? ");
            System.out.println("a) Wyswietl pracownikow ");
            System.out.println("b) Wyswietl liste projektow ");
            System.out.println("c) Wyswietl liste firm ");
            System.out.println("d) Dodowanie uyztkownika ");
            System.out.println("e) Usuwannie uzytkownika ");
            System.out.println("f) Czytanie pliku JSON i dodawanie do bazy danych ");
            System.out.println("g) Konwersja tabeli na plik .JSON ");
            System.out.println("h) Dodaj pracowników do projektu ");
            System.out.println("i) Dodawanie zadan do projektu");
            System.out.println("q) Wyjscie ");
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
                case 'f': {
                    System.out.println("Podaj sciezke gdzie znajudje sie plik: ");
                    String filename = scanner.next();


                    Gson gson = new Gson();

                    System.out.println("Należy wybrać tabelę: ");
                    System.out.println("a) Pracownicy ");
                    System.out.println("b) Projekty ");
                    System.out.println("c) Firmy ");

                    try {

                        char pickYourList = scanner.next().charAt(0);
                        String json = new String(Files.readAllBytes(Paths.get(filename)));

                        switch (pickYourList) {
                            case 'a': {
                                Type employeeListType = new TypeToken<List<Employee>>() {
                                }.getType();

                                List<Employee> data = gson.fromJson(json, employeeListType); // contains the whole reviews list
                                employeeList.addAll(data);

                                System.out.println("Nowi pracownicy zostali dodani");
                            }
                            case 'b': {
                                Type projectListType = new TypeToken<List<Project>>() {
                                }.getType();

                                List<Project> data = gson.fromJson(json, projectListType); // contains the whole reviews list
                                projectList.addAll(data);

                                System.out.println("Nowe projekty zostaly dodane");
                            }
                            case 'c': {
                                Type companyListType = new TypeToken<List<Company>>() {
                                }.getType();

                                List<Company> data = gson.fromJson(json, companyListType); // contains the whole reviews list
                                companyList.addAll(data);

                                System.out.println("Nowe firmy zostaly dodane");
                            }
                        }

                        ; // prints to screen some values
                    } catch (JsonSyntaxException | JsonIOException | IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }

                case 'g': {
                    System.out.println("Należy wybrać tabelę: ");
                    System.out.println("a) Pracownicy ");
                    System.out.println("b) Projekty ");
                    System.out.println("c) Firmy ");
                    char pickYourList = scanner.next().charAt(0);

                    switch (pickYourList) {
                        case 'a' -> writeMeLikeYouDo(employeeList);
                        case 'b' -> writeMeLikeYouDo(projectList);
                        case 'c' -> writeMeLikeYouDo(companyList);
                    }
                    break;
                }
                case 'h': {
                    System.out.println("Podaj id projektu: ");
                    int projectId = scanner.nextInt();
                    System.out.println("Ilu pracownikow chcesz dodac: ");
                    int counter = scanner.nextInt();
                    dodajPracownikaDoProjektu(assignmentList, projectId, counter);
                    break;
                }

                case 'i': {
                    System.out.println("Podaj id projektu, do ktorego chcesz dodac zadanie:");
                    int project_id = scanner.nextInt();

                    for (Project p: projectList) {
                        if (p.getId() != project_id) {
                            System.out.println("NIe ma takiego projektu");
                            break;
                        }
                    }

                    // W przypadku, gdy istnieje project

                    System.out.println("");

                }

                case 'q': {
                    System.exit(0);
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

    static void writeMeLikeYouDo(List<?> list) {
        String name = list.get(0).getClass().getSimpleName().toLowerCase();
        Date nowDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
        String srtDate = dateFormat.format(nowDate);
        try (Writer fileWriter = new FileWriter(name + "List" + srtDate + ".json");
             BufferedWriter in = new BufferedWriter(fileWriter)) {
            JSONArray ja = new JSONArray(list);
            in.write(ja.toString());
        } catch (IOException e) {
            System.err.println("Unable to write to file. An exception occurred");
        }
        System.out.println("Successfully wrote to file!");
    }

    static void dodajPracownikaDoProjektu(List<Assignment> assignmentList, int projectId, int counter){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < counter; i++) {
            System.out.println("Podaj id pracownika: ");
            int employeeId = s.nextInt();
            assignmentList.add(new Assignment(projectId, employeeId));
        }
        System.out.println("Pomyślnie dodano pracowników w liczbie: " + counter);
    }
}
