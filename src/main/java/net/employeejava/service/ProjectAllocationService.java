package net.employeejava.service;

import net.employeejava.entity.ProjectAllocationDo;
import net.employeejava.repository.ProjectAllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectAllocationService
{
    @Autowired
    private ProjectAllocationRepository repo;

    public List<ProjectAllocationDo> listAll()
    {
        return repo.findAll();
    }

    public void save(ProjectAllocationDo projectallocationdo)

    {
        repo.save(projectallocationdo);
    }

    public ProjectAllocationDo get(int id)

    {
        return repo.findById(id).get();
    }

    public void delete(int id)

    {
        repo.deleteById(id);
    }
}
