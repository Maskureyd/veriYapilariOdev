package Odevler.odev1;

import java.util.Random;
public class HighArray {
    private long[] dizi;
    private int elemanSayisi;
    private int primeCount;
    public HighArray(int max) {
        this.dizi = new long[max];
        elemanSayisi = 0;
    }
    public void display() {
        System.out.println("Array Elements is:");
        for (int i = 0; i < this.elemanSayisi; i++) {
            System.out.print(this.dizi[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public void fillRandom(int boyut) {
        Random random = new Random();
        for (int i = 0; i < boyut; i++) {
            int rastgeleSayi = random.nextInt(100);
            dizi[i] = rastgeleSayi;
            elemanSayisi++;
        }
        System.out.println();
    }
    public void primeNumberInfo() {
        System.out.println("Prime Numbers in Array:");
        for (int i = 0; i < elemanSayisi; i++) {
            if (isPrime(dizi[i])) {
                System.out.print(dizi[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Prime number count: "+primeCount);
        System.out.println();
        System.out.print("Numbers to be Deleted: ");
        System.out.println();
        for (int i = 0; i < elemanSayisi; i++) {
            if (!isPrime(dizi[i])) {
                System.out.print("{"+dizi[i] + "} ");
            }
        }
        System.out.print("\nNon-Prime Numbers Removed! \n");
        System.out.println();
    }
    public boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            primeCount++;
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        primeCount++;
        return true;
    }
    public void removeNonPrimeNumbers() {
        int tempIndex = 0;
        for (int i = 0; i < elemanSayisi; i++) {
            if (isPrime(dizi[i])) {
                dizi[tempIndex] = dizi[i];
                tempIndex++;
            }
        }
        elemanSayisi = tempIndex;
    }
    public void sort() {
        System.out.println("Array sorted");
        System.out.println();
        for (int i = 0; i < elemanSayisi - 1; i++) {
            for (int j = 0; j < elemanSayisi - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    long temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    }
}