package soru5;

public class Action3hanelisayi {
    public int basamaktopla(String sayi){

        char index0 = sayi.charAt(0);
        char index1 = sayi.charAt(1);
        char index2 = sayi.charAt(2);

        int basamak3 = index0 - '0';
        int basamak2 = index1 - '0';
        int basamak1 = index2 - '0';

        int toplam=basamak3+basamak2+basamak1;

        return toplam;
    }
}
