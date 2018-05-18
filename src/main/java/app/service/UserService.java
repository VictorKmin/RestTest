package app.service;

import app.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    void save(User user);

    List<User> findAll();

    User findOne (String name);

    void delete (User user);
}
