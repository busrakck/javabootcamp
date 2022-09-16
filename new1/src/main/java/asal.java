
import java.util.Scanner;


public class asal {

   
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        int sayac =0;
        int sayı;
        do {
            System.out.println("Sayıyı giriniz");
            sayı = input.nextInt();
            
        } while (sayı<1);
       
        for (int i = 2; i < sayı; i++)
        {
            if (sayı%i==0)
            {
                sayac++;
            }
        }
        if (sayac==0)
        {
            System.out.println("Sayı asaldır");
        }
        else
        {
            System.out.println("Sayı asal değildir");
        }    
    }
    
}
