
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Connection;  
import java.sql.Statement;

public class ProgramInsert2 {


    public static void main(String[] args) {
    Connection koneksi = KoneksiDatabases.getKoneksi();    
    Statement statement = null;
    try{
            statement =koneksi.createStatement();
    System.out.println("Statement berhasil dibuat");
    String url= "INSERT INTO maskapai (tujuan,nama_maskapai,nomor_penerbangan,tanggal_keberangkatan,jam_keberangkatan,kelas,harga_kelas)VALUES('Jakarta-Bali','garuda indonesia',801,'01/03/2022','15:00','Bisnis','2 000 000')";
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
