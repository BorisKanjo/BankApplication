package Banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    Konto konto1 = new Konto(1,337185,6802,10381.33);

    Kunden kunde1 = new Kunden(1,"Stefan Schmidt","steffi1", 30,"Deutsch", konto1);


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*************************************************************\n" +
                "Herzlich Wilkommen an der SchaetzBank. Die Bank der lokalen\n" +
                "Bevoelkerung\n" +
                "*************************************************************" );
    }
}
