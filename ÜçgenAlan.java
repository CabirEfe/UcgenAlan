/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 *
 */
import java.util.Scanner;

public class ÜçgenAlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgende Alan Hesaplamya Hoşgeldin");
        System.out.println("Üçgenin Taban Uzunluğunu Giriniz: ");
        double tu = input.nextDouble();
        
        
        
        
        System.out.println("Üçgenin yüksekliğini giriniz: ");
        double yü = input.nextDouble();
        
        
        double Alan = tu * yü / 2;
        
        System.out.println("Üçgenin Alanı: "+Alan);
        
        
        
        
    }
    
}
