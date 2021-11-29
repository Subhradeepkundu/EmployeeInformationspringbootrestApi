package net.employeejava.repository;

import net.employeejava.entity.ApproverDo;
import net.employeejava.entity.LeaveTypeDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveTypeDo, Integer>
{
}
