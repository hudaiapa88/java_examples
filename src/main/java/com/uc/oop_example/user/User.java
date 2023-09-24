package com.uc.oop_example.user;


import com.uc.oop_example.base.Base;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User extends Base {
   private String firstname;
   private String lastname;
   private String email;
   private String password;

   public User encodePassword(String password){
      setPassword(password+"encoded");
      return this;
   }

}
