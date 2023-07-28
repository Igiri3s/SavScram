package org.example.classes.project;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Project {
    @Id
    private int id;
    private String projectName;
    private Date startDate;
    private Date endDate;
    private double cost;
    private double revenue;
    private ProjectStatus projectStatus;
    private int supervisorId;
}
