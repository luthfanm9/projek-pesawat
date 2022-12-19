

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Connection;  
import java.sql.Statement;

public class Programupdate2 {


    public static void main(String[] args) {
    Connection koneksi = KoneksiDatabases.getKoneksi();    
    Statement statement = null;
    try{
            statement =koneksi.createStatement();
    System.out.println("Statement berhasil dibuat");
    String url= "UPDATE maskapai set tujuan='DPS-JKT',nama_maskapai='CITYLINK',nomor_penerbangan=2000,tanggal_keberangkatan='03/04/2022',jam_keberangkatan='20:00',kelas='Ekonomi',harga_kelas='1 500 000' WHERE  nomor_penerbangan=34343 ";
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
