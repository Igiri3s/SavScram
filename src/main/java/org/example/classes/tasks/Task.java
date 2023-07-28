package org.example.classes.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class Task {
    private int project_id;
    private int employee_id;
    private int priority;
    private String start_date;
    private String end_date;
    private String discription;

}
