package com.loga.chatapp.chat_app.chat;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

    // Find all messages by chatId (one-on-one conversation)
    List<ChatMessage> findByChatId(String chatId);
}
