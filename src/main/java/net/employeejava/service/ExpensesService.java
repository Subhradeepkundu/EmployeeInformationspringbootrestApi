package net.employeejava.service;

import net.employeejava.entity.ExpensesDo;
import net.employeejava.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {

    @Autowired
    private ExpensesRepository repo;

    public List<ExpensesDo> listAll()
    {
        return repo.findAll();
    }

    public void save(ExpensesDo expensesdo)

    {
        repo.save(expensesdo);
    }

    public ExpensesDo get(int id)

    {
        return repo.findById(id).get();
    }

    public void delete(int id)

    {
        repo.deleteById(id);
    }
}
