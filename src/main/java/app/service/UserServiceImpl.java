package app.service;

import app.dao.UserDao;
import app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    public void save(User user) {

        if (user != null) {
            userDao.save(user);
        }
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(String name) {
        return userDao.findOne(name);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userDao.delete(user);

    }
}
