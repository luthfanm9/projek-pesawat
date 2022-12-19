import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class fasilitas_maskapai {
    private Connection koneksi;
    public fasilitas_maskapai() {
        koneksi = KoneksiDatabases.getKoneksi();
}
public void insert(maskapai maskapai){
 PreparedStatement prepare = null;
 try {
     String sql ="INSERT INTO tiket(tujuan,nama_maskapai,nomor_penerbangan,tanggal_keberangkatan,jam_keberangkatan,kelas,harga_kelas)VALUES(?,?,?,?)";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, maskapai.getTujuan());
    prepare.setString(2, maskapai.getNama_maskapai());
    prepare.setInt(3, maskapai.getNomor_penerbangan());
    prepare.setLong(4, maskapai.getTanggal_keberangkatan());
    prepare.setLong(5, maskapai.getJam_keberangkatan());
    prepare.setLong(6, maskapai.getKelas());
    prepare.setLong(7, maskapai.getHarga_kelas());
    prepare.executeUpdate();
    System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
    System.out.println("Prepare statement gagal dibuat");
    System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
    try{
        prepare.close();
        System.out.println("Prepare statemen berhasil ditutup");
    }catch(SQLException ex){
        System.out.println("Prepare statemen gagal ditutup");
        System.out.println("Pesan : " + ex.getMessage());
            }
        }
     }
 }

 public void update(maskapai maskapai){
 PreparedStatement prepare = null;
     try {
        String sql ="UPDATE maskapai SET tujuan=?,nama_maskapai=?,nama_penerbangan=?,tanggal_keberangkatan=?,jam_keberangakatan=?,kelas=?,harga_kelas=? WHERE nomor_kursi=?";
            prepare = (PreparedStatement) koneksi.prepareStatement(sql);
            prepare.setString(1, maskapai.getTujuan());
            prepare.setString(2, maskapai.getNama_maskapai());
            prepare.setInt(3, maskapai.getNomor_penerbangan());
            prepare.setLong(4, maskapai.getTanggal_keberangkatan());
            prepare.setLong(5, maskapai.getJam_keberangkatan());
            prepare.setLong(6, maskapai.getKelas());
            prepare.setLong(7, maskapai.getHarga_kelas());
            prepare.executeUpdate();
            System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
        System.out.println("Prepare statement gagal dibuat");
        System.out.println("Pesan : " + ex.getMessage());
 }finally{
    if (prepare != null){
        try{
            prepare.close();
            System.out.println("Prepare statemen berhasil ditutup");
        }catch(SQLException ex){
            System.out.println("Prepare statemen gagal ditutup");
            System.out.println("Pesan : " + ex.getMessage());
 }
 }
 }
 }

 public void delete(String maskapai){
    PreparedStatement prepare = null;
    try {
 String sql ="DELETE FROM barang WHERE ?";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 prepare.executeUpdate();
 System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat");
 System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statemen gagal ditutup");
 System.out.println("Pesan : " + ex.getMessage());
 
 }
 }
 }}
 public List<tiket> selectAll(){
 PreparedStatement prepare = null;
 ResultSet result = null;
 List<tiket> list = new ArrayList<>();
 try {
 String sql ="SELECT * FROM tiket";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 result = prepare.executeQuery();
 while (result.next()){
 tiket tiket = new tiket();
 tiket.setNomor_kursi(result.getString("nomor_kursi"));
 tiket.setNama_penumpang(result.getString("nama_penumpang"));
 tiket.setJumlah_beli(result.getInt("jumlah_beli"));
 tiket.setTotal_bayar(result.getLong("total_bayar"));
 tiket.setUang_bayar(result.getLong("uang_bayar"));
 tiket.setUang_kembali(result.getLong("uang_kembali"));
 tiket.setNomor_telefon(result.getLong("nomor_telefon"));
 list.add(tiket);
 }
 System.out.println("Prepare statement berhasil dibuat");
 return list;
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat");
 System.out.println("Pesan : " + ex.getMessage());
 return list;
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statemen gagal ditutup");
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 if (result != null){
     try{
 result.close();
 System.out.println("Resultset berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Resultset gagal ditutup");
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 }
 }
 }