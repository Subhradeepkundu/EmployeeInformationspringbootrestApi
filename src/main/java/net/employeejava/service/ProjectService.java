package net.employeejava.service;

import net.employeejava.entity.ProjectDo;
import net.employeejava.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService
{
    @Autowired
    private ProjectRepository repo;

    public List<ProjectDo> listAll()
    {
        return repo.findAll();
    }

    public void save(ProjectDo projectdo)

    {
        repo.save(projectdo);
    }

    public ProjectDo get(int id)

    {
        return repo.findById(id).get();
    }

    public void delete(int id)

    {
        repo.deleteById(id);
    }
}
