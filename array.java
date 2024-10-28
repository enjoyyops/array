import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String mahasiswa[] = new String[100];
        int nilai[] = new int [100];
        
        Scanner sc = new Scanner(System.in);
        String inputData = "y";
        int i=0;
        do{
            System.out.print("Masukan nama: ");
            mahasiswa[i] = sc.nextLine();

            System.out.print("masukan nilai: ");
            nilai[i] = sc.nextInt();

            System.out.print("Input lagi?: (y/n) ");
            inputData = sc.nextLine();
            i++;
        } while(i<mahasiswa.length && inputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println("\nMasukan jumlah data: " + i);

        System.out.println(" ");
        int x=1;
        for (int j = 0; j < mahasiswa.length; j++){
            if(mahasiswa[j]!=null){
                System.out.println("----------------------------------------------");
                System.out.println("Mahasiswa ke : "+ (x++));
                System.out.println("Nama Mahasiswa: "+mahasiswa[j]);
                System.out.println("Nilai: "+nilai[j]);
            }
        }

        System.out.println("\nDaftar Mahasiswa: ");
        System.out.println("=====================================================");
        System.out.println("No \t Nama \t\t Nilai \t\t Keterangan");
        System.out.println("----------------------------------------------");
        x=1;
        for (int k = 0; k < mahasiswa.length; k++) {
            if (mahasiswa[k] != null) {
                String keterangan = (nilai[k] >= 75) ? "lulus" : "Tidak Lulus";
                System.out.println((x++) + "\t\t" + mahasiswa[k] + "\t\t" + nilai[k] + "\t\t" + keterangan);
            }
        }System.out.println("====================================================");
        double jumlah=0;
        for (double num : nilai){
            jumlah +=num;
        }
        System.out.println("jumlah nilai: "+jumlah);
        double rata2 = jumlah / i;
        System.out.println("nilai rata-rata: "+rata2);

        }
    }
    

