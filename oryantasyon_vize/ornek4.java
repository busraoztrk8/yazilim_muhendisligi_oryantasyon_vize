
package oryantasyon_vize;

import java.util.Scanner;


public class ornek4 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int sayi;
         sayi=input.nextInt();
         
         if(sayi%2==0){
             System.out.println(sayi+"sayısı çift sayıdır");
             
         }
         else{
             System.out.println(sayi+" "+"sayısı tek sayıdır");
         }
    }
    
}
