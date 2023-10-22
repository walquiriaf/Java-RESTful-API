package restfulApi.javarestfulapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import restfulApi.javarestfulapi.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);
}
