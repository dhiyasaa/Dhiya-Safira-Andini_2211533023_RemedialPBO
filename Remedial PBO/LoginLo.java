import java.sql.*;
import java.util.*;

public class LoginLo {
    public String Code[] = {"KM123","KM321","KM1432","KM7890","KM5686"};
    public String Captcha;
    public int hitung = -1;
    public LoginLo(){
        try{
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Menghubungkan ke database
            String url = "jdbc:mysql://localhost:3306/pegawai";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);

            String id;
            String passwordInput;
            Scanner laundry=new Scanner(System.in);

            System.out.println("SELAMAT DATANG DI DHIYA'S LAUNDRY");
            System.out.println("===================================================");
            System.out.println("Log in  ");
                do{
                    System.out.print("Username         : ");
                    id = laundry.next();
                    System.out.print("Password         : ");
                    passwordInput = laundry.next();
                    if(validateUser(connection, id, passwordInput)){
                        int random = 0;

                        do{
                            if(random>0){
                                System.out.println("Captcha Salah !!!");
                            }
                            random++;
                            hitung ++;
                            hitung %=3;
                            System.out.println("Kode Captcha     : " + Code[hitung]);
                            System.out.print("Entry Captcha    : ");
                            Scanner DS1 = new Scanner(System.in);
                            Captcha = DS1.next();

                        }while(!Captcha.equals(Code[hitung]));


                        System.out.println("Akun Anda Berhasil Terverifikasi");
                        break;
                    }else{
                        System.out.println("Coba Lagi");
                    }
                }while(true); 
                
                // tutup koneksi database
                connection.close();

            }catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        private boolean validateUser(Connection connection, String username, String password) throws SQLException {
            String query = "SELECT * FROM anggota WHERE Nama_Pegawai=? AND Pass_Pegawai=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                return resultSet.next();
        }
     }
}
