package net.employeejava.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="expenses")
public class ExpensesDo
{
    @Column(name="Project_id", nullable=false, unique=false)
    int project_id;
    @Column(name="Emp_id",  nullable=false, unique=false)
    int emp_id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int exp_id;
    @Column(name="Expense_type", nullable=false, unique=false)
    String expense_type;
    @Column(name="Approved_by",  nullable=false, unique=false)
    int approved_by;
    @OneToOne(mappedBy = "expenses")
    private EmployeeDo employee;

    @OneToOne(mappedBy = "expenses")
    private ProjectDo project;

    @OneToOne(mappedBy = "expenses")
    private ApproverDo approver;


    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getExp_id() {
        return exp_id;
    }

    public void setExp_id(int exp_id) {
        this.exp_id = exp_id;
    }

    public String getExpense_type() {
        return expense_type;
    }

    public void setExpense_type(String expense_type) {
        this.expense_type = expense_type;
    }

    public int getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(int approved_by) {
        this.approved_by = approved_by;
    }
}