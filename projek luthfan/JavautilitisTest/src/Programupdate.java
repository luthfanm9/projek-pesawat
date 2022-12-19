

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Connection;  
import java.sql.Statement;

public class Programupdate {


    public static void main(String[] args) {
    Connection koneksi = KoneksiDatabases.getKoneksi();    
    Statement statement = null;
    try{
            statement =koneksi.createStatement();
    System.out.println("Statement berhasil dibuat");
    String url= "UPDATE tiket set nama_penumpang='Zonson', jumlah_beli=1, total_bayar=600000,uang_kembali=1400000 WHERE nomor_kursi=1";
    statement.executeUpdate(url);
    }catch(SQLException ex){
        System.out.println("Statement gagal dibuat");
        System.out.println("Pesan : "+ex.getMessage());
    } finally {
    if (statement != null){ 
    try{
    statement.close();
    System.out.println("Statement berhasil ditutup");
    }catch(SQLException ex){
        System.out.println("Statement gagal ditutup");
        System.out.println("Pesan : "+ex.getMessage());
    }
    }
    }
    }
}
