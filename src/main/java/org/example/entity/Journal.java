package org.example.entity;

public class Journal extends Material{
    public Journal(String title, int stock) {
        super(title, stock);
        this.materialType = "Journal";
    }

    public Journal() {

    }

    @Override
    public void displayMaterial(){
        System.out.println(title + " || " + materialType + " || " + stock + " available");
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
