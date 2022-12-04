package oryantasyon_vize;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Kaç kilo elma alacaksınız:");
        int elma=giris.nextInt();
        int elmaFiyat=2*elma;
        
        System.out.println("Kaç kilo armut alacaksınız:");
        int armut=giris.nextInt();
        int armutFiyat=3*elma;
        
        System.out.println("Kaç kilo elma alacaksınız:");
        int portakal=giris.nextInt();
        int portakalFiyat=4*elma;
        
        int toplam=elmaFiyat+armutFiyat+portakalFiyat;
        System.out.println("Hesap:"+toplam+"TL");
        
    }
    
}
