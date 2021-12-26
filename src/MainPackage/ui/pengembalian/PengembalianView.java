/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.pengembalian;

import MainPackage.Constant;
import MainPackage.Factory.ViewContract;
import MainPackage.ui.peminjaman.PeminjamanView;
import MainPackage.ui.peminjaman.entity.Peminjaman;
import MainPackage.ui.peminjaman.repository.PeminjamanRepository;
import MainPackage.ui.pengembalian.entity.Pengembalian;
import MainPackage.ui.pengembalian.repository.PengembalianRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author praset
 */
public class PengembalianView extends javax.swing.JPanel implements ViewContract<Pengembalian>{

    private PengembalianRepository repoPengembalian; 
    private PeminjamanRepository repoPeminjaman;
    private Pengembalian selectedPengembalian;
    private SimpleDateFormat formater = new SimpleDateFormat(Constant.defaultDateFormat);
    
    /**
     * Creates new form PengembalianView
     * @param repoPengembalian
     * @param repoPeminjaman
     */
    public PengembalianView(PengembalianRepository repoPengembalian, PeminjamanRepository repoPeminjaman) {
        initComponents();
        this.repoPengembalian = repoPengembalian;
        this.repoPeminjaman = repoPeminjaman;
        setDataTable();
        setPeminjaman();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPengembalian = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        textFieldDenda = new javax.swing.JTextField();
        btnKembalikan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxPeminjaman = new javax.swing.JComboBox<>();
        datePickerKembali = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(197, 239, 248));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Pengembalian Buku");

        jLabel2.setText("Tanggal Kembali");

