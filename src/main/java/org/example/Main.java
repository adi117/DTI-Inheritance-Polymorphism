package org.example;

import org.example.entity.Book;
import org.example.entity.Journal;
import org.example.entity.Magazine;
import org.example.entity.Material;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Material> materialMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        materialMap.put("Devil all the time", new Book("Devil all the time"));
        materialMap.put("Rahvayana", new Book("Rahvayana"));
        materialMap.put("Man search for meaning", new Book("Man search for meaning"));
        materialMap.put("Bobo", new Magazine("Bobo"));
        materialMap.put("National Geographic", new Magazine("National Geographic"));
        materialMap.put("Tempo", new Magazine("Tempo"));
        materialMap.put("Medical", new Journal("Medical"));
        materialMap.put("Economic", new Journal("Economic"));
        materialMap.put("Technology", new Journal("Technology"));

        Material selectedMaterial = null;

        System.out.println("--- Material List ---");
        for (Material material : materialMap.values()){
            material.displayMaterial();
        }

        selectedMaterial = null;

        while (selectedMaterial == null){
            System.out.println("----");
            System.out.print("What material you want to borrow? ");
            String material = scanner.nextLine();

            if (materialMap.get(material) != null){
                selectedMaterial = materialMap.get(material);
            } else {
                System.out.println("No material found in the library!");
            }
        }

        while (true){
            System.out.println("----");
            System.out.println("Do you want to borrow or return :");
            System.out.println("1. Borrow");
            System.out.println("2. Return");
            System.out.println("q. Quit");
            String action = scanner.nextLine();

            switch (action){
                case "1" :
                    selectedMaterial.borrowMaterial();
                    break;
                case "2" :
                    selectedMaterial.returnMaterial();
                    break;
                case "q" :
                    return;
                default:
            }
        }


    }
}