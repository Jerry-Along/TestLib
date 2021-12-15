package com.example.myapplication;

public class RMP_Options {

   private static RMP_Options rmp_options;
   private String name;

   public static RMP_Options getInstance(){
       if (rmp_options == null) {
           synchronized (RMP_Options.class){
               if (rmp_options == null) {
                   rmp_options = new RMP_Options();
                   return rmp_options;
               }
           }
       }
       return rmp_options;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
