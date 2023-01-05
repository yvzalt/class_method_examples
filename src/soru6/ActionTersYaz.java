package soru6;

public class ActionTersYaz {

    String sayi="";
    public ActionTersYaz(String sayi){
        this.sayi=sayi;
    }
    public void Ters(){
        char index0 = sayi.charAt(0);
        char index1 = sayi.charAt(1);
        char index2 = sayi.charAt(2);

        System.out.print(index2);
        System.out.print(index1);
        System.out.print(index0);
    }
}
