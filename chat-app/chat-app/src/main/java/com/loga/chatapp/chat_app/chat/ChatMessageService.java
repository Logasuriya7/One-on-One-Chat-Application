package com.loga.chatapp.chat_app.chat;

import com.loga.chatapp.chat_app.chatroom.ChatRoomServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageService {

    private final ChatMessageRepository repository;
    private final ChatRoomServices chatRoomService;

    public ChatMessage save(ChatMessage chatMessage) {
        // get or create chat room ID
        String chatId = chatRoomService
                .getChatRoomId(chatMessage.getSenderId(), chatMessage.getRecipientId(), true)
                .orElseThrow(() -> new RuntimeException("Chat room not found"));

        chatMessage.setChatId(chatId);
        return repository.save(chatMessage); // return saved entity
    }

    public List<ChatMessage> findChatMessages(String senderId, String recipientId) {
        var chatId = chatRoomService.getChatRoomId(senderId, recipientId, false);
        return chatId.map(repository::findByChatId).orElse(new ArrayList<>());
    }
}
