package Odevler.odev1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi Boyutu Giriniz:");
        int boyut = scanner.nextInt();

        HighArray dizi = new HighArray(boyut);

        dizi.fillRandom(boyut);
        dizi.display();

        dizi.primeNumberInfo();

        dizi.removeNonPrimeNumbers();
        dizi.display();

        dizi.sort();
        dizi.display();
    }
}