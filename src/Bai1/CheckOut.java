package Bai1;
import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        String discode ="testing";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao discount code: ");
        String code= sc.nextLine();
        String app=code.toUpperCase();
        float sub=10;
        float discount=5;
        double ship= 4.99;
        if(code.equalsIgnoreCase(discode) && app.equals("TESTING")){
            System.out.println("a Pass");
        }else{
            System.out.println("a False");
        }
        if(code.equalsIgnoreCase(discode) && (sub-discount+ship)==9.99){
            System.out.println("b Pass");
        }else{
            System.out.println("b False");
        }

    }


}
