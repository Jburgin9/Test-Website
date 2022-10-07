package com.quietlip.carol_shop.api.dao.users;
import com.quietlip.carol_shop.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class UserService {

    @Autowired
    private final UserCollectionRepo userServiceDAO;

    public List<User> getAllUsers(){
        return userServiceDAO.findAll();
    }


    public void insertNewUser(User newUser) {
        userServiceDAO.insert(newUser);
    }

    public User findUserByUsername(String username) {
        return userServiceDAO.findUserByUsername(username);
    }

    public List<User> showAllUsers(){
        return userServiceDAO.findAll();
    }
}
