package Sorting;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First range");
        int lower = sc.nextInt();
        System.out.println("Last range");
        int upper = sc.nextInt();

        System.out.println("Think number between 1 and 50");

        int mid = 0;
        int guess = 0;
        String response=" ";

        while(!response.equals("Correct")){
            mid=lower+(upper-lower)/2;
            System.out.println("Is your number greater than "+mid+" Enter greater otherwise Enter less");
            sc=new Scanner(System.in);
            response=sc.nextLine();
            if(response.equals("greater")){
                lower=mid+1;


            }else if(response.equals("less")){
                upper=mid-1;

            }else if(response.equals("Correct")){
                guess=mid;
                System.out.println("It is your number "+guess);
                return;
            }else{
                System.out.println("Enter right operation");
            }

        }



    }
}


