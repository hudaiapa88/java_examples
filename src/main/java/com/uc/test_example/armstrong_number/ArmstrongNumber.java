package com.uc.test_example.armstrong_number;

public class ArmstrongNumber {
    public Boolean isArmstrong(Integer number){
        if(number<0){
            throw new IllegalArgumentException();
        }
        char[] nums= number.toString().toCharArray();
        int total=0;
        for (char num: nums) {
          total+= Math.pow(Integer.valueOf(String.valueOf(num)),3);
        }
        return total==number;
    }
}
