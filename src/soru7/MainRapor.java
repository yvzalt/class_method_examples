package soru7;

import java.util.Scanner;

public class MainRapor {
    public static void main(String[] args) {
        System.out.println("Kaç sayı gireceksiniz:");

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] dizi=new int[n];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+". sayıyı giriniz");
            dizi[i]=scanner.nextInt();
        }

        ActionRapor actionRapor=new ActionRapor();
        actionRapor.pozitif(dizi);
        actionRapor.negatif(dizi);
        actionRapor.enbuyuk(dizi);
        actionRapor.enkucuk(dizi);
        actionRapor.cift_tek(dizi);
        actionRapor.toplam_ort(dizi);

    }
}
