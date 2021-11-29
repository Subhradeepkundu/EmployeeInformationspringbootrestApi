package net.employeejava.repository;

import net.employeejava.entity.ApproverDo;
import net.employeejava.entity.EmployeeDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDo, Integer> {
}
