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
    private Date start_date;
    private Date end_date;
    private String discription;

}
