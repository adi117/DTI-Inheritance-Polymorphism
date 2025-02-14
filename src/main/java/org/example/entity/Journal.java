package org.example.entity;

public class Journal extends Material{
    public Journal(String tittle) {
        super(tittle);
        this.materialType = "Journal";
    }

    @Override
    public void displayMaterial(){
        System.out.println("------");
        System.out.println("Title : " + title);
        System.out.println("Type : " + materialType + " || " + getMaterialStatus());
//        System.out.println("ISBN : " + id);
    }
}
