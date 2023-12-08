package com.uc.superandthis_example;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Id {
    public Id(Long id) {
        this.id = id;
    }

    protected Long id;
}
