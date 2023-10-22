package restfulApi.javarestfulapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restfulApi.javarestfulapi.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
