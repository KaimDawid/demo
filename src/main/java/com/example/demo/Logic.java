package com.example.demo;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;
@Getter@Setter
public class Logic {


    public static  int selectPerimeter;
    public static  int selectWidth;
    public static  int selectProfile;
    public static Scanner scanner = new Scanner(System.in);

    public static void Add(){

        System.out.println("Add a tire:\nName:");
        String name = scanner.nextLine();
        System.out.println("Brand:");
        String brand = scanner.nextLine();
        System.out.println("Perimeter:");
        int perimeter = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Width:");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Profile:");
        int profile = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price:");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Tire.tireBase.add(new Tire(name,brand,perimeter,width,profile,price));

        System.out.println("Successfully added a tire: " + brand + " " + name);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Width: " + width);
        System.out.println("Profile: " + profile);
        System.out.println("Price: " + price +"zl ");
    }




    public static void Search(){
        System.out.println("Search tires: ");
        System.out.println("Provide perimeter: ");
        selectPerimeter =scanner.nextInt();
        scanner.nextLine();

        System.out.println("Provide width: ");
        selectWidth =scanner.nextInt();
        scanner.nextLine();

        System.out.println("Provide profile: ");
        selectProfile =scanner.nextInt();
        scanner.nextLine();

        System.out.println( "Searching for tires with:\nPerimeter: " + selectPerimeter +" \nWidth: "+selectWidth +"\nProfile: "+selectProfile +"\n");

        Tire.searchTires(selectPerimeter,selectWidth,selectProfile);

    }

    public static void displayTires(){
        for (int i = 0; i < Tire.tireBase.size(); i++) {
            System.out.println("Tire: " + Tire.tireBase.get(i).getLongName());
            System.out.println("Brand: " + Tire.tireBase.get(i).getBrand());
            System.out.println("Perimeter: " + Tire.tireBase.get(i).getPerimeter());
            System.out.println("Width: " + Tire.tireBase.get(i).getWidth());
            System.out.println("Profile: " + Tire.tireBase.get(i).getProfile());
            System.out.println("Price: " + Tire.tireBase.get(i).getPrice() + "zl \n \n ");
        }
    }


    public static void Run() {
        String choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Display tires");
            System.out.println("2. Search for tires");
            System.out.println("3. Add tires");

            choice = scanner.nextLine();

            switch (choice){
                case "1" -> {
                    displayTires();
                    break;
                }
                case "2" -> {
                    Search();
                    break;
                }
                case "3" -> {
                    Add();
                    break;
                }
                case "0" -> {
                    System.out.println("Thank you for using our app!");
                    break;
                }
            }
        } while (choice != "0");
        {

        }




    }


}

