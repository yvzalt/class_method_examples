package soru6;

import java.util.Scanner;

public class MainTersYaz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi girin:");
        String sayi=scanner.nextLine();
        ActionTersYaz actionTersYaz=new ActionTersYaz(sayi);
        actionTersYaz.Ters();
    }
}
