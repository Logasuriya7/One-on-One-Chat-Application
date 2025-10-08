package com.loga.chatapp.chat_app.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "app_user") // Renamed table to avoid 'user' keyword conflict
public class User {

    @Id
    private String nickname;

    private String name;

    @Enumerated(EnumType.STRING) // store enum as string in DB
    private Status status;
}
