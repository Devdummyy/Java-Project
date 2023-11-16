
package cheesecakecafe;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BOARD extends javax.swing.JFrame {

    /**
     * Creates new form BOARD
     */

    public BOARD() {
        initComponents();
        init();
    }
    
    private double  total = 0.0;
    private int x = 0;
    private double vat = 0.0;
    private final int nu1 = 40;
    private final int nu2 = 45;
    private final int nu3 = 50;

    public void init() {
        setImage();
        setTime();
       
    }

    public void getVat(double t){
        if(t >= 10.0){
            double Cal = 0.10;
            vat = t * Cal;
        }else if(t == 0.0){
         vat = t ;
        }
    }
    
    public void setImage() {
        ImageIcon iconB1 = new ImageIcon(getClass().getResource("/ICON_BUTTON/Total.jpg"));
        ImageIcon iconB2 = new ImageIcon(getClass().getResource("/ICON_BUTTON/Receipt.jpg"));
        ImageIcon iconB3 = new ImageIcon(getClass().getResource("/ICON_BUTTON/Reset.jpg"));
        ImageIcon iconB4 = new ImageIcon(getClass().getResource("/ICON_BUTTON/Exit.png"));
        ImageIcon iconB5 = new ImageIcon(getClass().getResource("/ICON_BUTTON/Detail.jpg"));

        Image img1 = iconB1.getImage().getScaledInstance(btnTotal.getWidth(), btnTotal.getHeight(), Image.SCALE_SMOOTH);
        Image img2 = iconB2.getImage().getScaledInstance(btnRec.getWidth(), btnRec.getHeight(), Image.SCALE_SMOOTH);
        Image img3 = iconB3.getImage().getScaledInstance(btnReset.getWidth(), btnReset.getHeight(), Image.SCALE_SMOOTH);
        Image img4 = iconB4.getImage().getScaledInstance(jButtonExit.getWidth(), jButtonExit.getHeight(), Image.SCALE_SMOOTH);
        Image img5 = iconB5.getImage().getScaledInstance(jButtonDetail.getWidth(), jButtonDetail.getHeight(), Image.SCALE_SMOOTH);

        btnTotal.setIcon(new ImageIcon(img1));
        btnRec.setIcon(new ImageIcon(img2));
        btnReset.setIcon(new ImageIcon(img3));
        jButtonExit.setIcon(new ImageIcon(img4));
        jButtonDetail.setIcon(new ImageIcon(img5));
        //-----------------------------------------------------------------------------------
        ImageIcon iconimg1 = new ImageIcon(getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Stawberry.jpg"));
        ImageIcon iconimg2 = new ImageIcon(getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Blueberry.jpg"));
        ImageIcon iconimg3 = new ImageIcon(getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Choccolate.jpg"));
        ImageIcon iconimg4 = new ImageIcon( getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Classic.jpg"));
        ImageIcon iconimg5 = new ImageIcon(getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Mango.jpg"));
        ImageIcon iconimg6 = new ImageIcon(getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Oreo.jpg"));
        ImageIcon iconimg7 = new ImageIcon(getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Coffee.jpg"));
        ImageIcon iconimg8 = new ImageIcon(   getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Monster.jpg"));
        ImageIcon iconimg9 = new ImageIcon(getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Caramel.jpg"));
        ImageIcon iconimg10 = new ImageIcon( getClass().getResource("/ICON_CHEESECAKE/Cheesecake_Orange.jpg"));
        
        Image img6 = iconimg1.getImage().getScaledInstance(jimg19.getWidth(), jimg19.getHeight(), Image.SCALE_SMOOTH);
        Image img7 = iconimg2.getImage().getScaledInstance(jimg2.getWidth(), jimg2.getHeight(), Image.SCALE_SMOOTH);
        Image img8 = iconimg3.getImage().getScaledInstance(jimg3.getWidth(), jimg3.getHeight(), Image.SCALE_SMOOTH);
        Image img9 = iconimg4.getImage().getScaledInstance(jimg4.getWidth(), jimg4.getHeight(), Image.SCALE_SMOOTH);
        Image img10 = iconimg5.getImage().getScaledInstance(jimg13.getWidth(), jimg13.getHeight(), Image.SCALE_SMOOTH);
        Image img11 = iconimg6.getImage().getScaledInstance(jimg6.getWidth(), jimg6.getHeight(), Image.SCALE_SMOOTH);
        Image img12 = iconimg7.getImage().getScaledInstance(jimg7.getWidth(), jimg7.getHeight(), Image.SCALE_SMOOTH);
        Image img13 = iconimg8.getImage().getScaledInstance(jimg8.getWidth(), jimg8.getHeight(), Image.SCALE_SMOOTH);
        Image img14 = iconimg9.getImage().getScaledInstance(jimg9.getWidth(), jimg9.getHeight(), Image.SCALE_SMOOTH);
        Image img15 = iconimg10.getImage().getScaledInstance(jimg10.getWidth(), jimg10.getHeight(), Image.SCALE_SMOOTH);

        jimg19.setIcon(new ImageIcon(img6));
        jimg2.setIcon(new ImageIcon(img7));
        jimg3.setIcon(new ImageIcon(img8));
        jimg4.setIcon(new ImageIcon(img9));
        jimg13.setIcon(new ImageIcon(img10));
        jimg6.setIcon(new ImageIcon(img11));
        jimg7.setIcon(new ImageIcon(img12));
        jimg8.setIcon(new ImageIcon(img13));
        jimg9.setIcon(new ImageIcon(img14));
        jimg10.setIcon(new ImageIcon(img15));
        
         //-----------------------------------------------------------------------------------
        ImageIcon iconimg11 = new ImageIcon(getClass().getResource("/ICON_DRINKS/Cappuccino.jpg"));
        ImageIcon iconimg12 = new ImageIcon(getClass().getResource("/ICON_DRINKS/Latte.jpg"));
        ImageIcon iconimg13 = new ImageIcon(getClass().getResource("/ICON_DRINKS/Mocha.jpg"));
        ImageIcon iconimg14 = new ImageIcon( getClass().getResource("/ICON_DRINKS/Espresso_Martini.jpg"));
        ImageIcon iconimg15 = new ImageIcon(getClass().getResource("/ICON_DRINKS/Passion_Fruit_Soda.jpg"));
        ImageIcon iconimg16 = new ImageIcon(getClass().getResource("/ICON_DRINKS/Americano.jpg"));
        ImageIcon iconimg17 = new ImageIcon(getClass().getResource("/ICON_DRINKS/Orange_Coffee.jpg"));
        ImageIcon iconimg18 = new ImageIcon(   getClass().getResource("/ICON_DRINKS/Green_tea.jpg"));
        ImageIcon iconimg19 = new ImageIcon(getClass().getResource("/ICON_DRINKS/CHA_thai.jpg"));
        ImageIcon iconimg20 = new ImageIcon( getClass().getResource("/ICON_DRINKS/Cocoa.jpg"));
        
        Image img16 = iconimg11.getImage().getScaledInstance(jimg22.getWidth(), jimg22.getHeight(), Image.SCALE_SMOOTH);
        Image img17 = iconimg12.getImage().getScaledInstance(jimg24.getWidth(), jimg24.getHeight(), Image.SCALE_SMOOTH);
        Image img18 = iconimg13.getImage().getScaledInstance(jimg23.getWidth(), jimg23.getHeight(), Image.SCALE_SMOOTH);
        Image img19 = iconimg14.getImage().getScaledInstance(jimg26.getWidth(), jimg26.getHeight(), Image.SCALE_SMOOTH);
        Image img20 = iconimg15.getImage().getScaledInstance(jimg25.getWidth(), jimg25.getHeight(), Image.SCALE_SMOOTH);
        Image img21 = iconimg16.getImage().getScaledInstance(jimg28.getWidth(), jimg28.getHeight(), Image.SCALE_SMOOTH);
        Image img22 = iconimg17.getImage().getScaledInstance(jimg27.getWidth(), jimg27.getHeight(), Image.SCALE_SMOOTH);
        Image img23 = iconimg18.getImage().getScaledInstance(jimg30.getWidth(), jimg30.getHeight(), Image.SCALE_SMOOTH);
        Image img24 = iconimg19.getImage().getScaledInstance(jimg29.getWidth(), jimg29.getHeight(), Image.SCALE_SMOOTH);
        Image img25 = iconimg20.getImage().getScaledInstance(jimg31.getWidth(), jimg31.getHeight(), Image.SCALE_SMOOTH);
        
        jimg22.setIcon(new ImageIcon(img16));
        jimg24.setIcon(new ImageIcon(img17));
        jimg23.setIcon(new ImageIcon(img18));
        jimg26.setIcon(new ImageIcon(img19));
        jimg25.setIcon(new ImageIcon(img20));
        jimg28.setIcon(new ImageIcon(img21));
        jimg27.setIcon(new ImageIcon(img22));
        jimg30.setIcon(new ImageIcon(img23));
        jimg29.setIcon(new ImageIcon(img24));
        jimg31.setIcon(new ImageIcon(img25));
        
        //--------
        ImageIcon iconimgC = new ImageIcon( getClass().getResource("/ICON_Loading/Load.jpg"));
        Image imgC = iconimgC.getImage().getScaledInstance(jimgg.getWidth(), jimgg.getHeight(), Image.SCALE_SMOOTH);
        jimgg.setIcon(new ImageIcon(imgC));
        
        //----Button
        ImageIcon iconimgBC = new ImageIcon( getClass().getResource("/ICON_CHEESECAKE/MenuC.jpg"));
        Image imgBC = iconimgBC.getImage().getScaledInstance(jButtonC.getWidth(), jButtonC.getHeight(), Image.SCALE_SMOOTH);
        jButtonC.setIcon(new ImageIcon(imgBC));
        
        ImageIcon iconimgBD = new ImageIcon( getClass().getResource("/ICON_DRINKS/MenuD.jpg"));
        Image imgBD = iconimgBD.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_SMOOTH);
        jButton1.setIcon(new ImageIcon(imgBD));
        
    }
    public void CheeseCake(){
        int pur  = 15020 + (int) (Math.random()*80800);
        jTextAreaMENU.setText("********************CHEESECAKE CAFE***********************\n"+"Time : "+jTxTime.getText()+" Date : "+jTxDate.getText()+"\n"+"Purchase Id : "+pur+"\n"+"***************************************************************"+"\nItem Name:\t\t                      "+"Price(Bath)\n");
    }
    
    public void dudate(){
        jTextVat.setText(String.valueOf(String.format("%.1f",vat)));
        jTextSub.setText(String.valueOf(String.format("%.1f",total)));
         jTextTotal.setText(String.valueOf(String.format("%.1f",total+vat)));
    }
    
     public void dudate1(){
        jTextVat.setText(String.valueOf(String.format("%.1f",0.0)));
        jTextSub.setText(String.valueOf(String.format("%.1f",total)));
         jTextTotal.setText(String.valueOf(String.format("%.1f",total-vat)));
    }
    
    
    public void setTime(){
        new Thread(new Runnable(){
            @Override
            public void run() {
               while(true){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(BOARD.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   Date date = new Date();
                   SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                   SimpleDateFormat df = new SimpleDateFormat("EEEE, MM-dd-yyyy");
                   String time = tf.format(date);
                   jTxTime.setText(time.split(" ")[0]+" "+time.split(" ")[1]);
                   jTxDate.setText(df.format(date));
               }
            }
        }).start();
    }
    public boolean qtyIsZero(int qty ){
        if(qty == 0){
            JOptionPane.showMessageDialog(null, "Please increase the Item quantity");
           return false;
        }
         return true;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxTime = new javax.swing.JLabel();
        jTxDate = new javax.swing.JLabel();
        jimgg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTotal = new javax.swing.JButton();
        btnRec = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButtonDetail = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextVat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextSub = new javax.swing.JTextField();
        jTextTotal = new javax.swing.JTextField();
        jC14asd = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMENU = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jimg19 = new javax.swing.JLabel();
        jLa1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel132 = new javax.swing.JLabel();
        jTotalM1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jimg2 = new javax.swing.JLabel();
        jLa3 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jTotalM3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jimg3 = new javax.swing.JLabel();
        jLa5 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        jTotalM5 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jimg4 = new javax.swing.JLabel();
        jLa7 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        jTotalM7 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jimg13 = new javax.swing.JLabel();
        jLa9 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel96 = new javax.swing.JLabel();
        jTotalM9 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jimg6 = new javax.swing.JLabel();
        jLa2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        jTotalM2 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jimg7 = new javax.swing.JLabel();
        jLa4 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel60 = new javax.swing.JLabel();
        jTotalM4 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jimg8 = new javax.swing.JLabel();
        jLa6 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel66 = new javax.swing.JLabel();
        jTotalM6 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jimg9 = new javax.swing.JLabel();
        jLa8 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel72 = new javax.swing.JLabel();
        jTotalM8 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jimg10 = new javax.swing.JLabel();
        jLa10 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel78 = new javax.swing.JLabel();
        jTotalM10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jimg22 = new javax.swing.JLabel();
        jLa11 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel150 = new javax.swing.JLabel();
        jTotalM11 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jimg23 = new javax.swing.JLabel();
        jLa13 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel156 = new javax.swing.JLabel();
        jTotalM13 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jimg25 = new javax.swing.JLabel();
        jLa15 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel162 = new javax.swing.JLabel();
        jTotalM15 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jimg27 = new javax.swing.JLabel();
        jLa17 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel168 = new javax.swing.JLabel();
        jTotalM17 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jimg29 = new javax.swing.JLabel();
        jLa19 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel174 = new javax.swing.JLabel();
        jTotalM19 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jimg24 = new javax.swing.JLabel();
        jLa12 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel180 = new javax.swing.JLabel();
        jTotalM12 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jimg26 = new javax.swing.JLabel();
        jLa14 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel186 = new javax.swing.JLabel();
        jTotalM14 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jimg28 = new javax.swing.JLabel();
        jLa16 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel192 = new javax.swing.JLabel();
        jTotalM16 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jimg30 = new javax.swing.JLabel();
        jLa18 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel198 = new javax.swing.JLabel();
        jTotalM18 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jimg31 = new javax.swing.JLabel();
        jLa20 = new javax.swing.JLabel();
        jSpinner20 = new javax.swing.JSpinner();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jCheckBox20 = new javax.swing.JCheckBox();
        jLabel204 = new javax.swing.JLabel();
        jTotalM20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 240, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 228, 167), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 228, 167));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CHEESECAKE CAFE");

        jTxTime.setBackground(new java.awt.Color(255, 240, 206));
        jTxTime.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jTxTime.setForeground(new java.awt.Color(0, 0, 0));
        jTxTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTxTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTxTime.setOpaque(true);

        jTxDate.setBackground(new java.awt.Color(255, 240, 206));
        jTxDate.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jTxDate.setForeground(new java.awt.Color(0, 0, 0));
        jTxDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTxDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTxDate.setOpaque(true);

        jimgg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jimgg, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jTxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTxTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jimgg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 1520, -1));

        jPanel3.setBackground(new java.awt.Color(255, 228, 167));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTotalMouseClicked(evt);
            }
        });
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecActionPerformed(evt);
            }
        });

        btnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jButtonDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailActionPerformed(evt);
            }
        });

        jButtonExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnRec, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jButtonDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnRec, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 85, -1, 740));

        jPanel4.setBackground(new java.awt.Color(255, 228, 167));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel6.setBackground(new java.awt.Color(255, 240, 206));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vat");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sub Total");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total");

        jTextVat.setBackground(new java.awt.Color(51, 51, 51));
        jTextVat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextVat.setForeground(new java.awt.Color(255, 255, 204));
        jTextVat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextVat.setText("0.0");
        jTextVat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextVat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextVatKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bath");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bath");

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bath");

        jTextSub.setBackground(new java.awt.Color(51, 51, 51));
        jTextSub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextSub.setForeground(new java.awt.Color(255, 255, 204));
        jTextSub.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSub.setText("0.0");
        jTextSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextSub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextSubKeyPressed(evt);
            }
        });

        jTextTotal.setBackground(new java.awt.Color(51, 51, 51));
        jTextTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextTotal.setForeground(new java.awt.Color(255, 255, 204));
        jTextTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTotal.setText("0.0");
        jTextTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalActionPerformed(evt);
            }
        });
        jTextTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextTotalKeyPressed(evt);
            }
        });

        jC14asd.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jC14asd.setForeground(new java.awt.Color(0, 0, 0));
        jC14asd.setText("None Vat");
        jC14asd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC14asdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextSub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jTextVat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jC14asd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC14asd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jTextSub)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTotal)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTextAreaMENU.setBackground(new java.awt.Color(255, 240, 206));
        jTextAreaMENU.setColumns(20);
        jTextAreaMENU.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jTextAreaMENU.setRows(5);
        jTextAreaMENU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextAreaMENU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaMENUKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaMENU);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 533, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 550, 730));

        jTabbedPane1.setBackground(new java.awt.Color(255, 228, 167));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane1.setEnabled(false);
        jTabbedPane1.setFont(new java.awt.Font("Nirmala UI", 1, 17)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel8.setBackground(new java.awt.Color(255, 228, 167));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.setOpaque(false);

        jPanel39.setBackground(new java.awt.Color(255, 240, 206));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg19.setOpaque(true);

        jLa1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa1.setForeground(new java.awt.Color(0, 0, 0));
        jLa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa1.setText("Stawberry Cheesecake");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel129.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setText("Price :");

        jLabel130.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("Quantity :");

        jLabel131.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(0, 0, 0));
        jLabel131.setText("Purchase :");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel132.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(0, 0, 0));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel132.setText("Bath");

        jTotalM1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM1.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM1.setText("40");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg19, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox1))
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel132))
                    .addComponent(jLa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg19, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLa1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(255, 240, 206));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg2.setOpaque(true);

        jLa3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa3.setForeground(new java.awt.Color(0, 0, 0));
        jLa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa3.setText("Blueberry Cheesecake");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel27.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Price :");

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Quantity :");

        jLabel29.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Purchase :");

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Bath");

        jTotalM3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM3.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM3.setText("40");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox3))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30))
                    .addComponent(jLa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLa3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 240, 206));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg3.setOpaque(true);

        jLa5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa5.setForeground(new java.awt.Color(0, 0, 0));
        jLa5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa5.setText("Chocolate Cheesecake");

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel33.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Price :");

        jLabel34.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Quantity :");

        jLabel35.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Purchase :");

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Bath");

        jTotalM5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM5.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM5.setText("40");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox5))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addComponent(jLa5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLa5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 240, 206));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg4.setOpaque(true);

        jLa7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa7.setForeground(new java.awt.Color(0, 0, 0));
        jLa7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa7.setText("Classic Cheesecake");

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel39.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Price :");

        jLabel40.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Quantity :");

        jLabel41.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Purchase :");

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Bath");

        jTotalM7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM7.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM7.setText("40");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox7))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42))
                    .addComponent(jLa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLa7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(255, 240, 206));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg13.setOpaque(true);

        jLa9.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa9.setForeground(new java.awt.Color(0, 0, 0));
        jLa9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa9.setText("Mango Cheesecake");

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel93.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 0));
        jLabel93.setText("Price :");

        jLabel94.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 0));
        jLabel94.setText("Quantity :");

        jLabel95.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Purchase :");

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 0, 0));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("Bath");

        jTotalM9.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM9.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM9.setText("40");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox9))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel96))
                    .addComponent(jLa9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLa9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 240, 206));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel26.setPreferredSize(new java.awt.Dimension(378, 135));

        jimg6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg6.setOpaque(true);

        jLa2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa2.setForeground(new java.awt.Color(0, 0, 0));
        jLa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa2.setText("Oreo Cheesecake");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel51.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Price :");

        jLabel52.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Quantity :");

        jLabel53.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Purchase :");

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Bath");

        jTotalM2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM2.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM2.setText("40");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox2))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel54))
                    .addComponent(jLa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLa2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel27.setBackground(new java.awt.Color(255, 240, 206));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg7.setOpaque(true);

        jLa4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa4.setForeground(new java.awt.Color(0, 0, 0));
        jLa4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa4.setText("Coffee Cheesecake");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel57.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Price :");

        jLabel58.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Quantity :");

        jLabel59.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Purchase :");

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed1(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Bath");

        jTotalM4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM4.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM4.setText("40");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox4))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel60))
                    .addComponent(jLa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLa4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 240, 206));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg8.setOpaque(true);

        jLa6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa6.setForeground(new java.awt.Color(0, 0, 0));
        jLa6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa6.setText("Monster Cheesecake");

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel63.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Price :");

        jLabel64.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Quantity :");

        jLabel65.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Purchase :");

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("Bath");

        jTotalM6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM6.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM6.setText("40");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox6))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel66))
                    .addComponent(jLa6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLa6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 240, 206));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg9.setOpaque(true);

        jLa8.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa8.setForeground(new java.awt.Color(0, 0, 0));
        jLa8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa8.setText("Caramel Cheesecake");

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel69.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("Price :");

        jLabel70.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Quantity :");

        jLabel71.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Purchase :");

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed1(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Bath");

        jTotalM8.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM8.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM8.setText("40");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox8))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel72))
                    .addComponent(jLa8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLa8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 240, 206));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg10.setOpaque(true);

        jLa10.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa10.setForeground(new java.awt.Color(0, 0, 0));
        jLa10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa10.setText("Orange Cheesecake");

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel75.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Price :");

        jLabel76.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Quantity :");

        jLabel77.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Purchase :");

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("Bath");

        jTotalM10.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM10.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM10.setText("40");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox10))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel78))
                    .addComponent(jLa10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLa10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("", jPanel8);

        jPanel11.setBackground(new java.awt.Color(255, 228, 167));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel42.setBackground(new java.awt.Color(255, 240, 206));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg22.setOpaque(true);

        jLa11.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa11.setForeground(new java.awt.Color(0, 0, 0));
        jLa11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa11.setText("Cappuccino");

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel147.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(0, 0, 0));
        jLabel147.setText("Price :");

        jLabel148.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(0, 0, 0));
        jLabel148.setText("Quantity :");

        jLabel149.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(0, 0, 0));
        jLabel149.setText("Purchase :");

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel150.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(0, 0, 0));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel150.setText("Bath");

        jTotalM11.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM11.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM11.setText("50");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg22, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel149, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox11))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel150))
                    .addComponent(jLa11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg22, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLa11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel43.setBackground(new java.awt.Color(255, 240, 206));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg23.setOpaque(true);

        jLa13.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa13.setForeground(new java.awt.Color(0, 0, 0));
        jLa13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa13.setText("Mocha");

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel153.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(0, 0, 0));
        jLabel153.setText("Price :");

        jLabel154.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(0, 0, 0));
        jLabel154.setText("Quantity :");

        jLabel155.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(0, 0, 0));
        jLabel155.setText("Purchase :");

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jLabel156.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(0, 0, 0));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel156.setText("Bath");

        jTotalM13.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM13.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM13.setText("50");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg23, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox13))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel156))
                    .addComponent(jLa13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg23, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLa13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel44.setBackground(new java.awt.Color(255, 240, 206));
        jPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg25.setOpaque(true);

        jLa15.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa15.setForeground(new java.awt.Color(0, 0, 0));
        jLa15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa15.setText("Passion Fruit Soda");

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel159.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(0, 0, 0));
        jLabel159.setText("Price :");

        jLabel160.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(0, 0, 0));
        jLabel160.setText("Quantity :");

        jLabel161.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(0, 0, 0));
        jLabel161.setText("Purchase :");

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jLabel162.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(0, 0, 0));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel162.setText("Bath");

        jTotalM15.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM15.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM15.setText("45");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg25, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel161, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel160, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox15))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel162))
                    .addComponent(jLa15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg25, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLa15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel45.setBackground(new java.awt.Color(255, 240, 206));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg27.setOpaque(true);

        jLa17.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa17.setForeground(new java.awt.Color(0, 0, 0));
        jLa17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa17.setText("Orange Coffee");

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel165.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(0, 0, 0));
        jLabel165.setText("Price :");

        jLabel166.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(0, 0, 0));
        jLabel166.setText("Quantity :");

        jLabel167.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(0, 0, 0));
        jLabel167.setText("Purchase :");

        jCheckBox17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jLabel168.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(0, 0, 0));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel168.setText("Bath");

        jTotalM17.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM17.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM17.setText("45");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg27, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel167, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox17))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel168))
                    .addComponent(jLa17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg27, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLa17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel46.setBackground(new java.awt.Color(255, 240, 206));
        jPanel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg29.setOpaque(true);

        jLa19.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa19.setForeground(new java.awt.Color(0, 0, 0));
        jLa19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa19.setText("CHA thai");

        jSpinner19.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel171.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(0, 0, 0));
        jLabel171.setText("Price :");

        jLabel172.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(0, 0, 0));
        jLabel172.setText("Quantity :");

        jLabel173.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(0, 0, 0));
        jLabel173.setText("Purchase :");

        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19jCheckBox8ActionPerformed(evt);
            }
        });

        jLabel174.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(0, 0, 0));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel174.setText("Bath");

        jTotalM19.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM19.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM19.setText("40");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg29, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel173, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox19))
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel174))
                    .addComponent(jLa19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg29, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLa19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel47.setBackground(new java.awt.Color(255, 240, 206));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg24.setOpaque(true);

        jLa12.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa12.setForeground(new java.awt.Color(0, 0, 0));
        jLa12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa12.setText("Latte");

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel177.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(0, 0, 0));
        jLabel177.setText("Price :");

        jLabel178.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(0, 0, 0));
        jLabel178.setText("Quantity :");

        jLabel179.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(0, 0, 0));
        jLabel179.setText("Purchase :");

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jLabel180.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(0, 0, 0));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel180.setText("Bath");

        jTotalM12.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM12.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM12.setText("50");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg24, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel179, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox12))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel180))
                    .addComponent(jLa12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jimg24, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jLa12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel48.setBackground(new java.awt.Color(255, 240, 206));
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg26.setOpaque(true);

        jLa14.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa14.setForeground(new java.awt.Color(0, 0, 0));
        jLa14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa14.setText("Espresso Martini");

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel183.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(0, 0, 0));
        jLabel183.setText("Price :");

        jLabel184.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(0, 0, 0));
        jLabel184.setText("Quantity :");

        jLabel185.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(0, 0, 0));
        jLabel185.setText("Purchase :");

        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jLabel186.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(0, 0, 0));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel186.setText("Bath");

        jTotalM14.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM14.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM14.setText("50");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg26, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel185, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jLabel184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel48Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox14))
                            .addGroup(jPanel48Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel186))
                    .addComponent(jLa14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg26, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLa14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel48Layout.createSequentialGroup()
                                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(255, 240, 206));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg28.setOpaque(true);

        jLa16.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa16.setForeground(new java.awt.Color(0, 0, 0));
        jLa16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa16.setText("Americano");

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel189.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(0, 0, 0));
        jLabel189.setText("Price :");

        jLabel190.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(0, 0, 0));
        jLabel190.setText("Quantity :");

        jLabel191.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(0, 0, 0));
        jLabel191.setText("Purchase :");

        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jLabel192.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(0, 0, 0));
        jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel192.setText("Bath");

        jTotalM16.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM16.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM16.setText("50");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg28, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel191, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox16))
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel192))
                    .addComponent(jLa16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg28, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLa16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel50.setBackground(new java.awt.Color(255, 240, 206));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg30.setOpaque(true);

        jLa18.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa18.setForeground(new java.awt.Color(0, 0, 0));
        jLa18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa18.setText("Milk Green Tea");

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel195.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(0, 0, 0));
        jLabel195.setText("Price :");

        jLabel196.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(0, 0, 0));
        jLabel196.setText("Quantity :");

        jLabel197.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(0, 0, 0));
        jLabel197.setText("Purchase :");

        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jLabel198.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(0, 0, 0));
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel198.setText("Bath");

        jTotalM18.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM18.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM18.setText("40");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg30, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel197, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox18))
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel198))
                    .addComponent(jLa18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg30, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLa18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel51.setBackground(new java.awt.Color(255, 240, 206));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jimg31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jimg31.setOpaque(true);

        jLa20.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLa20.setForeground(new java.awt.Color(0, 0, 0));
        jLa20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLa20.setText("Cocoa");

        jSpinner20.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel201.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(0, 0, 0));
        jLabel201.setText("Price :");

        jLabel202.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(0, 0, 0));
        jLabel202.setText("Quantity :");

        jLabel203.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(0, 0, 0));
        jLabel203.setText("Purchase :");

        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jLabel204.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(0, 0, 0));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel204.setText("Bath");

        jTotalM20.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jTotalM20.setForeground(new java.awt.Color(0, 0, 0));
        jTotalM20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTotalM20.setText("40");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimg31, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel203, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jCheckBox20))
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTotalM20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel204))
                    .addComponent(jLa20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jimg31, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLa20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTotalM20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        jTabbedPane1.addTab("", jPanel11);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 85, 840, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
       if(total == 0.0){
           JOptionPane.showMessageDialog(null, "You haven't selected any item.");
       }else{
           int Choose = JOptionPane.showConfirmDialog(rootPane, "Do you want to pay form QRcode ?");
           boolean tick = jC14asd.isSelected();
           if(Choose == JOptionPane.YES_OPTION){
                QRCODE QR = new QRCODE();
               QR.setVisible(true);
               if(tick == false){
                 jTextAreaMENU.setText(jTextAreaMENU.getText()+"\n"+"***************************************************************\n"+"Vat : \t\t\t"+String.format("%.1f",vat)+"\n"+"Sub Total : \t\t                          "+String.format("%.1f",total)+"\n"+"Total : \t\t                          "+String.format("%.1f",total+vat)+"\n"+"****************THANKYOU FOR SERVICE********************");
                 btnTotal.setEnabled(false);
                  jCheckBox1.setEnabled(false);
                   jCheckBox2.setEnabled(false);
         jCheckBox3.setEnabled(false);
         jCheckBox4.setEnabled(false);
         jCheckBox5.setEnabled(false);
         jCheckBox6.setEnabled(false);
         jCheckBox7.setEnabled(false);
         jCheckBox8.setEnabled(false);
         jCheckBox9.setEnabled(false);
         jCheckBox10.setEnabled(false);
         jCheckBox11.setEnabled(false);
         jCheckBox12.setEnabled(false);
         jCheckBox13.setEnabled(false);
         jCheckBox14.setEnabled(false);
         jCheckBox15.setEnabled(false);
         jCheckBox16.setEnabled(false);
         jCheckBox17.setEnabled(false);
         jCheckBox18.setEnabled(false);
         jCheckBox19.setEnabled(false);
         jCheckBox20.setEnabled(false);
               }else if( tick == true){
                jTextAreaMENU.setText(jTextAreaMENU.getText()+"\n"+"***************************************************************\n"+"Vat : \t\t\t"+String.format("%.1f",0.0)+"\n"+"Sub Total : \t\t                          "+String.format("%.1f",total)+"\n"+"Total : \t\t                          "+String.format("%.1f",total-vat)+"\n"+"****************THANKYOU FOR SERVICE********************");
                btnTotal.setEnabled(false);
                  jCheckBox1.setEnabled(false);
                   jCheckBox2.setEnabled(false);
         jCheckBox3.setEnabled(false);
         jCheckBox4.setEnabled(false);
         jCheckBox5.setEnabled(false);
         jCheckBox6.setEnabled(false);
         jCheckBox7.setEnabled(false);
         jCheckBox8.setEnabled(false);
         jCheckBox9.setEnabled(false);
         jCheckBox10.setEnabled(false);
         jCheckBox11.setEnabled(false);
         jCheckBox12.setEnabled(false);
         jCheckBox13.setEnabled(false);
         jCheckBox14.setEnabled(false);
         jCheckBox15.setEnabled(false);
         jCheckBox16.setEnabled(false);
         jCheckBox17.setEnabled(false);
         jCheckBox18.setEnabled(false);
         jCheckBox19.setEnabled(false);
         jCheckBox20.setEnabled(false);
               }
           }else if(Choose == JOptionPane.NO_OPTION){
            if(tick == false){
                 jTextAreaMENU.setText(jTextAreaMENU.getText()+"\n"+"***************************************************************\n"+"Vat : \t\t\t"+String.format("%.1f",vat)+"\n"+"Sub Total : \t\t                          "+String.format("%.1f",total)+"\n"+"Total : \t\t                          "+String.format("%.1f",total+vat)+"\n"+"****************THANKYOU FOR SERVICE********************");
                 btnTotal.setEnabled(false);
                  jCheckBox1.setEnabled(false);
                   jCheckBox2.setEnabled(false);
         jCheckBox3.setEnabled(false);
         jCheckBox4.setEnabled(false);
         jCheckBox5.setEnabled(false);
         jCheckBox6.setEnabled(false);
         jCheckBox7.setEnabled(false);
         jCheckBox8.setEnabled(false);
         jCheckBox9.setEnabled(false);
         jCheckBox10.setEnabled(false);
         jCheckBox11.setEnabled(false);
         jCheckBox12.setEnabled(false);
         jCheckBox13.setEnabled(false);
         jCheckBox14.setEnabled(false);
         jCheckBox15.setEnabled(false);
         jCheckBox16.setEnabled(false);
         jCheckBox17.setEnabled(false);
         jCheckBox18.setEnabled(false);
         jCheckBox19.setEnabled(false);
         jCheckBox20.setEnabled(false);
               }else if( tick == true){
                jTextAreaMENU.setText(jTextAreaMENU.getText()+"\n"+"***************************************************************\n"+"Vat : \t\t\t"+String.format("%.1f",0.0)+"\n"+"Sub Total : \t\t                          "+String.format("%.1f",total)+"\n"+"Total : \t\t                          "+String.format("%.1f",total-vat)+"\n"+"****************THANKYOU FOR SERVICE********************");
                btnTotal.setEnabled(false);
                  jCheckBox1.setEnabled(false);
                   jCheckBox2.setEnabled(false);
         jCheckBox3.setEnabled(false);
         jCheckBox4.setEnabled(false);
         jCheckBox5.setEnabled(false);
         jCheckBox6.setEnabled(false);
         jCheckBox7.setEnabled(false);
         jCheckBox8.setEnabled(false);
         jCheckBox9.setEnabled(false);
         jCheckBox10.setEnabled(false);
         jCheckBox11.setEnabled(false);
         jCheckBox12.setEnabled(false);
         jCheckBox13.setEnabled(false);
         jCheckBox14.setEnabled(false);
         jCheckBox15.setEnabled(false);
         jCheckBox16.setEnabled(false);
         jCheckBox17.setEnabled(false);
         jCheckBox18.setEnabled(false);
         jCheckBox19.setEnabled(false);
         jCheckBox20.setEnabled(false);
               }
           }
       }
    }//GEN-LAST:event_btnTotalActionPerformed
    
    private void btnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseClicked

    }//GEN-LAST:event_btnTotalMouseClicked

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

        int Confir = JOptionPane.showConfirmDialog(rootPane, "Do you want to return to logging in ?");
        if(Confir ==  JOptionPane.YES_OPTION){
            LOGIN L = new LOGIN();
            L.setVisible(true);
            L.pack();
           this.dispose();
        }else if(Confir == JOptionPane.NO_OPTION){
              System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed
    
    
    int xx, xy;
    
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
          int qty = Integer.parseInt(jSpinner10.getValue().toString());
          boolean tick = jC14asd.isSelected();
      if(tick == false){
             if(qtyIsZero(qty) && jCheckBox10.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa10.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox10.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox10.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa10.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox10.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox8ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed1
          int qty = Integer.parseInt(jSpinner8.getValue().toString());
          boolean tick = jC14asd.isSelected();
       if(tick == false){
             if(qtyIsZero(qty) && jCheckBox8.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa8.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            
        }else{
            jCheckBox8.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox8.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa8.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox8.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed1

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
          int qty = Integer.parseInt(jSpinner6.getValue().toString());
        boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox6.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa6.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            
        }else{
            jCheckBox6.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox6.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa6.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox6.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox4ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed1
          int qty = Integer.parseInt(jSpinner4.getValue().toString());
         boolean tick = jC14asd.isSelected();
      if(tick == false){
             if(qtyIsZero(qty) && jCheckBox4.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa4.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            
        }else{
            jCheckBox4.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox4.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa4.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox4.setSelected(false);
        }
        }
        
    }//GEN-LAST:event_jCheckBox4ActionPerformed1

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
          int qty = Integer.parseInt(jSpinner2.getValue().toString());
        boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox2.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            
            }
            double price = qty*nu1;
            total += price;
            getVat(total); 
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa2.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox2.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox2.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
           jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa2.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox2.setSelected(false);
        }
        }
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
           int qty = Integer.parseInt(jSpinner9.getValue().toString());
           boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox9.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa9.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            
        }else{
            jCheckBox9.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox9.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa9.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox9.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
           int qty = Integer.parseInt(jSpinner7.getValue().toString());
         boolean tick = jC14asd.isSelected();
       if(tick == false){
             if(qtyIsZero(qty) && jCheckBox7.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa7.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            
        }else{
            jCheckBox7.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox7.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa7.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox7.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
           int qty = Integer.parseInt(jSpinner5.getValue().toString());
        boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox5.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa5.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            
        }else{
            jCheckBox5.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox5.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa5.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox5.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
           int qty = Integer.parseInt(jSpinner3.getValue().toString());
         boolean tick = jC14asd.isSelected();
         if(tick == false){
             if(qtyIsZero(qty) && jCheckBox3.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            
            }
            double price = qty*nu1;
            total += price;
            getVat(total); 
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa3.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox3.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox3.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
           jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa3.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox3.setSelected(false);
        }
        }
        
        
        
    }//GEN-LAST:event_jCheckBox3ActionPerformed
    
    
    
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox1.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa1.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            
        }else{
            jCheckBox1.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox1.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa1.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox1.setSelected(false);
        }
        }
       

    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox11jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11jCheckBox4ActionPerformed
          int qty = Integer.parseInt(jSpinner11.getValue().toString());
         boolean tick = jC14asd.isSelected();
         if(tick == false){
             if(qtyIsZero(qty) && jCheckBox11.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa11.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox11.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox11.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa11.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox11.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox11jCheckBox4ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
         int qty = Integer.parseInt(jSpinner13.getValue().toString());
        boolean tick = jC14asd.isSelected();
         if(tick == false){
             if(qtyIsZero(qty) && jCheckBox13.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa13.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox13.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox13.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa13.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox13.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
         int qty = Integer.parseInt(jSpinner15.getValue().toString());
        boolean tick = jC14asd.isSelected();
          if(tick == false){
             if(qtyIsZero(qty) && jCheckBox15.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa15.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox15.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox15.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa15.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox15.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
         int qty = Integer.parseInt(jSpinner17.getValue().toString());
          boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox17.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu2;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa17.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox17.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox17.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu2;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa17.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox17.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox19jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19jCheckBox8ActionPerformed
        int qty = Integer.parseInt(jSpinner19.getValue().toString());
        boolean tick = jC14asd.isSelected();
         if(tick == false){
             if(qtyIsZero(qty) && jCheckBox19.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa19.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox19.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox19.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa19.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox19.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox19jCheckBox8ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
          int qty = Integer.parseInt(jSpinner12.getValue().toString());
          boolean tick = jC14asd.isSelected();
         if(tick == false){
             if(qtyIsZero(qty) && jCheckBox12.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa12.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox12.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox12.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa12.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox12.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
          int qty = Integer.parseInt(jSpinner14.getValue().toString());

        boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox14.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa14.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox14.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox14.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa14.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox14.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
         int qty = Integer.parseInt(jSpinner16.getValue().toString());
         boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox16.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa16.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox16.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox16.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu3;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa16.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox16.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
         int qty = Integer.parseInt(jSpinner18.getValue().toString());

        boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox18.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa18.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox18.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox18.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa18.getText()+"\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox18.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
         int qty = Integer.parseInt(jSpinner20.getValue().toString());
         boolean tick = jC14asd.isSelected();
        if(tick == false){
             if(qtyIsZero(qty) && jCheckBox20.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            getVat(total);
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa20.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
        }else{
            jCheckBox20.setSelected(false);
        }
        }else if(tick == true){
             if(qtyIsZero(qty) && jCheckBox20.isSelected()){
            x++;
            if(x==1){
                CheeseCake();
            }
            double price = qty*nu1;
            total += price;
            jTextVat.setText("0.0");
            jTextAreaMENU.setText(jTextAreaMENU.getText()+x+". "+jLa20.getText()+"\t\t["+qty+"]"+"\t"+price+"\n");
            dudate();
            if(tick == true){
                jC14asd.setSelected(false);
            }else if(tick == false){
                jC14asd.setSelected(true);
            }
        }else{
            jCheckBox20.setSelected(false);
        }
        }
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jButtonDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailActionPerformed
       DETAILMENU detail = new DETAILMENU();
       detail.setVisible(true);
       detail.pack(); 
    }//GEN-LAST:event_jButtonDetailActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        btnTotal.setEnabled(true);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        //-------
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jSpinner16.setValue(0);
        jSpinner17.setValue(0);
        jSpinner18.setValue(0);
        jSpinner19.setValue(0);
        jSpinner20.setValue(0);
        //-------
        jTextVat.setText("0.0");
        jTextSub.setText("0.0");
        jTextTotal.setText("0.0");
        //-------
        total = 0.0;
        x = 0;
        vat = 0.0;
        //-------
        jTextAreaMENU.setText("");
         //-------
         jCheckBox1.setSelected(false);
         jCheckBox2.setSelected(false);
         jCheckBox3.setSelected(false);
         jCheckBox4.setSelected(false);
         jCheckBox5.setSelected(false);
         jCheckBox6.setSelected(false);
         jCheckBox7.setSelected(false);
         jCheckBox8.setSelected(false);
         jCheckBox9.setSelected(false);
         jCheckBox10.setSelected(false);
         jCheckBox11.setSelected(false);
         jCheckBox12.setSelected(false);
         jCheckBox13.setSelected(false);
         jCheckBox14.setSelected(false);
         jCheckBox15.setSelected(false);
         jCheckBox16.setSelected(false);
         jCheckBox17.setSelected(false);
         jCheckBox18.setSelected(false);
         jCheckBox19.setSelected(false);
         jCheckBox20.setSelected(false);
         jC14asd.setSelected(false);
         
         //-------------------
          jCheckBox1.setEnabled(true);
          jCheckBox2.setEnabled(true);
         jCheckBox3.setEnabled(true);
         jCheckBox4.setEnabled(true);
         jCheckBox5.setEnabled(true);
         jCheckBox6.setEnabled(true);
         jCheckBox7.setEnabled(true);
         jCheckBox8.setEnabled(true);
         jCheckBox9.setEnabled(true);
         jCheckBox10.setEnabled(true);
         jCheckBox11.setEnabled(true);
         jCheckBox12.setEnabled(true);
         jCheckBox13.setEnabled(true);
         jCheckBox14.setEnabled(true);
         jCheckBox15.setEnabled(true);
         jCheckBox16.setEnabled(true);
         jCheckBox17.setEnabled(true);
         jCheckBox18.setEnabled(true);
         jCheckBox19.setEnabled(true);
         jCheckBox20.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecActionPerformed
        
        if(total != 0){
            if(!btnTotal.isEnabled()){
                try {
            jTextAreaMENU.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BOARD.class.getName()).log(Level.SEVERE, null, ex);
        }
            }else{
            JOptionPane.showMessageDialog(this, "First , you should calculate the total price");
        }
        
        }else{
            JOptionPane.showMessageDialog(this, "You haven't purchased any product");
        }
    }//GEN-LAST:event_btnRecActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextAreaMENUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaMENUKeyPressed
         String board = jTextAreaMENU.getText();
        char c = evt.getKeyChar();
        int len1 = board.length();
        
        if(Character.isLetter(c)){
             if(evt.getKeyChar()>='a' && evt.getKeyChar()<='z' || evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'){
                 jTextAreaMENU.setEditable(true);
             if(len1 == -1){
                jTextAreaMENU.setEditable(true);
            }else{
                jTextAreaMENU.setEditable(false);
            }
             }
        }else if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(len1 == -1){
                jTextAreaMENU.setEditable(true);
            }else{
                jTextAreaMENU.setEditable(false);
            }
        }
       
    }//GEN-LAST:event_jTextAreaMENUKeyPressed

    private void jTextVatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextVatKeyPressed
        String B1b = jTextVat.getText();
        char B1bb = evt.getKeyChar();
        int B1bbb = B1b.length();
        if(Character.isLetter(B1bb)){
             if(evt.getKeyChar()>='a' && evt.getKeyChar()<='z' || evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'){
                 jTextVat.setEditable(true);
             if(B1bbb == 2){
                jTextVat.setEditable(true);
            }else{
                jTextVat.setEditable(false);
            }
             }
        }else if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(B1bbb == 2){
                jTextVat.setEditable(true);
            }else{
                jTextVat.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextVatKeyPressed

    private void jTextSubKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSubKeyPressed
        String B2b = jTextSub.getText();
        char B2bb = evt.getKeyChar();
        int B2bbb = B2b.length();
        if(Character.isLetter(B2bb)){
             if(evt.getKeyChar()>='a' && evt.getKeyChar()<='z' || evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'){
                 jTextSub.setEditable(true);
             if(B2bbb == 2){
                jTextSub.setEditable(true);
            }else{
                jTextSub.setEditable(false);
            }
             }
        }else if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(B2bbb == 2){
                jTextSub.setEditable(true);
            }else{
                jTextSub.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextSubKeyPressed

    private void jTextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTotalActionPerformed

    private void jTextTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTotalKeyPressed
       String B3b = jTextTotal.getText();
        char B3bb = evt.getKeyChar();
        int B3bbb = B3b.length();
        if(Character.isLetter(B3bb)){
             if(evt.getKeyChar()>='a' && evt.getKeyChar()<='z' || evt.getKeyChar()>='A' && evt.getKeyChar()<='Z'){
                 jTextTotal.setEditable(true);
             if(B3bbb == 2){
                jTextTotal.setEditable(true);
            }else{
                jTextTotal.setEditable(false);
            }
             }
        }else if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(B3bbb == 2){
                jTextTotal.setEditable(true);
            }else{
                jTextTotal.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextTotalKeyPressed

    private void jC14asdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC14asdActionPerformed
         boolean Tick = jC14asd.isSelected();
         if(Tick == true){     
              String setFloat = Float.toString((float) ((float) total-vat));
              jTextTotal.setText(setFloat);
             jTextVat.setText("0.0");      
             jCheckBox1.setSelected(false);
               jCheckBox1.setSelected(false);
         jCheckBox2.setSelected(false);
         jCheckBox3.setSelected(false);
         jCheckBox4.setSelected(false);
         jCheckBox5.setSelected(false);
         jCheckBox6.setSelected(false);
         jCheckBox7.setSelected(false);
         jCheckBox8.setSelected(false);
         jCheckBox9.setSelected(false);
         jCheckBox10.setSelected(false);
         jCheckBox11.setSelected(false);
         jCheckBox12.setSelected(false);
         jCheckBox13.setSelected(false);
         jCheckBox14.setSelected(false);
         jCheckBox15.setSelected(false);
         jCheckBox16.setSelected(false);
         jCheckBox17.setSelected(false);
         jCheckBox18.setSelected(false);
         jCheckBox19.setSelected(false);
         jCheckBox20.setSelected(false);
          jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        //-------
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jSpinner16.setValue(0);
        jSpinner17.setValue(0);
        jSpinner18.setValue(0);
        jSpinner19.setValue(0);
        jSpinner20.setValue(0);
        //-------
         }else if(Tick == false){
       String setFloat = Float.toString((float) vat);
             jTextVat.setText(setFloat);    
         }
    }//GEN-LAST:event_jC14asdActionPerformed
    
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
            java.util.logging.Logger.getLogger(BOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BOARD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRec;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDetail;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JCheckBox jC14asd;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLa1;
    private javax.swing.JLabel jLa10;
    private javax.swing.JLabel jLa11;
    private javax.swing.JLabel jLa12;
    private javax.swing.JLabel jLa13;
    private javax.swing.JLabel jLa14;
    private javax.swing.JLabel jLa15;
    private javax.swing.JLabel jLa16;
    private javax.swing.JLabel jLa17;
    private javax.swing.JLabel jLa18;
    private javax.swing.JLabel jLa19;
    private javax.swing.JLabel jLa2;
    private javax.swing.JLabel jLa20;
    private javax.swing.JLabel jLa3;
    private javax.swing.JLabel jLa4;
    private javax.swing.JLabel jLa5;
    private javax.swing.JLabel jLa6;
    private javax.swing.JLabel jLa7;
    private javax.swing.JLabel jLa8;
    private javax.swing.JLabel jLa9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaMENU;
    private javax.swing.JTextField jTextSub;
    private javax.swing.JTextField jTextTotal;
    private javax.swing.JTextField jTextVat;
    private javax.swing.JLabel jTotalM1;
    private javax.swing.JLabel jTotalM10;
    private javax.swing.JLabel jTotalM11;
    private javax.swing.JLabel jTotalM12;
    private javax.swing.JLabel jTotalM13;
    private javax.swing.JLabel jTotalM14;
    private javax.swing.JLabel jTotalM15;
    private javax.swing.JLabel jTotalM16;
    private javax.swing.JLabel jTotalM17;
    private javax.swing.JLabel jTotalM18;
    private javax.swing.JLabel jTotalM19;
    private javax.swing.JLabel jTotalM2;
    private javax.swing.JLabel jTotalM20;
    private javax.swing.JLabel jTotalM3;
    private javax.swing.JLabel jTotalM4;
    private javax.swing.JLabel jTotalM5;
    private javax.swing.JLabel jTotalM6;
    private javax.swing.JLabel jTotalM7;
    private javax.swing.JLabel jTotalM8;
    private javax.swing.JLabel jTotalM9;
    private javax.swing.JLabel jTxDate;
    private javax.swing.JLabel jTxTime;
    private javax.swing.JLabel jimg10;
    private javax.swing.JLabel jimg13;
    private javax.swing.JLabel jimg19;
    private javax.swing.JLabel jimg2;
    private javax.swing.JLabel jimg22;
    private javax.swing.JLabel jimg23;
    private javax.swing.JLabel jimg24;
    private javax.swing.JLabel jimg25;
    private javax.swing.JLabel jimg26;
    private javax.swing.JLabel jimg27;
    private javax.swing.JLabel jimg28;
    private javax.swing.JLabel jimg29;
    private javax.swing.JLabel jimg3;
    private javax.swing.JLabel jimg30;
    private javax.swing.JLabel jimg31;
    private javax.swing.JLabel jimg4;
    private javax.swing.JLabel jimg6;
    private javax.swing.JLabel jimg7;
    private javax.swing.JLabel jimg8;
    private javax.swing.JLabel jimg9;
    private javax.swing.JLabel jimgg;
    // End of variables declaration//GEN-END:variables
}