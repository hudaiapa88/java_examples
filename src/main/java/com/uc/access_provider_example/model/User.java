package com.uc.access_provider_example.model;

import com.uc.access_provider_example.model.base.BaseModel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
public class User extends BaseModel {
    private String name;
    private String lastname;

    public static void main(String[] args) {
        User user= new User();
        BaseModel baseModel= new BaseModel();
        user.publicMethod();
        user.protectedMethod();
        user.defaultMethod();
        user.privateMethod();
    }
    private void privateMethod() {
        System.out.println("Private method accessed");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }

    public void publicMethod() {
        System.out.println("Public method accessed");
    }

    void defaultMethod() {
        System.out.println("Default method accessed");
    }
}
