/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import DomainModels.ChiTietSanPham;
import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import DomainModels.NhanVien;
import DomainModels.SanPham;
import Services.HDCTService;
import Services.HoaDonService;
import Services.ServiceCTSP;
import Services.ServiceSanPham;
import Services.impl.HDCTServiceImpl;
import Services.impl.HoaDonServiceImpl;
import Services.impl.ServiceCTSPImpl;
import Services.impl.ServiceSanPhamImpl;
import ViewModels.GioHangChiTietViewModels;
import ViewModels.HoaDonBanHangViewModels;
import ViewModels.SanPhamBanHangViewModel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diệm DZ
 */
public class ViewBanHang extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm1 = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    private DefaultTableModel dtm3 = new DefaultTableModel();
    private ServiceCTSP ql = new ServiceCTSPImpl();

    private ServiceSanPham qlSP = new ServiceSanPhamImpl();
    private HoaDonService hoaDonService = new HoaDonServiceImpl();
    private HDCTService hDCTService = new HDCTServiceImpl();
    private List<GioHangChiTietViewModels> list = new ArrayList<>();
   

    /**
     * Creates new form ViewBanHang
     */
    public ViewBanHang() {

        initComponents();
        jTableHoaDon.setModel(dtm1);
        String[] hd = {"STT", "Mã HĐ", "Ngày tạo", "Tên NV", "Tình trạng"};
        dtm1.setColumnIdentifiers(hd);
        showDataHoaDon(hoaDonService.getHoaDon());

        jTableGioHang.setModel(dtm2);
        String[] gh = {"STT", "Mã SP", "Tên SP", "Số lượng", "Đơn Giá", "Thành tiền"};
        dtm2.setColumnIdentifiers(gh);

        jTableSanPham.setModel(dtm3);
        String[] sp = {"STT", "Mã SP", "Tên SP", "Năm BH", "Mô tả", "Số lượng", "Giá nhập", "Giá bán"};
        dtm3.setColumnIdentifiers(sp);
        showData(ql.getAll());
    }

    private void showData(List<SanPhamBanHangViewModel> list) {

        dtm3.setRowCount(0);
        for (SanPhamBanHangViewModel x : list) {
            dtm3.addRow(new Object[]{jTableSanPham.getRowCount() + 1, x.getMa(), x.getTen(),
                x.getNamBaoHanh(), x.getMoTa(), x.getSoLuong(), x.getGiaNhap(), x.getGiaBan()});
        }
    }

    private void showDataHoaDon(List<HoaDonBanHangViewModels> list) {
        dtm1.setRowCount(0);
        for (HoaDonBanHangViewModels x : list) {
            dtm1.addRow(new Object[]{jTableHoaDon.getRowCount() + 1, x.getMaHD(), x.getNgatTao(), x.getTenNV(), x.tinhTrang()});
        }
    }

    private void showGioHang(List<GioHangChiTietViewModels> list) {
        dtm2.setRowCount(0);
        for (GioHangChiTietViewModels x : list) {
            dtm2.addRow(new Object[]{jTableGioHang.getRowCount() + 1, x.getMaSp(), x.getTenSp(), x.getSoLuong(), x.getDonGia(), x.getSoLuong() * x.getDonGia()});
        }
    }

    private String genMa() {
//        List<HoaDonBanHangViewModels> list = new ArrayList<>();
//        String a;
//        for (int i = 0; i < list.size(); i++) {
//          return a = "HD" + i++;
//        }
        Random random = new Random();
        String a = "HD" + random.nextInt(100);
        return a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppmSanPham = new javax.swing.JPopupMenu();
        miXoa = new javax.swing.JMenuItem();
        miSua = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSanPham = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGioHang = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnTaoHoaDOn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtKhachDua = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHoaDon = new javax.swing.JTable();

        miXoa.setText("Xóa Sản PHẩm");
        miXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miXoaActionPerformed(evt);
            }
        });
        ppmSanPham.add(miXoa);

        miSua.setText("Sửa Sản Phẩm");
        ppmSanPham.add(miSua);

        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1149, 664));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Hóa đơn");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Hóa đơn");

        jTableSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableSanPham.setComponentPopupMenu(ppmSanPham);
        jTableSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableSanPham);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Giỏ hàng");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Sản phẩm");
        jLabel10.setToolTipText("");

        jTableGioHang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableGioHang);

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnTaoHoaDOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTaoHoaDOn.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Add to basket.png")); // NOI18N
        btnTaoHoaDOn.setText("Tạo hóa đơn");
        btnTaoHoaDOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDOnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mã HĐ");

        jLabel3.setText("Ngày Tạo");

        jLabel4.setText("Tên NV");

        jLabel5.setText("Tổng Tiền");

        jLabel6.setText("Tiền khách đưa");

        jLabel7.setText("Tiền thừa");

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThanhToan.setIcon(new javax.swing.ImageIcon("E:\\SOF204_DuAnMau\\Tai nguyen sinh vien\\Tai nguyen khac\\Hinh\\Payment.png")); // NOI18N
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnThanhToan)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnTaoHoaDOn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnTaoHoaDOn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void jTableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSanPhamMouseClicked
        // TODO add your handling code here:

        String txtSoLuong = JOptionPane.showInputDialog(this, "Số lượng", "0");
        try {
            int soLuong = Integer.valueOf(txtSoLuong);
            int row = jTableSanPham.getSelectedRow();
            GioHangChiTietViewModels gh = new GioHangChiTietViewModels();
            gh.setMaSp(jTableSanPham.getValueAt(row, 1).toString());
            gh.setTenSp(jTableSanPham.getValueAt(row, 2).toString());
            gh.setSoLuong(soLuong);
            gh.setDonGia((double) jTableSanPham.getValueAt(row, 7));

            list.add(gh);
            showGioHang(list);

//            ChiTietSanPham ctsp = new ChiTietSanPham();
//
//            ctsp.setSoLuong(ctsp.getSoLuong() - soLuong);
//
//            List<SanPham> lists = new ArrayList<>();
//            for (SanPham x : lists) {
//                String idSP = qlSP.getId(x.getMa()).getiD();
//                ql.updateSoLuong(ctsp, ql.getIDByIDSP(idSP).getiD());
//                showData(ql.getAll());
//            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng = số");

        }


    }//GEN-LAST:event_jTableSanPhamMouseClicked

    private void btnTaoHoaDOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDOnActionPerformed
        // TODO add your handling code here:
        HoaDon hd = new HoaDon();

        hd.setMa( "HD" + dtm1.getRowCount());
        hd.setNgayTao(new Date());
        hd.setNhanVien(new NhanVien("DCE777B1-4F07-45B7-9A8E-3D14175E165B"));
        hd.setTinhTrang(1);

        hoaDonService.saveHoaDon(hd);
        showDataHoaDon(hoaDonService.getHoaDon());
    }//GEN-LAST:event_btnTaoHoaDOnActionPerformed

    public double tongTien() {
        double tong = 0;
        for (GioHangChiTietViewModels x : list) {
            tong += x.getDonGia() * x.getSoLuong();
        }
        return tong;
    }
    private void jTableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHoaDonMouseClicked
        // TODO add your handling code here:
        int row1 = jTableGioHang.getSelectedRow();
        int row = jTableHoaDon.getSelectedRow();
        HoaDonBanHangViewModels hd = hoaDonService.getHoaDon().get(row);
        txtMaHD.setText(hd.getMaHD());
        txtNgayTao.setText(String.valueOf(hd.getNgatTao()));
        txtTenNV.setText(hd.getTenNV());
        txtMaHD.setEditable(false);
        txtNgayTao.setEditable(false);
        txtTenNV.setEditable(false);
        txtTongTien.setText(String.valueOf(tongTien()));

    }//GEN-LAST:event_jTableHoaDonMouseClicked

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        txtTienThua.setText(String.valueOf(Double.valueOf(txtKhachDua.getText()) - Double.valueOf(txtTongTien.getText())));
        
        HoaDonBanHangViewModels donViewModels = new HoaDonBanHangViewModels();
        donViewModels.setTinhTrang(0);
        hoaDonService.updateTinhTrang(donViewModels, hoaDonService.getIdByMa(txtMaHD.getText()).getId());

        
