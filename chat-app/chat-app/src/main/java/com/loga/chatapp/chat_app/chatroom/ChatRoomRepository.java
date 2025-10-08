package com.loga.chatapp.chat_app.chatroom;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<Chatroom, Long> {

    // Custom finder method
    Optional<Chatroom> findBySenderIdAndReceiverId(String senderId, String receiverId);
}
