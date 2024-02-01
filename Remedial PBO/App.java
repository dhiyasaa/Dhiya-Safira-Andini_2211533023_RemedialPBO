import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String k = "Lanjut";
        Integer HargaKilo = 0;
        Integer JumlahKilo = 0;
        
        // Update
        Scanner scanner = new Scanner(System.in);
        update.updateEmployeeCredentials(scanner);
        System.out.println("");

        // Create
        Scanner scanNEW = new Scanner(System.in);
        create.insertEmployeeData(scanNEW);
        System.out.println("");

        // Delete
        delete.deleteEmployeeById();
        System.out.println("");

        LoginLo DS = new LoginLo();
        while(k.equals("Lanjut")){
            boolean input = false;
            Scanner cuci1 = new Scanner(System.in);
            Scanner pur = new Scanner(System.in);
            System.out.print("Kasir            : ");
            String Kasir= cuci1.nextLine();
            System.out.print("Nama Pelanggan   : ");
            String NamaPelanggan = cuci1.nextLine();
            System.out.print("Alamat           : ");
            String Alamat = cuci1.next();
            System.out.print("No HP            : ");
            String NoHp= cuci1.next();
            System.out.print("Parfume      : ");
            String NamaParfume = cuci1.next();

                do{
                    try {
                        System.out.print("Harga Kilo     : ");
                        HargaKilo = pur.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    pur.next();}
                }while(!input); 
            input = false;
                do{
                    try {
                        System.out.print("Jumlah Kilo      : ");
                        JumlahKilo = pur.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                        pur.next();}
                }while(!input);
            
            Penjualan cuci  = new Penjualan(Kasir, NamaPelanggan, Alamat, NoHp, NamaParfume, HargaKilo, JumlahKilo);

            Scanner cuci2 = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("ketik Lanjut untuk melanjutkan");
            k = cuci2.next();
            System.out.println();
        }
    }
}
