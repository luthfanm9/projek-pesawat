import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class fasilitas_tiket {
    private Connection koneksi;
    public fasilitas_tiket() {
        koneksi = KoneksiDatabases.getKoneksi();
}
public void insert(tiket tiket){
 PreparedStatement prepare = null;
 try {
     String sql ="INSERT INTO tiket(nomor_kursi,nama_penumpang,jumlah_bayar,uang_bayar,uang_kembali,nomor_telefon)VALUES(?,?,?,?)";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, tiket.getNomor_kursi());
    prepare.setString(2, tiket.getNama_penumpang());
    prepare.setInt(3, tiket.getJumlah_beli());
    prepare.setLong(4, tiket.getTotal_bayar());
    prepare.setLong(5, tiket.getUang_bayar());
    prepare.setLong(6, tiket.getUang_kembali());
    prepare.setLong(7, tiket.getNomor_telefon());
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

 public void update(tiket tiket){
 PreparedStatement prepare = null;
     try {
        String sql ="UPDATE tiket SET nomor_kursi=?,nama_penumpang=?,jumlah_beli=?,total_bayar=?,uang_bayar=?,uang_kembali=?,nomro_telefon=? WHERE nomor_kursi=?";
            prepare = (PreparedStatement) koneksi.prepareStatement(sql);
            prepare.setString(1, tiket.getNomor_kursi());
            prepare.setString(2, tiket.getNama_penumpang());
            prepare.setInt(3, tiket.getJumlah_beli());
            prepare.setLong(4, tiket.getTotal_bayar());
            prepare.setLong(5, tiket.getUang_bayar());
            prepare.setLong(6, tiket.getUang_kembali());
            prepare.setLong(7, tiket.getNomor_telefon());
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

 public void delete(String kode_barang){
    PreparedStatement prepare = null;
    try {
 String sql ="DELETE FROM tiket WHERE ?";
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