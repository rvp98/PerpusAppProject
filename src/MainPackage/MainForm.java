/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import MainPackage.ui.anggota.AnggotaView;
import MainPackage.ui.anggota.repository.AnggotaRepository;
import MainPackage.ui.buku.BukuView;
import MainPackage.ui.buku.repository.BukuRepository;
import MainPackage.ui.kategori.KategoriView;
import MainPackage.ui.kategori.repository.KategoriRepository;
import MainPackage.ui.login.LoginView;
import MainPackage.ui.petugas.PetugasView;
import MainPackage.ui.petugas.repository.PetugasRepository;
import MainPackage.ui.rak.RakView;
import MainPackage.ui.rak.repository.RakRepository;
import MainPackage.util.SessionHelper;

/**
 *
 * @author praset
 */
public class MainForm extends javax.swing.JFrame {
    
    private KategoriRepository kategoriRepo = new KategoriRepository();
    private BukuRepository bukuRepo = new BukuRepository();
    private AnggotaRepository anggotaRepo = new AnggotaRepository();
    private PetugasRepository petugasRepo = new PetugasRepository();
    private RakRepository rakRepo = new RakRepository();

    private KategoriView kategoriView = new KategoriView(kategoriRepo);
    private BukuView bukuView = new BukuView(bukuRepo, kategoriRepo, rakRepo);
    private PetugasView petugasView = new PetugasView(petugasRepo);
    private AnggotaView anggotaView = new AnggotaView(anggotaRepo);
    private RakView rakView = new RakView(rakRepo);
    
    /**
     * Creates new form MainFormNew
     * @param sessionPetugas
     */
    public MainForm() {
        initComponents();
        addAllPanel();
    }
    
    private void addAllPanel() {
        getContentPane().add(kategoriView);
        getContentPane().add(bukuView);
        getContentPane().add(petugasView);
        getContentPane().add(anggotaView);
        getContentPane().add(rakView);
        hideAllPanel();
        kategoriView.setVisible(true);
    }
    
    private void hideAllPanel() {
        panelContent.setVisible(false);
        kategoriView.setVisible(false);
        bukuView.setVisible(false);
        petugasView.setVisible(false);
        anggotaView.setVisible(false);
        rakView.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMaster = new javax.swing.JMenu();
        menuKategori = new javax.swing.JMenuItem();
        menuBuku = new javax.swing.JMenuItem();
        menuRakBuku = new javax.swing.JMenuItem();
        menuPetugas = new javax.swing.JMenuItem();
        menuAnggota = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        menuLaporan = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        getContentPane().add(panelContent, "card2");

        menuMaster.setText("Master");

        menuKategori.setText("Kategori");
        menuKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKategoriActionPerformed(evt);
            }
        });
        menuMaster.add(menuKategori);

        menuBuku.setText("Buku");
        menuBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBukuActionPerformed(evt);
            }
        });
        menuMaster.add(menuBuku);

        menuRakBuku.setText("Rak Buku");
        menuRakBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRakBukuActionPerformed(evt);
            }
        });
        menuMaster.add(menuRakBuku);

        menuPetugas.setText("Petugas");
        menuPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPetugasActionPerformed(evt);
            }
        });
        menuMaster.add(menuPetugas);

        menuAnggota.setText("Anggota");
        menuAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnggotaActionPerformed(evt);
            }
        });
        menuMaster.add(menuAnggota);

        jMenuBar1.add(menuMaster);

        menuTransaksi.setText("Transaksi");
        jMenuBar1.add(menuTransaksi);

        menuLaporan.setText("Laporan");
        jMenuBar1.add(menuLaporan);

        menuExit.setText("Exit");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKategoriActionPerformed
        hideAllPanel();
        kategoriView.setVisible(true);
    }//GEN-LAST:event_menuKategoriActionPerformed

    private void menuPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPetugasActionPerformed
        hideAllPanel();
        petugasView.setVisible(true);
    }//GEN-LAST:event_menuPetugasActionPerformed

    private void menuAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnggotaActionPerformed
        hideAllPanel();
        anggotaView.setVisible(true);
    }//GEN-LAST:event_menuAnggotaActionPerformed

    private void menuBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBukuActionPerformed
        hideAllPanel();
        bukuView.setVisible(true);
    }//GEN-LAST:event_menuBukuActionPerformed

    private void menuRakBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRakBukuActionPerformed
        hideAllPanel();
        rakView.setVisible(true);
    }//GEN-LAST:event_menuRakBukuActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuExitMouseClicked

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            if (SessionHelper.sessionPetugas == null) {
                new LoginView().setVisible(true);
            } else {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAnggota;
    private javax.swing.JMenuItem menuBuku;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenuItem menuKategori;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenuItem menuPetugas;
    private javax.swing.JMenuItem menuRakBuku;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JPanel panelContent;
    // End of variables declaration//GEN-END:variables
}
