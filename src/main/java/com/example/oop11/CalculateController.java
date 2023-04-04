package com.example.oop11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {

    @RequestMapping("/calc")
    public String calculate(
            @RequestParam double start,
            @RequestParam double end,
            @RequestParam double step,
            Model model
    ) {
        OperationsData operationsData = new OperationsData(start, end, step);
        model.addAttribute("max", operationsData.getMax());
        model.addAttribute("min", operationsData.getMin());
        model.addAttribute("average", operationsData.getAverage());
        model.addAttribute("sum", operationsData.getSum());
        model.addAttribute("points", operationsData.getList());
        return "calculate";
    }
}