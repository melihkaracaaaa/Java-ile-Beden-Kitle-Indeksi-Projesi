package kosullubedenkıtleındeksı;


import java.util.Scanner;


public class KosulluBedenKıtleIndeksı {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuz (Örn ; 150,90) : ");
        int kilo = scanner.nextInt();
        
        System.out.print("Boyunuz (Örn ; 1,20-1,85): ");
        Double boy = scanner.nextDouble();
     
        double bki = ( kilo/(boy*boy ));
    
    
        if (bki < 18.5 ) {
            System.out.print("Zargana");
  
}
       else if (bki>= 18.5 && bki <= 25) {
            System.out.print("İdare eder");
}       
        else if (bki>=25 && bki<= 30) {
            System.out.print("Fazla kilolu");
            }
            
        else 
            System.out.print("ŞİŞMAN");
    
    
}
}


        
        
          

