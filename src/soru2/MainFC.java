package soru2;

import java.util.Scanner;

public class MainFC {
    public static void main(String[] args) {
        System.out.println("1 - F -> C\n2 - C -> F\nSecim:");
        Scanner scanner=new Scanner(System.in);
        ActionFC actionFC=new ActionFC();
        int secim=scanner.nextInt();
        if (secim==1){
            System.out.println("F değerini giriniz:");
            double f=scanner.nextDouble();
            double fc=actionFC.fc(f);
            System.out.println(f+"F="+fc+"C");
        }
        else if (secim==2) {
            System.out.println("C değerini giriniz:");
            double c=scanner.nextDouble();
            double cf=actionFC.cf(c);
            System.out.println(c+"C="+cf+"F");
        }
        else {
            System.out.println("Hatalı Seçim");
        }


    }
}
