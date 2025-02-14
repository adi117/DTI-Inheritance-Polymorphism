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
        materialMap.put("1", new Book("Devil all the time", 10));
        materialMap.put("2", new Book("Rahvayana", 15));
        materialMap.put("3", new Book("Man search for meaning", 2));
        materialMap.put("4", new Magazine("Bobo", 5));
        materialMap.put("5", new Magazine("National Geographic", 20));
        materialMap.put("6", new Magazine("Tempo", 11));
        materialMap.put("7", new Journal("Medical", 7));
        materialMap.put("8", new Journal("Economic", 10));
        materialMap.put("9", new Journal("Technology", 15));

        Material selectedMaterial = null;

        selectedMaterial = null;

        while (true){
            Material.displayAllMaterial(materialMap);
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
                System.out.println("4. Material list");
                System.out.println("q. Quit");
                System.out.print("Select menu : ");
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
                    case "4" :
                        break;
                    case "q" :
                        return;
                    default:
                        System.out.println("No selected menu!");
                        continue;
                }

                break;
            }
        }

    }
}