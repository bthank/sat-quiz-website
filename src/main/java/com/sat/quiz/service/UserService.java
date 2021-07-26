package com.sat.quiz.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sat.quiz.entity.User;
import com.sat.quiz.user.CrmUser;

/*
 * Interface used for DAO service method declaration for User entity class
 * 
 * 
 * 
 */


public interface UserService extends UserDetailsService {

    User findByUserId(Long id);
    
    User findByUserName(String userName);
    
    List<User> findAllUsers();

    void save(CrmUser crmUser);
    
    void saveUser(User user);

    void delete(User user);
}
