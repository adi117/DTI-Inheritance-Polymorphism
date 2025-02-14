package org.example.entity;

public class Book extends Material{
    public Book(String tittle) {
        super(tittle);
        this.materialType = "Book";
    }

    @Override
    public void displayMaterial(){
        System.out.println("------");
        System.out.println("Title : " + title);
        System.out.println("Type : " + materialType + " || " + getMaterialStatus());
//        System.out.println("ISBN : " + id);
    }
}
