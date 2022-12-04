
package oryantasyon_vize;

import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        
        int deger=giris.nextInt();
        int faktoriyel=1;
        
        for(int i=1;i<=deger;i++){
            faktoriyel*=i;
            
        }
        System.out.println("-----------------------------------------");
        System.out.println("Faktöriyel:"+faktoriyel);
    }
    
}
