package com.uc.enum_implement;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Detect {
    private Check right=Check.NOTAVAILABLE;
    private Check left=Check.NOTAVAILABLE;
    private Check up=Check.NOTAVAILABLE;
    private Check down=Check.NOTAVAILABLE;

    public static void main(String[] args) {
   /*     Detect detect= new Detect();
        detect.setLeft(Check.AVAILABLE);
        System.out.println(detect.getDown());
        System.out.println(detect.getLeft());*/
    }
}