        tblPengembalian.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPengembalian);

        jLabel3.setText("Denda");

        textFieldDenda.setEditable(false);

        btnKembalikan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        btnKembalikan.setText("Kembalikan");
        btnKembalikan.setIconTextGap(7);
        btnKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembalikanActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnEdit.setText("Ubah");
        btnEdit.setIconTextGap(7);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
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
        btnDelete.setText("Delete");
        btnDelete.setIconTextGap(7);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Peminjaman");

        cbxPeminjaman.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPeminjamanItemStateChanged(evt);
            }
        });
        cbxPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPeminjamanActionPerformed(evt);
            }
        });
        cbxPeminjaman.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbxPeminjamanPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxPeminjaman, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnKembalikan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addComponent(textFieldDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(datePickerKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKembalikan)
                            .addComponent(btnClear))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePickerKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembalikanActionPerformed
        if(validateData()) {
            Pengembalian pengembalian = generateData();
            pengembalian.getPeminjaman().setTanggalKembali(pengembalian.getTanggalPengembalian());
            repoPengembalian.insert(pengembalian);
            repoPeminjaman.update(pengembalian.getPeminjaman(), pengembalian.getPeminjaman().getPrimaryKey());
            setDataTable();
            clearData();
        }
    }//GEN-LAST:event_btnKembalikanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(validateData()) {
            Pengembalian pengembalian = generateData();
            pengembalian.getPeminjaman().setTanggalKembali(pengembalian.getTanggalPengembalian());
            repoPengembalian.update(pengembalian, pengembalian.getPrimaryKey());
            repoPeminjaman.update(pengembalian.getPeminjaman(), pengembalian.getPeminjaman().getPrimaryKey());
            setDataTable();
            changeCondition(Constant.CurrState.create);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearData();
        changeCondition(Constant.CurrState.create);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        selectedPengembalian.getPeminjaman().setTanggalKembali(null);
        repoPengembalian.delete(selectedPengembalian.getPrimaryKey());
        repoPeminjaman.update(selectedPengembalian.getPeminjaman(), selectedPengembalian.getPeminjaman().getPrimaryKey());
        setDataTable();
        clearData();
        changeCondition(Constant.CurrState.update);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPengembalianMouseClicked
        Pengembalian pengembalian = this.repoPengembalian.get(tblPengembalian.getValueAt(tblPengembalian.getSelectedRow(), 0).toString());
        this.selectedPengembalian = pengembalian;
        Date dateKembali;
        try {
            dateKembali = new SimpleDateFormat(Constant.defaultDateFormat).parse(pengembalian.getTanggalPengembalian());
            datePickerKembali.setDate(dateKembali);
        } catch (ParseException ex) {
            Logger.getLogger(PengembalianView.class.getName()).log(Level.SEVERE, null, ex);
        }
        setSelectedPeminjaman(pengembalian.getPeminjaman().getIdPeminjaman());
        textFieldDenda.setText(pengembalian.getDenda()+"");
        changeCondition(Constant.CurrState.update);
    }//GEN-LAST:event_tblPengembalianMouseClicked

    private void cbxPeminjamanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbxPeminjamanPropertyChange

    }//GEN-LAST:event_cbxPeminjamanPropertyChange

    private void cbxPeminjamanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPeminjamanItemStateChanged
       
    }//GEN-LAST:event_cbxPeminjamanItemStateChanged

    private void cbxPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPeminjamanActionPerformed
        setDenda();
    }//GEN-LAST:event_cbxPeminjamanActionPerformed

    private void datePickerKembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePickerKembaliPropertyChange
        setDenda();
    }//GEN-LAST:event_datePickerKembaliPropertyChange

    private void setDenda() {
        if(cbxPeminjaman.getSelectedItem() != null) {
            if(datePickerKembali.getDate() != null) {
                try {
                    if(validateTanggalKembali()) {
                        Peminjaman selectedPeminjaman = (Peminjaman) cbxPeminjaman.getSelectedItem();
                        Date datePinjam = formater.parse(selectedPeminjaman.getTanggalPinjam());
                        Date dateKembali = datePickerKembali.getDate();
                        long diffInMillies = Math.abs(dateKembali.getTime() - datePinjam.getTime());
                        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                        if(diff > 7) {
                            long denda = (diff - 7) * 2500;
                            textFieldDenda.setText(denda + "");
                        }
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(PengembalianView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private boolean validateTanggalKembali() throws ParseException {
        boolean isValid = false;
        Peminjaman selectedPeminjaman = (Peminjaman) cbxPeminjaman.getSelectedItem();
        Date datePinjam = formater.parse(selectedPeminjaman.getTanggalPinjam());
        Date dateKembali = datePickerKembali.getDate();
        if(datePinjam.after(dateKembali)) {
            datePickerKembali.setDate(datePinjam);
            showMessage("Tanggal kembali tidak boleh sebelum tanggal pinjam");
        } else {
            isValid = true;
        }
        return isValid;
    }
    
    @Override
    public void setDataTable() {
        DefaultTableModel tableModel = generateDefaultTableModel();
        try {
            ArrayList<Pengembalian> listPengembalian = repoPengembalian.get();
            listPengembalian.forEach(pengembalian -> {
                tableModel.addRow(new Object[]{
                    pengembalian.getIdPengembalian(),
                    pengembalian.getPeminjaman().getTanggalPinjam(),
                    pengembalian.getTanggalPengembalian(),
                    pengembalian.getPeminjaman().getAnggota().getNamaAnggota(),
                    pengembalian.getPeminjaman().getBuku().getJudulBuku(),
                    pengembalian.getDenda()
                });
            });
        } catch (Exception e) {
            System.out.println("error when get data pengembalian");
            System.out.println(e.getLocalizedMessage());
        }
        tblPengembalian.setModel(tableModel);
    }

    @Override
    public DefaultTableModel generateDefaultTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Kembali");
        model.addColumn("Nama Anggota");
        model.addColumn("Judul Buku");
        model.addColumn("Denda");
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
                btnKembalikan.setEnabled(true);
                clearData();
                setDataTable();
                break;
            case update :
                btnEdit.setEnabled(true);
                btnDelete.setEnabled(true);
                btnKembalikan.setEnabled(false);
                break;
        }
    }

    @Override
    public void clearData() {
        textFieldDenda.setText("0");
        cbxPeminjaman.setSelectedIndex(-1);
        datePickerKembali.setDate(null);
    }

    @Override
    public Pengembalian generateData() {
        int idPengembalian = 0;
        if (selectedPengembalian != null) {
            idPengembalian = selectedPengembalian.getIdPengembalian();
        }
        String dateKembali = formater.format(datePickerKembali.getDate());
        return new Pengembalian(
            idPengembalian,
            dateKembali, 
            Integer.parseInt(textFieldDenda.getText()),
            (Peminjaman) cbxPeminjaman.getSelectedItem()
        );
    }

    @Override
    public boolean validateData() {
        boolean isValid = false;
        if (cbxPeminjaman.getSelectedItem() == null) {
            showMessage("Masih belum ada data peminjaman yang terpilih, mohon pilih data peminjaman atau tambahkan data peminjaman terlebih dahulu");
        } else if (datePickerKembali.getDateFormatString().isEmpty()) {
            showMessage("Mohon memilih tanggal pengembalian terlebih dahulu");
        } else {
            isValid = true;
        }
        return isValid;
    }
    
    private void setPeminjaman() {
        try {
            cbxPeminjaman.removeAllItems();
            repoPeminjaman.get().forEach(cbxPeminjaman::addItem);
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
    }
    
    private void setSelectedPeminjaman(int idPeminjaman) {
        for(int i = 0; i < cbxPeminjaman.getItemCount(); i++) {
            Peminjaman peminjaman = (Peminjaman) cbxPeminjaman.getItemAt(i);
            if(peminjaman.getIdPeminjaman()== idPeminjaman) {
                cbxPeminjaman.setSelectedIndex(i);
                break;
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnKembalikan;
    private javax.swing.JComboBox<Object> cbxPeminjaman;
    private com.toedter.calendar.JDateChooser datePickerKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPengembalian;
    private javax.swing.JTextField textFieldDenda;
    // End of variables declaration//GEN-END:variables
}
