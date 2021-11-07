/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.buku;

import MainPackage.Constant;
import MainPackage.Factory.ViewContract;
import MainPackage.ui.buku.entity.Buku;
import MainPackage.ui.kategori.entity.Kategori;
import MainPackage.ui.buku.repository.BukuRepository;
import MainPackage.ui.kategori.repository.KategoriRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author praset
 */
public class BukuView extends javax.swing.JPanel implements ViewContract<Buku> {

    private BukuRepository repositoryBuku;
    private KategoriRepository repositoryKategori;
    private Buku selectedBuku;
    private Kategori selectedKategori;
    
    /**
     * Creates new form BukuView
     * @param repositoryBuku
     * @param repositoryKategori
     */
    public BukuView(BukuRepository repositoryBuku, KategoriRepository repositoryKategori) {
        initComponents();
        this.repositoryBuku = repositoryBuku;
        this.repositoryKategori = repositoryKategori;
        setDataTable();
        fetchCbKategori();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tvKodeBuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tvJudulBuku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxKategoriBuku = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tvPenulis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tvPenerbit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tvTahunTerbit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jsStokBuku = new javax.swing.JSpinner();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MASTER BUKU");

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuku);

        jLabel2.setText("Kode Buku");

        jLabel3.setText("Judul Buku");

        jLabel4.setText("Kategori");

        jLabel5.setText("Penulis");

        jLabel6.setText("Penerbit");

        jLabel7.setText("Tahun Terbit");

        jLabel8.setText("Stok Buku");

        btnCreate.setText("Tambah");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(tvKodeBuku)
                                    .addComponent(jLabel4)
                                    .addComponent(cbxKategoriBuku, 0, 236, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(tvPenerbit))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(tvJudulBuku)
                                            .addComponent(tvPenulis, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tvTahunTerbit))))
                            .addComponent(jLabel8)
                            .addComponent(jsStokBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxKategoriBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsStokBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (validateData()) {
            if(repositoryBuku.isIdExist(tvKodeBuku.getText())) {
                showMessage("Kode buku sudah pernah digunakan, mohon gunakan kode yang lain");
            } else {
                Buku buku = generateData();
                repositoryBuku.insert(buku);
                changeCondition(Constant.CurrState.create);
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validateData()) {
            Buku buku = generateData();
            repositoryBuku.update(buku, selectedBuku.getKodeBuku());
            changeCondition(Constant.CurrState.create);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        repositoryBuku.delete(selectedBuku.getKodeBuku()+"");
        changeCondition(Constant.CurrState.create);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        changeCondition(Constant.CurrState.create);
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        Buku buku = this.repositoryBuku.get(tblBuku.getValueAt(tblBuku.getSelectedRow(), 0).toString());
        selectedBuku = buku;
        tvKodeBuku.setText(buku.getKodeBuku());
        tvJudulBuku.setText(buku.getJudulBuku());
        setSelectedKategori(buku.getIdKategori());
        tvPenulis.setText(buku.getPenulisBuku());
        tvPenerbit.setText(buku.getPenulisBuku());
        tvTahunTerbit.setText(buku.getTahunPenerbit());
        jsStokBuku.setValue(buku.getStok());
        changeCondition(Constant.CurrState.update);
    }//GEN-LAST:event_tblBukuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<Object> cbxKategoriBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsStokBuku;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField tvJudulBuku;
    private javax.swing.JTextField tvKodeBuku;
    private javax.swing.JTextField tvPenerbit;
    private javax.swing.JTextField tvPenulis;
    private javax.swing.JTextField tvTahunTerbit;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setDataTable() {
        DefaultTableModel tableModel = generateDefaultTableModel();
        try {
            ArrayList<Buku> listBuku = repositoryBuku.get();
            listBuku.forEach(buku -> {
                tableModel.addRow(new Object[]{
                    buku.getKodeBuku(),
                    buku.getJudulBuku(),
                    buku.getKategori().getNamaKategori(),
                    buku.getPenulisBuku(),
                    buku.getPenerbitBuku(),
                    buku.getTahunPenerbit(),
                    buku.getStok()
                });
            });
        } catch (Exception e) {
            System.out.println("error when get data kategori");
            System.out.println(e.getLocalizedMessage());
        }
        tblBuku.setModel(tableModel);
    }

    @Override
    public DefaultTableModel generateDefaultTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Kategori");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Stok Buku");
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
        tvKodeBuku.setText("");
        tvJudulBuku.setText("");
        tvPenulis.setText("");
        tvPenerbit.setText("");
        tvTahunTerbit.setText("");
        jsStokBuku.setValue(0);
        cbxKategoriBuku.setSelectedIndex(0);
    }

    @Override
    public Buku generateData() {
        Kategori choosedKategori = (Kategori) cbxKategoriBuku.getSelectedItem();
        int idBuku = selectedBuku != null ? selectedBuku.getIdBuku() : 0; 
        int stok = (int) jsStokBuku.getValue();
        return new Buku(
                idBuku,
                tvKodeBuku.getText(),
                choosedKategori.getIdKategori(),
                tvJudulBuku.getText(),
                tvPenulis.getText(),
                tvPenerbit.getText(),
                tvTahunTerbit.getText(),
                stok,
                choosedKategori
        );
    }

    @Override
    public boolean validateData() {
        boolean isValid = false;
        if(tvKodeBuku.getText().isEmpty()) {
            showMessage("Kode buku belum diisi");
        } else if(tvJudulBuku.getText().isEmpty()) {
            showMessage("Judul buku belum diisi");
        } else if(tvPenulis.getText().isEmpty()) {
            showMessage("Penulis buku belum diisi");
        } else if(tvPenerbit.getText().isEmpty()) {
            showMessage("Penerbit buku belum diisi");
        } else if(tvTahunTerbit.getText().isEmpty()) {
            showMessage("Tahun terbit buku belum diisi");
        } else if(!(jsStokBuku.getValue() instanceof Integer)) {
            showMessage("Stok harus diisi dengan angka");
        } else {
            isValid=true;
        }
        return isValid;
    }
    
    private void fetchCbKategori() {
        try {
            cbxKategoriBuku.removeAllItems();
            repositoryKategori.get().forEach(cbxKategoriBuku::addItem);
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
    }
    
    private void setSelectedKategori(int idKategori) {
        for(int i = 0; i < cbxKategoriBuku.getItemCount(); i++) {
            Kategori kategori = (Kategori) cbxKategoriBuku.getItemAt(i);
            if(kategori.getIdKategori() == idKategori) {
                cbxKategoriBuku.setSelectedIndex(i);
                break;
            }
        }
    }
}
