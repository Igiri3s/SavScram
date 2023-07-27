package org.example.classes.project;

import java.util.Date;

public class Project {
    private int id;
    private String projectName;
    private Date startDate;
    private Date endDate;
    private double cost;
    private double revenue;
    private ProjectStatus projectStatus;
    private int supervisorId;

    public Project(int id, String projectName,
                   Date startDate, Date endDate,
                   double cost, double revenue, ProjectStatus projectStatus, int supervisorId) {
        this.id = id;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
        this.revenue = revenue;
        this.projectStatus = projectStatus;
        this.supervisorId = supervisorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", cost=" + cost +
                ", revenue=" + revenue +
                ", projectStatus=" + projectStatus +
                ", supervisorId=" + supervisorId +
                '}';
    }
}
