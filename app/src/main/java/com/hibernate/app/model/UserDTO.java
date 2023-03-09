package com.hibernate.app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//DTO - Data Transfer Object
public class UserDTO {
private int id;
private String userName;
private String password;
}
