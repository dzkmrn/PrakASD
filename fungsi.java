import java.util.*;

public class fungsi {
    static String cabangToko[] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
    static String bunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};
    static int arrStock[][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" ");
            System.out.println("\n---------------- Royal Garden ---------------\n");
            System.out.println("=============================================");
            System.out.println("\t\t    MENU  \t\t ");
            System.out.println("=============================================\n");
            System.out.println("(1) Menampilkan Tabel Stock Bunga\t\t");
            System.out.println("(2) Menampilkan Jumlah Stock Bunga di seluruh cabang\t");
            System.out.println("(3) Exit");
            System.out.print("Silahkan input menu yang anda inginkan: ");
            int menu = sc.nextInt();
            System.out.println(" ");

            switch (menu) {
                case 1: {
                    stockbunga();
                }
                break;

                case 2: {
                    jumlahstock(cabangToko, bunga);
                }
                break;

                case 3: {
                    keluar();
                }
                
            }
            System.out.println();

        } while (true);
    }
    static void stockbunga(){
        System.out.println("============");
        System.out.println(">STOK BUNGA<");
        System.out.println("============");
        System.out.println("Aglonema\t|\tKeladi\t|\tAlocasia|\tMawar\t|");
        for (int i = 0; i < arrStock.length; i++) {
            for(int j = 0; j < arrStock.length; j++){
                System.out.print(arrStock[i][j]+ "\t\t|");
            }
        System.out.println(" ");
        }
    }
    static void jumlahstock(String cabangToko[], String bunga[]) {
        int jumAglo = arrStock[0][0] + arrStock[1][0] + arrStock[2][0] + arrStock[3][0];
        int jumKeldi = arrStock[0][1] + arrStock[1][1] + arrStock[2][1] + arrStock[3][1];
        int jumAlo = arrStock[0][2] + arrStock[1][2] + arrStock[2][2] + arrStock[3][2];
        int jumMaw = arrStock[0][3] + arrStock[1][3] + arrStock[2][3] + arrStock[3][3];

        System.out.println("Stock bunga pada seluruh Cabang: ");
        System.out.println("=====================");
        System.out.println("Aglonema\t: " + jumAglo);
        System.out.println("Keladi\t\t: " + jumKeldi);
        System.out.println("Alocasia\t: " + jumAlo);
        System.out.println("Mawar\t\t: " + jumMaw);
    }
    static void keluar(){
        System.out.println("Terimakasih karena telah memercayai kami!");
        System.exit(0);
    }
}        



