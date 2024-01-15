package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public String createUser(User user){
       return this.userRepository.save(user).toString();
    }

    @Transactional
    public User getUser(long id){
       return this.userRepository.getReferenceById(id);
    }
}
