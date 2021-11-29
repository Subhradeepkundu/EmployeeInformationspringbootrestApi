package net.employeejava.appcontroller;

import net.employeejava.entity.ApproverDo;
import net.employeejava.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AppController
{
    @Autowired
    private ApproverService service1;
    private EmployeeService service2;
    private ExpensesService service3;
    private LeavesService service4;
    private LeaveTypeService service5;
    private ProjectAllocationService service6;
    private ProjectService service7;


    @GetMapping("/approvers")
    public List<ApproverDo> listAll(Model model)
    {
        //return this.service1.listAll();
        List<ApproverDo> approverDos = service1.listAll();
        model.addAttribute("approverDos", approverDos);
        return this.service1.listAll();

    }


}
