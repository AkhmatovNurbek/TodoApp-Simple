package uz.proj.todoapp.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.proj.todoapp.todoapp.domains.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long> {
}
