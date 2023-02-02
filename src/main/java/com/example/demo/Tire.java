package com.example.demo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class Tire {

    public static ArrayList<Tire> tireBase = new ArrayList<>();

    String name;
    String longName;
    String brand;
    int perimeter;

    double width;
    int profile;

    double price;

    public Tire(String name, String brand, int perimeter, double width, int profile, double price) {
        this.name = name;
        this.longName = brand + " " + name +" " + width + "cm";
        this.brand = brand;
        this.perimeter = perimeter;

        this.width = width;
        this.profile = profile;
        this.price = price;
    }


    public static void searchTires(int perimeter, int width, int profile){
        boolean found = false;
        int slot = 1;
        for (int i = 0; i < tireBase.size(); i++) {

            if (perimeter == tireBase.get(i).getPerimeter() && width == tireBase.get(i).getWidth() && profile == tireBase.get(i).getProfile()) {

                System.out.println(slot +". \nTire: " + tireBase.get(i).getLongName());
                System.out.println("Brand: " + tireBase.get(i).getBrand());
                System.out.println("Profile: " + tireBase.get(i).getProfile());
                System.out.println("Perimeter: " + tireBase.get(i).getPerimeter());
                System.out.println("Width: " + tireBase.get(i).getWidth());
                System.out.println("Price: " + tireBase.get(i).getPrice() + "zl \n \n ");
                found = true;
                slot++;
            }

        }
        if (!found){
            System.out.println("There are no tires matching your preferences.");
        }

    }



}
