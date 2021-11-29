package net.employeejava.entity;

import javax.persistence.*;

@Entity
@Table(name="approver")
public class ApproverDo
{
    @Column(name="Approver_id", length=50, nullable=false, unique=false)
    int approver_id;
    @Column(name="Emp_id", length=50, nullable=false, unique=false)
    int emp_id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int manager_id;

    @OneToOne(mappedBy = "approver")
    private EmployeeDo employee;

    @OneToOne(mappedBy = "approver")
    private ProjectAllocationDo projectallocation;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "Manager_id", referencedColumnName = "Approved_by")
    private ExpensesDo expenses;


    public int getApprover_id() {
        return approver_id;
    }

    public void setApprover_id(int approver_id) {
        this.approver_id = approver_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }
}
