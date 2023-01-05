package soru7;

public class ActionRapor {

    public void pozitif(int dizi[]){
        int pozitif=0;
        for (int item:dizi        ) {
            if (item > 0) {
                pozitif = pozitif + 1;
            }
        }
        System.out.println(pozitif+" tanesi pozitif");
    }

    public void negatif(int dizi[]) {
        int negatif=0;
        for (int item : dizi) {
            if (item < 0) {
                negatif = negatif + 1;
            }
        }
        System.out.println(negatif+" tanesi negatif");
    }

    public void enbuyuk(int dizi[]){
        int buyuk=0;
        for (int item:dizi        ) {
            if(item>buyuk){
                buyuk=item;
            }
        }
        System.out.println("en büyüğü: "+buyuk);
    }

    public void enkucuk(int dizi[]){
        int kucuk=0;
        for (int item:dizi        ) {
            if(item<kucuk){
                kucuk=item;
            }
        }
        System.out.println("en küçüğü: "+kucuk);
    }

    public void cift_tek(int dizi[]){
        int cift=0; int tek=0;
        for (int item:dizi) {
            if(item%2==0){
                cift=cift+1;
            }
            else {
                tek=tek+1;
            }
        }
        System.out.println(cift+" tanesi çift");
        System.out.println(tek+" tanesi tek");
    }

    public void toplam_ort(int dizi[]){
        double top=0;
        for (int item:dizi) {
            top+=item;
        }
        System.out.println("Toplamları: "+top);
        double ort=top/ dizi.length;
        System.out.println("Ortalamaları: "+ort);
    }
}
