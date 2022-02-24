import java.util.Scanner;
public class pemilihan{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        System.out.println("===========================");
		System.out.println("Program Penilaian Mahasiswa");
        System.out.println("===========================");
        System.out.print("\nMasukkan nilai tugas mahasiswa : ");
        int tugas = sc.nextInt();
		System.out.print("Masukkan nilai UTS mahasiswa : ");
        int uts = sc.nextInt();
		System.out.print("Masukkan nilai UAS mahasiswa : ");
        int uas = sc.nextInt();
		System.out.println("\n===========================");
		System.out.println("Hasil input nilai mahasiswa");
		System.out.println("===========================");
		System.out.print("Tugas\t" +"|"+ "UTS\t" +"|"+ "UAS\t");
		System.out.print("\n"+ tugas + "\t|" + uts + "\t|" + uas);
		double nilaiAkhir = (float)(tugas*0.2)+(uts*0.35)+(uas*0.45);
		System.out.println("\n\nNilai akhir: " + nilaiAkhir);
		System.out.print("Nilai huruf: ");
			if(nilaiAkhir>80 && nilaiAkhir<=100){
				System.out.println("A");
				System.out.println("=====================");
				System.out.println("LULUS");
			}else if(nilaiAkhir>73 && nilaiAkhir<=80){
				System.out.println("B+");
				System.out.println("=====================");
				System.out.println("LULUS");
			}else if(nilaiAkhir>65 && nilaiAkhir<=73){
				System.out.println("B");
				System.out.println("=====================");
				System.out.println("LULUS");				
			}else if(nilaiAkhir>60 && nilaiAkhir<=65){
				System.out.println("C+");
				System.out.println("=====================");
				System.out.println("LULUS");
			}else if(nilaiAkhir>50 && nilaiAkhir<=60){
				System.out.println("C");
				System.out.println("=====================");
				System.out.println("LULUS");
			}else if(nilaiAkhir>39 && nilaiAkhir<=50){
				System.out.println("D");
				System.out.println("=====================");
				System.out.println("TIDAK LULUS");
			}else if(nilaiAkhir<39){
				System.out.println("E");
				System.out.println("=====================");
				System.out.println("TIDAK LULUS");
			}	
	}
}