import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Luthfan
 */
public class F_tiketpesawat extends javax.swing.JFrame {

    int ekonomi, bisnis, first, bayar, total, harga, beli, kembali, jawab, cetak;
    int x = 0;
    
    public F_tiketpesawat() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize  = this.getSize();
        if (frameSize.height > screenSize.height){
            frameSize.height = screenSize.height;
        }
        if (frameSize.width  > screenSize.width){
            frameSize.width  = screenSize.width;
        }
        
        // Di sini untuk menggantikan layar atau jendela, karena objek merupakan turunan dari class turunan dari JFrame
        this.setLocation(
                (screenSize.width  - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnnama = new javax.swing.JTextField();
        btnnohandphone = new javax.swing.JTextField();
        btnjumlah = new javax.swing.JTextField();
        btntotalharga = new javax.swing.JTextField();
        btnkembali = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnmaskapai = new javax.swing.JTextField();
        btnpenerbangan = new javax.swing.JTextField();
        btntanggal = new javax.swing.JTextField();
        btnjam = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        rbekonomi = new javax.swing.JRadioButton();
        rbbisnis = new javax.swing.JRadioButton();
        rbfirst = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        btnharga = new javax.swing.JTextField();
        btnbeli = new javax.swing.JButton();
        btnbelilagi = new javax.swing.JButton();
        btnhapusdata = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbbeli = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        btndestinasi = new javax.swing.JComboBox<>();
        btnbayar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("RESERVASI TIKET PESAWAT SUM-AIR");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel2.setText("PESANAN");

        jLabel3.setText("NAMA");

        jLabel4.setText("NO.HANPHONE");

        jLabel5.setText("JUMLAH");

        jLabel6.setText("TIKET");

        jLabel7.setText("TOTAL HARGA   Rp");

        jLabel8.setText("UANG BAYAR    Rp");

        jLabel9.setText("UANG KEMBALI    Rp");

        btnnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnamaActionPerformed(evt);
            }
        });
        btnnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnnamaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnnamaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnnamaKeyTyped(evt);
            }
        });

        btnnohandphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnnohandphoneKeyTyped(evt);
            }
        });

        btnjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjumlahActionPerformed(evt);
            }
        });
        btnjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnjumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnjumlahKeyTyped(evt);
            }
        });

        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        jLabel10.setText("TUJUAN");

        jLabel11.setText("NAMA MASKAPAI");

        jLabel12.setText("NO PENERBANGAN");

        jLabel13.setText("TANGGAL KEBERANGKATAN");

        jLabel14.setText("JAM KEBERANGKATAN");

        jLabel15.setText("WIB");

        jLabel16.setText("KELAS");

        rbekonomi.setText("EKONOMI");
        rbekonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbekonomiActionPerformed(evt);
            }
        });

        rbbisnis.setText("BISNIS CLASS");
        rbbisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbisnisActionPerformed(evt);
            }
        });

        rbfirst.setText("FIRST CLASS");
        rbfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfirstActionPerformed(evt);
            }
        });

        jLabel17.setText("HARGA/KELAS                           ...");

        btnharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhargaActionPerformed(evt);
            }
        });

        btnbeli.setText("BELI");
        btnbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeliActionPerformed(evt);
            }
        });

        btnbelilagi.setText("BELI LAGI");
        btnbelilagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbelilagiActionPerformed(evt);
            }
        });

        btnhapusdata.setText("HAPUS DATA");

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        tbbeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NAMA", "NO.HANDPHONE", "NAMA MASKAPAI", "PENERBANGAN", "TUJUAN", "TANGGAL", "JAM "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbbeli.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbbeliAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tbbeli);

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jLabel18.setText("MASKAPAI");

        btndestinasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "           PILIHAN", "JAKARTA - BANDUNG", "BANDUNG - JAKARTA", "JAKARTA - BALI", "BALI - JAKARTA" }));
        btndestinasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndestinasiActionPerformed(evt);
            }
        });

        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });
        btnbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnbayarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rbfirst, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbekonomi, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnharga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbbisnis, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btndestinasi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btntanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                .addComponent(btnpenerbangan)
                                                .addComponent(btnmaskapai)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnjam, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel15)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnbeli)
                                .addGap(6, 6, 6)
                                .addComponent(btnbelilagi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapusdata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnkeluar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnnama, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnnohandphone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel6))
                                        .addComponent(btntotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(77, 77, 77))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel18))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(btnnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(btnnohandphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(btnjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(btntotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel10)
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btndestinasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnmaskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnpenerbangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(btntanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(btnjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(rbekonomi))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbbisnis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbfirst)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(btnharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbeli)
                        .addComponent(btnbelilagi)
                        .addComponent(btnhapusdata)
                        .addComponent(btnkeluar)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnamaActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btnbelilagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbelilagiActionPerformed
        // TODO add your handling code here:
        btndestinasi.setSelectedItem("PILIH");
        rbekonomi.setSelected(false);
        rbbisnis.setSelected(false);
        rbfirst.setSelected(false);
        btnmaskapai.setText("");
        btnpenerbangan.setText("");
        btntanggal.setText("");
        btnjam.setText(""); 
        btnharga.setText("");
        btnnama.setText("");
        btnnohandphone.setText("");
        btnjumlah.setText("");
        btntotalharga.setText("");
        btnbayar.setText("");
        btnkembali.setText("");
        
    }//GEN-LAST:event_btnbelilagiActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
    int jawab = JOptionPane.showConfirmDialog(null, "APAKAH ANDA INGIN KELUR","KELUAR", JOptionPane.OK_OPTION);
        if (jawab==JOptionPane.OK_OPTION){
           dispose(); 
        }        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btndestinasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndestinasiActionPerformed
        if (btndestinasi.getSelectedItem().equals("PILIH")){
            buttonGroup1.clearSelection();
            btnmaskapai.setText("");
            btnpenerbangan.setText("");
            btnharga.setText("");
        }
        else if (btndestinasi.getSelectedItem().equals("JAKARTA-BANDUNG")){
            btnmaskapai.setText("JT Lion Airlines");
            btnpenerbangan.setText("JT 918");
            btntanggal.setText("16 Januari 2022");
            btnjam.setText("09:05");
            ekonomi  = 646000;
            bisnis   = 800000;
            first     = 752000;
        }
        else if (btndestinasi.getSelectedItem().equals("Jakarta - Denpasar")){
            btnmaskapai.setText("IW Wings Airline");
            btnpenerbangan.setText("IW 1274");
            btntanggal.setText("");
            btnjam.setText("06:20");
            ekonomi = 520000;
            bisnis  = 1500000;
            first    = 650000;

        }
        else if (btndestinasi.getSelectedItem().equals("Pekanbaru - Surabaya")){
            btnmaskapai.setText("ID Batik Air");
            btnpenerbangan.setText("ID 7064");
            btntanggal.setText ("21 April 2021");
            btnjam.setText ("06:30");
            ekonomi = 660000;
            bisnis  = 695000;
            first    = 780000;
        }
        else if (btndestinasi.getSelectedItem().equals ("Pekanbaru - Palembang")){
            btnmaskapai.setText("IW Wings Airline");
            btnpenerbangan.setText("IW 1759");
            btntanggal.setText("21 April 2021");
            btnjam.setText("07:00");
            ekonomi = 440000;
            bisnis  = 530000;
            first   = 595000;
        }
        else if (btndestinasi.getSelectedItem().equals ("Pekanbaru - Jambi")){
            btnmaskapai.setText("BATIK AIR");
            btnpenerbangan.setText("ID 426");
            btntanggal.setText("21 April 2021");
            btnjam.setText("07:20");
            ekonomi = 450000;
            bisnis  = 550000;
            first    = 595000;
        }
        else if (btndestinasi.getSelectedItem().equals ("Pekanbaru - Kuala Lumpur")){
            btnmaskapai.setText("AK Air Asia Benhard");
            btnpenerbangan.setText("AK 426");
            btntanggal.setText("21 April 2021");
            btnjam.setText("08:00");
            ekonomi = 690000;
            bisnis  = 780000;
            first   = 825000;
        }
     
    }                                            


    private void btnkembalianKeyReleased(java.awt.event.KeyEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnbayarKeyTyped(java.awt.event.KeyEvent evt) {                                  
        // TODO add your handling code here:
        char x = evt.getKeyChar();
        if (!(Character.isDigit(x) || x == KeyEvent.VK_BACK_SPACE || x == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }                                 

    private void btnhapusdataActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        tbbeli.setValueAt("", tbbeli.getSelectedRow(), 0);
        tbbeli.setValueAt("", tbbeli.getSelectedRow(), 1);
        tbbeli.setValueAt("", tbbeli.getSelectedRow(), 2);
        tbbeli.setValueAt("", tbbeli.getSelectedRow(), 3);
        tbbeli.setValueAt("", tbbeli.getSelectedRow(), 4);
        tbbeli.setValueAt("", tbbeli.getSelectedRow(), 5);
        tbbeli.setValueAt("", tbbeli.getSelectedRow(), 6);        // TODO add your handling code here:
        
    }//GEN-LAST:event_btndestinasiActionPerformed

    private void btnbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbeliActionPerformed

    private void rbfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfirstActionPerformed
        // TODO add your handling code here:
        if (rbfirst.isSelected()){
            btnharga.setText (String.valueOf(first));
            rbekonomi.setSelected(false);
            rbbisnis.setSelected(false);        
        }
    }//GEN-LAST:event_rbfirstActionPerformed

    private void tbbeliAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbbeliAncestorAdded
        // TODO add your handling code here:
        tbbeli.setValueAt(btnnama.getText(),x,0);
        tbbeli.setValueAt(btnnohandphone.getText(),x,1);
        tbbeli.setValueAt(btnmaskapai.getText(),x,2);
        tbbeli.setValueAt(btnpenerbangan.getText(),x,3);
        tbbeli.setValueAt(btndestinasi.getSelectedItem(),x,4);
        tbbeli.setValueAt(btntanggal.getText(),x,5);
        tbbeli.setValueAt(btnjam.getText(),x,6);
        x = x + 1;
    }//GEN-LAST:event_tbbeliAncestorAdded

    private void btnnamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnnamaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnamaKeyReleased

    private void btnnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnnamaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnamaKeyPressed

    private void rbbisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbisnisActionPerformed
        // TODO add your handling code here:
        if (rbbisnis.isSelected()){
            btnharga.setText (String.valueOf(bisnis));
            rbekonomi.setSelected(false);
            rbfirst.setSelected(false);        
        }
    }//GEN-LAST:event_rbbisnisActionPerformed

    private void rbekonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbekonomiActionPerformed
        // TODO add your handling code here:
        if (rbekonomi.isSelected()){
            btnharga.setText (String.valueOf(ekonomi));
            rbbisnis.setSelected(false);
            rbfirst.setSelected(false);        
        }
    }//GEN-LAST:event_rbekonomiActionPerformed

    private void btnnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnnamaKeyTyped
        // TODO add your handling code here:
        char x = evt.getKeyChar();
        if ((Character.isDigit (x) || x == KeyEvent.VK_BACK_SPACE || x == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_btnnamaKeyTyped

    private void btnnohandphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnnohandphoneKeyTyped
        // TODO add your handling code here:
        char x = evt.getKeyChar();
        if (!(Character.isDigit (x) || x == KeyEvent.VK_BACK_SPACE || x == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_btnnohandphoneKeyTyped

    private void btnjumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnjumlahKeyTyped
        // TODO add your handling code here:
        char x = evt.getKeyChar();
        if (!(Character.isDigit (x) || x == KeyEvent.VK_BACK_SPACE || x == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_btnjumlahKeyTyped

    private void btnjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjumlahActionPerformed
        // TODO add your handling code here:
        beli = Integer.parseInt(btnjumlah.getText());
        harga= Integer.parseInt(btnharga.getText());
        total= bayar*harga;
        btntotalharga.setText(String.valueOf(total));
    }//GEN-LAST:event_btnjumlahActionPerformed

    private void btnjumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnjumlahKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a = Integer.valueOf(btnharga.getText());
        b = Integer.valueOf(btnjumlah.getText());
        c = a*b;
        btntotalharga.setText("" + c);
    }//GEN-LAST:event_btnjumlahKeyReleased

    private void btnbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnbayarKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a = Integer.valueOf(btnbayar.getText());
        b = Integer.valueOf(btntotalharga.getText());
        c = a-b;
        btnkembali.setText("" + c);
    }//GEN-LAST:event_btnbayarKeyReleased

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        // TODO add your handling code here:
        beli    = Integer.parseInt(btnbayar.getText());
        kembali = Integer.parseInt(btntotalharga.getText());
        total   = bayar-kembali;
        btnkembali.setText(String.valueOf(total));
    }//GEN-LAST:event_btnbayarActionPerformed

    private void btnhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhargaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_tiketpesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_tiketpesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_tiketpesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_tiketpesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

   try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                 }
            }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (InstantiationException ex){
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (IllegalAccessException ex){
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //<editor-fold>
        
        /*Create and display the form */
         //   
        tiket frame = new tiket();
        frame.F_tiketpesawat(); 
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
         
            public void run() {
                new F_tiketpesawat().setVisible(true);
               }
        });
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnbayar;
    private javax.swing.JButton btnbeli;
    private javax.swing.JButton btnbelilagi;
    private javax.swing.JComboBox<String> btndestinasi;
    private javax.swing.JButton btnhapusdata;
    private javax.swing.JTextField btnharga;
    private javax.swing.JTextField btnjam;
    private javax.swing.JTextField btnjumlah;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JTextField btnkembali;
    private javax.swing.JTextField btnmaskapai;
    private javax.swing.JTextField btnnama;
    private javax.swing.JTextField btnnohandphone;
    private javax.swing.JTextField btnpenerbangan;
    private javax.swing.JTextField btntanggal;
    private javax.swing.JTextField btntotalharga;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbbisnis;
    private javax.swing.JRadioButton rbekonomi;
    private javax.swing.JRadioButton rbfirst;
    private javax.swing.JTable tbbeli;
    // End of variables declaration//GEN-END:variables
}
