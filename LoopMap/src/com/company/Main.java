package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        HashMap<String, String> modelMake = new HashMap<>();

        System.out.println("Menu: ");
        System.out.println("1. Number Program");
        System.out.println("2. Hash Map / Car Dealer Program");
        System.out.printf("Type 1 or 2 to continue: ");
        int menuKey = scan.nextInt();
        if(menuKey == 1) {
            System.out.println("Number Program! Here we go.");
            for (int i = 0; i < 5; i++) {
                System.out.printf("Please enter a number! - ");
                numbers.add(scan.nextInt());
            }
            int sum = numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3) + numbers.get(4);
            int product = numbers.get(0) * numbers.get(1) * numbers.get(2) * numbers.get(3) * numbers.get(4);

            System.out.println(numbers);
            System.out.println("Sum first. Let's add them together...");
            System.out.println("Done! The sum of numbers in the array is.." + " " + sum);
            System.out.println("Product next. Let's multiply them together...");
            System.out.println("Done! The product of numbers in the array is.." + " " + product);

            System.out.println("Finally, let's find the largest and smallest number.");
            System.out.println("The largest is..." + Collections.max(numbers));
            System.out.println("The smallest is..." + Collections.min(numbers));
        }
        else if(menuKey == 2){
            System.out.println("Hash Map Program! Great.");
            modelMake.put("civic","Honda");
            modelMake.put("corolla","Toyota");
            modelMake.put("focus","Ford");
            modelMake.put("cherokee","Jeep");

            System.out.print("What model of car are you looking for? - ");
            String cartype = scan.next().toLowerCase();
            if(modelMake.containsKey(cartype)){
                System.out.print("Sure we have that! It's a... ");
                System.out.println(modelMake.get(cartype).toString());
            }
            else if(!modelMake.containsKey(cartype) && !cartype.equals("exit")){
                System.out.println("Sorry, we don't have that.");
            }
            else if(cartype.equalsIgnoreCase("exit")) {
                System.out.println("Thanks! Have a good day.");
                System.exit(0);
            }
        }
    }
}