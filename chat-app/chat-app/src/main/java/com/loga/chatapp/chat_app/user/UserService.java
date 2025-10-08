package com.loga.chatapp.chat_app.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void saveUser(User user){
        user.setStatus(Status.ONLINE);
        repository.save(user);
    }

    public void disconnect(User user){
        var storeUser = repository.findById(user.getNickname())
                .orElse(null);
        if(storeUser != null){
            storeUser.setStatus(Status.OFFLINE);
            repository.save(storeUser);
        }

    }
    public List<User> findConnectedUsers(){
        return repository.findAllByStatus(Status.ONLINE);
    }
}
