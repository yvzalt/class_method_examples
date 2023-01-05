package soru5;

import java.util.Scanner;

public class Main3hanelisayi {
    public static void main(String[] args) {
        System.out.println("sayi giriniz:");

        Scanner scanner=new Scanner(System.in);
        String sayi=scanner.nextLine();

        Action3hanelisayi action3hanelisayi=new Action3hanelisayi();
        System.out.println(action3hanelisayi.basamaktopla(sayi));
    }
}
