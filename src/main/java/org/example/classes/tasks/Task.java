package org.example.classes.tasks;

import lombok.*;

import java.util.Date;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Task {
    private int project_id;
    private int employee_id;
    private int priority;
    private String start_date;
    private String end_date;
    private String discription;
    private String role;

}
