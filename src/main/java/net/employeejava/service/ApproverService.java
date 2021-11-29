package net.employeejava.service;

import net.employeejava.entity.ApproverDo;
import net.employeejava.repository.ApproverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApproverService
{
    @Autowired
    private ApproverRepository repo;

    public List<ApproverDo> listAll()
    {
        return repo.findAll();
    }

    public void save(ApproverDo approverdo)

    {
        repo.save(approverdo);
    }

    public ApproverDo get(int id)

    {
        return repo.findById(id).get();
    }

    public void delete(int id)

    {
        repo.deleteById(id);
    }
}
