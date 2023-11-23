
package GUI;


public class EditBukuAlamat extends javax.swing.JFrame {

    int status = 0;
    //private final int sedang_tambah = 0;
    private final int sedang_ubah = 1;

    
    public EditBukuAlamat() {
        initComponents();
        status =0;
        
    }

    public void rbJenisKelaminSetSelected(String jenisKelamin) {
       if(jenisKelamin.equals("Laki-laki"))
           rbPria.setSelected(true);
       else
           rbWanita.setSelected(true);
    }
    
    public String rbJenisKelaminGetSelected() {
        if(rbPria.isSelected())
            return "Laki-laki";
        else if(rbWanita.isSelected())
            return "perempuan";
        else
            return "";
    }
    
    public EditBukuAlamat(Buku buku){
        initComponents();
        status = 1;
        tfid.setText(Integer.toString(buku.getId()));
        tfnama.setText(buku.getNama());
        tftelepon.setText(buku.getTelepon());
        if (buku.getKelamin().equals("Laki-laki")){
            rbJenisKelaminSetSelected("Laki-laki");
        }else {
            rbJenisKelaminSetSelected("Peremuan");
        }
        taalamat.setText(buku.getAlamat());
        tfid.setEditable(false);
        
        dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblnama = new javax.swing.JLabel();
        lbltelepon = new javax.swing.JLabel();
        lblkelamin = new javax.swing.JLabel();
        lblalamat = new javax.swing.JLabel();
        rbPria = new javax.swing.JRadioButton();
        rbWanita = new javax.swing.JRadioButton();
        tfnama = new javax.swing.JTextField();
        tftelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taalamat = new javax.swing.JTextArea();
        btnedit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Buku Alamat", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 14))); // NOI18N

        lblnama.setText("Nama");

        lbltelepon.setText("No. Telepon");

        lblkelamin.setText("Jenis Kelamin");

        lblalamat.setText("Alamat");

        btnGroupKelamin.add(rbPria);
        rbPria.setText("Laki-laki");

        btnGroupKelamin.add(rbWanita);
        rbWanita.setText("Perempuan");

        taalamat.setColumns(20);
        taalamat.setRows(5);
        jScrollPane1.setViewportView(taalamat);

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");

        jLabel1.setText("Id Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblkelamin, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lblalamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(rbPria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbWanita, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tftelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                            .addComponent(tfnama))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnedit, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnclear, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnama)
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelepon)
                    .addComponent(tftelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkelamin)
                    .addComponent(rbPria)
                    .addComponent(rbWanita))
                .addGap(18, 18, 18)
                .addComponent(lblalamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
                int id = Integer.parseInt(tfid.getText());
        String nama = tfnama.getText();
        String telepon = tftelepon.getText();
        String kelamin;
        String alamat = taalamat.getText();
        
        if(rbPria.isSelected()){
            kelamin = "Laki - laki";
        }else{
            kelamin = "Perempuan";
        }
                    int listdata = 0;
            for (Buku bk: TampilBukuAlamat.bkalamat){
                if (bk.getId()== Integer.parseInt(tfid.getText())) {
                    listdata = TampilBukuAlamat.bkalamat.indexOf(bk);
                    break;
                }
            }
            TampilBukuAlamat.bkalamat.set(listdata, new Buku(id, nama, telepon, kelamin, alamat));
            dispose();
    }//GEN-LAST:event_btneditActionPerformed

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
            java.util.logging.Logger.getLogger(EditBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBukuAlamat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupKelamin;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblalamat;
    private javax.swing.JLabel lblkelamin;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lbltelepon;
    private javax.swing.JRadioButton rbPria;
    private javax.swing.JRadioButton rbWanita;
    private javax.swing.JTextArea taalamat;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tftelepon;
    // End of variables declaration//GEN-END:variables
}
