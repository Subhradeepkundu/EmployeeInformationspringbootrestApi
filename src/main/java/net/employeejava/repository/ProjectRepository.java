package net.employeejava.repository;


import net.employeejava.entity.ProjectDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectDo, Integer>
{

}
