/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.petugas;

import MainPackage.Constant;
import MainPackage.Factory.ViewContract;
import MainPackage.ui.petugas.entity.Petugas;
import MainPackage.ui.petugas.repository.PetugasRepository;
import MainPackage.util.HashingHelper;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;

/**
 *
 * @author praset
 */
public class PetugasView extends javax.swing.JPanel implements ViewContract<Petugas> {

    private PetugasRepository repositoryPetugas;
    private Petugas selectedPetugas;
    
    /**
     * Creates new form PetugasView
     * @param repositoryPetugas
     */
    public PetugasView(PetugasRepository repositoryPetugas) {
        initComponents();
        this.repositoryPetugas = repositoryPetugas;
        changeCondition(Constant.CurrState.create);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tvNamaPetugas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tvNoTelepon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxJk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPetugas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tvUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tvPassword = new javax.swing.JPasswordField();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(197, 239, 248));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MASTER PETUGAS");

        jLabel2.setText("Nama Petugas");

        jLabel3.setText("No Telepon");

        jLabel4.setText("Alamat");

        jLabel5.setText("Jenis Kelamin");

        cbxJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));

        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane1.setViewportView(taAlamat);

        tblPetugas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPetugasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPetugas);

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        btnCreate.setText("Tambah");
        btnCreate.setIconTextGap(7);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setIconTextGap(7);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(cbxJk, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tvNamaPetugas)
                            .addComponent(tvNoTelepon)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(tvUsername)
                                            .addComponent(tvPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxJk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(tvNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate)
                            .addComponent(btnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnDelete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (validateData()) {
            if(repositoryPetugas.isUsernameExist(tvUsername.getText())) {
                showMessage("Username sudah digunakan, mohon gunakan username yang lain");
            } else if(tvPassword.getPassword().length == 0) {
                showMessage("Password belum diisi");
            } else {
                Petugas petugas = generateData();
                repositoryPetugas.insert(petugas);
                changeCondition(Constant.CurrState.create);
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (validateData()) {
            Petugas petugas = generateData();
            repositoryPetugas.update(petugas, selectedPetugas.getPrimaryKey()+"");
            changeCondition(Constant.CurrState.create);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        repositoryPetugas.delete(selectedPetugas.getPrimaryKey()+"");
        changeCondition(Constant.CurrState.create);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        changeCondition(Constant.CurrState.create);
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPetugasMouseClicked
        Petugas petugas = this.repositoryPetugas.get(tblPetugas.getValueAt(tblPetugas.getSelectedRow(), 0).toString());
        selectedPetugas = petugas;
        tvNamaPetugas.setText(petugas.getNamaPetugas());
        cbxJk.setSelectedItem(petugas.getJkPetugas());
        tvNoTelepon.setText(petugas.getNoTelpPetugas());
        taAlamat.setText(petugas.getAlamatPetugas());
        tvUsername.setText(petugas.getUsernamePetugas());
        changeCondition(Constant.CurrState.update);
    }//GEN-LAST:event_tblPetugasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbxJk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTable tblPetugas;
    private javax.swing.JTextField tvNamaPetugas;
    private javax.swing.JTextField tvNoTelepon;
    private javax.swing.JPasswordField tvPassword;
    private javax.swing.JTextField tvUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setDataTable() {
        DefaultTableModel tableModel = generateDefaultTableModel();
        try {
            ArrayList<Petugas> listPetugas = repositoryPetugas.get();
            listPetugas.forEach(petugas -> {
                tableModel.addRow(new Object[]{
                    petugas.getIdPetugas(),
                    petugas.getNamaPetugas(),
                    petugas.getJkPetugas(),
                    petugas.getNoTelpPetugas(),
                    petugas.getAlamatPetugas(),
                    petugas.getUsernamePetugas()
                });
            });
        } catch (Exception e) {
            System.out.println("error when get data anggota");
            System.out.println(e.getLocalizedMessage());
        }
        tblPetugas.setModel(tableModel);
    }

    @Override
    public DefaultTableModel generateDefaultTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Petugas");
        model.addColumn("Nama Petugas");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No Telepon");
        model.addColumn("Alamat");
        model.addColumn("Username");
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
                tvUsername.setEnabled(true);
                clearData();
                setDataTable();
                break;
            case update :
                btnEdit.setEnabled(true);
                btnDelete.setEnabled(true);
                btnCreate.setEnabled(false);
                tvUsername.setEnabled(false);
                break;
        }
    }

    @Override
    public void clearData() {
        tvNamaPetugas.setText("");
        cbxJk.setSelectedIndex(0);
        tvNoTelepon.setText("");
        taAlamat.setText("");
        tvUsername.setText("");
        tvPassword.setText("");
    }

    @Override
    public Petugas generateData() {
        int idPetugas = selectedPetugas != null ? selectedPetugas.getIdPetugas() : 0;
        String jkPetugas = cbxJk.getSelectedItem().toString();
        String jabatanPetugas = "petugas";
        String pwd = Arrays.toString(tvPassword.getPassword());
        if(tvPassword.getPassword().length > 0) {
            pwd = HashingHelper.toMd5(pwd);
        } else if (selectedPetugas != null) {
            pwd = selectedPetugas.getPasswordPetugas();
        }
        return new Petugas(
                idPetugas,
                tvNamaPetugas.getText(),
                jkPetugas,
                jabatanPetugas,
                tvNoTelepon.getText(),
                taAlamat.getText(),
                tvUsername.getText(),
                pwd
        );
    }

    @Override
    public boolean validateData() {
        boolean isValid = false;
        if(tvNamaPetugas.getText().isEmpty()) {
            showMessage("Nama petugas belum diisi");
        } else if(tvNoTelepon.getText().isEmpty()) {
            showMessage("Nomor telepon belum diisi");
        } else if(taAlamat.getText().isEmpty()) {
            showMessage("Alamat belum diisi");
        } else if(tvUsername.getText().isEmpty()) {
            showMessage("Username belum diisi");
        } else {
            isValid=true;
        }
        return isValid;
    }
}
