package net.employeejava.repository;

import net.employeejava.entity.ApproverDo;
import net.employeejava.entity.ExpensesDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<ExpensesDo, Integer>
{

}