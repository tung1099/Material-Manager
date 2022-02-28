package controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    ArrayList<Material> materials = new ArrayList<>();
    public static void addCrispyFlour(ArrayList<Material> list){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("NSX: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.print("Cost: ");
        int cost = scanner.nextInt();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        Material flour = new CrispyFlour(id,name,LocalDate.of(year,month,day),cost,quantity);
        list.add(flour);
    }
    public static void addMeat(ArrayList<Material> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("NSX: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.print("Cost: ");
        int cost = scanner.nextInt();
        System.out.print("Weight: ");
        double weight = scanner.nextInt();
        Material meat = new Meat(id, name, LocalDate.of(year,month,day), cost, weight);
        list.add(meat);
    }
}
