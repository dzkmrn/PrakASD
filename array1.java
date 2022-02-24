public class array1 {
    public static void main(String[] args) {
        String cabangToko[] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        String bunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};

        int stokArr[][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
    
        int jumAglo = stokArr[0][0] + stokArr[1][0] + stokArr[2][0] + stokArr[3][0];
        int jumKeldi = stokArr[0][1] + stokArr[1][1] + stokArr[2][1] + stokArr[3][1];
        int jumAlo = stokArr[0][2] + stokArr[1][2] + stokArr[2][2] + stokArr[3][2];
        int jumMaw = stokArr[0][3] + stokArr[1][3] + stokArr[2][3] + stokArr[3][3];

        System.out.println("Stock bunga pada seluruh Cabang: ");
        System.out.println("=====================");
        System.out.println("Aglonema\t: " + jumAglo);
        System.out.println("Keladi\t\t: " + jumKeldi);
        System.out.println("Alocasia\t: " + jumAlo);
        System.out.println("Mawar\t\t: " + jumMaw);

        int minusAg = stokArr[0][0] - 1;
        int minusKel = stokArr[0][1] - 2;
        int minusAlo = stokArr[0][2] - 0;
        int minusMaw = stokArr[0][3] - 5;

        System.out.println("\nPengurangan stock bunga pada cabang Royal Garden 1");
        System.out.println("=====================");
        System.out.println("Aglonema\t: "+ minusAg);
        System.out.println("Keladi\t\t: "+ minusKel);
        System.out.println("Alocasia\t: "+ minusAlo);
        System.out.println("Mawar\t\t: "+ minusMaw);
        System.out.println("=====================");
        int income = (minusAg*75000) + (minusKel*50000) + (minusAlo*60000) + (minusMaw*10000);
        System.out.println("");
        System.out.println("Pendapatan Royal Garden 1: Rp"+ income);
        }
}
