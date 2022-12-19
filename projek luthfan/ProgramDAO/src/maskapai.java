
import com.stripbandunk.jwidget.annotation.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luthfan
 */
public class maskapai {


 @TableColumn(number=1, name ="TUJUAN")
 private String tujuan;
 @TableColumn(number=2, name ="NAMA MASKAPAI")
 private String nama_maskapai;
 @TableColumn(number=3, name ="NO PENERBANGAN")
 private int nomor_penerbangan;
 @TableColumn(number=4, name ="TANGGAL KEBERANGKATAN")
 private long tanggal_keberangkatan;
 @TableColumn(number=5, name ="JAM KEBERANGKATAN")
 private long jam_keberangkatan;
 @TableColumn(number=6, name ="KELAS")
 private long kelas;
 @TableColumn(number=7, name ="HARGA/KELAS")
 private long harga_kelas;

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getNama_maskapai() {
        return nama_maskapai;
    }

    public void setNama_maskapai(String nama_maskapai) {
        this.nama_maskapai = nama_maskapai;
    }

    public int getNomor_penerbangan() {
        return nomor_penerbangan;
    }

    public void setNomor_penerbangan(int nomor_penerbangan) {
        this.nomor_penerbangan = nomor_penerbangan;
    }

    public long getTanggal_keberangkatan() {
        return tanggal_keberangkatan;
    }

    public void setTanggal_keberangkatan(long tanggal_keberangkatan) {
        this.tanggal_keberangkatan = tanggal_keberangkatan;
    }

    public long getJam_keberangkatan() {
        return jam_keberangkatan;
    }

    public void setJam_keberangkatan(long jam_keberangkatan) {
        this.jam_keberangkatan = jam_keberangkatan;
    }

    public long getKelas() {
        return kelas;
    }

    public void setKelas(long kelas) {
        this.kelas = kelas;
    }

    public long getHarga_kelas() {
        return harga_kelas;
    }

    public void setHarga_kelas(long harga_kelas) {
        this.harga_kelas = harga_kelas;
    }
}
