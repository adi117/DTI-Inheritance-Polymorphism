package org.example.entity;

public class Magazine extends Material{
    public Magazine(String tittle) {
        super(tittle);
        this.materialType = "Magazine";
    }

    @Override
    public void displayMaterial(){
        System.out.println(title + " || " + materialType + " || " + getMaterialStatus());
//        System.out.println("ISBN : " + id);
    }

    @Override
    public void displayDetail(){
        System.out.println("Title : " + title);
        System.out.println("ISBN : " + id);
        System.out.println("Material type : " + materialType);
        System.out.println("Status : " + getMaterialStatus());
    }
}
