public class tugas1{
    public static void main(String[] args){
        String[] customer = {"Ani", "Budi", "Bina", "Cita"};
        int[] kiloan = {4, 15, 6, 11};
        System.out.println("============================");
        System.out.println("\tSMILE LAUNDRY");
        System.out.println("============================");
        System.out.print("Nama\t|" + "Berat Laundry\t|" + "Tarif\t");
        for(int i=0;i<customer.length;i++){
        System.out.print("\n"+customer[i]+"\t|");
        System.out.print(kiloan[i]+" kg"+"\t\t|");    
        double tarif = (float)(kiloan[i]*4500);
        double diskon = (float)(0.05*tarif);
        if(kiloan[i]>10){
            double potongan = (tarif-diskon);
            System.out.print(potongan);
        }else if(kiloan[i]<=10){
            System.out.print(tarif);
        }
        }
        System.out.println("\nTotal Pendapatan Smile Laundry: " +(kiloan[0]*4500+kiloan[1]*4500-(0.05*(kiloan[1]*4500))+kiloan[2]*4500+kiloan[3]*4500-(0.05*(kiloan[3]*4500))));
        }
        }
