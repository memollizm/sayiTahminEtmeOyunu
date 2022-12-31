package example;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi,kere=0,tahmin;
        
        sayi=(int)(Math.random()*100)+1;
        
        do{
            kere++;
            System.out.print("Tahmininiz: ");
            tahmin = klavye.nextInt();
            if(tahmin>sayi){
                System.out.println("Lutfen daha kucuk bir sayi tahmin ediniz.");
            }
            if(tahmin<sayi){
                System.out.println("Lutfen daha buyuk bir sayi tahmin ediniz.");
            }
        }
        while(tahmin!=sayi);
        System.out.print("Tebrikler bildiniz.");
        System.out.println(" "+kere+". Adimda buldunuz.");
    }
}
