package net.employeejava.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="project")
public class ProjectDo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int project_id;
    @Column(name="Project_name",  nullable=false, unique=false)
    String project_name;
    @Column(name="Start_date",  nullable=false, unique=false)
    Timestamp start_date;
    @Column(name="End_date",  nullable=false, unique=false)
    Timestamp end_date;
    @Column(name="Status",  nullable=false, unique=false)
    String status;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "Project_id", referencedColumnName = "Project_id")
    private ExpensesDo expenses;

    public ExpensesDo getExpenses() {
        return expenses;
    }

    public void setExpenses(ExpensesDo expenses) {
        this.expenses = expenses;
    }


    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "Project_id", referencedColumnName = "Project_id")
    private ProjectAllocationDo projectallocation;

    public ProjectAllocationDo getProjectallocation() {
        return projectallocation;
    }

    public void setProjectallocation(ProjectAllocationDo projectallocation) {
        this.projectallocation = projectallocation;
    }




    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
