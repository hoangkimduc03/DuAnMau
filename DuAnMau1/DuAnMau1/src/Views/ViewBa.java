/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import DomainModels.DongSp;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.NhanVien;
import DomainModels.SanPham;
import Services.ServiceDongSp;
import Services.ServiceMauSac;
import Services.ServiceNSX;
import Services.impl.ServiceDongSpImpl;
import Services.impl.ServiceMauSacImpl;
import Services.impl.ServiceNSXImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diệm DZ
 */
public class ViewBa extends javax.swing.JInternalFrame {
    private DefaultTableModel dtm1 = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    private DefaultTableModel dtm3 = new DefaultTableModel();
    private ServiceNSX qlNSX = new ServiceNSXImpl();
    private ServiceMauSac qlMauSac = new ServiceMauSacImpl();
    private ServiceDongSp qlDongSp = new ServiceDongSpImpl();
    /**
     * Creates new form ViewBa
     */
    public ViewBa() {
        initComponents();
        
        jTableNSX.setModel(dtm1);
        String [] nsx = {"Id","Mã NSX","Tên NSX"};
        dtm1.setColumnIdentifiers(nsx);
        showDataNSX(qlNSX.getAllNSX());
        
        jTableMauSac.setModel(dtm2);
        String [] ms = {"Id","Mã Mau","Tên Mau"};
        dtm2.setColumnIdentifiers(ms);
        showDataMau(qlMauSac.getAllMauSac());
        
        jTableDongSP.setModel(dtm3);
        String [] dsp = {"Id","Mã Dong","Tên Dong"};
        dtm3.setColumnIdentifiers(dsp);
        showDataDong(qlDongSp.getAllDongSp());
    }

