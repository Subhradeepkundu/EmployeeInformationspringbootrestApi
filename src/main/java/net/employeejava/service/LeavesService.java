package net.employeejava.service;

import net.employeejava.entity.LeavesDo;
import net.employeejava.repository.LeavesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeavesService {

    @Autowired
    private LeavesRepository repo;

    public List<LeavesDo> listAll()
    {
        return repo.findAll();
    }

    public void save(LeavesDo leavesdo)

    {
        repo.save(leavesdo);
    }

    public LeavesDo get(int id)

    {
        return repo.findById(id).get();
    }

    public void delete(int id)

    {
        repo.deleteById(id);
    }
}
