package oryantasyon_vize;

import java.util.Scanner;

public class ornek_10 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Ürünün KDV'siz fiyatını giriniz:");
        int fiyat=giris.nextInt();
        double yeni_fiyat=fiyat+(fiyat*0.18);
        System.out.println("KDV'li fiyatı:"+yeni_fiyat);
                
    }
    
}
