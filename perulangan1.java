import java.util.Scanner;
public class perulangan1{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int nim, n;
   System.out.println("=====================");
   System.out.println("PROGRAM HARI SESUAI NIM");
   System.out.println("=====================");
   System.out.println("\nMasukkan NIM Anda : ");
   nim = sc.nextInt();
   System.out.println("=====================");
      
   n = nim - 2041720000;
   if(n<10){
      n += 10;
   }
   System.out.println("n : " + n);
          
   for(int i=0; i<n; i++){
          int  = i%7;
       if (nimHari==0){
          System.out.print("Senin ");
       }else if (nimHari==1){
          System.out.print("Selasa ");
       }else if (nimHari==2){
          System.out.print("Rabu ");
       }else if (nimHari==3){
          System.out.print("Kamis ");
       }else if (nimHari==4){
          System.out.print("Jumat ");
       }else if (nimHari==5){
          System.out.print("Sabtu ");
       }else if(nimHari== 6){
          System.out.print("Minggu ");
       }else {
       System.out.println();
       }
   } 
   }
}