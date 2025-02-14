package org.example.entity;

public class Magazine extends Material{
    public Magazine(String tittle) {
        super(tittle);
        this.materialType = "Magazine";
    }

    @Override
    public void displayMaterial(){
        System.out.println("------");
        System.out.println("Title : " + title);
        System.out.println("Type : " + materialType + " || " + getMaterialStatus());
//        System.out.println("ISBN : " + id);
    }
}
