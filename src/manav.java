//Armut : 2,14 TL
// Elma : 3,67 TL
// Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL

import java.util.Scanner;

public class manav {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            Double armut,elma,domates,muz,patlican;

    System.out.print("Armut Kg Miktari Giriniz : ");
    armut=scan.nextDouble();
    System.out.print("Elma Kg Miktari Giriniz : ");
    elma=scan.nextDouble();
    System.out.print("Domates Kg Miktari Giriniz : ");
    domates=scan.nextDouble();
    System.out.print("Muz Kg Miktari Giriniz : ");
    muz=scan.nextDouble();
    System.out.print("Patlican Kg Miktari Giriniz : ");
    patlican= scan.nextDouble();

        armut = armut * 2.14;
        elma = elma * 3.67;
        domates= domates * 1.11;
        muz= muz * 0.95;
        patlican= patlican * 5.0;
        Double toplam = armut + elma + domates + muz + patlican;
    System.out.print("Toplam Tutar : " + toplam);


    }



}
