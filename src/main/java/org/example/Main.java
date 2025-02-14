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
        materialMap.put("1", new Book("Devil all the time"));
        materialMap.put("2", new Book("Rahvayana"));
        materialMap.put("3", new Book("Man search for meaning"));
        materialMap.put("4", new Magazine("Bobo"));
        materialMap.put("5", new Magazine("National Geographic"));
        materialMap.put("6", new Magazine("Tempo"));
        materialMap.put("7", new Journal("Medical"));
        materialMap.put("8", new Journal("Economic"));
        materialMap.put("9", new Journal("Technology"));

        Material selectedMaterial = null;

        int materialNumber = 0;
        System.out.println("--- Material List ---");
        for (Material material : materialMap.values()){
            materialNumber++;
            System.out.print(materialNumber + ". ");
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
            System.out.println("3. Display");
            System.out.println("q. Quit");
            String action = scanner.nextLine();

            switch (action){
                case "1" :
                    selectedMaterial.borrowMaterial();
                    break;
                case "2" :
                    selectedMaterial.returnMaterial();
                    break;
                case "3" :
                    selectedMaterial.displayDetail();
                    break;
                case "q" :
                    return;
                default:
            }
        }


    }
}