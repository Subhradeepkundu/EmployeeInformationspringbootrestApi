package net.employeejava.service;

import net.employeejava.entity.LeaveTypeDo;
import net.employeejava.entity.ProjectDo;
import net.employeejava.repository.LeaveTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveTypeService
{

    @Autowired
    private LeaveTypeRepository repo;

    public List<LeaveTypeDo> listAll()
    {
        return repo.findAll();
    }

    public void save(LeaveTypeDo leavetypedo)

    {
        repo.save(leavetypedo);
    }

    public LeaveTypeDo get(int id)

    {
        return repo.findById(id).get();
    }

    public void delete(int id)

    {
        repo.deleteById(id);
    }
}
