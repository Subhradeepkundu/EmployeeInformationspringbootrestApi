package net.employeejava.repository;

import net.employeejava.entity.LeaveTypeDo;
import net.employeejava.entity.ProjectAllocationDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectAllocationRepository  extends JpaRepository<ProjectAllocationDo, Integer> {
}
