package org.example.entity;

import java.util.UUID;

public class Material {
    private final UUID id;
    private final String title;
    private boolean isBorrowed;

    public Material(String tittle) {
        this.id = UUID.randomUUID();
        this.title = tittle;
        this.isBorrowed = false;
    }
     public boolean isBorrowed(){
        return isBorrowed;
     }

     public void borrowMaterial(){
        if (isBorrowed()){
            System.out.println("Successfully to borrow " + title);
            isBorrowed = true;
        } else {
            System.out.println("This material is not available!");
        }
     }

     public void returnMaterial() {
         System.out.println("Thank you for returning material " + title);
         isBorrowed = false;
     }

}
