package oryantasyon_vize;

import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        int dtarih=giris.nextInt();
        int yas=2022-dtarih;
        if(yas>=18){
            System.out.println("Ehliyet alabilirsiniz");
            
        }
        else{
            System.out.println("Ehliyat alamazsınız");
        }
    }
    
}
