/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GroceryManagementSystem;

import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.PreparedStatement;
/**
 *
 * @author Tanuja
 */
public class System_7_Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public System_7_Selling() {
        initComponents();
        SelectProduct();
        GetCategory();
    }
    Connection  con =null;
    Statement st= null;
    ResultSet rs= null;
    public void SelectProduct()
    {
      //  String currentDir= System.getProperty("user.dir");
        try{
          //   con= DriverManager.getConnection("jdbc:derby:"+currentDir+"\\db-derby-10.14.2.0-bin","root","root");
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/Groceryshop","root","root");
            st= con.createStatement();
            rs=st.executeQuery("Select * from ROOT.PRODUCTTABLE");
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Invalid input for Quantity");
}
        catch(Exception e){
            e.printStackTrace();
        }
      
    }
//   int ProdId, newQuantity;
//    public void update(){
//     try{
//
//                 con= DriverManager.getConnection("jdbc:derby://localhost:1527/Groceryshop","root","root");
//                 String Query="UPDATE ROOT.PRODUCTTABLE SET PRODUCT_QUANTITY="+newQuantity+""+"where PRODUCT_ID="+ProdId;
//
//                 Statement add= con.createStatement();
//                 add.executeUpdate(Query);
//                
//                 SelectProduct();
//            
//            }catch (NumberFormatException e) {
//    JOptionPane.showMessageDialog(this, "Invalid input for Quantity");
//    
//}
//            catch(Exception e){
//                e.printStackTrace();
//            }
//   }
    private void GetCategory(){
       // String currentDir= System.getProperty("user.dir");
     try{
         // con= DriverManager.getConnection("jdbc:derby:"+currentDir+"\\db-derby-10.14.2.0-bin","root","root");
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/Groceryshop","root","root");
            st= con.createStatement();
            String Query = "Select * from ROOT.CATEGORYTABLE";
            rs=st.executeQuery(Query);
           // ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
           while(rs.next()){
               String Mycat = rs.getString("CATEGORY_NAME");
               Product_Category.addItem(Mycat);
           }
        }catch(Exception e){
            e.printStackTrace();
        }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Grdtotal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Product_Quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Billing_Id = new javax.swing.JTextField();
        Product_Category = new javax.swing.JComboBox<>();
        Product_Name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        GrdtotalLabel = new javax.swing.JLabel();
        Filter = new javax.swing.JButton();
        WindowClosingLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 650));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 650));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        Grdtotal.setBackground(new java.awt.Color(255, 255, 255));
        Grdtotal.setPreferredSize(new java.awt.Dimension(1045, 600));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("BILLING POINT");

        Product_Quantity.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Product_Quantity.setForeground(new java.awt.Color(0, 51, 153));
        Product_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_QuantityActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Name");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Billing ID");

        Billing_Id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Billing_Id.setForeground(new java.awt.Color(0, 51, 153));
        Billing_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Billing_IdActionPerformed(evt);
            }
        });

        Product_Category.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Product_Category.setForeground(new java.awt.Color(0, 51, 153));
        Product_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Product_Category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Product_CategoryItemStateChanged(evt);
            }
        });
        Product_Category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_CategoryMouseClicked(evt);
            }
        });
        Product_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_CategoryActionPerformed(evt);
            }
        });

        Product_Name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Product_Name.setForeground(new java.awt.Color(0, 51, 153));
        Product_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_NameActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Quantity");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Filter By");

        Clear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 0, 153));
        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Refresh.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Refresh.setForeground(new java.awt.Color(0, 0, 153));
        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 0, 153));
        Add.setText("Add to Bill");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        ProductTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price", "Category"
            }
        ));
        ProductTable.setColumnSelectionAllowed(true);
        ProductTable.setGridColor(new java.awt.Color(0, 0, 0));
        ProductTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        ProductTable.setSelectionForeground(new java.awt.Color(204, 204, 204));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);
        ProductTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Product List");

        Print.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Print.setForeground(new java.awt.Color(0, 0, 153));
        Print.setText("Print");
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        BillTxt.setColumns(20);
        BillTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        GrdtotalLabel.setBackground(new java.awt.Color(255, 255, 255));
        GrdtotalLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        GrdtotalLabel.setForeground(new java.awt.Color(0, 51, 153));
        GrdtotalLabel.setText("Rs.");

        Filter.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Filter.setForeground(new java.awt.Color(0, 0, 153));
        Filter.setText("Filter");
        Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterMouseClicked(evt);
            }
        });
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GrdtotalLayout = new javax.swing.GroupLayout(Grdtotal);
        Grdtotal.setLayout(GrdtotalLayout);
        GrdtotalLayout.setHorizontalGroup(
            GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrdtotalLayout.createSequentialGroup()
                .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GrdtotalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Billing_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GrdtotalLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Product_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GrdtotalLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GrdtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 98, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrdtotalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Add)
                .addGap(40, 40, 40)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrdtotalLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Product_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Refresh)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrdtotalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(151, 151, 151)
                        .addComponent(Filter)
                        .addGap(71, 71, 71))))
            .addGroup(GrdtotalLayout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GrdtotalLayout.setVerticalGroup(
            GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrdtotalLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Billing_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GrdtotalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GrdtotalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GrdtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192))
                            .addGroup(GrdtotalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(GrdtotalLayout.createSequentialGroup()
                        .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Product_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Clear))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrdtotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GrdtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh)
                    .addComponent(Product_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(338, 338, 338)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        WindowClosingLabel.setBackground(new java.awt.Color(255, 255, 255));
        WindowClosingLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        WindowClosingLabel.setForeground(new java.awt.Color(255, 255, 255));
        WindowClosingLabel.setText("X");
        WindowClosingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WindowClosingLabelMouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Log Out");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Grdtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(WindowClosingLabel)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(WindowClosingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Grdtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Product_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_QuantityActionPerformed

    private void Billing_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Billing_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Billing_IdActionPerformed

    private void Product_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_CategoryActionPerformed

    private void Product_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_NameActionPerformed

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
        Billing_Id.setText("");
        Product_Name.setText("");
//        Product_Price.setText("");
        Product_Quantity.setText("");
    }//GEN-LAST:event_ClearMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
     SelectProduct();
    }//GEN-LAST:event_RefreshMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed
