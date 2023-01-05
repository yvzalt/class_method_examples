package soru1;

public class ActionUcgenMi {


    public void ucgenmi (int a,int b,int c){
        if (a+b>c){
            if (a+c>b){
                if (b+c>a){
                    System.out.println("üçgen olur");
                }
                else {
                    System.out.println("üçgen olmaz");
                }
            }
            else {
                System.out.println("üçgen olmaz");
            }
        }
        else {
            System.out.println("üçgen olmaz");
        }

    }



}
