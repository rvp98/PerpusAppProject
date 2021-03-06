/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.rak;

import MainPackage.Constant;
import MainPackage.Factory.ViewContract;
import MainPackage.ui.petugas.entity.Petugas;
import MainPackage.ui.rak.entity.Rak;
import MainPackage.ui.rak.repository.RakRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author praset
 */
public class RakView extends javax.swing.JPanel implements ViewContract<Rak>{
    
    private RakRepository rakRepository;
    private Rak selectedRak;

    /**
     * Creates new form RakView
     * @param rakRepository
     */
    public RakView(RakRepository rakRepository) {
        initComponents();
        this.rakRepository = rakRepository;
        setDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tvNamaRak = new javax.swing.JTextField();
        tvLokasiRak = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRakBuku = new javax.swing.JTable();

        setBackground(new java.awt.Color(197, 239, 248));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Master Rak Buku");

        jLabel2.setText("Nama Rak");

        jLabel3.setText("Lokasi Rak");

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnEdit.setText("Ubah");
        btnEdit.setEnabled(false);
        btnEdit.setIconTextGap(7);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        btnCreate.setText("Tambah");
        btnCreate.setIconTextGap(7);
        btnCreate.setInheritsPopupMenu(true);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setIconTextGap(7);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        btnDelete.setText("Hapus");
        btnDelete.setEnabled(false);
        btnDelete.setIconTextGap(7);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblRakBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRakBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRakBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRakBuku);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(tvNamaRak, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tvLokasiRak, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 533, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tvNamaRak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(tvLokasiRak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnEdit))
                    .addComponent(btnCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (validateData()) {
            Rak rak = generateData();
            rakRepository.insert(rak);
            changeCondition(Constant.CurrState.create);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validateData()) {
            Rak rak = generateData();
            rakRepository.update(rak, selectedRak.getPrimaryKey());
            changeCondition(Constant.CurrState.create);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        changeCondition(Constant.CurrState.create);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        rakRepository.delete(selectedRak.getPrimaryKey());
        changeCondition(Constant.CurrState.create);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblRakBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRakBukuMouseClicked
        Rak rak = this.rakRepository.get(tblRakBuku.getValueAt(tblRakBuku.getSelectedRow(), 0).toString());
        selectedRak = rak;
        tvNamaRak.setText(rak.getNamaRak());
        tvLokasiRak.setText(rak.getLokasiRak());
        changeCondition(Constant.CurrState.update);
    }//GEN-LAST:event_tblRakBukuMouseClicked

    @Override
    public void setDataTable() {
        DefaultTableModel tableModel = generateDefaultTableModel();
        try {
            ArrayList<Rak> listRak = rakRepository.get();
            listRak.forEach(rak -> {
                tableModel.addRow(new Object[]{
                    rak.getIdRak(),
                    rak.getNamaRak(),
                    rak.getLokasiRak()
                });
            });
        } catch (Exception e) {
            System.out.println("error when get data anggota");
            System.out.println(e.getLocalizedMessage());
        }
        tblRakBuku.setModel(tableModel);
    }

    @Override
    public DefaultTableModel generateDefaultTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nama Rak");
        model.addColumn("Lokasi Rak");
        return model;
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    @Override
    public void changeCondition(Constant.CurrState state) {
        switch(state) {
            case create :
                btnEdit.setEnabled(false);
                btnDelete.setEnabled(false);
                btnCreate.setEnabled(true);
                clearData();
                setDataTable();
                break;
            case update :
                btnEdit.setEnabled(true);
                btnDelete.setEnabled(true);
                btnCreate.setEnabled(false);
                break;
        }
    }

    @Override
    public void clearData() {
        tvNamaRak.setText("");
        tvLokasiRak.setText("");
    }

    @Override
    public Rak generateData() {
        int idRak = selectedRak != null ? selectedRak.getIdRak() : 0;
        return new Rak(
                idRak,
                tvNamaRak.getText(),
                tvLokasiRak.getText()
        );
    }

    @Override
    public boolean validateData() {
        boolean isValid = false;
        if(tvNamaRak.getText().isEmpty()) {
            showMessage("Nama Rak belum diisi");
        } else if(tvLokasiRak.getText().isEmpty()) {
            showMessage("Lokasi Rak belum diisi");
        } else {
            isValid = true;
        }
        return isValid;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRakBuku;
    private javax.swing.JTextField tvLokasiRak;
    private javax.swing.JTextField tvNamaRak;
    // End of variables declaration//GEN-END:variables
}
