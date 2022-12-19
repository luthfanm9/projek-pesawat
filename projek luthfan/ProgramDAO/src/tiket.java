
import com.stripbandunk.jwidget.annotation.TableColumn;
public class tiket {
 @TableColumn(number=1, name ="NOMOR KURSI")
 private String nomor_kursi;
 @TableColumn(number=2, name ="NAMA PENUMPANG")
 private String nama_penumpang;
 @TableColumn(number=3, name ="JUMLAH BELI")
 private int jumlah_beli;
 @TableColumn(number=4, name ="TOTAL BAYAR")
 private long total_bayar;
 @TableColumn(number=5, name ="UANG BAYAR")
 private long uang_bayar;
 @TableColumn(number=6, name ="UANG KEMBALI")
 private long uang_kembali;
 @TableColumn(number=7, name ="NOMOR TELEFON")
 private long nomor_telefon;

    public String getNomor_kursi() {
        return nomor_kursi;
    }

    public void setNomor_kursi(String nomor_kursi) {
        this.nomor_kursi = nomor_kursi;
    }

    public String getNama_penumpang() {
        return nama_penumpang;
    }

    public void setNama_penumpang(String nama_penumpang) {
        this.nama_penumpang = nama_penumpang;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }

    public void setJumlah_beli(int jumlah_beli) {
        this.jumlah_beli = jumlah_beli;
    }

    public long getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(long total_bayar) {
        this.total_bayar = total_bayar;
    }

    public long getUang_bayar() {
        return uang_bayar;
    }

    public void setUang_bayar(long uang_bayar) {
        this.uang_bayar = uang_bayar;
    }

    public long getUang_kembali() {
        return uang_kembali;
    }

    public void setUang_kembali(long uang_kembali) {
        this.uang_kembali = uang_kembali;
    }

    public long getNomor_telefon() {
        return nomor_telefon;
    }

    public void setNomor_telefon(long nomor_telefon) {
        this.nomor_telefon = nomor_telefon;
    }
 
 
}