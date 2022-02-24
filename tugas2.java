import java.util.Scanner;
public class tugas2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai kecepatan : ");
        double k = sc.nextDouble();
        System.out.print("Masukkan nilai Jarak : ");
        double j = sc.nextDouble();
        System.out.print("Masukkan nilai Waktu : ");
        double w = sc.nextDouble();
        do{
            System.out.println(" ");
            System.out.println("\n---------- Rumus KJW -----------\n");
            System.out.println("==================================================================");
            System.out.println("(1) Kecepatan\t\t");
            System.out.println("(2) Jarak\t");
            System.out.println("(3) Waktu\t");
            System.out.print("Silahkan input menu yang anda inginkan: ");
            int menu = sc.nextInt();
            System.out.println(" ");
            switch (menu) {
                case 1: 
                System.out.print("Kecepatannya adalah " + kecepatan(j,w) + "m/s");
                break;

                case 2: 
                System.out.print("Jaraknya adalah " + jarak(k,w) + "m");
                break;

                case 3: 
                System.out.print("Waktunya adalah " + waktu(j,k) + "s");
                break;
            }
            System.out.println();
        } while (true);
    }
    static double kecepatan(double j, double w){
        double k = j/w;
        return k;
    }
    static double jarak(double k, double w){
        double j = k*w;
        return j;
    }
    static double waktu(double j, double k){
        double w = j/k;
        return w;
    }
    }

