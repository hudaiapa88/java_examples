package com.uc.superandthis_example;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Teacher extends Person {
    private String branch;

    public Teacher(Long id, String firstname, String lastname, String branch) {
        super(id, firstname, lastname);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return String.format(
                "id:%s \n" +
                        "firsname: %s\n" +
                        "lastname: %s\n" +
                        "branch : %s\n",
                id,getFirstname(),getLastname(),this.branch
        );

    }
}
