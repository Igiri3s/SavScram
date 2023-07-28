package org.example;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.example.classes.ColumnParser;
import org.example.classes.assignment.Assignment;
import org.example.classes.company.Company;
import org.example.classes.employee.Employee;
import org.example.classes.employee.EmployeePosition;
import org.example.classes.project.Project;
import org.example.classes.project.ProjectStatus;
import org.example.classes.tasks.Task;
import org.json.JSONArray;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

import static org.example.classes.ColumnParser.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Faker faker = new Faker();
        Scanner scanner = new Scanner(System.in);

        List<Project> projectList = new ArrayList<>();
        List<Company> companyList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        List<Assignment> assignmentList = new ArrayList<>();
        List<Task> taskList = new ArrayList<>();

        fillData(projectList, companyList, employeeList, assignmentList, taskList);

        while (true) {
            System.out.println("Co chcesz zrobic? ");
            System.out.println("a) Wyswietl pracownikow ");
            System.out.println("b) Wyswietl liste projektow ");
            System.out.println("c) Wyswietl liste firm ");
            System.out.println("d) Wyswietl liste zadan");
            System.out.println("e) Dodowanie uyztkownika ");
            System.out.println("f) Usuwannie uzytkownika ");
            System.out.println("g) Czytanie pliku JSON i dodawanie do bazy danych ");
            System.out.println("h) Konwersja tabeli na plik .JSON ");
            System.out.println("i) Dodaj pracowników do projektu ");
            System.out.println("j) Dodawanie zadan do projektu");
            System.out.println("k) Dodawanie nowego projektu ");

            System.out.println("q) Wyjscie ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a' -> {
                    System.out.println("ID " + " | " + parsererer("First name") + " | " + parsererer("Last name") + " | " + parsererer("PESEL") + " | " + parsererer("Phone number") + " | " + parsererer("Email") + " | " + "Position");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (Employee e : employeeList) {
                        System.out.println(parsererer(e.getId()) + " | " + parsererer(e.getFirstName()) + " | " + parsererer(e.getLastName()) + " | " + parsererer(String.valueOf(e.getPesel())) + " | " + parsererer(String.valueOf(e.getPhoneNumer())) + " | " + parsererer(e.getEmail()) + " | " + e.getPosition());
                        System.out.println(parsererer(e.getId()) + " | " + parsererer(e.getFirstName()) + " | " + parsererer(e.getLastName()) + " | " + parsererer(String.valueOf(e.getPesel())) + " | " + parsererer(String.valueOf(e.getPhoneNumer())) + " | " + parsererer(e.getEmail()) + " | " + e.getPosition());
                    }
                    System.out.println();
                }
                case 'b' -> {
                    System.out.println("ID " + " | " + parsererer("Project name") + " | " + parsererer("Start date") + " | " + parsererer("End date") + " | " + "Cost    " + " | " + "Revenue " + " | " + "Project status" + " | " + "Supervisor id");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (Project p : projectList) {
                        System.out.println(parsererer(p.getId()) + " | " + parsererer(p.getProjectName()) + " | " + parsererer(p.getStartDate()) + " | " + parsererer(p.getEndDate()) + " | " + parsererer(p.getCost()) + " | " + parsererer(p.getRevenue()) + " | " + p.getProjectStatus() + "    | " + p.getSupervisorId());
                        System.out.println(parsererer(p.getId()) + " | " + parsererer(p.getProjectName()) + " | " + parsererer(p.getStartDate()) + " | " + parsererer(p.getEndDate()) + " | " + parsererer(p.getCost()) + " | " + parsererer(p.getRevenue()) + " | " + p.getProjectStatus() + "    | " + p.getSupervisorId());
                    }
                    System.out.println();
                }
                case 'c' -> {
                    System.out.println("ID " + " | " + parsererer("Name") + " | " + "NIP" + "         | " + parsererer("Owner"));
                    for (Company c : companyList) {
                        System.out.println(parsererer(c.getId()) + " | " + parsererer(c.getName()) + " | " + parsererer(c.getNip()) + " | " + parsererer(c.getOwner()));
                        System.out.println(parsererer(c.getId()) + " | " + parsererer(c.getName()) + " | " + parsererer(c.getNip()) + " | " + parsererer(c.getOwner()));
                    }
                    System.out.println();
                }
                case 'd' -> {
                    System.out.println("Project id" + " | " + "Employee id" + " | " + "Priority" + " | " + "Start date" + " | " + "End date" + " | " + "Description");
                    for (Task t : taskList) {
                        System.out.println(parsererer(t.getProject_id()) + "         | " + parsererer(t.getEmployee_id()) + "          | " + t.getPriority() + " | " + t.getStart_date() + " | " + t.getEnd_date() + " | " + t.getDiscription());
                        System.out.println(parsererer(t.getProject_id()) + "         | " + parsererer(t.getEmployee_id()) + "          | " + t.getPriority() + " | " + t.getStart_date() + " | " + t.getEnd_date() + " | " + t.getDiscription());
                    }
                    System.out.println();
                }
                case 'e' -> {
                    employeeList.add(new Employee(faker.number().numberBetween(1, 200), faker.name().firstName(), faker.name().lastName(), (int) faker.number().randomNumber(11, true), faker.internet().emailAddress(), faker.number().numberBetween(111111111, 999999999), EmployeePosition.DEV));
                    System.out.println("Dodano nowego uzytkownika");
                    System.out.println();
                }
                case 'f' -> {
                    System.out.println("Podaj id uzytkownika, ktorego chcesz ususnac: ");
                    int employee_id = scanner.nextInt();
                    employeeList.remove(getEmployee(employee_id, employeeList));
                    System.out.println("Usunieto uzytkownika od id: " + employee_id);
                    System.out.println();
                }
                case 'g' -> {
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
                            case 'a' -> {
                                Type employeeListType = new TypeToken<List<Employee>>() {
                                }.getType();

                                List<Employee> data = gson.fromJson(json, employeeListType); // contains the whole reviews list
                                employeeList.addAll(data);

                                System.out.println("Nowi pracownicy zostali dodani");
                            }
                            case 'b' -> {
                                Type projectListType = new TypeToken<List<Project>>() {
                                }.getType();

                                List<Project> data = gson.fromJson(json, projectListType); // contains the whole reviews list
                                projectList.addAll(data);

                                System.out.println("Nowe projekty zostaly dodane");
                            }
                            case 'c' -> {
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
                }
                case 'h' -> {
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
                }
                case 'i' -> {
                    System.out.println("Podaj id projektu: ");
                    int projectId = scanner.nextInt();
                    System.out.println("Ilu pracownikow chcesz dodac: ");
                    int counter = scanner.nextInt();
                    dodajPracownikaDoProjektu(assignmentList, projectId, counter);
                }
                case 'j' -> {
                    System.out.println("Podaj id projektu, do ktorego chcesz dodac zadanie:");
                    int project_id = scanner.nextInt();
                    boolean check = true;

                    for (Project p : projectList) {
                        if (p.getId() == project_id) {
                            check = false;
                            break;
                        }
                    }

                    if (check) {
                        System.out.println("Nie ma takiego projektu");
                        break;
                    }

                    // W przypadku, gdy istnieje project

                    System.out.println("Podaj id uzytkownika ktorego chcesz dodac do projektu");
                    int employee_id = scanner.nextInt();
                    System.out.println("Priorytet zadania (1-5), gdzie 1 oznacza najwazniejsze zadanie");
                    int priority = scanner.nextInt(); //<-- zabezpeiczyc
                    String start_date = "28-07-2023";
                    System.out.println("Podaj date zakonczenia zadania w formacie (DD-MM-2023)");
                    String end_date = scanner.next();
                    System.out.println("Podaj opis do zadania (domyslnie - 'Do roboty!')");
                    String discription = scanner.next(); // <-Poprawic
                    if (discription.isEmpty()) {
                        discription = "Do roboty!";
                    }
                    System.out.println("Okresl role pracownika w projekcie");
                    String role = scanner.next();

                    taskList.add(new Task(project_id, employee_id, priority, start_date, end_date, discription, role));
                    System.err.println("Dodano wpis do listy zadan");
                }
                case 'k' -> {
                    createNewProject(projectList);
                }
                case 'l' -> {
                    changeRoleOfEmployee(taskList);
                }
                case 'q' -> {
                    System.exit(0);
                }
            }

        }

    }
    private static void changeRoleOfEmployee(final List<Task> taskList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id projektu, w ktorym chcesz wprowadzic zmiany");
        int project_id = scanner.nextInt();
        boolean check = false;

        // Sprawdzam czy taki projekt istnieje
        for (Task t : taskList) {
            if (t.getProject_id() == project_id) ;
            check = true;
        }

        // Przydaloby sie zabezpiecznie sprawdzajace czy ktos ma role kierownika w projekcie

        if (!check) {
            System.err.println("Taki projekt nie istnieje");
        } else {
            System.out.println("Podaj id pracowmnika, u ktorego chcesz zmienic role");
            int employee_id = scanner.nextInt();
            int index_of_emp = 0;
            Task oldEmployee = new Task();
            boolean check_for_emp = false;

            for (Task t : taskList) {
                if (t.getEmployee_id() == employee_id) ;
                index_of_emp = taskList.indexOf(t);
                oldEmployee = t;
                check_for_emp = true;
            }

            if (!check_for_emp) {
                System.out.println("Nie ma takiego pracownika");
            } else {
                System.out.println("Podaj role jaka ma miec pracownik przypisany do tego zadania");
                String new_role = scanner.next();
                taskList.set(index_of_emp, new Task(oldEmployee.getProject_id(), oldEmployee.getEmployee_id(), oldEmployee.getPriority(), oldEmployee.getStart_date(), oldEmployee.getEnd_date(), oldEmployee.getDiscription(), new_role));
                System.err.println("Zmiana roli w projekcie powiodla sie");
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

    static void dodajPracownikaDoProjektu(List<Assignment> assignmentList, int projectId, int counter) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < counter; i++) {
            System.out.println("Podaj id pracownika: ");
            int employeeId = s.nextInt();
            assignmentList.add(new Assignment(projectId, employeeId));
        }
        System.out.println("Pomyślnie dodano pracowników w liczbie: " + counter);
    }

    static void createNewProject(List<Project> projectList) throws ParseException {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Podaj id: ");
        int id = s.nextInt();
        System.out.println("Podaj nazwę projektu: ");
        String projectName = s.next();
        System.out.println("Podaj datę startu (dd-mm-yyyy): ");
        String startDateStr = s.next();
        Date startDate = formatter.parse(startDateStr);
        System.out.println("Podaj datę konca (dd-mm-yyyy): ");
        String endDateStr = s.next();
        Date endDate = formatter.parse(endDateStr);
        System.out.println("Podaj koszt: ");
        double cost = s.nextDouble();
        System.out.println("Podaj wynagrodzenie: ");
        double revenue = s.nextDouble();
        ProjectStatus projectStatus = ProjectStatus.IN_PROGRESS;
        System.out.println("Podaj id osoby odpowiedzialnej za projekt: ");
        int supervisorId = s.nextInt();
        projectList.add(new Project(id, projectName, startDate, endDate, cost, revenue, projectStatus, supervisorId));
        System.out.println("Successfully added project!");
    }

    private static void fillData(final List<Project> projectList, final List<Company> companyList, final List<Employee> employeeList, final List<Assignment> assignmentList, final List<Task> taskList) {

        Faker faker = new Faker();

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

        companyList.add(company1);
        companyList.add(company2);
        companyList.add(company3);
        companyList.add(company4);
        companyList.add(company5);

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

        assignmentList.add(assignment1);
        assignmentList.add(assignment2);
        assignmentList.add(assignment3);
        assignmentList.add(assignment4);
        assignmentList.add(assignment5);
    }


}