//        List<HoaDonChiTiet> listHDCT = new ArrayList<>();
        
        for (GioHangChiTietViewModels x : list) {
            HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
            String idSP = qlSP.getId(x.getMaSp()).getiD();
            hoaDonChiTiet.setChiTietSanPham(new ChiTietSanPham(ql.getIDByIDSP(idSP).getiD()));
            hoaDonChiTiet.setDonGia(x.getDonGia());
            hoaDonChiTiet.setSoLuong(x.getSoLuong());
            hoaDonChiTiet.setHoaDon(new HoaDon(hoaDonService.getIdByMa(txtMaHD.getText()).getId()));
            hDCTService.saveHDCT(hoaDonChiTiet);
//            listHDCT.add(hoaDonChiTiet);
        }
//        for (HoaDonChiTiet hoaDonChiTiet : listHDCT) {
//            hDCTService.saveHDCT(hoaDonChiTiet);
//        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void miXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miXoaActionPerformed
        // TODO add your handling code here:
        int row = jTableSanPham.getSelectedRow();
        if (row >= 0) {
            dtm3.removeRow(row);
        }
    }//GEN-LAST:event_miXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDOn;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableGioHang;
    private javax.swing.JTable jTableHoaDon;
    private javax.swing.JTable jTableSanPham;
    private javax.swing.JMenuItem miSua;
    private javax.swing.JMenuItem miXoa;
    private javax.swing.JPopupMenu ppmSanPham;
    private javax.swing.JTextField txtKhachDua;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
