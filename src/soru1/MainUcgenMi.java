package soru1;

import java.util.Scanner;

public class MainUcgenMi {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Üçgenin 1. kenarı:");
        int a =scanner.nextInt();

        System.out.println("Üçgenin 2. kenarı:");
        int b =scanner.nextInt();

        System.out.println("Üçgenin 3. kenarı:");
        int c =scanner.nextInt();

        ActionUcgenMi actionucgenmi=new ActionUcgenMi();
        actionucgenmi.ucgenmi(a,b,c);


    }
}