package com.quietlip.carol_shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@Document
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    @Email
    @NotBlank
    private String username;
    @Size(min = 6, max = 20)
    private String password;
    private String type = "basic";
    public User(){}
}
