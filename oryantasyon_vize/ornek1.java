package oryantasyon_vize;

import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        int sayi1=giris.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int sayi2=giris.nextInt();
        
        int toplam=sayi1+sayi2;
        
        System.out.println("Toplam="+toplam);
    }
    
}
