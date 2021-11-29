package net.employeejava.entity;;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="projectallocation")
public class ProjectAllocationDo
{
    @Column(name="Project_id",  nullable=false, unique=false)
    int project_id;
    @Column(name="Emp_id",  nullable=false, unique=false)
    int emp_id;
    @Column(name="Allocation_from",  nullable=false, unique=false)
    Timestamp allocation_from;
    @Column(name="Allocation_to",  nullable=false, unique=false)
    Timestamp allocation_to;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int allocated_by;

    @OneToOne(mappedBy = "projectallocation")
    private EmployeeDo employee;

    @OneToOne(mappedBy = "projectallocation")
    private ProjectDo project;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "Allocated_by", referencedColumnName = "Approver_id")
    private ApproverDo approver;

    public ApproverDo getApprover() {
        return approver;
    }

    public void setApprover(ApproverDo approver) {
        this.approver = approver;
    }

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

    public Timestamp getAllocation_from() {
        return allocation_from;
    }

    public void setAllocation_from(Timestamp allocation_from) {
        this.allocation_from = allocation_from;
    }

    public Timestamp getAllocation_to() {
        return allocation_to;
    }

    public void setAllocation_to(Timestamp allocation_to) {
        this.allocation_to = allocation_to;
    }

    public int getAllocated_by() {
        return allocated_by;
    }

    public void setAllocated_by(int allocated_by) {
        this.allocated_by = allocated_by;
    }

}
