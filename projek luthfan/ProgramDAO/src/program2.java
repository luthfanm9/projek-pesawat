import java.util.List;

/**
 *
 * @author Luthfan
 */
public class program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fasilitas_maskapai mobil = new fasilitas_maskapai();
List<maskapai> list = mobil.selectAll();
for(maskapai maskapai : list){
System.out.println(maskapai.getTujuan());
System.out.println(maskapai.getNama_maskapai());
System.out.println(maskapai.getTanggal_keberangkatan());
System.out.println(maskapai.getJam_keberangkatan());
System.out.println(maskapai.getKelas());
System.out.println(maskapai.getHarga_kelas());
System.out.println("-------------------------");
}
    }
    
}
