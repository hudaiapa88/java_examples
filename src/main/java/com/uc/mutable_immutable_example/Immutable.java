package com.uc.mutable_immutable_example;

import lombok.ToString;

@ToString
public final class Immutable {

    private final String title;

    public Immutable(String title) {
        this.title = title;
    }
    public Immutable titleAdd(String title) {

        return new Immutable(this.getTitle()+title);
    }

    public String getTitle() {
        return title;
    }


}
