package soru2;

public class ActionFC {
    public double fc(double in){
        double c=(in-32)/1.8;
        return c;
    }
    public double cf(double in){
        double f=(in*1.8)+32;
        return f;
    }

}