int Uprice ,Product_Total=0 , GrdTotal=0;
int Available_Quantity; 
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        // TODO add your handling code here:
  

        DefaultTableModel model= (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow(); 
       //  ProdId = Integer.parseInt(model.getValueAt(Myindex,0).toString());   
        Available_Quantity= Integer.parseInt(model.getValueAt(Myindex,2).toString());
       // newQuantity= Available_Quantity -  Integer.parseInt(Product_Quantity.getText());
           Product_Name.setText(model.getValueAt(Myindex,1).toString());   
         Uprice= Integer.parseInt(model.getValueAt(Myindex,3).toString());
        Product_Total= Uprice * Integer.parseInt(Product_Quantity.getText());
        
    }//GEN-LAST:event_ProductTableMouseClicked

    private void WindowClosingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WindowClosingLabelMouseClicked
        // TODO add your handling code here:
        Window window = SwingUtilities.getWindowAncestor(WindowClosingLabel);
        if (window instanceof JFrame) {
            JFrame frame = (JFrame) window;
            frame.dispose();
        }
    }//GEN-LAST:event_WindowClosingLabelMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed
int i=0 ;
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        
        if(Product_Name.getText().isEmpty()||Product_Quantity.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Missing Information ");
        }
        
        else if(Available_Quantity <= Integer.parseInt(Product_Quantity.getText())){
             JOptionPane.showMessageDialog(this, "Not Enough in Stock ");
        }
        else{
            i++;
            Product_Total= Uprice * Integer.parseInt(Product_Quantity.getText());
             GrdTotal = GrdTotal +  Product_Total;
             
            if(i==1){
                BillTxt.setText(BillTxt.getText()+"       ==========RENUKA KIRANA & GENERAL STORES======\n"+"NUM    PRODUCT     PRICE     QUANTITY      TOTAL\n"+i+"          "+Product_Name.getText()+"        "+Uprice+"         "+Product_Quantity.getText()+"        "+Product_Total+"       \n");
            }
            else{
                BillTxt.setText(BillTxt.getText()+ +i+"          "+Product_Name.getText()+"          "+Uprice+"         "+Integer.parseInt(Product_Quantity.getText())+"       "+Product_Total+"       \n");
            }
            GrdtotalLabel.setText("Rs"+GrdTotal);
             //update();
            } 
            
       
    }//GEN-LAST:event_AddMouseClicked

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        // TODO add your handling code here:
        try{
        BillTxt.print();
        }catch(Exception e){
             e.printStackTrace();
        }
        
    }//GEN-LAST:event_PrintMouseClicked

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

    private void Product_CategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_CategoryMouseClicked
       
    }//GEN-LAST:event_Product_CategoryMouseClicked

    private void Product_CategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Product_CategoryItemStateChanged
        // TODO add your handling code here:
        //String currentDir= System.getProperty("user.dir");
          try{
          //     con= DriverManager.getConnection("jdbc:derby:"+currentDir+"\\db-derby-10.14.2.0-bin","root","root");
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/Groceryshop","root","root");
            st= con.createStatement();
            rs=st.executeQuery("Select * from ROOT.CATEGORYTABLE where CATEGORY_NAME='" + Product_Category.getSelectedItem().toString()+"'");
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Invalid input for Quantity");
}
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_Product_CategoryItemStateChanged

    private void FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseClicked
        // TODO add your handling code here:
        //String currentDir= System.getProperty("user.dir");
         try{
          //   con= DriverManager.getConnection("jdbc:derby:"+currentDir+"\\db-derby-10.14.2.0-bin","root","root");       
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/Groceryshop","root","root");
            st= con.createStatement();
            rs=st.executeQuery("Select * from ROOT.CATEGORYTABLE where CATEGORY_NAME='" + Product_Category.getSelectedItem().toString()+"'");
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Invalid input for Quantity");
}
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_FilterMouseClicked

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        new System_2_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(System_7_Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System_7_Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System_7_Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System_7_Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System_7_Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField Billing_Id;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Filter;
    private javax.swing.JPanel Grdtotal;
    private javax.swing.JLabel GrdtotalLabel;
    private javax.swing.JButton Print;
    private javax.swing.JTable ProductTable;
    private javax.swing.JComboBox<String> Product_Category;
    private javax.swing.JTextField Product_Name;
    private javax.swing.JTextField Product_Quantity;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel WindowClosingLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
