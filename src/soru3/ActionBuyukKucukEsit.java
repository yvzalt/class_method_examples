package soru3;

public class ActionBuyukKucukEsit {

    public void yazdir(int num1,int num2){

        if(num1>num2){
            System.out.println(num1+" büyüktür, "+num2+" küçüktür");
        }
        else if (num1<num2) {
            System.out.println(num2+" büyüktür, "+num1+" küçüktür");
        }
        else {
            System.out.println("eşittir");
        }

    }

}
