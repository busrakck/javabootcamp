
public class sayıbulma {

    
    public static void main(String[] args) {
        int [] sayılar = {1,2,5,7,9,0};
        int bul =6;
        boolean var=false;
        for (int i = 0; i < sayılar.length; i++)
        {
            if (bul==sayılar[i]) 
            {
                var=true;
                break;
            }
        }
        if (var)
        {
            System.out.println("Sayı var.");
        }
        else
        {
            System.out.println("Sayı yok.");
       }   
    }
    
}
