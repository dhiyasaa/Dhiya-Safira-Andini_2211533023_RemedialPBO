import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Penjualan extends Pelanggan {
    static Integer KodePel = 1;
    String NamaParfume;
    Integer HargaKilo;
    Integer JumlahKilo;
    Integer TotalBayar;
    String Kasir;
    
    public Penjualan(String Kasir, String NamaPelanggan, String Alamat, String NoHp, String NamaParfume, Integer HargaTotal, Integer JumlahKilo){
        super(NamaPelanggan,Alamat,NoHp);
        this.Kasir=Kasir;
        this.NamaPelanggan=NamaPelanggan;
        this.Alamat=Alamat;
        this.NoHp=NoHp;
        TotalBayar=HargaKilo * JumlahKilo;
        cetakStruk();  
    }

    @Override
    public void cetakStruk(){
        System.out.println("---------------------------------------------------");
        System.out.println("                   DHIYA'S LAUNDRY " );
            Date tanggalSekarang = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String tanggalTerformat = sdf.format(tanggalSekarang);
        System.out.println("Tanggal       : " + tanggalTerformat);
            Date waktuSekarang = new Date();
             SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String waktuTerformat = sdf.format(waktuSekarang);
        System.out.println("Waktu         : " + sdf2.format(waktuSekarang) + " WIB");
        System.out.println("===================================================");
        System.out.println("                  DATA PELANGGAN              ");
        System.out.println("---------------------------------------------------");
        System.out.println("Nama Pelanggan: " + NamaPelanggan);
        System.out.println("No.HP         : " + NoHp);
        System.out.println("Alamat        : " + Alamat);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("              DATA PEMBELIAN BARANG              ");
        System.out.println("---------------------------------------------------");
        System.out.println("Kode Pelanggan   : DSB" + KodePel);
        System.out.println("Nama Parfume   : " + NamaParfume);
        System.out.println("Harga Kilo  : Rp." + HargaKilo);
        System.out.println("Jumlah Kilo   : " + JumlahKilo + " Kilo");
        System.out.println("Total Bayar   : Rp." + TotalBayar );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Kasir         : " + Kasir );
    }
}
