package com.uc.oop_example.teacher;

import com.uc.oop_example.user.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends User {
    private String branch;
}