    private void showDataNSX(List<NSX> list1){
        dtm1.setRowCount(0);
        for (NSX x : list1) {
            dtm1.addRow(x.toRowData());
        }
    }
    private void showDataMau(List<MauSac> list2){
        dtm2.setRowCount(0);
        for (MauSac x : list2) {
            dtm2.addRow(x.toRowData());
        }
    }
    private void showDataDong(List<DongSp> list3){
        dtm3.setRowCount(0);
        for (DongSp x : list3) {
            dtm3.addRow(x.toRowData());
        }
    }
    private void fillNSX(int index){
        NSX nsx = qlNSX.getAllNSX().get(index);
        txtID.setText(nsx.getiD());
        txtMa.setText(nsx.getMa());
        txtTen.setText(nsx.getTen());
    }
    private void fillMau(int index){
        MauSac ms = qlMauSac.getAllMauSac().get(index);
        txtIDMau.setText(ms.getiD());
        txtMaMau.setText(ms.getMa());
        txtTenMau.setText(ms.getTen());
    }
    private void fillDong(int index){
        DongSp dsp = qlDongSp.getAllDongSp().get(index);
        txtIDDong.setText(dsp.getiD());
        txtMaDong.setText(dsp.getMa());
        txtTenDong.setText(dsp.getTen());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        btnNewNSX = new javax.swing.JButton();
        btnAddnsx = new javax.swing.JButton();
        btnUpdateNSX = new javax.swing.JButton();
        btndeleteNSX = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaMau = new javax.swing.JTextField();
        txtTenMau = new javax.swing.JTextField();
        btnNewMau = new javax.swing.JButton();
        btnAddMau = new javax.swing.JButton();
        btnUpdateMau = new javax.swing.JButton();
        btndeleteMau = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIDMau = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaDong = new javax.swing.JTextField();
        txtTenDong = new javax.swing.JTextField();
        btnNewDong = new javax.swing.JButton();
        btnAddDong = new javax.swing.JButton();
        btnUpdateDong = new javax.swing.JButton();
        btndeleteDong = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtIDDong = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableNSX = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableMauSac = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableDongSP = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1149, 664));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Tên NSX");

        jLabel2.setText("Mã NSX");

        btnNewNSX.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Refresh.png")); // NOI18N
        btnNewNSX.setText("New");
        btnNewNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewNSXActionPerformed(evt);
            }
        });

        btnAddnsx.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Add.png")); // NOI18N
        btnAddnsx.setText("Add");
        btnAddnsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddnsxActionPerformed(evt);
            }
        });

        btnUpdateNSX.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Edit.png")); // NOI18N
        btnUpdateNSX.setText("Update");
        btnUpdateNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNSXActionPerformed(evt);
            }
        });

        btndeleteNSX.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Delete.png")); // NOI18N
        btndeleteNSX.setText("Delete");
        btndeleteNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteNSXActionPerformed(evt);
            }
        });

        jLabel9.setText("ID ");

        txtID.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txtTen))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNewNSX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddnsx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateNSX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndeleteNSX)
                        .addGap(61, 61, 61))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndeleteNSX)
                    .addComponent(btnUpdateNSX)
                    .addComponent(btnAddnsx)
                    .addComponent(btnNewNSX))
                .addGap(50, 50, 50))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Tên Màu");

        jLabel4.setText("Mã Màu");

        btnNewMau.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Refresh.png")); // NOI18N
        btnNewMau.setText("New");
        btnNewMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMauActionPerformed(evt);
            }
        });

        btnAddMau.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Add.png")); // NOI18N
        btnAddMau.setText("Add");
        btnAddMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMauActionPerformed(evt);
            }
        });

        btnUpdateMau.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Edit.png")); // NOI18N
        btnUpdateMau.setText("Update");
        btnUpdateMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMauActionPerformed(evt);
            }
        });

        btndeleteMau.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Delete.png")); // NOI18N
        btndeleteMau.setText("Delete");
        btndeleteMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteMauActionPerformed(evt);
            }
        });

        jLabel10.setText("ID ");

        txtIDMau.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDMau)
                            .addComponent(txtMaMau, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txtTenMau))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNewMau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddMau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateMau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndeleteMau)
                        .addGap(61, 61, 61))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDMau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMaMau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenMau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndeleteMau)
                    .addComponent(btnUpdateMau)
                    .addComponent(btnAddMau)
                    .addComponent(btnNewMau))
                .addGap(50, 50, 50))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Tên Dòng");

        jLabel6.setText("Mã Dòng");

        btnNewDong.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Refresh.png")); // NOI18N
        btnNewDong.setText("New");
        btnNewDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDongActionPerformed(evt);
            }
        });

        btnAddDong.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Add.png")); // NOI18N
        btnAddDong.setText("Add");
        btnAddDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDongActionPerformed(evt);
            }
        });

        btnUpdateDong.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Edit.png")); // NOI18N
        btnUpdateDong.setText("Update");
        btnUpdateDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDongActionPerformed(evt);
            }
        });

        btndeleteDong.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Delete.png")); // NOI18N
        btndeleteDong.setText("Delete");
        btndeleteDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteDongActionPerformed(evt);
            }
        });

        jLabel11.setText("ID ");

        txtIDDong.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDDong)
                            .addComponent(txtMaDong, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txtTenDong))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnNewDong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddDong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateDong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndeleteDong)
                        .addGap(61, 61, 61))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDDong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMaDong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndeleteDong)
                    .addComponent(btnUpdateDong)
                    .addComponent(btnAddDong)
                    .addComponent(btnNewDong))
                .addGap(50, 50, 50))
        );

        jTableNSX.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNSXMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableNSX);

        jTableMauSac.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMauSacMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableMauSac);

        jTableDongSP.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableDongSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDongSPMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableDongSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, Short.MAX_VALUE))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewNSXActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtMa.setText("");
        txtTen.setText("");
    }//GEN-LAST:event_btnNewNSXActionPerformed

    private void btnAddnsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddnsxActionPerformed
        String ma = txtMa.getText();
        String ten = txtTen.getText();
        
        NSX nsx = new NSX(ma, ten);
        JOptionPane.showMessageDialog(this, qlNSX.add(nsx));
        showDataNSX(qlNSX.getAllNSX());
    }//GEN-LAST:event_btnAddnsxActionPerformed

    private void btnUpdateNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNSXActionPerformed
       String id = txtID.getText();
        String ma = txtMa.getText();
        String ten = txtTen.getText();
        
        NSX nsx = new NSX(ma, ten);
        JOptionPane.showMessageDialog(this, qlNSX.update(nsx, id));
        showDataNSX(qlNSX.getAllNSX());
    }//GEN-LAST:event_btnUpdateNSXActionPerformed

    private void btndeleteNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteNSXActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        JOptionPane.showMessageDialog(this, qlNSX.delete(id));
        showDataNSX(qlNSX.getAllNSX());
    }//GEN-LAST:event_btndeleteNSXActionPerformed

    private void btnNewMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMauActionPerformed
        // TODO add your handling code here:
          txtIDMau.setText("");
        txtMaMau.setText("");
        txtTenMau.setText("");
    }//GEN-LAST:event_btnNewMauActionPerformed

    private void btnAddMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMauActionPerformed
        // TODO add your handling code here:
        String ma = txtMaMau.getText();
        String ten = txtTenMau.getText();
        
        MauSac mauSac = new MauSac(ma, ten);
        JOptionPane.showMessageDialog(this, qlMauSac.add(mauSac));
        showDataMau(qlMauSac.getAllMauSac());
    }//GEN-LAST:event_btnAddMauActionPerformed

    private void btnUpdateMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMauActionPerformed
        // TODO add your handling code here:
        String id = txtIDMau.getText();
          String ma = txtMaMau.getText();
        String ten = txtTenMau.getText();
        
        MauSac mauSac = new MauSac(ma, ten);
        JOptionPane.showMessageDialog(this, qlMauSac.update(mauSac, id));
        showDataMau(qlMauSac.getAllMauSac());
    }//GEN-LAST:event_btnUpdateMauActionPerformed

    private void btndeleteMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteMauActionPerformed
        // TODO add your handling code here:
         String id = txtIDMau.getText();
         JOptionPane.showMessageDialog(this, qlMauSac.delete(id));
        showDataMau(qlMauSac.getAllMauSac());
    }//GEN-LAST:event_btndeleteMauActionPerformed

    private void btnNewDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDongActionPerformed
        // TODO add your handling code here:
          txtIDDong.setText("");
        txtMaDong.setText("");
        txtTenDong.setText("");
    }//GEN-LAST:event_btnNewDongActionPerformed

    private void btnAddDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDongActionPerformed
        // TODO add your handling code here:
        String ma = txtMaDong.getText();
        String ten = txtTenDong.getText();
        
        DongSp dsp = new DongSp(ma, ten);
        JOptionPane.showMessageDialog(this, qlDongSp.add(dsp));
        showDataDong(qlDongSp.getAllDongSp());
    }//GEN-LAST:event_btnAddDongActionPerformed

    private void btnUpdateDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDongActionPerformed
        // TODO add your handling code here:
        String id = txtIDDong.getText();
        String ma = txtMaDong.getText();
        String ten = txtTenDong.getText();
        
        DongSp dsp = new DongSp(ma, ten);
        JOptionPane.showMessageDialog(this, qlDongSp.update(dsp, id));
        showDataDong(qlDongSp.getAllDongSp());
    }//GEN-LAST:event_btnUpdateDongActionPerformed

    private void btndeleteDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteDongActionPerformed
        // TODO add your handling code here:
         String id = txtIDDong.getText();
         JOptionPane.showMessageDialog(this, qlDongSp.delete(id));
        showDataDong(qlDongSp.getAllDongSp());
    }//GEN-LAST:event_btndeleteDongActionPerformed

    private void jTableNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNSXMouseClicked
        // TODO add your handling code here:
        int row = jTableNSX.getSelectedRow();
        fillNSX(row);
    }//GEN-LAST:event_jTableNSXMouseClicked

    private void jTableMauSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMauSacMouseClicked
        // TODO add your handling code here:
         int row = jTableMauSac.getSelectedRow();
        fillMau(row);
    }//GEN-LAST:event_jTableMauSacMouseClicked

    private void jTableDongSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDongSPMouseClicked
        // TODO add your handling code here:
         int row = jTableDongSP.getSelectedRow();
        fillDong(row);
    }//GEN-LAST:event_jTableDongSPMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDong;
    private javax.swing.JButton btnAddMau;
    private javax.swing.JButton btnAddnsx;
    private javax.swing.JButton btnNewDong;
    private javax.swing.JButton btnNewMau;
    private javax.swing.JButton btnNewNSX;
    private javax.swing.JButton btnUpdateDong;
    private javax.swing.JButton btnUpdateMau;
    private javax.swing.JButton btnUpdateNSX;
    private javax.swing.JButton btndeleteDong;
    private javax.swing.JButton btndeleteMau;
    private javax.swing.JButton btndeleteNSX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableDongSP;
    private javax.swing.JTable jTableMauSac;
    private javax.swing.JTable jTableNSX;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDDong;
    private javax.swing.JTextField txtIDMau;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaDong;
    private javax.swing.JTextField txtMaMau;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenDong;
    private javax.swing.JTextField txtTenMau;
    // End of variables declaration//GEN-END:variables
}