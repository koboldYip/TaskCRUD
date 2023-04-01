package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    User getById(Long id);

    User update(User user);

    void delete(User user);

    void deleteById(Long id);

    List<User> findAll();

}
