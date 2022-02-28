package model;

import model.Material;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    @Override
    public double getPrice() {
        return getCost() * weight;
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        if (today.isBefore(getExpiryDate()) &&
                (today.isAfter(getExpiryDate().minusDays(5)))){
//            System.out.println("--> Giá thịt đang giảm 30%: ");
            return getPrice() * 0.7;
        } else if (today.isBefore(getExpiryDate().minusDays(5)) &&
                today.isAfter(getManufacturingDate())){
//            System.out.println("--> Giá thịt đang giảm 10%: ");
            return getPrice() * 0.9;
        } else {
            System.out.println(".......Thịt đã hết hạn: ");
            return -1;
        }
    }


    @Override
    public String toString() {
        return "Thịt: " +
                super.toString() +
                ",Trọng lượng = " + weight +
                ",Tổng tiền = " + getRealMoney();
    }
}
