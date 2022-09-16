


public class mükemmelsayı {

    
    public static void main(String[] args) {
        int sayı = 6;
        int toplam =0;
        for (int i = 1; i <sayı; i++)
        {
            if (sayı%i==0) 
            {
                toplam+=i;
            }
        }
        if (toplam==sayı) 
        {
            System.out.println(sayı+" Mükemmel sayıdır.");
        }
        else
        {
            System.out.println(sayı+" Mükemmel sayı değildir.");
        }    
        
        
    }
    
}
