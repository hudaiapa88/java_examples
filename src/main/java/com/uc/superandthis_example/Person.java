package com.uc.superandthis_example;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Person extends Id {


    private String firstname;
    private String lastname;

    public Person(Long id, String firstname, String lastname) {
        super(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
