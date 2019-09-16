import config.DbConnect;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Booking extends javax.swing.JFrame {
 ResultSet rs=null; 
long ph = 0;
     Statement statement=null;
       DbConnect con=null;
       PreparedStatement pstmt=null;
   int emp=0,flag;
   Timer t1,t2,t3,t4,t5,t6,t7,t8;
   String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    public Booking() throws SQLException {
                        initComponents();
                        jTextField5.setEditable(false);

                         jTextField6.setText(date);
                          jTextField6.setEditable(false);

                        con=new DbConnect();
                        statement=con.getConnection().createStatement();
                       emp=0;
                       t1 = new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jLabel10.setText(null);
                                jLabel11.setText(null);
                               
                            }
                        });
                         t2 = new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jTextField1.setText(null);
                                 jTextField1.setBackground(Color.white);
                                      jTextField1.setForeground(Color.BLACK);
                            }
                        });
                         t3 = new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jTextField2.setText(null);
                                    jTextField2.setBackground(Color.white);
                                      jTextField2.setForeground(Color.BLACK);
                            }
                        });
                         t4 = new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jTextField3.setText(null);
                                    jTextField3.setBackground(Color.white);
                                      jTextField3.setForeground(Color.BLACK);
                            }
                        });
                         t5 = new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jTextField4.setText(null);
                                    jTextField4.setBackground(Color.white);
                                      jTextField4.setForeground(Color.BLACK);
                            }
                        });
                         t6= new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jTextField5.setText(null);
                                    jTextField5.setBackground(Color.white);
                                      jTextField5.setForeground(Color.BLACK);
                            }
                        }); 
                          t7 = new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jTextField6.setText(null);
                                    jTextField6.setBackground(Color.white);
                                      jTextField6.setForeground(Color.BLACK);
                            }
                        });
                           t8 = new Timer(3000, new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                jTextField7.setText(null);
                                    jTextField7.setBackground(Color.white);
                                      jTextField7.setForeground(Color.BLACK);
                            }
                        });
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CURRENT BOOKING");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Phone No.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Check-in Date");

        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Room Type");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setText("AC");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2.setText("NON-AC");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("No.of Bed");

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton3.setText("Single");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4.setText("Double");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("Customer_id ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Room no.");

        jTextField4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 204));
        jButton2.setText("CANCEL / BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("<< get");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setText("Advance Payment");

        jTextField7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4))
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jTextField5)
                                .addComponent(jTextField7)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTextField7)))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
home o=new home();
                    o.setVisible(true);
                   o.setLocation(this.getX(),this.getY());
                   this.dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
  jRadioButton1.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
  jRadioButton4.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
  jRadioButton3.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed
