package uz.proj.todoapp.todoapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.proj.todoapp.todoapp.domains.Todo;
import uz.proj.todoapp.todoapp.repository.TodoRepository;

import java.util.List;


@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

    private final TodoRepository todoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Todo create(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() {
        todoRepository.deleteAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Todo updateStatus(@PathVariable Long id) {
        // TODO: 12/08/22 add logging here and add check for null
        Todo todo = todoRepository.findById(id).get();
        todo.setCompleted(!todo.isCompleted());
        return todoRepository.save(todo);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> getAll() {
        // TODO: 12/08/22 add logging here and add check for null
        return todoRepository.findAll();
    }


}
