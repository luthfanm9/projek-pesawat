
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Connection;  
import java.sql.Statement;

public class ProgramInsert {


    public static void main(String[] args) {
    Connection koneksi = KoneksiDatabases.getKoneksi();    
    Statement statement = null;
    try{
            statement =koneksi.createStatement();
    System.out.println("Statement berhasil dibuat");
    String url= "INSERT INTO tiket (nama_penumpang,jumlah_beli,total_bayar,uang_bayar,uang_kembali,nomor_telefon)VALUES('agus',2,12000000,2000000,800000,08192021867)";
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
