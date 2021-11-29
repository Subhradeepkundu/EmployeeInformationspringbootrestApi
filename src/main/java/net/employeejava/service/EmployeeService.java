package net.employeejava.service;

import net.employeejava.entity.EmployeeDo;
import net.employeejava.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<EmployeeDo> listAll()
    {
        return repo.findAll();
    }

    public void save(EmployeeDo employeedo)

    {
        repo.save(employeedo);
    }

    public EmployeeDo get(int id)

    {
        return repo.findById(id).get();
    }

    public void delete(int id)

    {
        repo.deleteById(id);
    }
}
