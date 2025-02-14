package org.example.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Material {
    public final UUID id;
    public final String title;
    public boolean isAvailable;
    public String materialType;
    public int stock;

    public Material(String title, int stock) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.isAvailable = true;
        this.stock = stock;
    }
     public String getMaterialStatus(){
        if (isAvailable){
            return "Borrowed";
        }

        return "Available";
     }

     public void borrowMaterial(){
        if (isAvailable){
            System.out.println("Successfully to borrow " + '"' + title + '"');
            --stock;
            updateStockStatus();
        } else {
            System.out.println("This material is not available!");
        }
     }

     public void updateStockStatus(){
         isAvailable = stock > 0;
     }

     public void returnMaterial() {
         System.out.println("Thank you for returning material " + title);
         ++stock;
         updateStockStatus();
     }

     public static void displayAllMaterial(Map<String, Material> materialMap){
         int materialNumber = 0;
         System.out.println("--- Material List ---");
         for (Material material : materialMap.values()){
             materialNumber++;
             System.out.print(materialNumber + ". ");
             material.displayMaterial();
         }
     }

     public String getTitle(){
        return title;
     }

    public void displayMaterial() {

    }

    public void displayDetail() {

    }

}
