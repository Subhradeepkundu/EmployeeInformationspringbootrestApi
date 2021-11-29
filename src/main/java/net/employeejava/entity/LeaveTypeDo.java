package net.employeejava.entity;

import javax.persistence.*;

@Entity
@Table(name="leavetype")
public class LeaveTypeDo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int emp_id;
    @Column(name="Leave_id",  nullable=false, unique=false)
    int leave_id;
    @Column(name="Leave_name",  nullable=false, unique=false)
    String leave_name;

    @OneToOne(mappedBy = "leavetype")
    private LeavesDo leaves;


    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }


    public int getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(int leave_id) {
        this.leave_id = leave_id;
    }

    public String getLeave_name() {
        return leave_name;
    }

    public void setLeave_name(String leave_name) {
        this.leave_name = leave_name;
    }
}
