package model;

import model.Material;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
       return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        if (today.isBefore(getExpiryDate())&&
                (today.isAfter(getExpiryDate().minusMonths(2)))){
//            System.out.println("--> Giá bột đang giảm 40%: ");

            return getPrice()*0.6;
        }
        else if(today.isBefore(getExpiryDate().minusMonths(2)) &&
                (today.isAfter(getExpiryDate().minusMonths(4)))){
//            System.out.println("--> Giá bột đang giảm 20%: ");

            return getPrice()*0.8;
        }
        else if(today.isBefore(getExpiryDate().minusMonths(4))&&
                (today.isAfter(getManufacturingDate()))){
//            System.out.println("--> Giá bột đang giảm 5%: ");

            return getPrice()*0.95;
        }
        else {
            System.out.println("!@##$$ Bột đã hết hạn: ");
            return -1;
        }

    }


    @Override
    public String toString() {
        return "Bột chiên giòn: " +
                super.toString() +
                ",Số lượng = " + quantity +
                ",Tổng tiền = " + getRealMoney();

    }
}
