package uz.proj.todoapp.todoapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import uz.proj.todoapp.todoapp.repository.TodoRepository;


@Controller
@RequiredArgsConstructor
public class HomeController {
    private final TodoRepository todoRepository;


    @GetMapping
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("main");
        modelAndView.addObject("todos", todoRepository.findAll());
        return modelAndView;
    }

}
