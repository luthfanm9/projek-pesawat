import java.util.List;

/**
 *
 * @author Luthfan
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fasilitas_tiket perintah = new fasilitas_tiket();
List<tiket> list = perintah.selectAll();
for(tiket tiket : list){
System.out.println(tiket.getNomor_kursi());
System.out.println(tiket.getNama_penumpang());
System.out.println(tiket.getJumlah_beli());
System.out.println(tiket.getTotal_bayar());
System.out.println(tiket.getUang_bayar());
System.out.println(tiket.getUang_kembali());
System.out.println("-------------------------");
}
    }
    
}
