package com.mycompany.mediaone.View.Product;

import com.mycompany.mediaone.Model.Product;
import com.mycompany.mediaone.Util.FileUtil;
import com.mycompany.mediaone.Util.ProductUtil;
import com.mycompany.mediaone.View.HomePage;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddProduct extends javax.swing.JPanel {

    private HomePage homePage;
    private ProductUtil productUtil = new ProductUtil();
    private FileUtil<Product> productFileUtil = new FileUtil<>();

    private void resetAllTextAfterCreateProduct() {
        productNameTextArea.setText("");
        productIdTextArea.setText(UUID.randomUUID().toString());
        productSellPriceTextArea.setText("");
        productInputPriceTextArea.setText("");
        productNumInStockTextArea.setText("");
        productDateRelease.setCalendar(null);
        productActorTextArea.setText("");
        productCategoryTextArea.setText("");
        productAuthorTextArea.setText("");
    }

    public AddProduct(HomePage homePage) {
        initComponents();
        this.homePage = homePage;
        this.productIdTextArea.setText(UUID.randomUUID().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        InterfaceTitleLabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        productIdPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productIdTextArea = new javax.swing.JTextArea();
        productNamePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productNameTextArea = new javax.swing.JTextArea();
        productTypePanel = new javax.swing.JPanel();
        productTypeLabel = new javax.swing.JLabel();
        productTypeComboBox = new javax.swing.JComboBox<>();
        productCategoryPanel = new javax.swing.JPanel();
        productCategoryLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        productCategoryTextArea = new javax.swing.JTextArea();
        productAuthorPanel = new javax.swing.JPanel();
        productAuthorLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        productAuthorTextArea = new javax.swing.JTextArea();
        productListActorSinger = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        productActorTextArea = new javax.swing.JTextArea();
        productSellPricePanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        productSellPriceTextArea = new javax.swing.JTextArea();
        productNumInStockPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        productInputPriceTextArea = new javax.swing.JTextArea();
        productNumInStockPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        productNumInStockTextArea = new javax.swing.JTextArea();
        dataRelease = new javax.swing.JPanel();
        productIdPanel1 = new javax.swing.JLabel();
        productDateRelease = new com.toedter.calendar.JDateChooser();
        backBtnPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        createBtnPanel = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setPreferredSize(new java.awt.Dimension(689, 542));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setPreferredSize(new java.awt.Dimension(692, 567));

        InterfaceTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InterfaceTitleLabel.setText("Add products");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        formPanel.setLayout(new java.awt.GridLayout(6, 2));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productIdPanel.setText("Product ID");
        jPanel3.add(productIdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productIdTextArea.setEditable(false);
        productIdTextArea.setBackground(new java.awt.Color(204, 204, 204));
        productIdTextArea.setColumns(20);
        productIdTextArea.setRows(5);
        jScrollPane1.setViewportView(productIdTextArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(jPanel3);

        productNamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Product Name");
        productNamePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productNameTextArea.setColumns(20);
        productNameTextArea.setRows(5);
        jScrollPane2.setViewportView(productNameTextArea);

        productNamePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productNamePanel);

        productTypePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTypeLabel.setText("Product Type");
        productTypePanel.add(productTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Film CD", "Music CD", "Book" }));
        productTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTypeComboBoxActionPerformed(evt);
            }
        });
        productTypePanel.add(productTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        formPanel.add(productTypePanel);

        productCategoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productCategoryLabel.setText("Product Category");
        productCategoryPanel.add(productCategoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productCategoryTextArea.setColumns(20);
        productCategoryTextArea.setRows(5);
        jScrollPane4.setViewportView(productCategoryTextArea);

        productCategoryPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        formPanel.add(productCategoryPanel);

        productAuthorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productAuthorLabel.setText("Author/Director/Musician");
        productAuthorPanel.add(productAuthorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 30));

        productAuthorTextArea.setColumns(20);
        productAuthorTextArea.setRows(5);
        jScrollPane5.setViewportView(productAuthorTextArea);

        productAuthorPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productAuthorPanel);

        productListActorSinger.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("List contributor/actor/singer");
        productListActorSinger.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 30));

        productActorTextArea.setColumns(20);
        productActorTextArea.setRows(5);
        jScrollPane10.setViewportView(productActorTextArea);

        productListActorSinger.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productListActorSinger);

        productSellPricePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Product Sell Price");
        productSellPricePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productSellPriceTextArea.setColumns(20);
        productSellPriceTextArea.setRows(5);
        jScrollPane6.setViewportView(productSellPriceTextArea);

        productSellPricePanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productSellPricePanel);

        productNumInStockPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Product Input Price");
        productNumInStockPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productInputPriceTextArea.setColumns(20);
        productInputPriceTextArea.setRows(5);
        jScrollPane9.setViewportView(productInputPriceTextArea);

        productNumInStockPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productNumInStockPanel1);

        productNumInStockPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Number in stock");
        productNumInStockPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productNumInStockTextArea.setColumns(20);
        productNumInStockTextArea.setRows(5);
        jScrollPane7.setViewportView(productNumInStockTextArea);

        productNumInStockPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        formPanel.add(productNumInStockPanel);

        dataRelease.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productIdPanel1.setText("Date release");
        dataRelease.add(productIdPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productDateRelease.setDateFormatString("dd-MM-yyyy");
        dataRelease.add(productDateRelease, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 50));

        formPanel.add(dataRelease);

        backBtn.setBackground(new java.awt.Color(255, 0, 51));
        backBtn.setText("BACK");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backBtnPanelLayout = new javax.swing.GroupLayout(backBtnPanel);
        backBtnPanel.setLayout(backBtnPanelLayout);
        backBtnPanelLayout.setHorizontalGroup(
            backBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backBtnPanelLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        backBtnPanelLayout.setVerticalGroup(
            backBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        formPanel.add(backBtnPanel);

        createBtn.setBackground(new java.awt.Color(51, 255, 102));
        createBtn.setText("CREATE");
        createBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout createBtnPanelLayout = new javax.swing.GroupLayout(createBtnPanel);
        createBtnPanel.setLayout(createBtnPanelLayout);
        createBtnPanelLayout.setHorizontalGroup(
            createBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createBtnPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        createBtnPanelLayout.setVerticalGroup(
            createBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createBtnPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        formPanel.add(createBtnPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        this.homePage.menuClicked(homePage.productInterface);
        this.resetAllTextAfterCreateProduct();
    }//GEN-LAST:event_backBtnMouseClicked

    private void createBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseClicked
        // TODO add your handling code here:
        var productName = productNameTextArea.getText();
        var productId = productIdTextArea.getText();
        var productType = productUtil.convertStringToEProductType((productTypeComboBox.getSelectedItem().toString()));
        int productSellPrice = Integer.parseInt(productSellPriceTextArea.getText());
        int productInputPrice = Integer.parseInt(productInputPriceTextArea.getText());
        int productNumInStock = Integer.parseInt(productNumInStockTextArea.getText());
        Date releaseDate = productDateRelease.getDate();
        var productCategory = productCategoryTextArea.getText();
        var productContributorActorSinger = productActorTextArea.getText();
        var productAuthorDirectorMusician = productAuthorTextArea.getText();
        this.homePage.productInterface.productListItems.add(new Product(productId, productName, productType, productNumInStock, productInputPrice, productSellPrice, releaseDate, productCategory, productAuthorDirectorMusician, productContributorActorSinger));
        try {
            this.productFileUtil.writeListToFile("product", this.homePage.productInterface.productListItems);
        } catch (IOException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.homePage.productInterface.addNewProductToListPanel(new Product(productId, productName, productType, productNumInStock, productInputPrice, productSellPrice, releaseDate, productCategory, productAuthorDirectorMusician, productContributorActorSinger));
        this.homePage.menuClicked(homePage.productInterface);
        this.resetAllTextAfterCreateProduct();
    }//GEN-LAST:event_createBtnMouseClicked

    private void productTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTypeComboBoxActionPerformed
        // TODO productTypeadd your handling code here:
    }//GEN-LAST:event_productTypeComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InterfaceTitleLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backBtnPanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel createBtnPanel;
    private javax.swing.JPanel dataRelease;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea productActorTextArea;
    private javax.swing.JLabel productAuthorLabel;
    private javax.swing.JPanel productAuthorPanel;
    private javax.swing.JTextArea productAuthorTextArea;
    private javax.swing.JLabel productCategoryLabel;
    private javax.swing.JPanel productCategoryPanel;
    private javax.swing.JTextArea productCategoryTextArea;
    private com.toedter.calendar.JDateChooser productDateRelease;
    private javax.swing.JLabel productIdPanel;
    private javax.swing.JLabel productIdPanel1;
    private javax.swing.JTextArea productIdTextArea;
    private javax.swing.JTextArea productInputPriceTextArea;
    private javax.swing.JPanel productListActorSinger;
    private javax.swing.JPanel productNamePanel;
    private javax.swing.JTextArea productNameTextArea;
    private javax.swing.JPanel productNumInStockPanel;
    private javax.swing.JPanel productNumInStockPanel1;
    private javax.swing.JTextArea productNumInStockTextArea;
    private javax.swing.JPanel productSellPricePanel;
    private javax.swing.JTextArea productSellPriceTextArea;
    private javax.swing.JComboBox<String> productTypeComboBox;
    private javax.swing.JLabel productTypeLabel;
    private javax.swing.JPanel productTypePanel;
    // End of variables declaration//GEN-END:variables
}
