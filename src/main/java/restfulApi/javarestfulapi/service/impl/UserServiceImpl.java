package restfulApi.javarestfulapi.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import restfulApi.javarestfulapi.domain.model.User;
import restfulApi.javarestfulapi.domain.repository.UserRepository;
import restfulApi.javarestfulapi.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException:: new);
    }
    
    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number already exists;");
        }
        return userRepository.save(userToCreate);
    }

}
