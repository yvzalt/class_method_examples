package soru4;

import java.util.Scanner;

public class MainToplam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int n= scanner.nextInt();
        ActionToplam actionToplam=new ActionToplam();
        int t=actionToplam.toplam(n);
        System.out.println("1'den "+n+"'e kadar olan sayıların toplamı= "+t);
    }

}
