package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaterialManager {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Material> materials = new ArrayList<>();
        CrispyFlour crispyFlour1 = new CrispyFlour("C1","CrispyFlour 1", LocalDate.of(2021,8,1), 10, 1 );
        CrispyFlour crispyFlour2 = new CrispyFlour("C2","CrispyFlour 2", LocalDate.of(2021,6,2), 10, 10 );
        CrispyFlour crispyFlour3 = new CrispyFlour("C3","CrispyFlour 3", LocalDate.of(2021,5,3), 10, 100 );
        CrispyFlour crispyFlour4 = new CrispyFlour("C4","CrispyFlour 4", LocalDate.of(2021,4,4), 10, 20 );
        CrispyFlour crispyFlour5 = new CrispyFlour("C5","CrispyFlour 5", LocalDate.of(2021,2,5), 10, 50 );
        materials.add(crispyFlour1);
        materials.add(crispyFlour2);
        materials.add(crispyFlour3);
        materials.add(crispyFlour4);
        materials.add(crispyFlour5);
        Meat meat1 = new Meat("M1","Meat 1", LocalDate.of(2022,2,26),100,1200);
        Meat meat2 = new Meat("M2","Meat 2", LocalDate.of(2022,2,2),100,20);
        Meat meat3 = new Meat("M3","Meat 3", LocalDate.of(2022,2,22),100,2000);
        Meat meat4 = new Meat("M4","Meat 4", LocalDate.of(2022,2,23),100,400);
        Meat meat5 = new Meat("M5","Meat 5", LocalDate.of(2022,2,24),100,500);
        materials.add(meat1);
        materials.add(meat2);
        materials.add(meat3);
        materials.add(meat4);
        materials.add(meat5);

        System.out.println("_________Danh sách bột chiên giòn__________");
        System.out.println(crispyFlour1.toString());
        System.out.println(crispyFlour2.toString());
        System.out.println(crispyFlour3.toString());
        System.out.println(crispyFlour4.toString());
        System.out.println(crispyFlour5.toString());
        System.out.println("_________Danh sách thịt__________");
        System.out.println(meat1.toString());
        System.out.println(meat2.toString());
        System.out.println(meat3.toString());
        System.out.println(meat4.toString());
        System.out.println(meat5.toString());
        
        double totalPrice = 0;
        double totalPriceAfterDiscount = 0;
        for (Material material:materials
             ) {
            totalPrice += material.getAmount();
            totalPriceAfterDiscount += material.getRealMoney();
        }
        double totalDifference = totalPrice - totalPriceAfterDiscount;
        System.out.print("Tổng chênh lệch giữa chiết khấu và không chiết khấu là: " + totalDifference);
    }
    
}
