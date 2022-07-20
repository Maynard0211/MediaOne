package com.mycompany.mediaone.View.Product;

import com.mycompany.mediaone.Model.Product;
import com.mycompany.SharedType.EProductType;
import com.mycompany.mediaone.Util.ProductUtil;
import com.mycompany.SharedType.WrapLayout;
import com.mycompany.mediaone.Component.ProductCard;
import com.mycompany.mediaone.Util.FileUtil;
import com.mycompany.mediaone.View.HomePage;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ProductInterface extends javax.swing.JPanel {

    private final HomePage homePage;

    private FileUtil<Product> productFileUtil = new FileUtil<>();

    public List<Product> productListItems;

    private ProductUtil productUtil = new ProductUtil();

    public ProductInterface(HomePage homePage) {
        initComponents();

        this.homePage = homePage;
        this.ProductListPanel.setLayout(new WrapLayout());

        try {
            this.productListItems = this.productFileUtil.readFile("product");

            System.out.println(this.productFileUtil.readFile("product"));

            for (Product productListItem : productListItems) {
                this.ProductListPanel.add(new ProductCard(productListItem, this.homePage));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class object not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }

    }

    public void addNewProductToListPanel(Product product) {
        this.ProductListPanel.add(new ProductCard(product, this.homePage));
    }

    public void reRenderProductListPanel(List<Product> curentRenderProductList) {
        this.ProductListPanel.removeAll();
        ProductListPanel.revalidate();
        ProductListPanel.repaint();
        for (Product currentProductItem : curentRenderProductList) {
            this.addNewProductToListPanel(currentProductItem);
        }
    }

    public void filterProductListByType(String productType) {
        productLabel.setText(productType);
        if (!"All Product".equals(productType)) {
            List<Product> filteredProduct = this.productListItems.stream()
                    .filter(product -> productType.equals(product.getType()))
                    .collect(Collectors.toList());

            productLabel.setText(productType);
            for (int i = 0; i < productListItems.size(); i++) {
                System.out.println(productListItems.get(i));
            }
            reRenderProductListPanel(filteredProduct);
        } else {
            reRenderProductListPanel(productListItems);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainProductInterface = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        InterfaceTitleLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        typeProductFilterPanel = new javax.swing.JPanel();
        allProductField = new javax.swing.JButton();
        musicCdField = new javax.swing.JButton();
        bookField = new javax.swing.JButton();
        filmCdField = new javax.swing.JButton();
        productTypeHeader = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductListPanel = new javax.swing.JPanel();

        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(677, 543));
        setLayout(new java.awt.GridLayout(1, 0));

        InterfaceTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InterfaceTitleLabel.setText("Products");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\plus.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        typeProductFilterPanel.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        allProductField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allProductField.setText("All Product");
        allProductField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allProductFieldMouseClicked(evt);
            }
        });
        typeProductFilterPanel.add(allProductField);

        musicCdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        musicCdField.setText("Music CD");
        musicCdField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musicCdFieldMouseClicked(evt);
            }
        });
        typeProductFilterPanel.add(musicCdField);

        bookField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookField.setText("Book");
        bookField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookFieldMouseClicked(evt);
            }
        });
        bookField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFieldActionPerformed(evt);
            }
        });
        typeProductFilterPanel.add(bookField);

        filmCdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filmCdField.setText("Film CD");
        filmCdField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmCdFieldMouseClicked(evt);
            }
        });
        typeProductFilterPanel.add(filmCdField);

        productLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setText("All Product");

        javax.swing.GroupLayout productTypeHeaderLayout = new javax.swing.GroupLayout(productTypeHeader);
        productTypeHeader.setLayout(productTypeHeaderLayout);
        productTypeHeaderLayout.setHorizontalGroup(
            productTypeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTypeHeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productTypeHeaderLayout.setVerticalGroup(
            productTypeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productTypeHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(ProductListPanel);

        javax.swing.GroupLayout MainProductInterfaceLayout = new javax.swing.GroupLayout(MainProductInterface);
        MainProductInterface.setLayout(MainProductInterfaceLayout);
        MainProductInterfaceLayout.setHorizontalGroup(
            MainProductInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(typeProductFilterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productTypeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainProductInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        MainProductInterfaceLayout.setVerticalGroup(
            MainProductInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainProductInterfaceLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeProductFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productTypeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        add(MainProductInterface);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.homePage.menuClicked(homePage.addProduct);

    }//GEN-LAST:event_jButton1MouseClicked

    private void musicCdFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicCdFieldMouseClicked
        // TODO add your handling code here:
        filterProductListByType("Music CD");
    }//GEN-LAST:event_musicCdFieldMouseClicked

    private void bookFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookFieldActionPerformed

    private void bookFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookFieldMouseClicked
        // TODO add your handling code here:
        filterProductListByType("Book");
    }//GEN-LAST:event_bookFieldMouseClicked

    private void filmCdFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmCdFieldMouseClicked
        // TODO add your handling code here:
        filterProductListByType("Film CD");
    }//GEN-LAST:event_filmCdFieldMouseClicked

    private void allProductFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allProductFieldMouseClicked
        // TODO add your handling code here:
        filterProductListByType("All Product");

    }//GEN-LAST:event_allProductFieldMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InterfaceTitleLabel;
    private javax.swing.JPanel MainProductInterface;
    private javax.swing.JPanel ProductListPanel;
    private javax.swing.JButton allProductField;
    private javax.swing.JButton bookField;
    private javax.swing.JButton filmCdField;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton musicCdField;
    private javax.swing.JLabel productLabel;
    private javax.swing.JPanel productTypeHeader;
    private javax.swing.JPanel typeProductFilterPanel;
    // End of variables declaration//GEN-END:variables
}
