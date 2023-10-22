package restfulApi.javarestfulapi.service;

import restfulApi.javarestfulapi.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
