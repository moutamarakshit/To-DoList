package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoListController {
    @Autowired
    private ToDoListService toDoListService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tasks", toDoListService.getAllTasks());
        return "index";
    }

    @PostMapping("/addTask")
    public String addTask(@RequestParam String description) {
        toDoListService.addTask(new Task(description));
        return "redirect:/";
    }

    @PostMapping("/markTaskAsCompleted")
    public String markTaskAsCompleted(@RequestParam String description) {
        toDoListService.markTaskAsCompleted(description);
        return "redirect:/";
    }
}
