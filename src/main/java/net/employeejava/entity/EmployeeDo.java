package net.employeejava.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="employee")
public class EmployeeDo
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   int emp_id;
   @Column(name="Emp_name",  nullable=false, unique=false)
   String emp_name;
   @Column(name="Dob",  nullable=false, unique=false)
   Date dob;
   @Column(name="Address", nullable=false, unique=false)
   String address;

   @OneToOne (cascade = CascadeType.ALL)
   @JoinColumn(name = "Emp_id", referencedColumnName = "Emp_id")
   private ProjectAllocationDo projectallocation;

   public ProjectAllocationDo getProjectallocation()
   {
      return projectallocation;
   }

   public void setProjectallocation(ProjectAllocationDo projectallocation) {
      this.projectallocation = projectallocation;
   }



   @OneToOne (cascade = CascadeType.ALL)
   @JoinColumn(name = "Emp_id", referencedColumnName = "Emp_id")
   private LeavesDo leaves;

   public LeavesDo getLeaves() {
      return leaves;
   }

   public void setLeaves(LeavesDo leaves) {
      this.leaves = leaves;
   }




   @OneToOne (cascade = CascadeType.ALL)
   @JoinColumn(name = "Emp_id", referencedColumnName = "Emp_id")
   private ExpensesDo expenses;

   public ExpensesDo getExpenses() {
      return expenses;
   }

   public void setExpenses(ExpensesDo expenses) {
      this.expenses = expenses;
   }




   @OneToOne (cascade = CascadeType.ALL)
   @JoinColumn(name = "Emp_id", referencedColumnName = "Emp_id")
   private ApproverDo approver;

   public ApproverDo getApprover() {
      return approver;
   }

   public void setApprover(ApproverDo approver) {
      this.approver = approver;
   }







   public int getEmp_id() {
      return emp_id;
   }

   public void setEmp_id(int emp_id) {
      this.emp_id = emp_id;
   }

   public String getEmp_name() {
      return emp_name;
   }

   public void setEmp_name(String emp_name) {
      this.emp_name = emp_name;
   }

   public Date getDob() {
      return dob;
   }

   public void setDob(Date dob) {
      this.dob = dob;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}
