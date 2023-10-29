package Sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkBinary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range ");
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Guess number between "+a+" and "+b);
            int[] arr=new int[b+1];
            for(int i=a;i<=b;i++){
                arr[i]=i;
            }
            getBinary(arr);
        }
        catch (InputMismatchException ex){
            System.out.println("You have to enter number");
        }catch (RuntimeException ex){
            System.out.println("you dont have such as operation");
        }

    }
    public static void getBinary(int[] arr) throws RuntimeException{
        Scanner sc=new Scanner(System.in);
        int first=arr[0];
        int n=arr.length;
        int last=arr[n-1];
        int mid;
        int count=0;
        String response=" ";
        while (!response.equals("Correct")) {
            mid=first+(last-first)/2;
            System.out.println("your number is greater than " + mid + " Enter greater");
            System.out.println("your number is less than "+mid+"Enter less");
            System.out.println("Your number is equal to"+mid+"Enter Correct");
            response=sc.nextLine();
            BinaryType binaryType=BinaryType.valueOf(response.toUpperCase());
            switch (binaryType ){
                case GREATER:first=mid+1;
                count++;
                break;
                case LESS:last=mid-1;
                count++;
                break;
                case CORRECT:
                    System.out.println("Your number is "+mid);
                    System.out.println("Steps: "+count);
                    return;
                default:throw new RuntimeException();
            }


        }

    }

}
