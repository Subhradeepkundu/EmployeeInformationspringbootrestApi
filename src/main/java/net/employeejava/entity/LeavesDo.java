package net.employeejava.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="leaves")
public class LeavesDo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int leave_id;
    @Column(name="Emp_id",  nullable=false, unique=false)
    int emp_id;
    @Column(name="Leave_taken",  nullable=false, unique=false)
    int leave_taken;
    @Column(name="Leave_remaining",  nullable=false, unique=false)
    int leave_remaining;
    @Column(name="Leave_from_date",  nullable=false, unique=false)
    Timestamp leave_from_date;
    @Column(name="Leave_to_date",  nullable=false, unique=false)
    Timestamp leave_to_date;
    @Column(name="Status",  nullable=false, unique=false)
    String status;
    @Column(name="Approved_by",  nullable=false, unique=false)
    int approved_by;

    @OneToOne(mappedBy = "leaves")
    private EmployeeDo employee;


    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "Leave_id", referencedColumnName = "Leave_id")
    private LeaveTypeDo leavetype;

    public LeaveTypeDo getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(LeaveTypeDo leavetype) {
        this.leavetype = leavetype;
    }





    public int getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(int leave_id) {
        this.leave_id = leave_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getLeave_taken() {
        return leave_taken;
    }

    public void setLeave_taken(int leave_taken) {
        this.leave_taken = leave_taken;
    }

    public int getLeave_remaining() {
        return leave_remaining;
    }

    public void setLeave_remaining(int leave_remaining) {
        this.leave_remaining = leave_remaining;
    }

    public Timestamp getLeave_from_date() {
        return leave_from_date;
    }

    public void setLeave_from_date(Timestamp leave_from_date) {
        this.leave_from_date = leave_from_date;
    }

    public Timestamp getLeave_to_date() {
        return leave_to_date;
    }

    public void setLeave_to_date(Timestamp leave_to_date) {
        this.leave_to_date = leave_to_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(int approved_by) {
        this.approved_by = approved_by;
    }


}
