package com.mycompany.mediaone.Component;

import com.mycompany.mediaone.Model.Product;
import com.mycompany.mediaone.Util.FileUtil;
import com.mycompany.mediaone.View.Product.AddProduct;
import com.mycompany.mediaone.View.HomePage;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ProductCard extends javax.swing.JPanel {

    private HomePage homePage;
    private Product product;
    private FileUtil<Product> productFileUtil = new FileUtil<>();

    public ProductCard(Product product, HomePage homePage) {
        initComponents();
        this.productName.setText(product.getName());
        this.productPrice.setText(String.valueOf(product.getSellPrice()));
        this.productType.setText(product.getType());
        this.homePage = homePage;
        this.product = product;
        Image imageFilm = (new ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\filmCD.png")).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        Image imageBook = (new ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\book.png")).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        Image imageMusic = (new ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\musicCd.png")).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);

        switch (product.getType()) {
            case "Film CD": {
                productImageLabel.setIcon(new ImageIcon(imageFilm));
            }
            break;
            case "Music CD": {
                productImageLabel.setIcon(new ImageIcon(imageMusic));
            }
            break;
            case "Book": {
                productImageLabel.setIcon(new ImageIcon(imageBook));
            }
            break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productImagePanel = new javax.swing.JPanel();
        productImageLabel = new javax.swing.JLabel();
        productDetail1 = new javax.swing.JPanel();
        productName = new javax.swing.JLabel();
        productType = new javax.swing.JLabel();
        productDetail2 = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        productPrice = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridLayout(1, 0));

        productImagePanel.setAlignmentX(0.1F);

        productImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout productImagePanelLayout = new javax.swing.GroupLayout(productImagePanel);
        productImagePanel.setLayout(productImagePanelLayout);
        productImagePanelLayout.setHorizontalGroup(
            productImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        productImagePanelLayout.setVerticalGroup(
            productImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        add(productImagePanel);

        productDetail1.setLayout(new java.awt.GridLayout(2, 1));

        productName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName.setText("jLabel5");
        productDetail1.add(productName);

        productType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productType.setText("jLabel6");
        productDetail1.add(productType);

        add(productDetail1);

        productDetail2.setAlignmentX(0.1F);
        productDetail2.setLayout(new java.awt.GridLayout(2, 1, 0, 1));

        deleteBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\delete.png")); // NOI18N
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        editBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\pencil.png")); // NOI18N
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn)
                    .addComponent(editBtn))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        productDetail2.add(buttonPanel);

        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText("jLabel2");
        productDetail2.add(productPrice);

        add(productDetail2);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete this product", "Confirmation",
                JOptionPane.YES_NO_OPTION) == 0) {
            this.homePage.productInterface.productListItems.remove(product);
            try {
                this.productFileUtil.writeListToFile("product", this.homePage.productInterface.productListItems);
            } catch (IOException ex) {
                Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.homePage.productInterface.reRenderProductListPanel(this.homePage.productInterface.productListItems);
        }
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        // TODO add your handling code here:
        System.out.println(this.homePage);
        this.homePage.productDetail.setProductInfo(product);
        this.homePage.menuClicked(homePage.productDetail);    }//GEN-LAST:event_editBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel productDetail1;
    private javax.swing.JPanel productDetail2;
    private javax.swing.JLabel productImageLabel;
    private javax.swing.JPanel productImagePanel;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel productType;
    // End of variables declaration//GEN-END:variables
}
