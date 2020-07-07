
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import java.text.DateFormat;
import java.util.*;
import javax.swing.JComboBox;
public final class MainPage extends javax.swing.JFrame {
    public MainPage() {
        initComponents();
        showDbTable(addTable);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        dispButton = new javax.swing.JButton();
        billButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        addPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        iName = new javax.swing.JTextField();
        iQty = new javax.swing.JTextField();
        iPrice = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        iQty2 = new javax.swing.JTextField();
        iPrice2 = new javax.swing.JTextField();
        updateItemButton = new javax.swing.JButton();
        iNameLabel2 = new javax.swing.JLabel();
        iQtyLabel2 = new javax.swing.JLabel();
        iPriceLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateItems = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        updateTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        deleteItem = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        deleteTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        billingPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        selectItem = new javax.swing.JComboBox<>();
        selectItemLabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        qtyTextField = new javax.swing.JTextField();
        addToBill = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        billTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 80)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SAT SAHEB AUTOPARTS");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 990, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainPageBack.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 990, 170));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255,20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        updateButton.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        updateButton.setText("UPDATE AN ITEM ");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        dispButton.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        dispButton.setText("SHOW ALL ITEMS");
        dispButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispButtonActionPerformed(evt);
            }
        });

        billButton.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        billButton.setText("CREATE BILL");
        billButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        addButton.setText("ADD NEW  ITEM");
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        delButton.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        delButton.setText("DELETE AN ITEM");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dispButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(dispButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 700));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        addPanel.setBackground(new java.awt.Color(102, 102, 255,20));

        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel3KeyPressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iName.setText("Item Name");
        iName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iNameFocusLost(evt);
            }
        });
        iName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iNameActionPerformed(evt);
            }
        });
        jPanel3.add(iName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 40));

        iQty.setText("Enter Quantity");
        iQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iQtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iQtyFocusLost(evt);
            }
        });
        iQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iQtyActionPerformed(evt);
            }
        });
        jPanel3.add(iQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 50));

        iPrice.setText("Price Per Item");
        iPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iPriceFocusLost(evt);
            }
        });
        iPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iPriceActionPerformed(evt);
            }
        });
        iPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iPriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iPriceKeyReleased(evt);
            }
        });
        jPanel3.add(iPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 50));

        addItemButton.setText("Add Item to Shop");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });
        addItemButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addItemButtonKeyPressed(evt);
            }
        });
        jPanel3.add(addItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 250, 50));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADDING DETAILS OF NEW ITEM");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 50));

        addTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(addTable);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ITEMS IN OUR SHOP");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLayeredPane1.add(addPanel, "card2");

        updatePanel.setBackground(new java.awt.Color(102, 102, 255,20));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iQty2.setText("Enter Quantity");
        iQty2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iQty2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iQty2FocusLost(evt);
            }
        });
        iQty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iQty2ActionPerformed(evt);
            }
        });
        jPanel4.add(iQty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 50));

        iPrice2.setText("Price Per Item");
        iPrice2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iPrice2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iPrice2FocusLost(evt);
            }
        });
        iPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iPrice2ActionPerformed(evt);
            }
        });
        jPanel4.add(iPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, 50));

        updateItemButton.setText("UPDATE ITEM");
        updateItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemButtonActionPerformed(evt);
            }
        });
        jPanel4.add(updateItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 250, 50));

        iNameLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jPanel4.add(iNameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        iQtyLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jPanel4.add(iQtyLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        iPriceLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jPanel4.add(iPriceLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DETAILS OF UPDATING ITEM");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 50));

        updateItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(updateItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 40));

        updateTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(updateTable);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ITEMS IN OUR SHOP");

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(295, 295, 295))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLayeredPane1.add(updatePanel, "card2");

        displayPanel.setBackground(new java.awt.Color(102, 102, 255,20));

        displayTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        displayTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(displayTable);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SATSAHEB AUTOPARTS ITEM LIST");

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLayeredPane1.add(displayPanel, "card2");

        deletePanel.setBackground(new java.awt.Color(102, 102, 255,20));

        jLabel12.setText("Select item to delete");

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        deleteItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deleteItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteItemKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(deleteItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        deleteTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(deleteTable);

        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ITEM LIST IN OUR SHOP");

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLayeredPane1.add(deletePanel, "card6");

        billingPanel.setBackground(new java.awt.Color(102, 102, 255,20));

        selectItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectItemActionPerformed(evt);
            }
        });

        selectItemLabel.setText("Select Item");

        qtyLabel.setText("Quantity");

        qtyTextField.setText("1");
        qtyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyTextFieldKeyPressed(evt);
            }
        });

        addToBill.setText("ADD TO BILL");
        addToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectItem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(selectItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToBill)
                    .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addToBill)
                .addGap(116, 116, 116))
        );

        billTextArea.setColumns(20);
        billTextArea.setRows(5);
        jScrollPane5.setViewportView(billTextArea);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BILL");

        printButton.setText("PRINT");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        jButton1.setText("RESET BILL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billingPanelLayout = new javax.swing.GroupLayout(billingPanel);
        billingPanel.setLayout(billingPanelLayout);
        billingPanelLayout.setHorizontalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billingPanelLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(billingPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        billingPanelLayout.setVerticalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLayeredPane1.add(billingPanel, "card2");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 173, 990, 530));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newItemBack.jpg"))); // NOI18N
        jLabel8.setText("bill");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public HashMap<String,Integer> BillingItems = new HashMap<>();
    
    public Statement getConnectionToDB()
    {
        try{
            String url = "jdbc:mysql://localhost:3306/satsaheb";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbuser = "root";
            String dbpass  = "8080";
            Connection conn = DriverManager.getConnection(url,dbuser,dbpass);
            Statement st = conn.createStatement();
            return st;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(jLayeredPane1, "Database error please contact to MANISH");
        }
        return null;
    }
    
    public void showDbTable(JTable table)
    {
        Statement st = getConnectionToDB();
        try{
            ResultSet rs = st.executeQuery("select * from itemDetails");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(addPanel, "Enter valid price or valid quantity");
        }
         
    }
    public void showInComboBox(JComboBox jBox)
    {
        Statement st = getConnectionToDB();
        jBox.removeAllItems();
        try
        {
            ResultSet rs =  st.executeQuery("select Item_Name from itemDetails");
            ArrayList<String>items =new ArrayList<>();
            while(rs.next())
            {
                items.add(rs.getString("Item_Name"));
            }
            Collections.sort(items);
            items.forEach(s -> {
                jBox.addItem(s);
            });
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    public void resetBill()
    {
        String date = DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());
        int  BillNo;
        BillNo = (int)(Math.random()*1000);
        billTextArea.append("\t          SATSAHEB AUTOPARTS\n"+
                "\t                 Uniara Bus Stand\n"+
                "   Bill No."+BillNo+"\t\t\t    PH: 9667689832\n"+
                "   Date:"+date+"             \t\t    Pin-code:304024\n"+
                "   ====================================================\n"+
                "   S.   Item                 \t                  Qty   \t      Rate             Amt\n"+
                "   ====================================================\n");
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(addPanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        showDbTable(addTable);
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(updatePanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        showDbTable(updateTable);
        Statement st = getConnectionToDB();
        updateItems.removeAllItems();
        showInComboBox(updateItems);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void dispButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispButtonActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(displayPanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        showDbTable(displayTable);
    }//GEN-LAST:event_dispButtonActionPerformed

    private void billButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billButtonActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(billingPanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        showInComboBox(selectItem);
        billTextArea.setText("");
        BillingItems.clear();
        resetBill();
    }//GEN-LAST:event_billButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        try{
            String itemName = iName.getText().toUpperCase();
            if(itemName.length()>10)
            {
                itemName = itemName.substring(0,10)+"...";
            }
            int itemQty = Integer.parseInt(iQty.getText());
            float itemPrice = Float.parseFloat(iPrice.getText());
            try{
                Statement st = getConnectionToDB();                
                st.executeUpdate("insert into itemDetails values('"+itemName+"','"+itemQty+"','"+itemPrice+"')");
                JOptionPane.showMessageDialog(addPanel,itemName+" successfully added to your shop");
                showDbTable(addTable);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(addPanel,"Item already exist you can update the item in update section");
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(addPanel, "Quantity or Price is not valid!!!");
        }
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void iPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iPriceActionPerformed

    private void iPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iPriceFocusLost
        // TODO add your handling code here:
        if(iPrice.getText().equals(""))
        {
            iPrice.setText("Price Per Item");
        }
    }//GEN-LAST:event_iPriceFocusLost

    private void iPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iPriceFocusGained
        // TODO add your handling code here:
        if(iPrice.getText().equals("Price Per Item"))
        {
            iPrice.setText("");
        }
    }//GEN-LAST:event_iPriceFocusGained

    private void iQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iQtyActionPerformed

    private void iQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iQtyFocusLost
        // TODO add your handling code here:
        if(iQty.getText().equals(""))
        {
            iQty.setText("Enter Quantity");
        }
    }//GEN-LAST:event_iQtyFocusLost

    private void iQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iQtyFocusGained
        // TODO add your handling code here:
        if(iQty.getText().equals("Enter Quantity"))
        {
            iQty.setText("");
        }
    }//GEN-LAST:event_iQtyFocusGained

    private void iNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_iNameActionPerformed

    private void iNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iNameFocusLost
        // TODO add your handling code here:
        if(iName.getText().equals(""))
        {
            iName.setText("Item Name");
        }
    }//GEN-LAST:event_iNameFocusLost

    private void iNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iNameFocusGained
        // TODO add your handling code here:
        if(iName.getText().equals("Item Name"))
        {
            iName.setText("");
        }
    }//GEN-LAST:event_iNameFocusGained

    private void iQty2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iQty2FocusGained
        // TODO add your handling code here:
        if(iQty2.getText().equals("Enter Quantity"))
        {
            iQty2.setText("");                    
        }
    }//GEN-LAST:event_iQty2FocusGained

    private void iQty2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iQty2FocusLost
        // TODO add your handling code here:
        if(iQty2.getText().equals(""))
        {
            iQty2.setText("Enter Quantity");                    
        }
    }//GEN-LAST:event_iQty2FocusLost

    private void iQty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iQty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iQty2ActionPerformed

    private void iPrice2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iPrice2FocusGained
        // TODO add your handling code here:
        if(iPrice2.getText().equals("Price Per Item"))
        {
            iPrice2.setText("");
        }
    }//GEN-LAST:event_iPrice2FocusGained

    private void iPrice2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iPrice2FocusLost
        // TODO add your handling code here:
        if(iPrice2.getText().equals(""))
        {
            iPrice2.setText("Price Per Item");
        }
    }//GEN-LAST:event_iPrice2FocusLost

    private void iPrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iPrice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iPrice2ActionPerformed

    @SuppressWarnings("empty-statement")
    private void updateItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemButtonActionPerformed
        String itemName = updateItems.getSelectedItem().toString();
        if(!iQty2.getText().equals("Enter Quantity") && !iPrice2.getText().equals("Price Per Item"))
        {
            int itemQty = Integer.parseInt(iQty2.getText());
            float itemPrice = Float.parseFloat(iPrice2.getText());
            try{
                Statement st = getConnectionToDB();
                st.executeUpdate("update itemDetails set Item_Qty = "+itemQty+",Item_Price="+itemPrice+" where Item_Name = "+"'"+itemName+"'");
                JOptionPane.showMessageDialog(addPanel, "Quantity and Price of "+itemName+" has been updated");
                showDbTable(updateTable);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(addPanel, "Database error please contact to MANISH");
            }
        }
        else if(!iQty2.getText().equals("Enter Quantity"))
        {
            int itemQty = Integer.parseInt(iQty2.getText());
            try{
                Statement st = getConnectionToDB();
                st.executeUpdate("update itemDetails set Item_Qty = "+itemQty+" where Item_Name = '"+itemName+"'");
                JOptionPane.showMessageDialog(addPanel, "Quantity of "+itemName+" has been updated");
                showDbTable(updateTable);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(addPanel, "Database error please contact to MANISH"+e.getMessage());
            }
        }
        else
        {
            float itemPrice = Float.parseFloat(iPrice2.getText());
            try{
                Statement st = getConnectionToDB();
                st.executeUpdate("update itemDetails set Item_Price="+itemPrice+" where Item_Name = "+"'"+itemName+"'");
                JOptionPane.showMessageDialog(addPanel, "Price of "+itemName+" has been updated");
                showDbTable(updateTable);
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(addPanel, "Database error please contact to MANISH"+e.getMessage());
            }
        }       
    }//GEN-LAST:event_updateItemButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(deletePanel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
        showDbTable(deleteTable);
        showInComboBox(deleteItem);
    }//GEN-LAST:event_delButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        try
        {            
            String toDelete = deleteItem.getSelectedItem().toString();
            try{
                Statement st  = getConnectionToDB();
                st.executeUpdate("delete from itemDetails where Item_Name = "+"'"+toDelete+"'");
                showDbTable(deleteTable);
                JOptionPane.showMessageDialog(deletePanel, toDelete+" has been deleted from shop list!!!");
                showInComboBox(deleteItem);
                } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(deletePanel, " Database probel  contact to MANISH");
            }
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(deletePanel, "No item to Delete");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void selectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectItemActionPerformed

    private void addToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBillActionPerformed
        billTextArea.setText("");
        resetBill();
        String itemName = selectItem.getSelectedItem().toString();
        try{
            int qty = Integer.parseInt(qtyTextField.getText());
            Statement st = getConnectionToDB();
            try{
                ResultSet rs = st.executeQuery("select Item_Qty from itemDetails where Item_Name ='"+itemName+"'");
                rs.next();
                int preQty = Integer.parseInt(rs.getString("Item_Qty"));
                if(preQty>=qty)
                {
                    BillingItems. put(itemName, qty);
                    int sno = 1;
                    float total = 0;
                    for(String item:BillingItems.keySet())
                    {
                        rs = st.executeQuery("select Item_Price from itemDetails where Item_Name =  '"+item+"'");
                        rs.next();
                        int l = 65-(int)Math.ceil(item.length()*2.5);
                        String space = new String(new char[l+3]).replace('\0', ' ');
                        float price = Float.parseFloat(rs.getString("Item_Price"));
                        billTextArea.append("   "+sno+"     "+item+space+BillingItems.get(item)+"\t      "+price+
                                "      "+BillingItems.get(item)*price+"\n");
                        total+=(BillingItems.get(item)*price);
                        sno++;
                    }
                    String lines = new String(new char[16-sno]).replace('\0', '\n');
                    billTextArea.append(lines+"     TOTAL"+"\t\t\t\t"+total);
                }
                else
                {
                    int sno = 1;
                    float total = 0;
                    for(String item:BillingItems.keySet())
                    {
                        rs = st.executeQuery("select Item_Price from itemDetails where Item_Name =  '"+item+"'");
                        rs.next();
                        int l = 65-(int)Math.ceil(item.length()*2.5);
                        String space = new String(new char[l+3]).replace('\0', ' ');
                        float price = Float.parseFloat(rs.getString("Item_Price"));
                        billTextArea.append("   "+sno+"     "+item+space+BillingItems.get(item)+"\t      "+price+
                                "          "+BillingItems.get(item)*price+"\n");
                        total+=(BillingItems.get(item)*price);
                        sno++;
                    }
                    String lines = new String(new char[16-sno]).replace('\0', '\n');
                    billTextArea.append(lines+"     TOTAL"+"\t\t\t\t"+total);
                    JOptionPane.showMessageDialog(billingPanel, "This much quantity not availlable in our stock!!!");
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(billingPanel, "Database problem!!Contact to MANISH");
            }         
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(billingPanel, "Quantity should be a number");
        }        
    }//GEN-LAST:event_addToBillActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            // TODO add your handling code here:
            billTextArea.print();
            try{
                Statement st = getConnectionToDB();
                for(String s:BillingItems.keySet())
                {
                    st.executeUpdate("Update itemDetails set Item_Qty = Item_Qty-"+BillingItems.get(s)+" where Item_Name = '"+s+"'");
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(billingPanel, "DATABASE PROBLEM CONTACT TO MANISH"+e.getMessage());
            }
            
        } catch (PrinterException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        billTextArea.setText("");
        BillingItems.clear();
        resetBill();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3KeyPressed

    private void iPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iPriceKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            try{
                String itemName = iName.getText().toUpperCase();
                int itemQty = Integer.parseInt(iQty.getText());
                float itemPrice = Float.parseFloat(iPrice.getText());
                try{
                    Statement st = getConnectionToDB();                
                    st.executeUpdate("insert into itemDetails values('"+itemName+"','"+itemQty+"','"+itemPrice+"')");
                    JOptionPane.showMessageDialog(addPanel,itemName+" successfully added to your shop");
                    showDbTable(addTable);
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(addPanel,"Item already exist you can update the item in update section");
                }
            }   
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(addPanel, "Quantity or Price is not valid!!!");
            }
        }
    }//GEN-LAST:event_iPriceKeyPressed

    private void addItemButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addItemButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addItemButtonKeyPressed

    private void iPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iPriceKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            billTextArea.setText("");
        resetBill();
        String itemName = selectItem.getSelectedItem().toString();
        try{
            int qty = Integer.parseInt(qtyTextField.getText());
            Statement st = getConnectionToDB();
            try{
                ResultSet rs = st.executeQuery("select Item_Qty from itemDetails where Item_Name ='"+itemName+"'");
                rs.next();
                int preQty = Integer.parseInt(rs.getString("Item_Qty"));
                if(preQty>=qty)
                {
                    BillingItems. put(itemName, qty);
                    int sno = 1;
                    float total = 0;
                    for(String item:BillingItems.keySet())
                    {
                        rs = st.executeQuery("select Item_Price from itemDetails where Item_Name =  '"+item+"'");
                        rs.next();
                        int l = 65-(int)Math.ceil(item.length()*2.5);
                        String space = new String(new char[l+3]).replace('\0', ' ');
                        float price = Float.parseFloat(rs.getString("Item_Price"));
                        billTextArea.append("   "+sno+"     "+item+space+BillingItems.get(item)+"\t      "+price+
                                "      "+BillingItems.get(item)*price+"\n");
                        total+=(BillingItems.get(item)*price);
                        sno++;
                    }
                    String lines = new String(new char[16-sno]).replace('\0', '\n');
                    billTextArea.append(lines+"     TOTAL"+"\t\t\t\t"+total);
                }
                else
                {
                    int sno = 1;
                    float total = 0;
                    for(String item:BillingItems.keySet())
                    {
                        rs = st.executeQuery("select Item_Price from itemDetails where Item_Name =  '"+item+"'");
                        rs.next();
                        int l = 65-(int)Math.ceil(item.length()*2.5);
                        String space = new String(new char[l+3]).replace('\0', ' ');
                        float price = Float.parseFloat(rs.getString("Item_Price"));
                        billTextArea.append("   "+sno+"     "+item+space+BillingItems.get(item)+"\t      "+price+
                                "          "+BillingItems.get(item)*price+"\n");
                        total+=(BillingItems.get(item)*price);
                        sno++;
                    }
                    String lines = new String(new char[16-sno]).replace('\0', '\n');
                    billTextArea.append(lines+"     TOTAL"+"\t\t\t\t"+total);
                    JOptionPane.showMessageDialog(billingPanel, "This much quantity not availlable in our stock!!!");
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(billingPanel, "Database problem!!Contact to MANISH");
            }         
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(billingPanel, "Quantity should be a number");
        }
        }
    }//GEN-LAST:event_iPriceKeyReleased

    private void deleteItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteItemKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String toDelete = deleteItem.getSelectedItem().toString();
            try{
                Statement st  = getConnectionToDB();
                st.executeUpdate("delete from itemDetails where Item_Name = "+"'"+toDelete+"'");
                showDbTable(deleteTable);
                showInComboBox(deleteItem);
            } catch (SQLException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_deleteItemKeyPressed

    private void qtyTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextFieldKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_qtyTextFieldKeyPressed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTable addTable;
    private javax.swing.JButton addToBill;
    private javax.swing.JButton billButton;
    private javax.swing.JTextArea billTextArea;
    private javax.swing.JPanel billingPanel;
    private javax.swing.JButton delButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> deleteItem;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JTable deleteTable;
    private javax.swing.JButton dispButton;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JTable displayTable;
    private javax.swing.JTextField iName;
    private javax.swing.JLabel iNameLabel2;
    private javax.swing.JTextField iPrice;
    private javax.swing.JTextField iPrice2;
    private javax.swing.JLabel iPriceLabel2;
    private javax.swing.JTextField iQty;
    private javax.swing.JTextField iQty2;
    private javax.swing.JLabel iQtyLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField qtyTextField;
    private javax.swing.JComboBox<String> selectItem;
    private javax.swing.JLabel selectItemLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateItemButton;
    private javax.swing.JComboBox<String> updateItems;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JTable updateTable;
    // End of variables declaration//GEN-END:variables
}