/*backupcode
    int validateCustid()
{
    try{
    String cid=jTextField4.getText();
  String q1="select cust_id from cust_details where cust_id='"+cid+"'"+ " UNION("+ "select cust_id from cd_adv where cust_id='"+cid+"'"+") UNION ("+"select cust_id from cd_old where cust_id='"+cid+"')";
   ResultSet rs=statement.executeQuery(q1); 
   if(rs.next()){
        return 0;
   }
}
 catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
     return 1;
}*/
    String roomtype()
{
    if(jRadioButton1.isSelected())
        return "AC";
    else
        return "NON-AC";
}
 String bedno()
{
    if(jRadioButton3.isSelected())
        return "1";
    else
        return "2";
}
 void isAnyFieldEmpty(int sf)
 {
     emp=0;
     int x=0,y=0,z=0,x1=0,y1=0,z1=0;
     String s="cannot be empty.";
     if(jTextField1.getText().length()==0 || jTextField1.getText().equals(s)){
         if(sf==0){
         jTextField1.setText("Cannot be empty.");
         jTextField1.setBackground(Color.LIGHT_GRAY);
        jTextField1.setForeground(Color.RED);
          t2.setRepeats(false);
                         t2.start();
         }
        emp=1;
     }
        if(jTextField2.getText().length()==0 || jTextField2.getText().equals(s)){
            if(sf==0){
         jTextField2.setText("cannot be empty.");
         jTextField2.setBackground(Color.LIGHT_GRAY);
        jTextField2.setForeground(Color.RED);
          t3.setRepeats(false);
                         t3.start();
            }
        emp=1;
        }
        if(jTextField3.getText().length()==0 || jTextField3.getText().equals(s)){
            if(sf==0){
         jTextField3.setText("cannot be empty.");
         jTextField3.setBackground(Color.LIGHT_GRAY);
        jTextField3.setForeground(Color.RED);
           JOptionPane.showMessageDialog(null,"INVALID PHONE NO: cannot be empty.");
          t4.setRepeats(false);
                         t4.start();
            }
       emp=1;
       x1=1;
        }
        if(jTextField4.getText().length()==0 || jTextField4.getText().equals(s)){
            if(sf==0){
         jTextField4.setText("cannot be empty.");
             jTextField4.setBackground(Color.LIGHT_GRAY);
        jTextField4.setForeground(Color.RED);
          JOptionPane.showMessageDialog(null,"INVALID CUST-ID: cannot be empty.");
          t5.setRepeats(false);
                         t5.start();
            }
       emp=1;
       y1=1;
        }
        if(jTextField7.getText().length()==0){
            z1=1;
        }
          if(sf==0){
        if(jTextField5.getText().length()==0 || jTextField5.getText().equals(s)){
          
         jTextField5.setText("cannot be empty.");
         jTextField5.setBackground(Color.LIGHT_GRAY);
        jTextField5.setForeground(Color.RED);
           t6.setRepeats(false);
                         t6.start();
        emp=1;
    }
          }
        if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false){
            if(sf==0){
            jLabel10.setText("please select >>");
            t1.setRepeats(false);
                         t1.start();
            }
           emp=1;  
        }
          if(jRadioButton3.isSelected()==false && jRadioButton4.isSelected()==false){
              if(sf==0){
            jLabel11.setText("please select >>");
            t1.setRepeats(false);
                         t1.start();
              }
           emp=1;  
        }
          if(sf==0){
          try{
              if(x1==0){
                ph=Long.parseLong(jTextField3.getText());}
                }
                catch (NumberFormatException e){
                     x=1;
                     emp=1;
                    }

           try{
               if(y1==0){
               int cust=Integer.parseInt(jTextField4.getText());}
                }
                catch (NumberFormatException e){
                  y=1;
                  emp=1;
                }
           
           try{
               if(z1==0){
               int ad=Integer.parseInt(jTextField7.getText());}
                }
                catch (NumberFormatException e){
                      z=1;
                      emp=1;
                }
          }
          if(x==1 && y==1 && z==1){
                JOptionPane.showMessageDialog(null,"INVALID PHONE NO. \n INVALID CUST-ID: Customer-id can contain only digits. \n INVALID AMOUNT: Enter a Valid value for advance payment");
             t4.setRepeats(false);
                         t4.start();
                          t5.setRepeats(false);
                        t5.start();
                         t8.setRepeats(false);
                         t8.start();    
          }
        else  if(x==1 && y==1 ){
                JOptionPane.showMessageDialog(null,"INVALID PHONE NO. \n INVALID CUST-ID: Customer-id can contain only digits.");
           t4.setRepeats(false);
                         t4.start();
                          t5.setRepeats(false);
                        t5.start();           
        }
         else  if(y==1 && z==1 ){
                JOptionPane.showMessageDialog(null,"INVALID CUST-ID: Customer-id can contain only digits. \n INVALID AMOUNT: Enter a Valid value for advance payment.");
           
                          t5.setRepeats(false);
                        t5.start();
                         t8.setRepeats(false);
                         t8.start();      
        }
          else  if(x==1 && z==1 ){
                JOptionPane.showMessageDialog(null,"INVALID PHONE NO. \n INVALID AMOUNT: Enter a Valid value for advance payment");
         t4.setRepeats(false);
                         t4.start();
                         
                         t8.setRepeats(false);
                         t8.start();      
        }
        else  if(x==1 ){
                JOptionPane.showMessageDialog(null,"INVALID PHONE NO.");
                 t4.setRepeats(false);
                         t4.start();
                      
          }
       else   if(y==1){
                JOptionPane.showMessageDialog(null," INVALID CUST-ID: Customer-id can contain only digits. ");
                 
                          t5.setRepeats(false);
                        t5.start();
                      
          }
       else if( z==1){
                JOptionPane.showMessageDialog(null," INVALID AMOUNT: Enter a Valid value for advance payment.");
                
                         t8.setRepeats(false);
                         t8.start();
          }
          
            }
        
        


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        isAnyFieldEmpty(0);
        
        if(emp==0)
  {
        try{  
        int exp=0;
String q="select room_no from room where room_type='"+roomtype()+"' and no_of_bed="+bedno()+" and room_status='available';";
String q1 = "INSERT INTO cust_details(cust_id,name,address,phone,check_in,room_no) VALUES(?,?,?,?,?,?);";
String q2 = "INSERT INTO adv_payment(cust_id,paid) VALUES(?,?);";

    rs=statement.executeQuery(q); 
PreparedStatement preparedStatement = con.getConnection().prepareStatement(q1);
PreparedStatement preparedStatement1 = con.getConnection().prepareStatement(q2);
if(rs.next())  
            { 
         
              preparedStatement.clearParameters();
              
                preparedStatement.setString(1, jTextField4.getText());
                preparedStatement.setString(2, jTextField1.getText());
                preparedStatement.setString(3, jTextField2.getText());
                
                 preparedStatement.setLong(4, ph);
                preparedStatement.setString(5,jTextField6.getText());
                 preparedStatement.setInt(6, rs.getInt(1));
                 
                flag=0;
                 if(jTextField7.getText().length()>0)  //inserting advance payment details...
                 {
                 preparedStatement1.setString(1, jTextField4.getText());     
                 preparedStatement1.setInt(2, Integer.parseInt(jTextField7.getText()));    
                  flag=1;
                 }
                
                try {
                    preparedStatement.executeUpdate();
                    if(flag==1){
                    preparedStatement1.executeUpdate();
                    }
                     } 
               
                catch (SQLException e) {   //exception from my trigger
                   
                        JOptionPane.showMessageDialog(null, e.getMessage());
                     jTextField4.setBackground(java.awt.Color.LIGHT_GRAY);
                    jTextField4.setForeground(java.awt.Color.red);
                     t5.setRepeats(false);
                         t5.start();
                    exp=1;
                }
            }
            if(exp==0){
            statement.executeUpdate("update room SET room_status='unavailable' where room_no="+jTextField5.getText()+";");
            JOptionPane.showMessageDialog(null, "Booked Successfully!");
           home o=new home();
                    o.setVisible(true);
                   o.setLocation(this.getX(),this.getY());
                   this.dispose();
    }
                    //} backupcode
                    //else 
                         //jTextField4.setText("Cust-ID already exists!");
   con.getConnection().close();
 
    }                                  
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
      
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{  
            isAnyFieldEmpty(1);
    if(emp==0)
    {
        
String q="select room_no from room where room_type='"+roomtype()+"' and no_of_bed="+bedno()+" and room_status='available';";
ResultSet rs1=statement.executeQuery(q);     
if(rs1.next()){
             jTextField5.setText(rs1.getString(1));
jRadioButton1.setEnabled(false);
jRadioButton2.setEnabled(false);
jRadioButton3.setEnabled(false);
jRadioButton4.setEnabled(false);
        
        }

else{
                 //JOptionPane.showMessageDialog(null, "No Rooms Available");
                    jTextField6.setText("No Rooms Available.");
                    jTextField6.setBackground(java.awt.Color.LIGHT_GRAY);
                    jTextField6.setForeground(java.awt.Color.red);
}
   con.getConnection().close();
    }
    else{
         JOptionPane.showMessageDialog(null,"Fill all the above fields first!");
    }
    }//GEN-LAST:event_jButton3ActionPerformed
catch(Exception e)
    {
        e.printStackTrace();
         JOptionPane.showMessageDialog(null,e);
    }

    }

    
   
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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Booking().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}