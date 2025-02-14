package org.example.entity;

import java.util.UUID;

public class Material {
    public final UUID id;
    public final String title;
    public boolean isBorrowed;
    public String materialType;

    public Material(String tittle) {
        this.id = UUID.randomUUID();
        this.title = tittle;
        this.isBorrowed = false;
    }
     public String getMaterialStatus(){
        if (isBorrowed){
            return "Borrowed";
        }

        return "Available";
     }

     public void borrowMaterial(){
        if (!isBorrowed){
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

    public void displayMaterial() {

    }

}
