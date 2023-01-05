package soru3;

import java.util.Scanner;

public class MainBuyukKucukEsit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        int num1=scanner.nextInt();

        System.out.println("2.sayıyı giriniz");
        int num2=scanner.nextInt();

        ActionBuyukKucukEsit actionBuyukKucukEsit=new ActionBuyukKucukEsit();
        actionBuyukKucukEsit.yazdir(num1,num2);
    }
}
