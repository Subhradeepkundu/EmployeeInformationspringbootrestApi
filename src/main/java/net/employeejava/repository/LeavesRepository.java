package net.employeejava.repository;

import net.employeejava.entity.ApproverDo;
import net.employeejava.entity.LeavesDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeavesRepository extends JpaRepository<LeavesDo, Integer>
{

}
