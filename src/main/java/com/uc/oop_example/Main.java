package com.uc.oop_example;

import com.uc.oop_example.teacher.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        teacher.setFirstname("Hüdai");
        teacher.setLastname("Apa");
        teacher.setEmail("hudaiapa88@gmail.com");
        teacher.setBranch("Matematik");
        teacher.encodePassword("password");
    }
}
