
package com.mycompany.week3_lec2;

public class NewClass {
       
    int getStrLngth(String name){
        int l = name.length();
        return l;
   
    
    }
   public static void main(String[] args) {
       
       NewClass nc = new NewClass();
       String str = "Muhammad Zafar";
       int z =nc.getStrLngth(str);
       System.out.println("The length is "+ z);
  }
}

