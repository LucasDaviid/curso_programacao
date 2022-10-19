package entities;

public class Currencyconverter {
    public static double dollar;
    public static double buy;

    public static double conversion(){
       return (buy * dollar * 6 /100) + buy * dollar;
    }
}
