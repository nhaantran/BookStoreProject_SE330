/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Book.Book;
import Model.Book.BookDao;
import View.Component.BillScreen;
import View.Component.BookScreen;
import View.Component.CustomerScreen;
import View.Component.DiscountScreen;
import View.Component.StatisticScreen;
import View.Tab.InsertBill;
import View.Tab.UpdateDiscount;
import View.Tab.InsertBook;
import View.Tab.InsertCustomer;
import View.Tab.InsertDiscount;
import View.Tab.UpdateBill;
import View.Tab.UpdateCustomer;
import View.Tab.UpdateBook;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nhaantran
 */
public class Home extends javax.swing.JFrame {

    
    /**
     * Creates new form LoginScreen
     */
    @SuppressWarnings("empty-statement")
    public Home() {
        initComponents();
        setclickColor(clickbook);
        //setForm(new BookScreen());
        setForm(new BookScreen());
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screen = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        menubook = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblsach = new javax.swing.JLabel();
        clickbook = new javax.swing.JPanel();
        menudiscount = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblncc = new javax.swing.JLabel();
        clicksupplier = new javax.swing.JPanel();
        menucustomer = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblkhach = new javax.swing.JLabel();
        clickcustomer = new javax.swing.JPanel();
        menustatistic = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblthongke = new javax.swing.JLabel();
        clickstatistic = new javax.swing.JPanel();
        menubill = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblhoadon = new javax.swing.JLabel();
        clickbill = new javax.swing.JPanel();
        lblbookstore = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblbookstoreicon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usericon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblUSERID = new javax.swing.JLabel();
        lblUSERMAIL = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        searchBar1 = new View.Component.SearchBar();
        datapane = new View.Component.datapane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setResizable(false);

        screen.setBackground(new java.awt.Color(204, 204, 204));

        sidepane.setBackground(new java.awt.Color(246, 248, 250));
        sidepane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubook.setBackground(new java.awt.Color(246, 248, 250));
        menubook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menubookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menubookMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/warehouse.png"))); // NOI18N

        lblsach.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblsach.setForeground(new java.awt.Color(0, 0, 0));
        lblsach.setText("Storage");

        clickbook.setBackground(new java.awt.Color(246, 248, 250));

        javax.swing.GroupLayout clickbookLayout = new javax.swing.GroupLayout(clickbook);
        clickbook.setLayout(clickbookLayout);
        clickbookLayout.setHorizontalGroup(
            clickbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        clickbookLayout.setVerticalGroup(
            clickbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menubookLayout = new javax.swing.GroupLayout(menubook);
        menubook.setLayout(menubookLayout);
        menubookLayout.setHorizontalGroup(
            menubookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubookLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(clickbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menubookLayout.setVerticalGroup(
            menubookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubookLayout.createSequentialGroup()
                .addGroup(menubookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menubookLayout.createSequentialGroup()
                        .addGroup(menubookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menubookLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5))
                            .addGroup(menubookLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblsach)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(clickbook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidepane.add(menubook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, -1));

        menudiscount.setBackground(new java.awt.Color(246, 248, 250));
        menudiscount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menudiscount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menudiscountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menudiscountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menudiscountMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/supplier.png"))); // NOI18N

        lblncc.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblncc.setForeground(new java.awt.Color(0, 0, 0));
        lblncc.setText("Discount");

        clicksupplier.setBackground(new java.awt.Color(246, 248, 250));

        javax.swing.GroupLayout clicksupplierLayout = new javax.swing.GroupLayout(clicksupplier);
        clicksupplier.setLayout(clicksupplierLayout);
        clicksupplierLayout.setHorizontalGroup(
            clicksupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        clicksupplierLayout.setVerticalGroup(
            clicksupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menudiscountLayout = new javax.swing.GroupLayout(menudiscount);
        menudiscount.setLayout(menudiscountLayout);
        menudiscountLayout.setHorizontalGroup(
            menudiscountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menudiscountLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblncc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(clicksupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menudiscountLayout.setVerticalGroup(
            menudiscountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menudiscountLayout.createSequentialGroup()
                .addGroup(menudiscountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menudiscountLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addGroup(menudiscountLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblncc)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(clicksupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane.add(menudiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, -1));

        menucustomer.setBackground(new java.awt.Color(246, 248, 250));
        menucustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menucustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menucustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menucustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menucustomerMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customerblack.png"))); // NOI18N

        lblkhach.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblkhach.setForeground(new java.awt.Color(0, 0, 0));
        lblkhach.setText("Customer");

        clickcustomer.setBackground(new java.awt.Color(246, 248, 250));

        javax.swing.GroupLayout clickcustomerLayout = new javax.swing.GroupLayout(clickcustomer);
        clickcustomer.setLayout(clickcustomerLayout);
        clickcustomerLayout.setHorizontalGroup(
            clickcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        clickcustomerLayout.setVerticalGroup(
            clickcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menucustomerLayout = new javax.swing.GroupLayout(menucustomer);
        menucustomer.setLayout(menucustomerLayout);
        menucustomerLayout.setHorizontalGroup(
            menucustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menucustomerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblkhach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(clickcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menucustomerLayout.setVerticalGroup(
            menucustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menucustomerLayout.createSequentialGroup()
                .addGroup(menucustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menucustomerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11))
                    .addGroup(menucustomerLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblkhach)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(clickcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane.add(menucustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, -1));

        menustatistic.setBackground(new java.awt.Color(246, 248, 250));
        menustatistic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menustatistic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menustatisticMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menustatisticMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menustatisticMouseExited(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/analytics_1.png"))); // NOI18N

        lblthongke.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblthongke.setForeground(new java.awt.Color(0, 0, 0));
        lblthongke.setText("Statistic");

        clickstatistic.setBackground(new java.awt.Color(246, 248, 250));

        javax.swing.GroupLayout clickstatisticLayout = new javax.swing.GroupLayout(clickstatistic);
        clickstatistic.setLayout(clickstatisticLayout);
        clickstatisticLayout.setHorizontalGroup(
            clickstatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        clickstatisticLayout.setVerticalGroup(
            clickstatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menustatisticLayout = new javax.swing.GroupLayout(menustatistic);
        menustatistic.setLayout(menustatisticLayout);
        menustatisticLayout.setHorizontalGroup(
            menustatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menustatisticLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblthongke)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(clickstatistic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menustatisticLayout.setVerticalGroup(
            menustatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menustatisticLayout.createSequentialGroup()
                .addGroup(menustatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menustatisticLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel13))
                    .addGroup(menustatisticLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblthongke)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(clickstatistic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane.add(menustatistic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 60));

        menubill.setBackground(new java.awt.Color(246, 248, 250));
        menubill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menubillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menubillMouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/billblack.png"))); // NOI18N

        lblhoadon.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblhoadon.setForeground(new java.awt.Color(0, 0, 0));
        lblhoadon.setText("Bill");

        clickbill.setBackground(new java.awt.Color(246, 248, 250));

        javax.swing.GroupLayout clickbillLayout = new javax.swing.GroupLayout(clickbill);
        clickbill.setLayout(clickbillLayout);
        clickbillLayout.setHorizontalGroup(
            clickbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        clickbillLayout.setVerticalGroup(
            clickbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menubillLayout = new javax.swing.GroupLayout(menubill);
        menubill.setLayout(menubillLayout);
        menubillLayout.setHorizontalGroup(
            menubillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubillLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhoadon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(clickbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menubillLayout.setVerticalGroup(
            menubillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubillLayout.createSequentialGroup()
                .addGroup(menubillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menubillLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel15))
                    .addGroup(menubillLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblhoadon)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(clickbill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane.add(menubill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, -1));

        lblbookstore.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblbookstore.setForeground(new java.awt.Color(0, 153, 255));
        lblbookstore.setText("UIT Book Store");
        sidepane.add(lblbookstore, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 10));

        lblbookstoreicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bookshelvessmall.png"))); // NOI18N
        lblbookstoreicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbookstoreiconMouseClicked(evt);
            }
        });
        sidepane.add(lblbookstoreicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        usericon.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("User ID:");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblUSERID.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblUSERID.setForeground(new java.awt.Color(0, 0, 0));
        lblUSERID.setText("this is user ID");
        lblUSERID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblUSERMAIL.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblUSERMAIL.setForeground(new java.awt.Color(0, 0, 0));
        lblUSERMAIL.setText("this is user Mail");
        lblUSERMAIL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel19.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("User Mail:");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lbllogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logoutblack.png"))); // NOI18N
        lbllogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(usericon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUSERID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUSERMAIL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lbllogout)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogout)
                    .addComponent(usericon)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblUSERID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblUSERMAIL))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 60));

        searchBar1.setForeground(new java.awt.Color(204, 204, 204));

        datapane.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout datapaneLayout = new javax.swing.GroupLayout(datapane);
        datapane.setLayout(datapaneLayout);
        datapaneLayout.setHorizontalGroup(
            datapaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        datapaneLayout.setVerticalGroup(
            datapaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout screenLayout = new javax.swing.GroupLayout(screen);
        screen.setLayout(screenLayout);
        screenLayout.setHorizontalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                    .addGroup(screenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(datapane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        screenLayout.setVerticalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
            .addGroup(screenLayout.createSequentialGroup()
                .addComponent(searchBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datapane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setForm(Component pane){
        datapane.removeAll();
        datapane.add(pane);
        datapane.repaint();
        datapane.revalidate();
    }
    
    void menuentercolor(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }
    void menuexitcolor(JPanel panel){
        panel.setBackground(new Color(246,248,250));
    }
    
    void lblsetmenufontbold(JLabel label){
        label.setFont(new Font("Candara",Font.BOLD, 18));
    }
    
    void lblsetmenufontplain(JLabel label){
        label.setFont(new Font("Candara",Font.PLAIN, 18));
    }
    
    
    
    private void menubookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubookMouseEntered
        // TODO add your handling code here:
        menuentercolor(menubook);
        lblsetmenufontbold(lblsach);
    }//GEN-LAST:event_menubookMouseEntered

    private void menubookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubookMouseExited
        // TODO add your handling code here:
        menuexitcolor(menubook);
        lblsetmenufontplain(lblsach);
    }//GEN-LAST:event_menubookMouseExited

    private void menudiscountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudiscountMouseEntered
        // TODO add your handling code here:
        menuentercolor(menudiscount);
        lblsetmenufontbold(lblncc);
    }//GEN-LAST:event_menudiscountMouseEntered

    private void menudiscountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudiscountMouseExited
        // TODO add your handling code here:
        menuexitcolor(menudiscount);
        lblsetmenufontplain(lblncc);
    }//GEN-LAST:event_menudiscountMouseExited

    private void menucustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menucustomerMouseEntered
        // TODO add your handling code here:
        menuentercolor(menucustomer);
        lblsetmenufontbold(lblkhach);
    }//GEN-LAST:event_menucustomerMouseEntered

    private void menucustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menucustomerMouseExited
        // TODO add your handling code here:
        menuexitcolor(menucustomer);
        lblsetmenufontplain(lblkhach);
    }//GEN-LAST:event_menucustomerMouseExited

    private void menubillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubillMouseEntered
        // TODO add your handling code here:
        menuentercolor(menubill);
        lblsetmenufontbold(lblhoadon);
    }//GEN-LAST:event_menubillMouseEntered

    private void menubillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubillMouseExited
        // TODO add your handling code here:
        menuexitcolor(menubill);
        lblsetmenufontplain(lblhoadon);
    }//GEN-LAST:event_menubillMouseExited

    private void menustatisticMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menustatisticMouseEntered
        // TODO add your handling code here:
        menuentercolor(menustatistic);
        lblsetmenufontbold(lblthongke);
    }//GEN-LAST:event_menustatisticMouseEntered

    private void menustatisticMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menustatisticMouseExited
        // TODO add your handling code here:
        menuexitcolor(menustatistic);
        lblsetmenufontplain(lblthongke);
    }//GEN-LAST:event_menustatisticMouseExited

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseClicked
        // TODO add your handling code here:
        Login screen  = new Login();
        screen.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lbllogoutMouseClicked
//
//    private void setpanevisible(JPanel panel){
//        
//        bookpane.setVisible(false);
//        discountpane.setVisible(false);
//        customerpane.setVisible(false);
//        billpane.setVisible(false);
//        statisticpane.setVisible(false);
//        
//        panel.setVisible(true);
//    }
//    
    private void loadDatatoTable(ArrayList<Book> list){
        try{
            for(Book s : list){
//                table.addRow(new Object[]{
//                    s.getID(),s.getName(), s.getDescription(),s.getSupplier(),s.getAuthor(),s.getPublisher(),s.getEdition(),
//                    s.getType(),s.getBookCover(), s.getReleaseDate(), s.getNumPages(), s.getPrice(), "not set",new BookDao(s)
//                });   
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private void setclickColor(JPanel panel){
        
        clickbook.setBackground(Color.WHITE);
        clicksupplier.setBackground(Color.WHITE);
        clickcustomer.setBackground(Color.WHITE);
        clickbill.setBackground(Color.WHITE);
        clickstatistic.setBackground(Color.WHITE);
        
        panel.setBackground(new Color(0,0,0));
    }
    
    private void menubookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubookMouseClicked
        // TODO add your handling code here:
        setForm(new BookScreen());
        setclickColor(clickbook);
    }//GEN-LAST:event_menubookMouseClicked

    private void menudiscountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudiscountMouseClicked
        // TODO add your handling code here:
        setForm(new DiscountScreen());
        setclickColor(clicksupplier);
    }//GEN-LAST:event_menudiscountMouseClicked

    private void menucustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menucustomerMouseClicked
        // TODO add your handling code here:
        setForm(new CustomerScreen());
        setclickColor(clickcustomer);
    }//GEN-LAST:event_menucustomerMouseClicked

    private void menubillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubillMouseClicked
        // TODO add your handling code here:
        setForm(new BillScreen());
        setclickColor(clickbill);
    }//GEN-LAST:event_menubillMouseClicked

    private void menustatisticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menustatisticMouseClicked
        // TODO add your handling code here:
        setForm(new StatisticScreen());
        setclickColor(clickstatistic);
    }//GEN-LAST:event_menustatisticMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1MouseClicked

   
    
    private void lblbookstoreiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbookstoreiconMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblbookstoreiconMouseClicked

   

    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clickbill;
    private javax.swing.JPanel clickbook;
    private javax.swing.JPanel clickcustomer;
    private javax.swing.JPanel clickstatistic;
    private javax.swing.JPanel clicksupplier;
    private View.Component.datapane datapane;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUSERID;
    private javax.swing.JLabel lblUSERMAIL;
    private javax.swing.JLabel lblbookstore;
    private javax.swing.JLabel lblbookstoreicon;
    private javax.swing.JLabel lblhoadon;
    private javax.swing.JLabel lblkhach;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblncc;
    private javax.swing.JLabel lblsach;
    private javax.swing.JLabel lblthongke;
    private javax.swing.JPanel menubill;
    private javax.swing.JPanel menubook;
    private javax.swing.JPanel menucustomer;
    private javax.swing.JPanel menudiscount;
    private javax.swing.JPanel menustatistic;
    private javax.swing.JPanel screen;
    private View.Component.SearchBar searchBar1;
    private javax.swing.JPanel sidepane;
    private javax.swing.JLabel usericon;
    // End of variables declaration//GEN-END:variables
}
