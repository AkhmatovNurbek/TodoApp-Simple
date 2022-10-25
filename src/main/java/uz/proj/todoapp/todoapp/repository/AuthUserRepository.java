package uz.proj.todoapp.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.proj.todoapp.todoapp.domains.AuthUser;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    Optional<AuthUser> findByUsername(String username);
}
