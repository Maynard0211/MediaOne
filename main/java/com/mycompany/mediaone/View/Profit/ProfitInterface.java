package com.mycompany.mediaone.View.Profit;
import com.mycompany.mediaone.Model.Bill;
import com.mycompany.mediaone.Model.BillItem;
import com.mycompany.mediaone.Model.Customer;
import com.mycompany.mediaone.View.HomePage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ProfitInterface extends javax.swing.JPanel {
    private List<Bill> billList;
    private List<Bill> listSoldBill = new ArrayList<>();
    private List<Bill> listBuyBill = new ArrayList<>();
    private Customer customer;
    private List<BillItem> listItems = new ArrayList<>();
    private DefaultTableModel model;
    private final HomePage homePage;
    private String[] costcolumHeaders = new String[]{"Number", "ID", "Time", "Price"};
    private String[] salecolumHeaders = new String[]{"Number","ID", "Time", "Price"};
    private Object total;
    public ProfitInterface(HomePage homePage) {
        initComponents();
        this.homePage = homePage;
        initData();
        initTable();
    }
    public void loadTableBill(){ //load dữ liệu đầu vào
        List<Bill> loadTableBill  = new List<>();
    }
    public void FomatCalendar(){
        
    }
    public void searchFor(){
        search.setEnabled(false);
        profit.setEnabled(false);
     //   searchText.setText();
    }
  
    private void initData() {
        listItems.add(new BillItem("02", "Slayer", 6, 200, 6 * 200));

        listItems.add(new BillItem("P01", "Utaka", 1, 400, 1 * 400));
        listItems.add(new BillItem("P02", "Santa", 3, 400, 3 * 400));

        listSoldBill.add(new Bill("01pc", 500, new Date(), customer, listItems, "sold"));
        listSoldBill.add(new Bill("02ad", 500, new Date(), customer, listItems, "sold"));
        customer = new Customer("Tran Xuan Loc", "0899999999", "Dai Co Viet, Hai Ba Trung, Ha Noi");

        listBuyBill.add(new Bill("01vn", 500, new Date(), customer, listItems, "buy"));
        listBuyBill.add(new Bill("02kv", 400, new Date(), customer, listItems, "buy"));
        totalCostLabel.setText(Double.toString(this.calculateTotalCost(listBuyBill)));
        totalSaleLabel.setText(Double.toString(this.calculateTotalSale(listSoldBill)));
 
    }

    private double calculateTotalCost(List<Bill> listBillCost) {
        double sumb = 0.1;
        
        for( Bill i:listBillCost){
            sumb += i;
       }
        return sumb;
    }
    private double calculateTotalSale(List<Bill> listBillSold) {
       double sums = 0.2;
      
        for ( Bill k:listBillSale){
            sums += k;
        }
        return sums;
    }
    private double caculateTotalProfit(){
        double sump = 0;
        sump = sums - sumb;
        return 0.0;
       
    }
  
    private int initTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(costcolumHeaders);

        listBuyBill.forEach(item -> {
            model.addRow(new Object[]{listBuyBill.indexOf(item), item.getId(),
                item.getCreatedAt(), item.getTotal()});
        });
        CostsTable.setModel(model);
        model = new DefaultTableModel();
        model.setColumnIdentifiers(salecolumHeaders);
        listSoldBill.forEach(item -> {
            model.addRow(new Object[]{listSoldBill.indexOf(item), item.getId(),
                item.getCreatedAt(), item.getTotal()});
        });
        SalesTable.setModel(model);
        return 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search = new javax.swing.JButton();
        profit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        timeForm = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        timeFrom = new com.toedter.calendar.JDateChooser();
        timeTo = new com.toedter.calendar.JDateChooser();
        costsTable = new javax.swing.JScrollPane();
        CostsTable = new javax.swing.JTable();
        saleTable = new javax.swing.JScrollPane();
        SalesTable = new javax.swing.JTable();
        mediaoneSearch = new javax.swing.JLabel();
        searchText = new javax.swing.JScrollPane();
        textSearch = new javax.swing.JTextArea();
        proFit = new javax.swing.JLabel();
        totalSale = new javax.swing.JLabel();
        profittext = new javax.swing.JScrollPane();
        totalProfit = new javax.swing.JTextPane();
        totalCost = new javax.swing.JLabel();
        unitvnd = new javax.swing.JLabel();
        saletables = new javax.swing.JLabel();
        coststable = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        totalSaleLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnloadBill = new javax.swing.JButton();

        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        profit.setText("PROFIT");
        profit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profitActionPerformed(evt);
            }
        });

        timeForm.setText("Time From");

        to.setText(" To");

        timeFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeFromMouseClicked(evt);
            }
        });

        timeTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeToMouseClicked(evt);
            }
        });

        CostsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "ID", "Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CostsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CostsTableMouseClicked(evt);
            }
        });
        costsTable.setViewportView(CostsTable);

        SalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "ID", "Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        saleTable.setViewportView(SalesTable);

        mediaoneSearch.setText("MediaOne Search ");

        searchText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFocusGained(evt);
            }
        });

        textSearch.setColumns(20);
        textSearch.setRows(5);
        textSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSearchFocusLost(evt);
            }
        });
        textSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSearchMouseClicked(evt);
            }
        });
        searchText.setViewportView(textSearch);

        proFit.setText("Profit");

        totalSale.setText("Total Sale");

        totalProfit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalProfitFocusLost(evt);
            }
        });
        profittext.setViewportView(totalProfit);

        totalCost.setText("Total Cost");

        unitvnd.setText("VND");

        saletables.setText("Sales Table");

        coststable.setText("Costs Table");

        totalCostLabel.setText("Tiền mua hàng");

        totalSaleLabel.setText("Tiền bán hàng");

        jLabel3.setText("VND");

        jLabel4.setText("VND");

        btnloadBill.setText("LOADBILL");
        btnloadBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloadBillMouseClicked(evt);
            }
        });
        btnloadBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalSale)
                            .addComponent(totalCost))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(totalSaleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(proFit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profittext, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(unitvnd)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(440, 440, 440))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(profit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(mediaoneSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeForm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(saletables))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(to)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(coststable))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(timeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnloadBill, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(saleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(timeForm)
                        .addComponent(timeFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(to)
                        .addComponent(timeTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnloadBill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mediaoneSearch))
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(coststable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(costsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saletables)
                .addGap(12, 12, 12)
                .addComponent(saleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profittext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(totalCost))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(proFit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalSaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalSale)))
                    .addComponent(unitvnd))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void profitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profitActionPerformed
    
    }//GEN-LAST:event_profitActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       
    }//GEN-LAST:event_searchActionPerformed

    private void timeFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeFromMouseClicked
       
    }//GEN-LAST:event_timeFromMouseClicked

    private void timeToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeToMouseClicked
      
    }//GEN-LAST:event_timeToMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        
    }//GEN-LAST:event_searchMouseClicked

    private void textSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSearchMouseClicked
    
    }//GEN-LAST:event_textSearchMouseClicked

    private void searchTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusGained
     
    }//GEN-LAST:event_searchTextFocusGained

    private void textSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSearchFocusLost

    }//GEN-LAST:event_textSearchFocusLost

    private void btnloadBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadBillActionPerformed
        // kiểm tra đầu vào của Bill trước khi truyền dữ liệu đến bảng
        SimpleDateFormat TTime = new SimpleDateFormat("dd-MM-yyyy");
        String datefrom = TTime.format(timeFrom.getDate());
        String dateto = TTime.format(timeTo.getDate());
        List<Bill> listBuyBill = new ArrayList<>();
        List<Bill> listSoldBill = new ArrayList<>();
        // Khởi tạo List truyền vào List<Bill> CreatAt của Bill: datecheck;
        LocalTime datecheck = LocalTime.of(20, 1, 2022); //initDate
        if ((datecheck.isAfter(timefrom) || datecheck.isEquals(timeto)) 
                && (datecheck.isBefore(timeto) || datecheck.isEquals(timeto)))
            {
            //loadTable dã có điều kiện dàng buộc vô bảng CostTable;
            model = new DefaultTableModel();
            model.setColumnIdentifiers(costcolumHeaders);

            listBuyBill.forEach(item -> {
            model.addRow(new Object[]{listBuyBill.indexOf(item), item.getId(),
                item.getCreatedAt(), item.getTotal()});
            });
            CostsTable.setModel(model);
                
            //loadTable dã có điều kiện dàng buộc vô bảng SaleTable;
            model = new DefaultTableModel();
            model.setColumnIdentifiers(salecolumHeaders);
            listSoldBill.forEach(item -> {
            model.addRow(new Object[]{listSoldBill.indexOf(item), item.getId(),
                item.getCreatedAt(), item.getTotal()});
            });
            SalesTable.setModel(model);
            return 0;
            }
        if (datecheck.isBefore(timefrom) || datecheck.isAfter(timeto)){
            JOptionPane.showMessageDialog(null, "Không có dữ liệu ! Vui lòng nhập lại ngày giờ");
            return 0;
        } 
        
        
        
        
    }//GEN-LAST:event_btnloadBillActionPerformed

    private void btnloadBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloadBillMouseClicked
        
    }//GEN-LAST:event_btnloadBillMouseClicked

    private void totalProfitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalProfitFocusLost

        totalProfit.setText(Double.parseDouble(totalSaleLabel.getText()) - Double.parseDouble(totalCostLabel.getText())+"");
        
    }//GEN-LAST:event_totalProfitFocusLost

    private void textSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSearchFocusGained

    }//GEN-LAST:event_textSearchFocusGained

    private void CostsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CostsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CostsTableMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CostsTable;
    private javax.swing.JTable SalesTable;
    private javax.swing.JButton btnloadBill;
    private javax.swing.JScrollPane costsTable;
    private javax.swing.JLabel coststable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mediaoneSearch;
    private javax.swing.JLabel proFit;
    private javax.swing.JButton profit;
    private javax.swing.JScrollPane profittext;
    private javax.swing.JScrollPane saleTable;
    private javax.swing.JLabel saletables;
    private javax.swing.JButton search;
    private javax.swing.JScrollPane searchText;
    private javax.swing.JTextArea textSearch;
    private javax.swing.JLabel timeForm;
    private com.toedter.calendar.JDateChooser timeFrom;
    private com.toedter.calendar.JDateChooser timeTo;
    private javax.swing.JLabel to;
    private javax.swing.JLabel totalCost;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JTextPane totalProfit;
    private javax.swing.JLabel totalSale;
    private javax.swing.JLabel totalSaleLabel;
    private javax.swing.JLabel unitvnd;
    // End of variables declaration//GEN-END:variables

}
