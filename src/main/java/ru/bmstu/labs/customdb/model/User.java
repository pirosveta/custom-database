package ru.bmstu.labs.customdb.model;

import lombok.*;

@Getter
@Setter
@ToString
public class User extends AbstractEntity {
    private Long id;
    private String name;
    private String lastName;
    private String email;
}
