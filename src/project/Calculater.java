package project;

public class Calculater {
    public static void main(String [] args) {
        int a;
        System.out.println("Calculater class started.");
        a = add(3, 5);
        System.out.println(a);
    }
    
    public static int add(int a, int b) {
        int num;        
        num = a + b;
        return num;
    }
}