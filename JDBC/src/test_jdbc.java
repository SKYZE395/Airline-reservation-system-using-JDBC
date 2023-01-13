import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.metal.MetalCheckBoxIcon;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

class x{
    static JFrame frame1;
    static JFrame frame2;
    static JFrame frame3;
    static JFrame frame4;
    static JFrame frame5;
    static JFrame frame6;
    static JFrame frame7;
    static JLabel name1;
    static JLabel name2;
    static JLabel name3;
    static JLabel age1;
    static JLabel age2;
    static JLabel age3;
    static JTextField nametf1;
    static JTextField nametf2;
    static JTextField nametf3;
    static JTextField agetf1;
    static JTextField agetf2;
    static JTextField agetf3;
    static JLabel gender1;
    static JLabel gender2;
    static JLabel gender3;
    static JRadioButton rb1;
    static JRadioButton rb2;
    static JRadioButton rb3;
    static JRadioButton rb4;
    static JRadioButton rb5;
    static JRadioButton rb6;
    static ButtonGroup bg1;
    static ButtonGroup bg2;
    static ButtonGroup bg3;
    static String f;
    static double fare;
    static int i;
    static int i1;
    static int[] chk;
    static JLabel ar;
}
class ask{
    ask(String user){
        JFrame f11 = new JFrame();   
        Container c = f11.getContentPane();
        c.setLayout(null);

        String DB_URL = "jdbc:mysql://localhost:3306/";
        String USER = "root";
        String PASS = "Aakashisgood@123";

        JLabel l1 = new JLabel("");
        l1.setBounds(100,200,550,20);
        l1.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l11 = new JLabel("");
        l11.setBounds(100,225,550,20);
        l11.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l12 = new JLabel("");
        l12.setBounds(100,250,550,20);
        l12.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l2 = new JLabel("");
        l2.setBounds(100,300,550,20);
        l2.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l21 = new JLabel("");
        l21.setBounds(100,325,550,20);
        l21.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l22 = new JLabel("");
        l22.setBounds(100,350,550,20);
        l22.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l3 = new JLabel("");
        l3.setBounds(100,400,550,20);
        l3.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l31 = new JLabel("");
        l31.setBounds(100,425,550,20);
        l31.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l32 = new JLabel("");
        l32.setBounds(100,450,550,20);
        l32.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l4 = new JLabel("");
        l4.setBounds(100,500,550,20);
        l4.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l41 = new JLabel("");
        l41.setBounds(100,525,550,20);
        l41.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l42 = new JLabel("");
        l42.setBounds(100,550,550,20);
        l42.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l5 = new JLabel("");
        l5.setBounds(100,600,550,20);
        l5.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l51 = new JLabel("");
        l51.setBounds(100,625,550,20);
        l51.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l52 = new JLabel("");
        l52.setBounds(100,650,550,20);
        l52.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel l6 = new JLabel("WE CAN SHOW YOU YOUR PAST 5 JOURNEYS.");
        l6.setBounds(100,50,800,50);
        l6.setFont(new Font("Bahnschrift", Font.BOLD, 36));

        JLabel t1 = new JLabel();
        t1.setBounds(650,200,800,20);
        t1.setFont(new Font("Bahnschrift", Font.BOLD, 19));
        
        JLabel t2 = new JLabel();
        t2.setBounds(650,300,800,20);
        t2.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel t3 = new JLabel();
        t3.setBounds(650,400,800,20);
        t3.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel t4 = new JLabel();
        t4.setBounds(650,500,800,20);
        t4.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JLabel t5 = new JLabel();
        t5.setBounds(650,600,800,20);
        t5.setFont(new Font("Bahnschrift", Font.BOLD, 19));

        JButton back = new JButton("BACK");
        back.setBounds(20,700,100,20);
        f11.add(back);

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x.frame1.setVisible(true);
                f11.setVisible(false);
            }
        });

        try{
            int i=1;
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement s11 = conn.createStatement();
            s11.executeUpdate("use air;");
            int cursor=0;

            Statement s2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet r1 = s2.executeQuery("select * from "+user+";");
            while(r1.next()){
                if(r1.getInt("journey")==i){   
                    i++;
                }
            }
            cursor = i-1;

            Statement s1 = conn.createStatement();
            ResultSet set1 = s1.executeQuery("select * from "+user+" where journey ="+cursor+";");
            if(set1.next()){
                String n1_1 = set1.getString("name");
                int a1_1 = set1.getInt("age");
                String d1 = set1.getString("arr")+"   ->    "+set1.getString("dep");
                if(set1.next()){
                    String n1_2 = set1.getString("name");
                    int a1_2 = set1.getInt("age");
                    if(set1.next()){
                        String n1_3 = set1.getString("name");
                        int a1_3 = set1.getInt("age");
                        l1.setText("NAME:  "+n1_1+"  AGE: "+a1_1);
                        l11.setText("NAME: "+n1_2+"  AGE: "+a1_2);
                        l12.setText("NAME: "+n1_3+"  AGE: "+a1_3);
                        t1.setText(d1);
                        cursor--;
                    }
                    else{
                        l1.setText("NAME:  "+n1_1+"  AGE: "+a1_1);
                        l11.setText("\nNAME: "+n1_2+"  AGE: "+a1_2);
                        t1.setText(d1);
                        cursor--;
                    }
                }
                else{
                    l1.setText("NAME:  "+n1_1+"  AGE: "+a1_1);
                    t1.setText(d1);
                    cursor--;
                }
            }
            else{
                l1.setText("CONTINUE FLYING WITH US TO TRACK YOUR JOURNEYS.");
            }

            Statement s3 = conn.createStatement();
            ResultSet set2 = s3.executeQuery("select * from "+user+" where journey ="+cursor+";");
            if(set2.next()){
                String n2_1 = set2.getString("name");
                int a2_1 = set2.getInt("age");
                String d2 = set2.getString("arr")+"   ->    "+set2.getString("dep");
                if(set2.next()){
                    String n2_2 = set2.getString("name");
                    int a2_2 = set2.getInt("age");
                    if(set2.next()){
                        String n2_3 = set2.getString("name");
                        int a2_3 = set2.getInt("age");
                        l2.setText("NAME:  "+n2_1+"  AGE: "+a2_1);
                        l21.setText("NAME: "+n2_2+"  AGE: "+a2_2);
                        l22.setText("NAME: "+n2_3+"  AGE: "+a2_3);
                        t2.setText(d2);
                        cursor--;
                    }
                    else{
                        l2.setText("NAME:  "+n2_1+"  AGE: "+a2_1);
                        l21.setText("NAME: "+n2_2+"  AGE: "+a2_2);
                        t2.setText(d2);
                        cursor--;
                    }
                }
                else{
                    l2.setText("NAME:  "+n2_1+"  AGE: "+a2_1);
                    t2.setText(d2);
                    cursor--;
                }
            }
            else{
                l2.setText("CONTINUE FLYING WITH US TO TRACK YOUR JOURNEYS.");
            }
            
            Statement s4 = conn.createStatement();
            ResultSet set3 = s4.executeQuery("select * from "+user+" where journey ="+cursor+";");
            if(set3.next()){
                String n3_1 = set3.getString("name");
                int a3_1 = set3.getInt("age");
                String d3 = set3.getString("arr")+"   ->    "+set3.getString("dep");
                if(set3.next()){
                    String n3_2 = set3.getString("name");
                    int a3_2 = set3.getInt("age");
                    if(set3.next()){
                        String n3_3 = set3.getString("name");
                        int a3_3 = set3.getInt("age");
                        l3.setText("NAME:  "+n3_1+"  AGE: "+a3_1);
                        l31.setText("NAME: "+n3_2+"  AGE: "+a3_2);
                        l32.setText("NAME: "+n3_3+"  AGE: "+a3_3);
                        t3.setText(d3);
                        cursor--;
                    }
                    else{
                        l3.setText("NAME:  "+n3_1+"  AGE: "+a3_1);
                        l31.setText("NAME: "+n3_2+"  AGE: "+a3_2);
                        t3.setText(d3);
                        cursor--;
                    }
                }
                else{
                    l3.setText("NAME:  "+n3_1+"  AGE: "+a3_1);
                    t3.setText(d3);
                    cursor--;
                }
            }
            else{
                l3.setText("CONTINUE FLYING WITH US TO TRACK YOUR JOURNEYS.");
            }

            Statement s5 = conn.createStatement();
            ResultSet set4 = s5.executeQuery("select * from "+user+" where journey ="+cursor+";");
            if(set4.next()){
                String n4_1 = set4.getString("name");
                int a4_1 = set4.getInt("age");
                String d4 = set4.getString("arr")+"   ->    "+set4.getString("dep");
                if(set4.next()){
                    String n4_2 = set4.getString("name");
                    int a4_2 = set4.getInt("age");
                    if(set4.next()){
                        String n4_3 = set4.getString("name");
                        int a4_3 = set4.getInt("age");
                        l4.setText("NAME:  "+n4_1+"  AGE: "+a4_1);
                        l41.setText("NAME: "+n4_2+"  AGE: "+a4_2);
                        l42.setText("NAME: "+n4_3+"  AGE: "+a4_3);
                        t4.setText(d4);
                        cursor--;
                    }
                    else{
                        l4.setText("NAME:  "+n4_1+"  AGE: "+a4_1);
                        l41.setText("NAME: "+n4_2+"  AGE: "+a4_2);
                        t4.setText(d4);
                        cursor--;
                    }
                }
                else{
                    l4.setText("NAME:  "+n4_1+"  AGE: "+a4_1);
                    t4.setText(d4);
                    cursor--;
                }
            }
            else{
                l4.setText("CONTINUE FLYING WITH US TO TRACK YOUR JOURNEYS.");
            }

            Statement s6 = conn.createStatement();
            ResultSet set5 = s6.executeQuery("select * from "+user+" where journey ="+cursor+";");
            if(set5.next()){
                String n5_1 = set5.getString("name");
                int a5_1 = set5.getInt("age");
                String d5 = set5.getString("arr")+"   ->    "+set5.getString("dep");
                if(set5.next()){
                    String n5_2 = set5.getString("name");
                    int a5_2 = set5.getInt("age");
                    if(set5.next()){
                        String n5_3 = set5.getString("name");
                        int a5_3 = set5.getInt("age");
                        l5.setText("NAME:  "+n5_1+"  AGE: "+a5_1);
                        l51.setText("NAME:  "+n5_2+"  AGE: "+a5_2);
                        l52.setText("NAME: "+n5_3+"  AGE: "+a5_3);
                        t5.setText(d5);
                        cursor--;
                    }
                    else{
                        l5.setText("NAME:  "+n5_1+"  AGE: "+a5_1);
                        l51.setText("NAME: "+n5_2+"  AGE: "+a5_2);
                        t5.setText(d5);
                        cursor--;
                    }
                }
                else{
                    l5.setText("NAME:  "+n5_1+"  AGE: "+a5_1);
                    t5.setText(d5);
                    cursor--;
                }
            }
            else{
                l5.setText("CONTINUE FLYING WITH US TO TRACK YOUR JOURNEYS.");
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println(e);
        }

        f11.add(l1);
        f11.add(l11);
        f11.add(l12);
        f11.add(l2);
        f11.add(l21);
        f11.add(l22);
        f11.add(l3);
        f11.add(l31);
        f11.add(l32);
        f11.add(l6);
        f11.add(l4);
        f11.add(l41);
        f11.add(l42);
        f11.add(l5);
        f11.add(l51);
        f11.add(l52);
        f11.add(t1);
        f11.add(t2);
        f11.add(t3);
        f11.add(t4);
        f11.add(t5);
        f11.setTitle("AIRLINE RESERVATION SYSTEM");
        f11.setSize(1920,1080);
        f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f11.setVisible(true);
    }
}

class final_window{
    final_window(String user, int no_of_passengers,String passenger_type,String arrival,String departure,String p1,String p2,String p3,String seat1,String seat2,String seat3){
        x.frame7 = new JFrame();
        Container c = x.frame7.getContentPane();
        c.setLayout(null);

        JLabel l1 = new JLabel("THANK YOU "+user+" FOR USING OUR SERVICES, WE HOPE YOUR EXPERIENCE WAS SEAMLESS.");
        l1.setBounds(2,10,1900,80);
        l1.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        JLabel l1e = new JLabel();
        l1e.setBounds(20,100,1000,20);

        JButton home = new JButton("HOME");
        home.setBounds(20,700,100,30);
        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = JOptionPane.showConfirmDialog(c,"ARE YOU SURE YOU WANT TO RETURN TO HOME PAGE?");
                if(a == 0){
                    x.frame1.setVisible(true);
                    x.frame7.setVisible(false);  
                }
                else if(a == 1){
                    l1e.setText("");
                }
                else{
                    l1e.setText("");
                }
            }
        });

        JLabel l2 = new JLabel("Your currently booked flight is as below");
        l2.setBounds(50,200,1000,40);
        l2.setFont(new Font("Bahnschrift", Font.BOLD, 35));

        JLabel l3 = new JLabel(arrival+"                                                             ->              ");
        l3.setBounds(50,300,1000,40);
        l3.setFont(new Font("Bahnschrift", Font.BOLD, 35));

        JLabel l4 = new JLabel(departure);
        l4.setBounds(800,300,1000,40);
        l4.setFont(new Font("Bahnschrift", Font.BOLD, 35));
        
        JLabel l5 = new JLabel("         No. of travellers: "+no_of_passengers);
        l5.setBounds(400,350,500,40);
        l5.setFont(new Font("Bahnschrift", Font.BOLD, 35));
        
        JLabel l6 = new JLabel("");
        l6.setBounds(200,400,200,40);
        l6.setFont(new Font("Bahnschrift", Font.BOLD, 25));
        
        JLabel l7 = new JLabel("");
        l7.setBounds(200,450,200,40);
        l7.setFont(new Font("Bahnschrift", Font.BOLD, 25));

        JLabel l8 = new JLabel("");
        l8.setBounds(200,500,200,40);
        l8.setFont(new Font("Bahnschrift", Font.BOLD, 25));

        JLabel l9 = new JLabel("");
        l9.setBounds(200,550,200,40);
        l9.setFont(new Font("Bahnschrift", Font.BOLD, 25));
        
        JLabel l10 = new JLabel(departure);
        l10.setBounds(600,400,200,40);
        l10.setFont(new Font("Bahnschrift", Font.BOLD, 25));

        JLabel l11 = new JLabel("");
        l11.setBounds(600,450,200,40);
        l11.setFont(new Font("Bahnschrift", Font.BOLD, 25));

        JLabel l12 = new JLabel("");
        l12.setBounds(600,500,200,40);
        l12.setFont(new Font("Bahnschrift", Font.BOLD, 25));
        
        JLabel l13 = new JLabel("");
        l13.setBounds(600,550,200,40);
        l13.setFont(new Font("Bahnschrift", Font.BOLD, 25));

        JLabel l14 = new JLabel("");
        l14.setBounds(600,600,200,40);
        l14.setFont(new Font("Bahnschrift", Font.BOLD, 25));

        if(no_of_passengers==1){
            l6.setText("Name: "+p1);
            l10.setText("Seat: "+seat1);
        }
        else{
            if(no_of_passengers==2){
                l6.setText("Name: "+p1);
                l10.setText("Seat: "+seat1);
                l7.setText("Name: "+p2);
                l11.setText("Seat: "+seat2);
            }
            else{
                if(no_of_passengers==3){
                    l6.setText("Name: "+p1);
                    l10.setText("Seat: "+seat1);
                    l7.setText("Name: "+p2);
                    l11.setText("Seat: "+seat2);
                    l8.setText("Name: "+p3);
                    l12.setText("Seat: "+seat3);
                }              
            }
        }

        JButton exit = new JButton("EXIT");
        exit.setBounds(20,750,90,30);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = JOptionPane.showConfirmDialog(c,"ARE YOU SURE YOU WANT TO EXIT?");
                if(a == 0){
                    System.exit(a);
                }
                else if(a == 1){
                    l1e.setText("");
                }
                else{
                    l1e.setText("");
                }
            }
        });

        x.frame7.add(exit);
        x.frame7.add(home);
        x.frame7.add(l1);
        x.frame7.add(l1e);
        x.frame7.add(l2);
        x.frame7.add(l3);
        x.frame7.add(l4);
        x.frame7.add(l5);
        x.frame7.add(l6);
        x.frame7.add(l7);
        x.frame7.add(l8);
        x.frame7.add(l9);
        x.frame7.add(l10);
        x.frame7.add(l11);
        x.frame7.add(l12);
        x.frame7.add(l13);
        x.frame7.add(l14);
        x.frame7.setTitle("AIRLINE RESERVATION SYSTEM.");
        x.frame7.setSize(1920,1080);
        x.frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.frame7.setVisible(true);
    }
}
class card{
    card(String user, int no_of_passengers,String passenger_type,String arrival,String departure,String p1,String p2,String p3,String seat1,String seat2,String seat3){
        JFrame frame1 = new JFrame();
        Container c = frame1.getContentPane();
        c.setLayout(null);

        JLabel l1 = new JLabel("Enter card details");
        l1.setBounds(20,20,300,20);

        JLabel l1e = new JLabel();
        l1e.setBounds(20,20,500,20);

        JButton home = new JButton("HOME");
        home.setBounds(20,700,100,30);
        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = JOptionPane.showConfirmDialog(c,"ARE YOU SURE YOU WANT TO RETURN TO HOME PAGE?");
                if(a == 0){
                    x.frame1.setVisible(true);
                    x.frame6.setVisible(false);  
                }
                else if(a == 1){
                    l1.setText("PLEASE PROCEED TO SELECT PAYMENT METHOD.");
                }
                else{
                    l1.setText("");
                }
            }
        });
        
        JLabel l2 = new JLabel("Card number");
        l2.setBounds(20,50,300,20);
        JTextArea a1 = new JTextArea();
        a1.setBounds(110,50,200,20);
        JLabel l3 = new JLabel("CVV");
        l3.setBounds(20,100,300,20);
        JTextArea a2 = new JTextArea();
        a2.setBounds(50,100,100,20);

        JCheckBox c1 = new JCheckBox();
        JLabel l12 = new JLabel("BY CLICKING THIS YOU ARE AGREEING TO A SUM OF "+x.fare+"Rs.");
        l12.setBounds(40,200,400,20);

        JButton b1 = new JButton("CONTINUE");
        b1.setBounds(120,230,140,20);
        c1.setBounds(10,200,20,20);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(a1.getText().length()!=16){
                    String s = "Please Enter a Valid Card Number";
                    JOptionPane.showMessageDialog(c,s, "Warning", 0, null);
                }
                else{
                    if(a2.getText().length()!=3){
                        String s = "Please Enter a valid CVV";
                        JOptionPane.showMessageDialog(c, s, "Warning", 0, null);
                    }
                    else{
                        if(c1.isSelected()==false){
                            String s = "Please agree to the payment of "+x.fare+"Rs.";
                            JOptionPane.showMessageDialog(c, s, "Warning", 0, null);
                        }
                        else{
                            new final_window(user, no_of_passengers,passenger_type,arrival,departure,p1,p2,p3,seat1,seat2,seat3);
                            frame1.setVisible(false);
                        }
                    }
                }
            }
        });

        frame1.add(b1);
        frame1.add(c1);
        frame1.add(l12);
        frame1.add(l1);
        frame1.add(l2);
        frame1.add(a1);
        frame1.add(l3);
        frame1.add(a2);
        frame1.setSize(450,300);
        frame1.setVisible(true);
    }
}

class payment_select{
    payment_select(String user, int no_of_passengers,String passenger_type,String arrival,String departure,String p1,String p2,String p3,String seat1,String seat2,String seat3){
        x.frame6 = new JFrame();
        Container c = x.frame6.getContentPane();
        c.setLayout(null);

        JLabel l1 = new JLabel();
        l1.setBounds(20,60,500,20);

        JButton home = new JButton("HOME");
        home.setBounds(20,700,100,30);
        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = JOptionPane.showConfirmDialog(c,"ARE YOU SURE YOU WANT TO RETURN TO HOME PAGE?");
                if(a == 0){
                    x.frame1.setVisible(true);
                    x.frame6.setVisible(false);  
                }
                else if(a == 1){
                    l1.setText("PLEASE PROCEED TO SELECT PAYMENT METHOD.");
                }
                else{
                    l1.setText("");
                }
            }
        });

        JLabel l2 = new JLabel("PLEASE SELECT METHOD OF PAYMENT");
        l2.setBounds(20,20,500,20);

        JLabel l3 = new JLabel("UPI");
        l3.setBounds(20,220,500,20);
        JLabel l4 = new JLabel("NET BANKING");
        l4.setBounds(20,250,500,20);

        JRadioButton rb1 = new JRadioButton();
        rb1.setBounds(200,220,20,20);
        JRadioButton rb2 = new JRadioButton();
        rb2.setBounds(200,250,20,20);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        x.ar = new JLabel();
        x.ar.setBounds(0,0,1330,1600);
        x.frame6.add(x.ar);

        JLabel lend = new JLabel();
        lend.setBounds(800,600,450,20);

        rb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ImageIcon i = new ImageIcon("qr (2).jpg");
                    Image img = i.getImage();
                    BufferedImage bi = new BufferedImage(1500,1500,BufferedImage.TYPE_INT_ARGB);
                    Graphics g = bi.createGraphics();
                    g.drawImage(img,800,100,400,400,null);
                    ImageIcon newic = new ImageIcon(bi);
                    x.ar.setIcon(newic);
                    lend.setText("SCAN THIS QR CODE AND COMPLETE THE PAYMENT OF "+x.fare+" Rs. and CLICK NEXT");
            }
        });

        JButton bt = new JButton("NEXT");
        bt.setBounds(1000,700,100,30);
        x.frame6.add(bt);

        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new final_window(user, no_of_passengers,passenger_type,arrival,departure,p1,p2,p3,seat1,seat2,seat3);
                x.frame6.setVisible(false);
            }
        });

        rb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                new card(user,no_of_passengers,passenger_type,arrival,departure,p1,p2,p3,seat1,seat2,seat3);
            }
        });
        
        x.frame6.add(rb1);
        x.frame6.add(rb2);
        x.frame6.add(home);
        x.frame6.add(l1);
        x.frame6.add(lend);
        x.frame6.add(l2);
        x.frame6.add(l3);
        x.frame6.add(l4);
        x.frame6.add(rb1);
        x.frame6.add(rb2);
        x.frame6.setTitle("AIRLINE RESERVATION SYSTEM");
        x.frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.frame6.setSize(1920,1080);
        x.frame6.setVisible(true);
    }
}
class seat_select{
    seat_select(String user, int no_of_passengers,String passenger_type,String arrival,String departure,String p1,String p2,String p3){
        x.frame5 = new JFrame();
        Container c = x.frame5.getContentPane();
        c.setLayout(null);

        JLabel l1 = new JLabel();
        l1.setBounds(20,20,500,20);

        JLabel l2 = new JLabel("PLEASE SELECT THE SEATS");
        l2.setBounds(100,50,500,20);
        l2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JButton home = new JButton("HOME");
        home.setBounds(20,700,100,30);
        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = JOptionPane.showConfirmDialog(c,"ARE YOU SURE YOU WANT TO RETURN TO HOME PAGE?");
                if(a == 0){
                    x.frame1.setVisible(true);
                    x.frame5.setVisible(false);  
                }
                else if(a == 1){
                    l1.setText("PLEASE PROCEED TO SELECT SEAT(S).");
                }
                else{
                    l1.setText("");
                }
            }
        });

        x.i = 0;

        JTextArea a1 = new JTextArea();
        a1.setBounds(1200,150,100,30);
        a1.setEditable(false);

        JTextArea a2 = new JTextArea();
        a2.setBounds(1200,200,100,30);
        a2.setEditable(false);
        x.frame5.add(a2);

        JTextArea a3 = new JTextArea();
        a3.setBounds(1200,250,100,30);
        a3.setEditable(false);
        x.frame5.add(a3);

        JCheckBox[] cba = new JCheckBox[60];
        for(int i=0;i<60;i++){
            cba[i] = new JCheckBox("S"+(i+1));
        }
        if(no_of_passengers==1){
            x.i1=0;
            for(x.i1=0;x.i1<60;x.i1++){
                cba[x.i1].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent er){
                        int cur = 0;
                        for(x.i1=0;x.i1<60;x.i1++){
                            if(cba[x.i1].isSelected()){
                                x.i++;
                                cur=x.i1;
                                if(x.i==1){
                                    for(int k=0;k<60;k++){
                                        if(k!=cur){
                                            cba[k].setEnabled(false);
                                        }
                                    }
                                    a1.setText(cba[x.i1].getText());
                                }
                            }
                        }
                    }
                });
            }
            JButton b11 = new JButton("CLEAR SELECTION");
            b11.setBounds(20,300,300,20);
            b11.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e1){
                    for(int l = 0;l<60;l++){
                        cba[l].setSelected(false);;
                        cba[l].setEnabled(true);
                        a1.setText("");
                        x.i=0;
                    }
                }
            });
            x.frame5.add(b11);
        }
        if(no_of_passengers==2){
            x.i1=0;
            x.chk = new int[2];
            for(x.i1=0;x.i1<60;x.i1++){
                cba[x.i1].addActionListener(new ActionListener(){
                    int d=0;
                    public void actionPerformed(ActionEvent e3){
                        for(x.i1=0;x.i1<60;x.i1++){
                            if(cba[x.i1].isSelected()){
                                x.chk[d]=(x.i1+1);
                                d++;
                            }
                            if(d==2){
                                for(x.i1=0;x.i1<60;x.i1++){
                                    cba[x.i1].setEnabled(false);
                                }
                            }
                        }
                        a1.setText("S"+x.chk[0]);
                        a2.setText("S"+x.chk[1]);;
                    }
                });
            }
            JButton b11 = new JButton("CLEAR SELECTION");
            b11.setBounds(20,300,300,20);
            b11.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e1){
                    for(int l = 0;l<60;l++){
                        cba[l].setSelected(false);;
                        cba[l].setEnabled(true);
                        a1.setText("");
                        a2.setText("");
                        x.i=0;
                    }
                }
            });
            x.frame5.add(b11);
        }
        if(no_of_passengers==3){
            x.i1=0;
            x.chk = new int[3];
            for(x.i1=0;x.i1<60;x.i1++){
                cba[x.i1].addActionListener(new ActionListener(){
                    int d=0;
                    public void actionPerformed(ActionEvent e3){
                        for(x.i1=0;x.i1<60;x.i1++){
                            if(cba[x.i1].isSelected()){
                                x.chk[d]=(x.i1+1);
                                d++;
                            }
                            if(d==3){
                                for(x.i1=0;x.i1<60;x.i1++){
                                    cba[x.i1].setEnabled(false);
                                }
                            }
                        }
                        a1.setText("S"+x.chk[0]);
                        a2.setText("S"+x.chk[1]);
                        a3.setText("S"+x.chk[2]);
                    }
                });
            }
            JButton b11 = new JButton("CLEAR SELECTION");
            b11.setBounds(20,300,300,20);
            b11.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e1){
                    for(int l = 0;l<60;l++){
                        cba[l].setSelected(false);;
                        cba[l].setEnabled(true);
                        a1.setText("");
                        a2.setText("");
                        a3.setText("");
                        x.i=0;
                    }
                }
            });
            x.frame5.add(b11);
        }
        String DB_URL = "jdbc:mysql://localhost:3306/";
        String USER = "root";
        String PASS = "Aakashisgood@123";

        JLabel lerror = new JLabel();
        lerror.setBounds(600,20,1000,20);

        JButton cnf = new JButton("CONFIRM");
        cnf.setBounds(1200,500,100,20);
        cnf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){
                int a = JOptionPane.showConfirmDialog(c,"PLEASE CHECK THE SEATS, THEY CAN'T BE UNCHANGED.");
                char aa = '"';
                if(a==0){
                    if(no_of_passengers==1){
                        if(a1.getText().equals("S0")){
                            l1.setText("PLEASE SELECT SEATS");
                            lerror.setForeground(Color.red);
                        }
                        else{
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement s1 = conn.createStatement();
                                s1.executeUpdate("use air;");
                                int flag = 0;
                                int cnt=1;
                                Statement s2 = conn.createStatement();
                                ResultSet r1 = s2.executeQuery("show tables;");
                                while(r1.next()){
                                    if(r1.getString("Tables_in_air").equals(user+"_seats")){
                                        flag = 1;
                                    }
                                }
                                String se1 = a1.getText();    
                                String se2 = a2.getText();
                                String se3 = a3.getText();
                                if(flag==0){
                                    Statement s5 = conn.createStatement();
                                    s5.executeUpdate("create table "+user+"_seats(name char(100),seat varchar(10),journey int);");
                                    Statement s6 = conn.createStatement();
                                    s6.executeUpdate("insert into "+user+"_seats values("+aa+p1+aa+","+aa+a1.getText()+aa+","+1+");");
                                    new payment_select(user, no_of_passengers, passenger_type, arrival, departure, p1, p2, p3,se1,se2,se3);
                                    x.frame5.setVisible(false);
                                }
                                else{
                                    Statement s5 = conn.createStatement();
                                    ResultSet r2 = s5.executeQuery("select journey from "+user+"_seats;");
                                    while(r2.next()){
                                        if(r2.getInt("journey")==cnt){
                                            cnt++;
                                        }
                                    }
                                    Statement s6 = conn.createStatement();
                                    s6.executeUpdate("insert into "+user+"_seats values("+aa+p1+aa+","+aa+a1.getText()+aa+","+cnt+");");
                                    new payment_select(user, no_of_passengers, passenger_type, arrival, departure, p1, p2, p3,se1,se2,se3);
                                    x.frame5.setVisible(false);
                                }
                            }catch(SQLException e){
                                e.printStackTrace();
                                System.out.println(e);
                            }
                        }
                    }
                    else if(no_of_passengers==2){
                        if(a1.getText().equals("S0")||a2.getText().equals("S0")){
                            l1.setText("PLEASE SELECT SEATS.");
                        }
                        else{
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement s1 = conn.createStatement();
                                s1.executeUpdate("use air;");
                                int flag = 0;
                                int cnt=1;
                                Statement s2 = conn.createStatement();
                                ResultSet r1 = s2.executeQuery("show tables;");
                                while(r1.next()){
                                    if(r1.getString("Tables_in_air").equals(user+"_seats")){
                                        flag = 1;
                                    }
                                }
                                String se1 = a1.getText();    
                                String se2 = a2.getText();
                                String se3 = a3.getText();
                                if(flag==0){
                                    Statement s5 = conn.createStatement();
                                    s5.executeUpdate("create table "+user+"_seats(name char(100),seat varchar(10),journey int);");
                                    Statement s6 = conn.createStatement();
                                    s6.executeUpdate("insert into "+user+"_seats values("+aa+p1+aa+","+aa+a1.getText()+aa+","+1+");");
                                    Statement s7 = conn.createStatement();
                                    s7.executeUpdate("insert into "+user+"_seats values("+aa+p2+aa+","+aa+a2.getText()+aa+","+1+");");
                                    new payment_select(user, no_of_passengers, passenger_type, arrival, departure, p1, p2, p3,se1,se2,se3);
                                    x.frame5.setVisible(false);
                                }
                                else{
                                    Statement s5 = conn.createStatement();
                                    ResultSet r2 = s5.executeQuery("select journey from "+user+"_seats;");
                                    while(r2.next()){
                                        if(r2.getInt("journey")==cnt){
                                            cnt++;
                                        }
                                    }
                                    Statement s6 = conn.createStatement();
                                    s6.executeUpdate("insert into "+user+"_seats values("+aa+p1+aa+","+aa+a1.getText()+aa+","+cnt+");");
                                    Statement s7 = conn.createStatement();
                                    s7.executeUpdate("insert into "+user+"_seats values("+aa+p2+aa+","+aa+a2.getText()+aa+","+cnt+");");
                                    new payment_select(user, no_of_passengers, passenger_type, arrival, departure, p1, p2, p3,se1,se2,se3);
                                    x.frame5.setVisible(false);
                                }
                            }catch(SQLException e){
                                e.printStackTrace();
                                System.out.println(e);
                            }
                        }
                    }
                    else{
                        if(a1.getText().equals("S0")||a2.getText().equals("S0")||a3.getText().equals("S0")){
                            l1.setText("PLEASE SELECT SEATS.");
                        }
                        else{
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement s1 = conn.createStatement();
                                s1.executeUpdate("use air;");
                                int flag = 0;
                                int cnt=1;
                                Statement s2 = conn.createStatement();
                                ResultSet r1 = s2.executeQuery("show tables;");
                                while(r1.next()){
                                    if(r1.getString("Tables_in_air").equals(user+"_seats")){
                                        flag = 1;
                                    }
                                }
                                String se1 = a1.getText();    
                                String se2 = a2.getText();
                                String se3 = a3.getText();
                                if(flag==0){
                                    Statement s5 = conn.createStatement();
                                    s5.executeUpdate("create table "+user+"_seats(name char(100),seat varchar(10),journey int);");
                                    Statement s6 = conn.createStatement();
                                    s6.executeUpdate("insert into "+user+"_seats values("+aa+p1+aa+","+aa+a1.getText()+aa+","+1+");");
                                    Statement s7 = conn.createStatement();
                                    s7.executeUpdate("insert into "+user+"_seats values("+aa+p2+aa+","+aa+a2.getText()+aa+","+1+");");
                                    Statement s8 = conn.createStatement();
                                    s8.executeUpdate("insert into "+user+"_seats values("+aa+p3+aa+","+aa+a3.getText()+aa+","+1+");");
                                    new payment_select(user, no_of_passengers, passenger_type, arrival, departure, p1, p2, p3,se1,se2,se3);
                                    x.frame5.setVisible(false);
                                }
                                else{
                                    Statement s5 = conn.createStatement();
                                    ResultSet r2 = s5.executeQuery("select journey from "+user+"_seats;");
                                    while(r2.next()){
                                        if(r2.getInt("journey")==cnt){
                                            cnt++;
                                        }
                                    }
                                    Statement s6 = conn.createStatement();
                                    s6.executeUpdate("insert into "+user+"_seats values("+aa+p1+aa+","+aa+a1.getText()+aa+","+cnt+");");
                                    Statement s7 = conn.createStatement();
                                    s7.executeUpdate("insert into "+user+"_seats values("+aa+p2+aa+","+aa+a2.getText()+aa+","+cnt+");");
                                    Statement s8 = conn.createStatement();
                                    s8.executeUpdate("insert into "+user+"_seats values("+aa+p3+aa+","+aa+a3.getText()+aa+","+cnt+");");
                                    new payment_select(user, no_of_passengers, passenger_type, arrival, departure, p1, p2, p3,se1,se2,se3);
                                    x.frame5.setVisible(false);
                                }
                            }catch(SQLException e){
                                e.printStackTrace();
                                System.out.println(e);
                            }
                        }
                    }
                }
                else if(a==1){
                    lerror.setText("PLEASE SELECT AND CONFIRM SEATS.");
                }
                else{
                    lerror.setText("");
                }
            }
        });
        x.frame5.add(cnf);
        int n=0;
        int x1 = 400;
        for(int j=0;j<6;j++){
            int y1 = 150;
            for(int k=0;k<10;k++){   
                cba[n].setBounds(x1,y1,48,25);
                x.frame5.add(cba[n]);
                y1+=50;
                n++;
            }
            x1+=100;
        }
        x.i=0;

        JLabel pas1 = new JLabel();
        pas1.setBounds(1100,150,300,30);
        JLabel pas2 = new JLabel();
        pas2.setBounds(1100,200,300,30);
        JLabel pas3 = new JLabel();
        pas3.setBounds(1100,250,300,30);
        if(no_of_passengers==1){
            pas1.setText(p1);
        }
        else{
            if(no_of_passengers==2){
                pas1.setText(p1);
                pas2.setText(p2);
            }
            else{
                if(no_of_passengers==3){
                    pas1.setText(p1);
                    pas2.setText(p2);
                    pas3.setText(p3);
                }
            }
        }
        
        x.frame5.add(l1);
        x.frame5.add(a1);
        x.frame5.add(l2);
        x.frame5.add(home);
        x.frame5.add(pas1);
        x.frame5.add(pas2);
        x.frame5.add(pas3);
        x.frame5.setTitle("AIRLINE RESERVATION SYSTEM");
        x.frame5.setSize(1920,1080);
        x.frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.frame5.setVisible(true);
    }
}

class flight_select{
    flight_select(String user, int no_of_passengers,String passenger_type,String arrival,String departure,String p1,String p2,String p3){
        x.frame4 = new JFrame();
        Container c = x.frame4.getContentPane();
        c.setLayout(null);

        String DB_URL = "jdbc:mysql://localhost:3306/";
        String USER = "root";
        String PASS = "Aakashisgood@123";

        JLabel l1 = new JLabel();
        l1.setBounds(20,20,500,20);

        JButton home = new JButton("HOME");
        home.setBounds(20,700,100,30);
        x.frame4.add(home);
        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = JOptionPane.showConfirmDialog(c,"ARE YOU SURE YOU WANT TO RETURN TO HOME PAGE?");
                if(a == 0){
                    x.frame1.setVisible(true);
                    x.frame4.setVisible(false);    
                }
                else if(a == 1){
                    l1.setText("PLEASE PROCEED TO SELECT FLIGHT");
                }
                else{
                    l1.setText("");
                }
            }
        });

        JLabel l2 = new JLabel("PLEASE SELECT FROM THE FOLLOWING FLIGHTS");
        l2.setBounds(100,120,1000,30);
        l2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l3 = new JLabel("X7 3495             0800                1200                5600");
        l3.setBounds(50,190,1000,60);
        l3.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        JLabel l4 = new JLabel("4R 564               1000                1300                4000");
        l4.setBounds(50,260,1000,60);
        l4.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        JLabel l5 = new JLabel("1A 908                1500                2000                9000");
        l5.setBounds(50,330,1000,60);
        l5.setFont(new Font("Bahnschrift", Font.BOLD, 30));
        
        JLabel l6 = new JLabel("U9 1111                1100                  1800                19000");
        l6.setBounds(50,400,1000,60);
        l6.setFont(new Font("Bahnschrift", Font.BOLD, 30));
        
        JLabel l7 = new JLabel("9G 711                 1350                1550                  8000");
        l7.setBounds(50,470,1000,60);
        l7.setFont(new Font("Bahnschrift", Font.BOLD, 30));
        
        JLabel l8 = new JLabel("6E 4195               1650                2350               23000");
        l8.setBounds(50,540,1000,60);
        l8.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        JLabel l9 = new JLabel("V7 2195                1250                1750                10000");
        l9.setBounds(50,610,1000,60);
        l9.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        JRadioButton rb1 = new JRadioButton();
        rb1.setBounds(750,210,20,20);

        JRadioButton rb2 = new JRadioButton();
        rb2.setBounds(750,280,20,20);

        JRadioButton rb3 = new JRadioButton();
        rb3.setBounds(750,350,20,20);

        JRadioButton rb4 = new JRadioButton();
        rb4.setBounds(750,420,20,20);

        JRadioButton rb5 = new JRadioButton();
        rb5.setBounds(750,490,20,20);

        JRadioButton rb6 = new JRadioButton();
        rb6.setBounds(750,560,20,20);

        JRadioButton rb7 = new JRadioButton();
        rb7.setBounds(750,630,20,20);

        ButtonGroup b1 = new ButtonGroup();

        JTextArea ar1 = new JTextArea();
        ar1.setBounds(800,300,200,70);
        ar1.setEditable(false);
        ar1.setFont(new Font("Bahnschrift", Font.BOLD, 50));

        rb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                x.f="X7 3495";
                x.fare = 5600;
                if(passenger_type.equalsIgnoreCase("doctor")){
                    x.fare = x.fare-(0.1*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                    else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            x.fare = x.fare-(0.10*x.fare);
                        }
                        else{
                            if(passenger_type.equalsIgnoreCase("vaccinated")){
                                x.fare = x.fare-(0.15*x.fare);
                            }
                        }
                    }
                }
                ar1.setText(String.valueOf(x.fare));
            }
        });

        rb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                x.f="4R 564";
                x.fare = 4000;
                if(passenger_type.equalsIgnoreCase("doctor")){
                    x.fare = x.fare-(0.1*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                    else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            x.fare = x.fare-(0.10*x.fare);
                        }
                        else{
                            if(passenger_type.equalsIgnoreCase("vaccinated")){
                                x.fare = x.fare-(0.15*x.fare);
                            }
                        }
                    }
                }
                ar1.setText(String.valueOf(x.fare));
            }
        });

        rb3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                x.f = "1A 908";
                x.fare = 9000;
                if(passenger_type.equalsIgnoreCase("doctor")){
                    x.fare = x.fare-(0.1*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                    else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            x.fare = x.fare-(0.10*x.fare);
                        }
                        else{
                            if(passenger_type.equalsIgnoreCase("vaccinated")){
                                x.fare = x.fare-(0.15*x.fare);
                            }
                        }
                    }
                }
                ar1.setText(String.valueOf(x.fare));
            }
        });

        rb4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                
                x.f = "U9 1111";
                x.fare = 19000;
                if(passenger_type.equalsIgnoreCase("doctor")){
                    x.fare = x.fare-(0.1*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                    else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            x.fare = x.fare-(0.10*x.fare);
                        }
                        else{
                            if(passenger_type.equalsIgnoreCase("vaccinated")){
                                x.fare = x.fare-(0.15*x.fare);
                            }
                        }
                    }
                }
                ar1.setText(String.valueOf(x.fare));
            }
        });

        rb5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                
                x.f = "9G 711";
                x.fare = 8000;
                if(passenger_type.equalsIgnoreCase("doctor")){
                    x.fare = x.fare-(0.1*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                    else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            x.fare = x.fare-(0.10*x.fare);
                        }
                        else{
                            if(passenger_type.equalsIgnoreCase("vaccinated")){
                                x.fare = x.fare-(0.15*x.fare);
                            }
                        }
                    }
                }
                ar1.setText(String.valueOf(x.fare));
            }
        });

        rb6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                
                x.f = "6E 4195";
                x.fare = 23000;
                if(passenger_type.equalsIgnoreCase("doctor")){
                    x.fare = x.fare-(0.1*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                    else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            x.fare = x.fare-(0.10*x.fare);
                        }
                        else{
                            if(passenger_type.equalsIgnoreCase("vaccinated")){
                                x.fare = x.fare-(0.15*x.fare);
                            }
                        }
                    }
                }
                ar1.setText(String.valueOf(x.fare));
            }
        });

        rb7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                
                x.f = "V7 2195";
                x.fare = 10000;
                if(passenger_type.equalsIgnoreCase("doctor")){
                    x.fare = x.fare-(0.1*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                    else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            x.fare = x.fare-(0.10*x.fare);
                        }
                        else{
                            if(passenger_type.equalsIgnoreCase("vaccinated")){
                                x.fare = x.fare-(0.15*x.fare);
                            }
                        }
                    }
                }
                ar1.setText(String.valueOf(x.fare));
            }
        });

        JLabel total = new JLabel("TOTAL AMOUNT TO BE PAID:-");
        total.setBounds(800,250,500,60);
        total.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        JLabel lerror = new JLabel("");
        lerror.setBounds(800,150,500,60);
        lerror.setFont(new Font("Bahnschrift", Font.BOLD, 30));

        JButton nxt = new JButton("PROCEED");
        nxt.setBounds(800,400,300,50);
        nxt.setFont(new Font("Bahnschrift", Font.BOLD, 30));
        if(passenger_type.equalsIgnoreCase("doctor")){
            x.fare = x.fare-(0.1*x.fare);
        }
        else{
            if(passenger_type.equalsIgnoreCase("army")){
                x.fare = x.fare-(0.15*x.fare);
            }
            else{
                if(passenger_type.equalsIgnoreCase("family")){
                    x.fare = x.fare-(0.10*x.fare);
                }
                else{
                    if(passenger_type.equalsIgnoreCase("vaccinated")){
                        x.fare = x.fare-(0.15*x.fare);
                    }
                }
            }
        }

        nxt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int flag = 0;
                int i=1;
                char a1= '"';
                if(ar1.getText().equals("")){
                    lerror.setText("PLEASE SELECT FLIGHT BEFORE PROCEEDING");
                }
                else{
                    int a = JOptionPane.showConfirmDialog(c,"ARE YOU SURE THE SELECTED FLIGHT IS CORRECT?");
                    if(a==0){
                        if(no_of_passengers==1){
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement s1 = conn.createStatement();
                                s1.executeUpdate("use air;");

                                Statement s3 = conn.createStatement();
                                ResultSet set1 = s3.executeQuery("show tables;");
                                while(set1.next()){
                                    if(set1.getString("Tables_in_air").equals(user+"_flights")){
                                        flag = 1;
                                    }
                                }
                                if(flag==0){
                                    int a11 = JOptionPane.showConfirmDialog(c,"THIS ACTION CAN'T BE UNDONE");
                                    if(a11==0){
                                        Statement s2 = conn.createStatement();
                                        s2.executeUpdate("create table "+user+"_flights(name char(200),flight char(10),fare int,jouerney int);");
                                        Statement s4 = conn.createStatement();
                                        s4.executeUpdate("insert into "+user+"_flights values("+a1+p1+a1+","+a1+x.f+a1+","+x.fare+","+1+");");
                                        x.frame4.setVisible(false);
                                        new seat_select(user,no_of_passengers,passenger_type,arrival,departure,p1,p2,p3);
                                    }
                                    else if(a11==1){
                                        lerror.setForeground(Color.magenta);
                                        lerror.setText("PLEASE CONFIRM THE DEATILS AND PROCEED AGAIN.");
                                    }
                                    else{
                                        lerror.setText("");
                                    }
                                }
                                else{
                                    int a11 = JOptionPane.showConfirmDialog(c,"THIS ACTION CAN'T BE UNDONE");
                                    if(a11==0){
                                        Statement s5 = conn.createStatement();
                                        ResultSet set = s5.executeQuery("select journey from "+user+"_flights;");
                                        while(set.next()){
                                            if(set.getInt("journey")==i){
                                                i++;
                                            }
                                        }
                                        Statement s6 = conn.createStatement();
                                        s6.executeUpdate("insert into "+user+"_flights values("+a1+p1+a1+","+a1+x.f+a1+","+x.fare+","+i+");");
                                        x.frame4.setVisible(false);
                                        new seat_select(user,no_of_passengers,passenger_type,arrival,departure,p1,p2,p3);
                                    }
                                    else if(a11==1){
                                        lerror.setForeground(Color.magenta);
                                        lerror.setText("PLEASE CONFIRM THE DEATILS AND PROCEED AGAIN.");
                                    }
                                    else{
                                        lerror.setText("");
                                    }
                                }
                            }catch(SQLException e123){
                                System.out.println(e123);
                            }
                        }
                        else if(no_of_passengers==2){
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement s1 = conn.createStatement();
                                s1.executeUpdate("use air;");

                                Statement s3 = conn.createStatement();
                                ResultSet set1 = s3.executeQuery("show tables;");
                                while(set1.next()){
                                    if(set1.getString("Tables_in_air").equals(user+"_flights")){
                                        flag = 1;
                                    }
                                }
                                if(flag==0){
                                    int a11 = JOptionPane.showConfirmDialog(c,"THIS ACTION CAN'T BE UNDONE");
                                    if(a11==0){
                                        Statement s2 = conn.createStatement();
                                        s2.executeUpdate("create table "+user+"_flights(name char(200),flight char(10),fare int,jouerney int);");
                                        Statement s4 = conn.createStatement();
                                        s4.executeUpdate("insert into "+user+"_flights values("+a1+p1+a1+","+a1+x.f+a1+","+x.fare+","+1+");");
                                        Statement s5 = conn.createStatement();
                                        s5.executeUpdate("insert into "+user+"_flights values("+a1+p2+a1+","+a1+x.f+a1+","+x.fare+","+1+");");
                                        x.frame4.setVisible(false);
                                        new seat_select(user,no_of_passengers,passenger_type,arrival,departure,p1,p2,p3);
                                    }
                                    else if(a11==1){
                                        lerror.setForeground(Color.magenta);
                                        lerror.setText("PLEASE CONFIRM THE DEATILS AND PROCEED AGAIN.");
                                    }
                                    else{
                                        lerror.setText("");
                                    }
                                }
                                else{
                                    int a11 = JOptionPane.showConfirmDialog(c,"THIS ACTION CAN'T BE UNDONE");
                                    if(a11==0){
                                        Statement s5 = conn.createStatement();
                                        ResultSet set = s5.executeQuery("select journey from "+user+"_flights;");
                                        while(set.next()){
                                            if(set.getInt("journey")==i){
                                                i++;
                                            }
                                        }
                                        Statement s4 = conn.createStatement();
                                        s4.executeUpdate("insert into "+user+"_flights values("+a1+p1+a1+","+a1+x.f+a1+","+x.fare+","+i+");");
                                        Statement s6 = conn.createStatement();
                                        s6.executeUpdate("insert into "+user+"_flights values("+a1+p2+a1+","+a1+x.f+a1+","+x.fare+","+i+");");
                                        x.frame4.setVisible(false);
                                        new seat_select(user,no_of_passengers,passenger_type,arrival,departure,p1,p2,p3);
                                    }
                                    else if(a11==1){
                                        lerror.setForeground(Color.magenta);
                                        lerror.setText("PLEASE CONFIRM THE DEATILS AND PROCEED AGAIN.");
                                    }
                                    else{
                                        lerror.setText("");
                                    }
                                }
                            }catch(SQLException e123){
                                System.out.println(e123);
                            }
                        }
                        else{
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement s1 = conn.createStatement();
                                s1.executeUpdate("use air;");

                                Statement s3 = conn.createStatement();
                                ResultSet set1 = s3.executeQuery("show tables;");
                                while(set1.next()){
                                    if(set1.getString("Tables_in_air").equals(user+"_flights")){
                                        flag = 1;
                                    }
                                }
                                if(flag==0){
                                    int a11 = JOptionPane.showConfirmDialog(c,"THIS ACTION CAN'T BE UNDONE");
                                    if(a11==0){
                                        Statement s2 = conn.createStatement();
                                        s2.executeUpdate("create table "+user+"_flights(name char(200),flight char(10),fare int,jouerney int);");
                                        Statement s4 = conn.createStatement();
                                        s4.executeUpdate("insert into "+user+"_flights values("+a1+p1+a1+","+a1+x.f+a1+","+x.fare+","+1+");");
                                        Statement s5 = conn.createStatement();
                                        s5.executeUpdate("insert into "+user+"_flights values("+a1+p2+a1+","+a1+x.f+a1+","+x.fare+","+1+");");
                                        Statement s6 = conn.createStatement();
                                        s6.executeUpdate("insert into "+user+"_flights values("+a1+p3+a1+","+a1+x.f+a1+","+x.fare+","+1+");");
                                        x.frame4.setVisible(false);
                                        new seat_select(user,no_of_passengers,passenger_type,arrival,departure,p1,p2,p3);
                                    }
                                    else if(a11==1){
                                        lerror.setForeground(Color.magenta);
                                        lerror.setText("PLEASE CONFIRM THE DEATILS AND PROCEED AGAIN.");
                                    }
                                    else{
                                        lerror.setText("");
                                    }
                                }
                                else{
                                    int a11 = JOptionPane.showConfirmDialog(c,"THIS ACTION CAN'T BE UNDONE");
                                    if(a11==0){
                                        Statement s5 = conn.createStatement();
                                        ResultSet set = s5.executeQuery("select journey from "+user+"_flights;");
                                        while(set.next()){
                                            if(set.getInt("journey")==i){
                                                i++;
                                            }
                                        }
                                        Statement s4 = conn.createStatement();
                                        s4.executeUpdate("insert into "+user+"_flights values("+a1+p1+a1+","+a1+x.f+a1+","+x.fare+","+i+");");
                                        Statement s6 = conn.createStatement();
                                        s6.executeUpdate("insert into "+user+"_flights values("+a1+p2+a1+","+a1+x.f+a1+","+x.fare+","+i+");");
                                        Statement s7 = conn.createStatement();
                                        s7.executeUpdate("insert into "+user+"_flights values("+a1+p3+a1+","+a1+x.f+a1+","+x.fare+","+i+");");
                                        x.frame4.setVisible(false);
                                        new seat_select(user,no_of_passengers,passenger_type,arrival,departure,p1,p2,p3);
                                    }
                                    else if(a11==1){
                                        lerror.setForeground(Color.magenta);
                                        lerror.setText("PLEASE CONFIRM THE DEATILS AND PROCEED AGAIN.");
                                    }
                                    else{
                                        lerror.setText("");
                                    }
                                }
                            }catch(SQLException e123){
                                System.out.println(e123);
                            }
                        }
                    }
                }
            }
        });
        
        b1.add(rb1);
        b1.add(rb2);
        b1.add(rb3);
        b1.add(rb4);
        b1.add(rb5);
        b1.add(rb6);
        b1.add(rb7);
        
        x.frame4.add(lerror);
        x.frame4.add(nxt);
        x.frame4.add(ar1);
        x.frame4.add(l3);
        x.frame4.add(rb1);
        x.frame4.add(rb2);
        x.frame4.add(rb3);
        x.frame4.add(rb4);
        x.frame4.add(rb5);
        x.frame4.add(rb6);
        x.frame4.add(rb7);
        x.frame4.add(l4);
        x.frame4.add(l5);
        x.frame4.add(l6);
        x.frame4.add(l7);
        x.frame4.add(l8);
        x.frame4.add(l9);
        x.frame4.add(l2);
        x.frame4.add(l1);
        x.frame4.add(total);
        x.frame4.setSize(1920,1080);
        x.frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.frame4.setVisible(true);
    }
}

class details_page{
        details_page(String user, int no_of_passengers,String passenger_type,String arrival,String departure){

            String DB_URL = "jdbc:mysql://localhost:3306/";
            String USER = "root";
            String PASS = "Aakashisgood@123";

            x.frame3 = new JFrame();
            Container c = x.frame3.getContentPane();
            c.setLayout(null);

            JLabel lerror = new JLabel();
            lerror.setBounds(20,20,1000,220);
            x.frame3.add(lerror);

            JButton back = new JButton("BACK");
            back.setBounds(20,700,70,30);
            back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    x.frame2.setVisible(true);
                    x.frame3.setVisible(false);
                }
            });
            x.frame3.add(back);

            JButton home = new JButton("HOME");
            home.setBounds(20,750,120,30);
            home.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    x.frame1.setVisible(true);
                    x.frame3.setVisible(false);
                }
            });
            x.frame3.add(home);

            JLabel type = new JLabel();
            type.setBounds(500,200,1000,30);
            if(passenger_type.equalsIgnoreCase("student")){
                type.setForeground(Color.pink);
                type.setText("STUDENTS CAN CARRY EXTRA LUGGAGE OF 15KGs.");
                type.setFont(new Font("Bahnschrift", Font.BOLD, 20));
            }else{
                if(passenger_type.equalsIgnoreCase("doctor")){
                    type.setForeground(Color.pink);
                    type.setText("DOCTORS CAN AVAIL A SPECIAL DISCOUNT OF 10% ON ALL DOMESTIC FLIGHTS.");
                    type.setFont(new Font("Bahnschrift", Font.BOLD, 20));
                }else{
                    if(passenger_type.equalsIgnoreCase("army")){
                        type.setForeground(Color.pink);
                        type.setText("DEFENSE AND ARMY MEMBERS CAN AVAIL A SPECIAL DISCOUNT OF 15% ALONG WITH EXTRA LUGGAGE WEIGHT LIMIT OF 15KGs");
                        type.setFont(new Font("Bahnschrift", Font.BOLD, 20));
                    }else{
                        if(passenger_type.equalsIgnoreCase("family")){
                            type.setForeground(Color.pink);
                            type.setText("FRIENDS AND FAMILY CAN AVAIL A SPECIAL DISCOUNT OF 10%.");
                            type.setFont(new Font("Bahnschrift", Font.BOLD, 20));                                
                        }else{
                            if(passenger_type.equalsIgnoreCase("VACCINATED")){
                                type.setForeground(Color.pink);
                                type.setText("VACCINATED CUSTOMERS CAN AVAIL UPTO 15% DISCOUNT ON ALL DOMESTIC FLIGHTS(T&Cs APPLY).");
                                type.setFont(new Font("Bahnschrift", Font.BOLD, 20));
                            }
                            else{
                                if(passenger_type.equalsIgnoreCase("regular")){
                                    type.setForeground(Color.pink);
                                    type.setText("THANK YOU FOR CHOOSING OUR AIRLINE, IT IS OUT PLEASURE TO SERVE YOU!");
                                    type.setFont(new Font("Bahnschrift", Font.BOLD, 20));
                                }
                            }
                        }
                    }
                }
            }
            x.frame3.add(type);

            JLabel l6 = new JLabel("PLEASE FILL IN ALL THE DETAILS OF TRAVELLING PASSENGERS.");
            l6.setBounds(10,280,700,20);
            l6.setFont(new Font("Bahnschrift", Font.BOLD, 20));
            x.frame3.add(l6);

            JButton proceed = new JButton("PROCEED");
            proceed.setBounds(500,700,200,25);
            proceed.setFont(new Font("Bahnschrift", Font.BOLD, 20));
            proceed.setVerticalAlignment(1);
            x.frame3.add(proceed);

            JLabel l1 = new JLabel("Welcome, "+user);
            l1.setBounds(20,20,500,40);
            l1.setFont(new Font("Eras Bold ITC", Font.BOLD, 35));
            x.frame3.add(l1);

            x.frame3.setTitle("AIRLINE RESERVATION SYSTEM");

            proceed.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(x.nametf1.getText().equals("")){
                        lerror.setText("PLEASE ENTER A NAME");
                        lerror.setForeground(Color.RED);
                    }
                    else{
                        if(x.agetf1.getText().equals("")||(Integer.valueOf(x.agetf1.getText())>100)){
                            lerror.setText("ENTER A VALID AGE");
                            lerror.setForeground(Color.RED);
                        }
                        else{
                            if(x.rb1.isSelected()==false && x.rb2.isSelected()==false){
                                lerror.setText("select gender");
                                lerror.setForeground(Color.RED);
                            }
                            else{
                                if(no_of_passengers==1){
                                    try{
                                        String gen;
                                        if(x.rb1.isSelected()){
                                            gen = "MALE";
                                        }
                                        else{
                                            gen = "FEMALE";
                                        }
                                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                        Statement stmt1 = conn.createStatement();
                                        stmt1.executeUpdate("use air;");
                                        char a = '"';
                                        int i = 1;
                                        int flag = 0;
            
                                        Statement stmt2 = conn.createStatement();
                                        String query = "show tables;";
                                        ResultSet r12 = stmt2.executeQuery(query);
                                        while(r12.next()){
                                            if(r12.getString("Tables_in_air").equals(user)){
                                                flag = 1;
                                            }
                                        }
                                        if(flag == 0){
                                            int a1 = JOptionPane.showConfirmDialog(c,"ARE THE ENTERED DETAILS CORRECT,CONFIRM THE DETAILS AS YOU CAN'T RETURN BACK TO THIS PAGE");
                                            if(a1==0){
                                                lerror.setText("not present");
                                                Statement stmt3 = conn.createStatement();
                                                stmt3.executeUpdate("create table "+user+" (name char(200),age int,gender char(50),dep char(200),arr char(200),journey int);");
                                                Statement stmt4 = conn.createStatement();
                                                stmt4.executeUpdate("insert into "+user+" values("+a+x.nametf1.getText()+a+","+Integer.valueOf(x.agetf1.getText())+","+a+gen+a+","+a+departure+a+","+a+arrival+a+","+1+");");
                                                new flight_select(user,no_of_passengers,passenger_type,arrival,departure,x.nametf1.getText(),"","");
                                            }
                                            else if(a1==1){
                                                lerror.setText("PLEASE CONFIRM THE DETAILS AND CLICK PROCEED AGAIN.");
                                            }
                                            else{
                                                lerror.setText("");
                                            }                                           
                                        }
                                        else{
                                            int a1 = JOptionPane.showConfirmDialog(c,"ARE THE ENTERED DETAILS CORRECT,CONFIRM THE DETAILS AS YOU CAN'T RETURN BACK TO THIS PAGE");
                                            if(a1==0){
                                                lerror.setText("present");
                                                Statement stmt6 = conn.createStatement();
                                                ResultSet r1 = stmt6.executeQuery("select journey from "+user+";");
                                                while(r1.next()){
                                                    if(r1.getInt("journey")==i){
                                                        i++;
                                                    }
                                                }
                                                Statement stmt5 = conn.createStatement();
                                                stmt5.executeUpdate("insert into "+user+" values("+a+x.nametf1.getText()+a+","+Integer.valueOf(x.agetf1.getText())+","+a+gen+a+","+a+departure+a+","+a+arrival+a+","+i+");");
                                                new flight_select(user,no_of_passengers,passenger_type,arrival,departure,x.nametf1.getText(),"","");
                                                x.frame3.setVisible(false);
                                                lerror.setText("insertion success");
                                            }
                                            else if(a1==1){
                                                lerror.setText("PLEASE CONFIRM THE DETAILS AND CLICK PROCEED AGAIN.");
                                            }
                                            else{
                                                lerror.setText("");
                                            }
                                        }
                                    }catch(SQLException e1){
                                        e1.printStackTrace();
                                        lerror.setText("ERROR "+user);
                                        lerror.setForeground(Color.RED);
                                    }
                                }
                                else{
                                    if(no_of_passengers==2){
                                        if(x.nametf1.getText().equals("")||x.nametf2.getText().equals("")){
                                            lerror.setText("PLEASE ENTER A NAME");
                                            lerror.setForeground(Color.RED);
                                        }
                                        else{
                                            if(x.agetf1.getText().equals("")||x.agetf2.getText().equals("")&&(Integer.valueOf(x.agetf1.getText())>100 ||Integer.valueOf(x.agetf2.getText())>100 )){
                                                lerror.setText("ENTER A VALID AGE");
                                                lerror.setForeground(Color.RED);
                                            }
                                            else{
                                                if(x.rb1.isSelected()==false && x.rb2.isSelected()==false || x.rb3.isSelected()==false && x.rb4.isSelected()==false ){
                                                    lerror.setText("SELECT GENDER");
                                                    lerror.setForeground(Color.RED);
                                                }
                                                else{
                                                    try{
                                                        String gen;
                                                        String gen1;
                                                        if(x.rb1.isSelected()){
                                                            gen = "MALE";
                                                        }
                                                        else{
                                                            gen = "FEMALE";
                                                        }
                                                        if(x.rb3.isSelected()){
                                                            gen1 = "MALE";
                                                        }
                                                        else{
                                                            gen1 = "FEMALE";
                                                        }

                                                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                                        Statement stmt1 = conn.createStatement();
                                                        stmt1.executeUpdate("use air;");
                                                        char a = '"';
                                                        int i = 1;
                                                        int flag = 0;
                            
                                                        Statement stmt2 = conn.createStatement();
                                                        String query = "show tables;";
                                                        ResultSet r12 = stmt2.executeQuery(query);

                                                        while(r12.next()){
                                                            if(r12.getString("Tables_in_air").equals(user)){
                                                                flag = 1;
                                                            }
                                                        }

                                                        if(flag == 0){
                                                            int a23 = JOptionPane.showConfirmDialog(c,"ARE THE ENTERED DETAILS CORRECT,CONFIRM THE DETAILS AS YOU CAN'T RETURN BACK TO THIS PAGE");
                                                            if(a23==0){
                                                                Statement stmt3 = conn.createStatement();
                                                                stmt3.executeUpdate("create table "+user+" (name char(200),age int,gender char(50),dep char(200),arr char(200),journey int);");
                                                                Statement stmt4 = conn.createStatement();
                                                                stmt4.executeUpdate("insert into "+user+" values("+a+x.nametf1.getText()+a+","+Integer.valueOf(x.agetf1.getText())+","+a+gen+a+","+a+departure+a+","+a+arrival+a+","+1+");");
                                                                Statement stmt5 = conn.createStatement();
                                                                stmt5.executeUpdate("insert into "+user+" values("+a+x.nametf2.getText()+a+","+Integer.valueOf(x.agetf2.getText())+","+a+gen1+a+","+a+departure+a+","+a+arrival+a+","+1+");");
                                                                new flight_select(user,no_of_passengers,passenger_type,arrival,departure,x.nametf1.getText(),x.nametf2.getText(),"");
                                                                x.frame3.setVisible(false);
                                                            }
                                                            else if(a23==1){
                                                                lerror.setText("PLEASE CONFIRM THE DETAILS AND CLICK PROCEED AGAIN.");
                                                            }
                                                            else{
                                                                lerror.setText("");
                                                            }
                                                        }
                                                        else{
                                                            int a23 = JOptionPane.showConfirmDialog(c,"ARE THE ENTERED DETAILS CORRECT,CONFIRM THE DETAILS AS YOU CAN'T RETURN BACK TO THIS PAGE");
                                                            if(a23==0){
                                                                Statement stmt6 = conn.createStatement();
                                                                ResultSet r1 = stmt6.executeQuery("select journey from "+user+";");
                                                                while(r1.next()){
                                                                    if(r1.getInt("journey")==i){
                                                                        i++;
                                                                    }
                                                                }
                                                                Statement stmt5 = conn.createStatement();
                                                                stmt5.executeUpdate("insert into "+user+" values("+a+x.nametf1.getText()+a+","+Integer.valueOf(x.agetf1.getText())+","+a+gen+a+","+a+departure+a+","+a+arrival+a+","+i+");");
                                                                Statement stmt7 = conn.createStatement();
                                                                stmt7.executeUpdate("insert into "+user+" values("+a+x.nametf2.getText()+a+","+Integer.valueOf(x.agetf2.getText())+","+a+gen1+a+","+a+departure+a+","+a+arrival+a+","+i+");");
                                                                new flight_select(user,no_of_passengers,passenger_type,arrival,departure,x.nametf1.getText(),x.nametf2.getText(),"");
                                                                x.frame3.setVisible(false);
                                                            }
                                                            else if(a23==1){
                                                                lerror.setText("PLEASE CONFIRM THE DETAILS AND CLICK PROCEED AGAIN.");
                                                            }
                                                            else{
                                                                lerror.setText("");
                                                            }
                                                        }
                                                    }catch(SQLException er){
                                                        lerror.setText("ERROR "+user);
                                                        lerror.setForeground(Color.RED);
                                                        System.out.println(er);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else{
                                        if(no_of_passengers==3){
                                            if(x.nametf1.getText().equals("")||x.nametf2.getText().equals("")||x.nametf3.getText().equals("")){
                                                lerror.setText("PLEASE ENTER A NAME");
                                                lerror.setForeground(Color.RED);
                                            }
                                            else{
                                                if((x.agetf1.getText().equals("")||x.agetf2.getText().equals("")||x.agetf2.getText().equals(""))&&(Integer.valueOf(x.agetf1.getText())>100 ||Integer.valueOf(x.agetf2.getText())>100 || Integer.valueOf(x.agetf3.getText())>100)){
                                                    lerror.setText("ENTER A VALID AGE");
                                                    lerror.setForeground(Color.RED);
                                                }
                                                else{
                                                    if(x.rb1.isSelected()==false && x.rb2.isSelected()==false || x.rb3.isSelected()==false && x.rb4.isSelected()==false || x.rb5.isSelected()==false && x.rb6.isSelected()==false ){
                                                        lerror.setText("SELECT GENDER");
                                                        lerror.setForeground(Color.RED);
                                                    }
                                                    else{
                                                        try{
                                                            String gen;
                                                            String gen1;
                                                            String gen2;
                                                            if(x.rb1.isSelected()){
                                                                gen = "MALE";
                                                            }
                                                            else{
                                                                gen = "FEMALE";
                                                            }
                                                            if(x.rb3.isSelected()){
                                                                gen1 = "MALE";
                                                            }
                                                            else{
                                                                gen1 = "FEMALE";
                                                            }
                                                            if(x.rb5.isSelected()){
                                                                gen2 = "MALE";
                                                            }
                                                            else{
                                                                gen2 = "FEMALE";
                                                            }

                                                            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                                            Statement stmt1 = conn.createStatement();
                                                            stmt1.executeUpdate("use air;");
                                                            char a = '"';
                                                            int i = 1;
                                                            int flag = 0;
                                
                                                            Statement stmt2 = conn.createStatement();
                                                            String query = "show tables;";
                                                            ResultSet r12 = stmt2.executeQuery(query);

                                                            while(r12.next()){
                                                                if(r12.getString("Tables_in_air").equals(user)){
                                                                    flag = 1;
                                                                }
                                                            }

                                                            if(flag == 0){
                                                                int a23 = JOptionPane.showConfirmDialog(c,"ARE THE ENTERED DETAILS CORRECT,CONFIRM THE DETAILS AS YOU CAN'T RETURN BACK TO THIS PAGE");
                                                                if(a23==0){
                                                                    lerror.setText("not present");
                                                                    Statement stmt3 = conn.createStatement();
                                                                    stmt3.executeUpdate("create table "+user+" (name char(200),age int,gender char(50),dep char(200),arr char(200),journey int);");
                                                                    Statement stmt4 = conn.createStatement();
                                                                    stmt4.executeUpdate("insert into "+user+" values("+a+x.nametf1.getText()+a+","+Integer.valueOf(x.agetf1.getText())+","+a+gen+a+","+a+departure+a+","+a+arrival+a+","+1+");");
                                                                    Statement stmt5 = conn.createStatement();
                                                                    stmt5.executeUpdate("insert into "+user+" values("+a+x.nametf2.getText()+a+","+Integer.valueOf(x.agetf2.getText())+","+a+gen1+a+","+a+departure+a+","+a+arrival+a+","+1+");");
                                                                    Statement stmt6 = conn.createStatement();
                                                                    stmt6.executeUpdate("insert into "+user+" values("+a+x.nametf3.getText()+a+","+Integer.valueOf(x.agetf3.getText())+","+a+gen2+a+","+a+departure+a+","+a+arrival+a+","+1+");");                                                                
                                                                    new flight_select(user,no_of_passengers,passenger_type,arrival,departure,x.nametf1.getText(),x.nametf2.getText(),x.nametf3.getText());
                                                                    x.frame3.setVisible(false);
                                                                }
                                                                else if(a23==1){
                                                                    lerror.setText("PLEASE CONFIRM THE DETAILS AND CLICK PROCEED AGAIN.");
                                                                }
                                                                else{
                                                                    lerror.setText("");
                                                                }
                                                            }
                                                            else{
                                                                int a23 = JOptionPane.showConfirmDialog(c,"ARE THE ENTERED DETAILS CORRECT,CONFIRM THE DETAILS AS YOU CAN'T RETURN BACK TO THIS PAGE");
                                                                if(a23==0){
                                                                    Statement stmt6 = conn.createStatement();
                                                                    ResultSet r1 = stmt6.executeQuery("select journey from "+user+";");
                                                                    while(r1.next()){
                                                                        if(r1.getInt("journey")==i){
                                                                            i++;
                                                                        }
                                                                    }
                                                                    Statement stmt5 = conn.createStatement();
                                                                    stmt5.executeUpdate("insert into "+user+" values("+a+x.nametf1.getText()+a+","+Integer.valueOf(x.agetf1.getText())+","+a+gen+a+","+a+departure+a+","+a+arrival+a+","+i+");");
                                                                    Statement stmt7 = conn.createStatement();
                                                                    stmt7.executeUpdate("insert into "+user+" values("+a+x.nametf2.getText()+a+","+Integer.valueOf(x.agetf2.getText())+","+a+gen1+a+","+a+departure+a+","+a+arrival+a+","+i+");");
                                                                    Statement stmt8 = conn.createStatement();
                                                                    stmt8.executeUpdate("insert into "+user+" values("+a+x.nametf3.getText()+a+","+Integer.valueOf(x.agetf3.getText())+","+a+gen2+a+","+a+departure+a+","+a+arrival+a+","+i+");");        
                                                                    lerror.setForeground(Color.BLACK);
                                                                    new flight_select(user,no_of_passengers,passenger_type,arrival,departure,x.nametf1.getText(),x.nametf2.getText(),x.nametf3.getText());
                                                                    x.frame3.setVisible(false);
                                                                }
                                                                else if(a23==1){
                                                                    lerror.setText("PLEASE CONFIRM THE DETAILS AND CLICK PROCEED AGAIN.");
                                                                }
                                                                else{
                                                                    lerror.setText("");
                                                                }
                                                            }
                                                        }catch(SQLException err){
                                                            lerror.setText("ERROR "+user);
                                                            lerror.setForeground(Color.RED);
                                                            System.out.println(err);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });

            /*x.frame3.add(x.name1);                            //DO NOT EDIT THIS PORTION
            x.frame3.add(x.nametf1);                            //IT CAN STILL BE VALID BY CHANGING THE VARIABLE NAMES
            x.frame3.add(age1);
            x.frame3.add(tf2);
            x.frame3.add(gender1);
            x.frame3.add(rb1);
            x.frame3.add(rb2);
            x.frame3.add(name2);
            x.frame3.add(tf3);
            x.frame3.add(age2);
            x.frame3.add(tf4);
            x.frame3.add(gender2);
            x.frame3.add(rb3);
            x.frame3.add(rb4);
            x.frame3.add(name3);
            x.frame3.add(tf5);
            x.frame3.add(age3);
            x.frame3.add(tf6);
            x.frame3.add(gender3);
            x.frame3.add(rb5);
            x.frame3.add(rb6);
            x.frame3.add(back);
            x.frame3.add(l6);    */

            x.frame3.setSize(1920,1080);
            x.frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            x.frame3.setVisible(true);
    }
}
class confirm{
    confirm(String user, int no_of_passengers,String passenger_type,String arrival,String departure){
        x.frame2 = new JFrame();
        Container c = x.frame2.getContentPane();
        c.setLayout(null);

        JButton back = new JButton("BACK");
        back.setBounds(20,700,70,30);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x.frame1.setVisible(true);
                x.frame2.setVisible(false);
            }
        });
        JLabel l1 = new JLabel("Welcome, "+user);
        l1.setBounds(20,20,500,40);
        l1.setFont(new Font("Eras Bold ITC", Font.BOLD, 35));

        JLabel l4 = new JLabel(departure.toUpperCase());
        l4.setBounds(250,200,500,20);
        l4.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l3 = new JLabel(departure.substring(0,3).toUpperCase());         //DEPARTURE ABBREVIATION
        l3.setBounds(300,130,200,50);
        l3.setFont(new Font("Bahnschrift", Font.BOLD, 50));

        JLabel l2 = new JLabel(arrival.substring(0, 3).toUpperCase());          //ARRIVAL ABBREVIATION
        l2.setBounds(1000,130,200,50);
        l2.setFont(new Font("Bahnschrift", Font.BOLD, 50));

        JLabel l5 = new JLabel(arrival.toUpperCase());
        l5.setBounds(950,200,500,20);
        l5.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel ar = new JLabel();
        ImageIcon i = new ImageIcon("arrow.png");
        Image img = i.getImage();
        BufferedImage bi = new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        g.drawImage(img,500,200,400,300,null);
        ImageIcon newic = new ImageIcon(bi);
        ar.setIcon(newic);
        ar.setBounds(10,100,1400,600);
        x.frame2.add(ar);

        JLabel name = new JLabel("NAME :");
        name.setBounds(500,400,100,20);
        name.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel namec = new JLabel(user.toUpperCase());
        namec.setBounds(580,400,200,20);
        namec.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel nopass = new JLabel("NO OF PASSENGERS :");
        nopass.setBounds(500,450,300,20);
        nopass.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel nopassc = new JLabel(String.valueOf(no_of_passengers));
        nopassc.setBounds(720,450,300,20);
        nopassc.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel arr = new JLabel("ARRIVAL :");
        arr.setBounds(500,500,170,20);
        arr.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel arrc = new JLabel(arrival.toUpperCase());
        arrc.setBounds(620,500,470,20);
        arrc.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        
        JLabel dep = new JLabel("DEPARTURE :");
        dep.setBounds(500,550,170,20);
        dep.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel depc = new JLabel(departure.toUpperCase());    
        depc.setBounds(650,550,470,20);
        depc.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        String ty;
        if(passenger_type.equalsIgnoreCase("")){
            ty = "REGULAR";
        }
        else{
            ty=passenger_type;
        }

        JLabel type = new JLabel("PASSENGER TYPE:     "+ty);
        type.setBounds(500,600,470,20);
        type.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        x.frame2.add(type);

        JButton cnf = new JButton("CONFIRM AND PROCEED");
        cnf.setBounds(650,700,270,30);
        cnf.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cnf.setVerticalAlignment(1);

        JButton back1 = new JButton("BACK");
        back1.setFont(new Font("Georgia", Font.BOLD, 14));
        back1.setBounds(20,720,80,40);
        back1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){
                x.frame2.setVisible(false);
                x.frame1.setVisible(true);
            }
        });
        x.frame2.add(back1);

            x.name1 = new JLabel("NAME: ");                                            //NAME 1
            x.name1.setBounds(10,330,100,20);
            x.name1.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.nametf1 = new JTextField();                                                      //NAME TXT FIELD 1
            x.nametf1.setBounds(120,330,300,25);
            x.nametf1.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.age1 = new JLabel("AGE: ");                                                 //AGE1 
            x.age1.setBounds(10,360,50,20);
            x.age1.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.agetf1 = new JTextField();                                                      //AGE TXT FIELD 1
            x.agetf1.setBounds(120,360,100,25);
            x.agetf1.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.gender1 = new JLabel("GENDER: ");                                               //GENDER
            x.gender1.setBounds(10,390,100,20);
            x.gender1.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        x.rb1 = new JRadioButton("MALE");                                        //RBs
        x.rb1.setBounds(120,390,85,20);
        x.rb1.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.rb2 = new JRadioButton("FEMALE");
            x.rb2.setBounds(210,390,120,20);
            x.rb2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.name2 = new JLabel("NAME: ");                                            //NAME 2
            x.name2.setBounds(10,440,100,20);
            x.name2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
            
            x.nametf2 = new JTextField();                                                      //NAME TXT FIELD 2
            x.nametf2.setBounds(120,440,300,25);
            x.nametf2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.age2 = new JLabel("AGE: ");                                                 //x.age2
            x.age2.setBounds(10,470,50,20);
            x.age2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.agetf2 = new JTextField();                                                      //AGE TXT FIELD 2
            x.agetf2.setBounds(120,470,100,25);
            x.agetf2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.gender2 = new JLabel("GENDER: ");                                               //GENDER 2
            x.gender2.setBounds(10,500,100,20);
            x.gender2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.rb3 = new JRadioButton("MALE");                                        //RBs 2
            x.rb3.setBounds(120,500,85,20);
            x.rb3.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.rb4 = new JRadioButton("FEMALE");
            x.rb4.setBounds(210,500,120,20);
            x.rb4.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.name3 = new JLabel("NAME: ");                                            //NAME 3
            x.name3.setBounds(10,550,100,20);
            x.name3.setFont(new Font("Bahnschrift", Font.BOLD, 20));     

            x.nametf3 = new JTextField();                                                      //NAME TXT FIELD 3
            x.nametf3.setBounds(120,550,300,25);
            x.nametf3.setFont(new Font("Bahnschrift", Font.BOLD, 20));          

            x.age3 = new JLabel("AGE: ");                                                 //x.age3
            x.age3.setBounds(10,580,50,20);
            x.age3.setFont(new Font("Bahnschrift", Font.BOLD, 20));    

            x.agetf3 = new JTextField();                                                      //AGE TXT FIELD 3
            x.agetf3.setBounds(120,580,100,25);
            x.agetf3.setFont(new Font("Bahnschrift", Font.BOLD, 20));   

            x.gender3 = new JLabel("GENDER: ");                                               //GENDER 3
            x.gender3.setBounds(10,610,100,20);
            x.gender3.setFont(new Font("Bahnschrift", Font.BOLD, 20)); 

            x.rb5 = new JRadioButton("MALE");                                        //RBs 3
            x.rb5.setBounds(120,610,85,20);
            x.rb5.setFont(new Font("Bahnschrift", Font.BOLD, 20));

            x.rb6 = new JRadioButton("FEMALE");
            x.rb6.setBounds(210,610,120,20);
            x.rb6.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        cnf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new details_page(user, no_of_passengers, passenger_type, arrival, departure);
                if(no_of_passengers==1){
                    x.bg1 = new ButtonGroup();

                    x.frame3.add(x.name1);
                    x.frame3.add(x.nametf1);
                    x.frame3.add(x.age1);
                    x.frame3.add(x.agetf1);
                    x.frame3.add(x.gender1);
                    x.frame3.add(x.rb1);
                    x.frame3.add(x.rb2);

                    x.bg1.add(x.rb1);
                    x.bg1.add(x.rb2);

                    x.frame2.setVisible(false);
                }
                else{
                    if(no_of_passengers==2){
                        x.bg1 = new ButtonGroup();
                        x.bg2 = new ButtonGroup();

                        x.frame3.add(x.name1);
                        x.frame3.add(x.nametf1);
                        x.frame3.add(x.age1);
                        x.frame3.add(x.agetf1);
                        x.frame3.add(x.gender1);
                        x.frame3.add(x.rb1);
                        x.frame3.add(x.rb2);

                        x.frame3.add(x.name2);
                        x.frame3.add(x.nametf2);
                        x.frame3.add(x.age2);
                        x.frame3.add(x.agetf2);
                        x.frame3.add(x.gender2);
                        x.frame3.add(x.rb3);
                        x.frame3.add(x.rb4);

                        x.bg1.add(x.rb1);
                        x.bg1.add(x.rb2);
                        x.bg2.add(x.rb3);
                        x.bg2.add(x.rb4);

                        x.frame2.setVisible(false);
                    }
                    else{
                        if(no_of_passengers==3){
                            x.bg1 = new ButtonGroup();
                            x.bg2 = new ButtonGroup();
                            x.bg3 = new ButtonGroup();

                            x.frame3.add(x.name1);
                            x.frame3.add(x.nametf1);
                            x.frame3.add(x.age1);
                            x.frame3.add(x.agetf1);
                            x.frame3.add(x.gender1);
                            x.frame3.add(x.rb1);
                            x.frame3.add(x.rb2);

                            x.frame3.add(x.name2);
                            x.frame3.add(x.nametf2);
                            x.frame3.add(x.age2);
                            x.frame3.add(x.agetf2);
                            x.frame3.add(x.gender2);
                            x.frame3.add(x.rb3);
                            x.frame3.add(x.rb4);

                            x.frame3.add(x.name3);
                            x.frame3.add(x.nametf3);
                            x.frame3.add(x.age3);
                            x.frame3.add(x.agetf3);
                            x.frame3.add(x.gender3);
                            x.frame3.add(x.rb5);
                            x.frame3.add(x.rb6);

                            x.bg1.add(x.rb1);
                            x.bg1.add(x.rb2);
                            x.bg2.add(x.rb3);
                            x.bg2.add(x.rb4);
                            x.bg3.add(x.rb5);
                            x.bg3.add(x.rb6);

                            x.frame2.setVisible(false);                            
                        }
                    }
                }
            }
        });
        
        x.frame2.add(cnf);
        x.frame2.add(namec);
        x.frame2.add(nopassc);
        x.frame2.add(arrc);
        x.frame2.add(depc);
        x.frame2.add(arr);
        x.frame2.add(dep);
        x.frame2.add(name);
        x.frame2.add(l4);
        x.frame2.add(l1);
        x.frame2.add(nopass);
        x.frame2.add(l2);
        x.frame2.add(l5);
        x.frame2.add(l3);
        x.frame2.setSize(1920,1080);
        x.frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.frame2.setTitle("AIRLINE TICKET RESERVATION SYSTEM");
        x.frame2.setVisible(true);
    }
}

class main_page{
    main_page(String user){
        x.frame1 = new JFrame();
        JButton b1 = new JButton("BACK");
        x.frame1.setLayout(null);
        b1.setFont(new Font("Georgia", Font.BOLD, 14));
        b1.setBounds(20,720,80,40);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){
                new test_jdbc();
                x.frame1.setVisible(false);
            }
        });
        JLabel l1 = new JLabel("FROM");
        l1.setBounds(20,100,100,20);
        l1.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l2 = new JLabel("TO");
        l2.setBounds(920,100,50,20);
        l2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l3 = new JLabel("->");
        l3.setBounds(750,50,550,120);
        l3.setFont(new Font("Bahnschrift", Font.BOLD, 80));
        
        JLabel l4 = new JLabel("ENTER NUMBER OF PASSENGERS:");          //PASSENGERS LABEL
        l4.setBounds(20,290,350,20);
        l4.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l10 = new JLabel("Welcome, "+user);
        l10.setBounds(20,0,700,80);
        l10.setFont(new Font("Eras Bold ITC", Font.BOLD, 35));

        String[] fromS = {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chattisgarh","Goa","Gujarat"
        ,"Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","kerela","Madhya Pradesh","Maharashtra"
        ,"Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil nadu","Telangana"
        ,"Tripura","Uttar Pradesh","Uttrakhand","West Bengal"};

        String[] toS = {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chattisgarh","Goa","Gujarat"
        ,"Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","kerela","Madhya Pradesh","Maharashtra"
        ,"Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil nadu","Telangana"
        ,"Tripura","Uttar Pradesh","Uttrakhand","West Bengal"};

        String[] fromC1 = {"Vishakhapatnam","Tirupati","Kadapa","Kurnool"};
        String[] fromC2 = {"Aalo","Itanagar","Vijaynagar","Walong","Ziro"};
        String[] fromC3 = {"Guwahati","Dibrugarh","Jorhat","Silchar","Lakhimpur"};
        String[] fromC4 = {"Patna","Gaya","Bhagalpur","Raxaul","Saharsa"};
        String[] fromC5 = {"Raipur","Bilaspur","Raigarh","Jagdalpur"};
        String[] fromC6 = {"Dabolim","Mopa"};
        String[] fromC7 = {"Ahemdabad","Surat","Vadodara","Rajkot","Bhavnagar","Porbandar","Ankleshwar","Mehsana"};
        String[] fromC8 = {"Chandigarh","Hisar","Karnal"};
        String[] fromC9 = {"Mandi","Dharmshala","Rangrik","Shimla"};
        String[] fromC10 = {"Srinagar","Jammu","Poonch","Udhampur","Awantipura","Rajouri"};
        String[] fromC11 = {"Bokaro","Chakulla","Deoghar","Jamshedpur","Ranchi"};
        String[] fromC12 = {"Bengaluru","Mangalore","Ballari","Mysuru","Kolar","Bidar"};
        String[] fromC13 = {"Kannur","Kochi","Kottayam","Kozhikode","Thiruvananthapuram"};
        String[] fromC14 = {"Indore","Bhopal","Jabalpur","Gwalior","Rewa","Satna","Ujjain","Harda"};
        String[] fromC15 = {"Mumbai","Nashik","Pune","Aurangabad","Shirdi","Kalyan","Dhule","Phaltan","Ratnagiri","Shirpur","Kolhapur"};
        String[] fromC16 = {"Imphal","Kangla"};
        String[] fromC17 = {"Shella","Shillong","Tura"};
        String[] fromC18 = {"Lengpui"};
        String[] fromC19 = {"Chümoukedima","Kohima"};
        String[] fromC20 = {"Rourkela","Cuttack","Nuapada","Angul","Sambalpur","Rayagada"};
        String[] fromC21 = {"Jalandhar","Bathinda","Pathankot","Patiala","Amritsar","Halwara"};
        String[] fromC22 = {"Bikaner","Jaisalmer","Jodhpur","Udaipur","Jaipur","Ajmer"};
        String[] fromC23 = {"Gangtok"};
        String[] fromC24 = {"Chennai","Coimbatore","Madurai","Tiruchirappalli","Tuticorin","Salem","Puducherry"};
        String[] fromC25 = {"Shamshabad","Begumpet","Warangal","Hakimpet","Nizambad","Kothagudem"};
        String[] fromC26 = {"Agartala","Kamalpur"};
        String[] fromC27 = {"Agra","Bareilly","Gorakhpur","Jhansi","Lucknow","Meerut","Noida","Raebareli","Sonbhadra","varanasi"};
        String[] fromC28 = {"Dehradhun","Pithoragarh","Pantnagar"};
        String[] fromC29 = {"Kolkata","Durgapur","Kharagpur","Malda"};

        JComboBox<String> cb1 = new JComboBox<>(fromS);                                   //FROM COMBO-BOX 
        cb1.setBounds(100,97,200,25);
        cb1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        x.frame1.add(cb1);
        
        JComboBox<String> cb2 = new JComboBox<>(toS);                                   //TO COMBO-BOX 
        cb2.setBounds(970,97,200,25);
        cb2.setSelectedIndex(1);
        cb2.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JComboBox<String> cb11 = new JComboBox<>(fromC1);                                     //SUB COMBO BOX FROM
        cb11.setBounds(310,97,200,25);
        cb11.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cb11.setVisible(true);
        x.frame1.add(cb11);

        JComboBox<String> cb22 = new JComboBox<>(fromC1);                                     //SUB COMBO BOX TO
        cb22.setBounds(1185,97,200,25);
        cb22.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cb22.setVisible(true);
        x.frame1.add(cb22);

        JLabel f1 = new JLabel("To :");
        f1.setBounds(860,395,200,50);
        f1.setFont(new Font("HP Simplified Jpan", Font.BOLD, 45));
        x.frame1.add(f1);

        JTextArea a2 = new JTextArea();
        a2.setBounds(860,452,370,20);
        a2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        a2.setEditable(false);
        a2.setText("");
        x.frame1.add(a2);

        JButton cnf2 = new JButton("CONFIRM");
        cnf2.setBounds(1210,142,150,25);
        cnf2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cnf2.setVerticalAlignment(1);
        x.frame1.add(cnf2);
        cnf2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a2.setText((String)cb2.getSelectedItem()+", "+(String)cb22.getSelectedItem());
            }
        });

        JButton b3 = new JButton("SELECT");
        b3.setBounds(970,142,150,25);
        b3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        b3.setVerticalAlignment(1);
        x.frame1.add(b3);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                switch(cb2.getSelectedIndex()){
                    case(0):{
                        cb22.setModel(new JComboBox<>(fromC1).getModel());
                        break;
                    }
                    case(1):{               
                        cb22.setModel(new JComboBox<>(fromC2).getModel());
                        break;
                    }
                    case(2):{               
                        cb22.setModel(new JComboBox<>(fromC3).getModel());
                        break;
                    }
                    case(3):{               
                        cb22.setModel(new JComboBox<>(fromC4).getModel());
                        break;
                    }
                    case(4):{               
                        cb22.setModel(new JComboBox<>(fromC5).getModel());
                        break;
                    }
                    case(5):{               
                        cb22.setModel(new JComboBox<>(fromC6).getModel());
                        break;
                    }
                    case(6):{               
                        cb22.setModel(new JComboBox<>(fromC7).getModel());
                        break;
                    }
                    case(7):{               
                        cb22.setModel(new JComboBox<>(fromC8).getModel());
                        break;
                    }
                    case(8):{               
                        cb22.setModel(new JComboBox<>(fromC9).getModel());
                        break;
                    }
                    case(9):{               
                        cb22.setModel(new JComboBox<>(fromC10).getModel());
                        break;
                    }
                    case(10):{               
                        cb22.setModel(new JComboBox<>(fromC11).getModel());
                        break;
                    }
                    case(11):{               
                        cb22.setModel(new JComboBox<>(fromC12).getModel());
                        break;
                    }
                    case(12):{               
                        cb22.setModel(new JComboBox<>(fromC13).getModel());
                        break;
                    }
                    case(13):{               
                        cb22.setModel(new JComboBox<>(fromC14).getModel());
                        break;
                    }
                    case(14):{               
                        cb22.setModel(new JComboBox<>(fromC15).getModel());
                        break;
                    }
                    case(15):{               
                        cb22.setModel(new JComboBox<>(fromC16).getModel());
                        break;
                    }
                    case(16):{               
                        cb22.setModel(new JComboBox<>(fromC17).getModel());
                        break;
                    }
                    case(17):{               
                        cb22.setModel(new JComboBox<>(fromC18).getModel());
                        break;
                    }
                    case(18):{               
                        cb22.setModel(new JComboBox<>(fromC19).getModel());
                        break;
                    }
                    case(19):{               
                        cb22.setModel(new JComboBox<>(fromC20).getModel());
                        break;
                    }
                    case(20):{               
                        cb22.setModel(new JComboBox<>(fromC21).getModel());
                        break;
                    }
                    case(21):{               
                        cb22.setModel(new JComboBox<>(fromC22).getModel());
                        break;
                    }
                    case(22):{               
                        cb22.setModel(new JComboBox<>(fromC23).getModel());
                        break;
                    }
                    case(23):{               
                        cb22.setModel(new JComboBox<>(fromC24).getModel());
                        break;
                    }
                    case(24):{               
                        cb22.setModel(new JComboBox<>(fromC25).getModel());
                        break;
                    }
                    case(25):{               
                        cb22.setModel(new JComboBox<>(fromC26).getModel());
                        break;
                    }
                    case(26):{               
                        cb22.setModel(new JComboBox<>(fromC27).getModel());
                        break;
                    }
                    case(27):{               
                        cb22.setModel(new JComboBox<>(fromC28).getModel());
                        break;
                    }
                    case(28):{               
                        cb22.setModel(new JComboBox<>(fromC29).getModel());
                        break;
                    }
                }
            }
        });

        JLabel f = new JLabel("From :");
        f.setBounds(160,395,200,50);
        f.setFont(new Font("HP Simplified Jpan", Font.BOLD, 45));
        x.frame1.add(f);
        
        JTextArea a1 = new JTextArea();
        a1.setBounds(160,452,370,20);
        a1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        a1.setEditable(false);
        a1.setText("");
        x.frame1.add(a1);

        JButton cnf1 = new JButton("CONFIRM");
        cnf1.setBounds(370,142,150,25);
        cnf1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        cnf1.setVerticalAlignment(1);
        x.frame1.add(cnf1);
        cnf1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a1.setText((String)cb1.getSelectedItem()+", "+(String)cb11.getSelectedItem());
            }
        });

        JButton b2 = new JButton("SELECT");
        b2.setBounds(100,142,150,25);
        b2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        b2.setVerticalAlignment(1);
        x.frame1.add(b2);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                switch(cb1.getSelectedIndex()){
                    case(0):{
                        cb11.setModel(new JComboBox<>(fromC1).getModel());
                        break;
                    }
                    case(1):{               
                        cb11.setModel(new JComboBox<>(fromC2).getModel());
                        break;
                    }
                    case(2):{               
                        cb11.setModel(new JComboBox<>(fromC3).getModel());
                        break;
                    }
                    case(3):{               
                        cb11.setModel(new JComboBox<>(fromC4).getModel());
                        break;
                    }
                    case(4):{               
                        cb11.setModel(new JComboBox<>(fromC5).getModel());
                        break;
                    }
                    case(5):{               
                        cb11.setModel(new JComboBox<>(fromC6).getModel());
                        break;
                    }
                    case(6):{               
                        cb11.setModel(new JComboBox<>(fromC7).getModel());
                        break;
                    }
                    case(7):{               
                        cb11.setModel(new JComboBox<>(fromC8).getModel());
                        break;
                    }
                    case(8):{               
                        cb11.setModel(new JComboBox<>(fromC9).getModel());
                        break;
                    }
                    case(9):{               
                        cb11.setModel(new JComboBox<>(fromC10).getModel());
                        break;
                    }
                    case(10):{               
                        cb11.setModel(new JComboBox<>(fromC11).getModel());
                        break;
                    }
                    case(11):{               
                        cb11.setModel(new JComboBox<>(fromC12).getModel());
                        break;
                    }
                    case(12):{               
                        cb11.setModel(new JComboBox<>(fromC13).getModel());
                        break;
                    }
                    case(13):{               
                        cb11.setModel(new JComboBox<>(fromC14).getModel());
                        break;
                    }
                    case(14):{               
                        cb11.setModel(new JComboBox<>(fromC15).getModel());
                        break;
                    }
                    case(15):{               
                        cb11.setModel(new JComboBox<>(fromC16).getModel());
                        break;
                    }
                    case(16):{               
                        cb11.setModel(new JComboBox<>(fromC17).getModel());
                        break;
                    }
                    case(17):{               
                        cb11.setModel(new JComboBox<>(fromC18).getModel());
                        break;
                    }
                    case(18):{               
                        cb11.setModel(new JComboBox<>(fromC19).getModel());
                        break;
                    }
                    case(19):{               
                        cb11.setModel(new JComboBox<>(fromC20).getModel());
                        break;
                    }
                    case(20):{               
                        cb11.setModel(new JComboBox<>(fromC21).getModel());
                        break;
                    }
                    case(21):{               
                        cb11.setModel(new JComboBox<>(fromC22).getModel());
                        break;
                    }
                    case(22):{               
                        cb11.setModel(new JComboBox<>(fromC23).getModel());
                        break;
                    }
                    case(23):{               
                        cb11.setModel(new JComboBox<>(fromC24).getModel());
                        break;
                    }
                    case(24):{               
                        cb11.setModel(new JComboBox<>(fromC25).getModel());
                        break;
                    }
                    case(25):{               
                        cb11.setModel(new JComboBox<>(fromC26).getModel());
                        break;
                    }
                    case(26):{               
                        cb11.setModel(new JComboBox<>(fromC27).getModel());
                        break;
                    }
                    case(27):{               
                        cb11.setModel(new JComboBox<>(fromC28).getModel());
                        break;
                    }
                    case(28):{               
                        cb11.setModel(new JComboBox<>(fromC29).getModel());
                        break;
                    }
                }
            }
        });
        
        JTextField tf3 = new JTextField();                                  //PASSENGERS TEXTFIELD
        tf3.setBounds(355,287,50,25);
        tf3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        tf3.setText("");

        JLabel l5 = new JLabel("VACCINATED");
        l5.setBounds(20,230,350,20);
        l5.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l6 = new JLabel("DOCTOR");
        l6.setBounds(220,230,350,20);
        l6.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l7 = new JLabel("ARMY");
        l7.setBounds(420,230,350,20);
        l7.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l8 = new JLabel("FAMILY");
        l8.setBounds(620,230,350,20);
        l8.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JLabel l9 = new JLabel("STUDENT");
        l9.setBounds(820,230,350,20);
        l9.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        JCheckBox ch1 = new JCheckBox();
        ch1.setIcon(new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        ch1.setBounds(150,225,25,25);

        JCheckBox ch2 = new JCheckBox();
        ch2.setIcon(new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        ch2.setBounds(300,225,25,25);

        JCheckBox ch3 = new JCheckBox();
        ch3.setIcon(new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        ch3.setBounds(490,225,25,25);

        JCheckBox ch4 = new JCheckBox();
        ch4.setIcon(new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        ch4.setBounds(700,225,25,25);

        JCheckBox ch5 = new JCheckBox();
        ch5.setIcon(new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        ch5.setBounds(910,225,25,25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(ch1);
        bg.add(ch2);
        bg.add(ch3);
        bg.add(ch4);
        bg.add(ch5);

        JCheckBox lcb =new JCheckBox();
        lcb.setIcon(new MetalCheckBoxIcon() {
            protected int getControlSize() { return 20; }
        });
        lcb.setBounds(520,700,25,25);

        JLabel lerror = new JLabel("");
        lerror.setBounds(550,600,500,20);
        x.frame1.add(lerror);

        JButton prcd = new JButton("PROCEED");
        prcd.setBounds(600,725,200,50);
        prcd.setFont(new Font("HP Simpllified Jpan", Font.BOLD, 20));
        prcd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cb11.getSelectedItem() == cb22.getSelectedItem()){
                    lerror.setText("DEPARTURE AND ARRIVAL LOCATIONS CAN'T BE THE SAME!");
                    lerror.setForeground(Color.RED);
                }
                else{
                    if((tf3.getText().equals(""))){
                        lerror.setText("PLEASE ENTER A VALID NUMBER OF PASSENGERS");
                        lerror.setForeground(Color.RED);
                    }
                    else{
                        if(Integer.valueOf(tf3.getText()) <=0 || Integer.valueOf(tf3.getText()) >3){
                            lerror.setText("PLEASE ENTER A VALID NUMBER OF PASSENGERS! (MAX PASSENGERS:3)");
                            lerror.setForeground(Color.RED);
                        }
                        else{
                            if(a1.getText().equals("") || a2.getText().equals("")){
                                lerror.setText("PLEASE CONFIRM THE ARRIVAL AND DEPARTURE LOCATIONS.");
                                lerror.setForeground(Color.RED);
                            }
                            else{
                                if(lcb.isSelected() == false){
                                    lerror.setText("PLEASE AGREE TO THE TERMS AND CONDITIONS OF THE FIRM.");
                                    lerror.setForeground(Color.RED);    
                                }
                                else{
                                    int pass = Integer.valueOf(tf3.getText());
                                    String type = "";
                                    if(ch1.isSelected() == true){
                                        type = "VACCINATED";
                                    }
                                    else{
                                        if(ch2.isSelected() == true){
                                            type = "DOCTOR";
                                        }
                                        else{
                                            if(ch3.isSelected() == true){
                                                type = "ARMY";
                                            }
                                            else{
                                                if(ch4.isSelected() == true){
                                                    type = "FAMILY";
                                                }
                                                else{
                                                    if(ch5.isSelected() == true){
                                                        type = "STUDENT";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    String dep = a2.getText();
                                    String arr = a1.getText();
                                    new confirm(user,pass,type,arr,dep);
                                    x.frame1.setVisible(false);
                                }
                            }
                        }
                    }
                }
            }
        });
        x.frame1.add(prcd);

        JButton ask1 = new JButton("CLICK HERE TO RETRIIVE AN ITENARY");
        ask1.setBounds(1000,700,400,30);

        ask1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = JOptionPane.showConfirmDialog(x.frame1,"ARE YOU SURE YOU WANT TO PROCEED TO FIND ANOTHER ITENARY?");
                if(a==0){
                    x.frame1.setVisible(false);
                    new ask(user);
                }
                else if(a==1){
                    lerror.setText("Please proceed with filling the details.");
                    lerror.setForeground(Color.red);
                }
                else{
                    lerror.setText("");
                }
            }
        });

        JLabel ll = new JLabel("By checking this box you agree to all our terms and conditions");
        ll.setBounds(550,700,700,20);

        x.frame1.add(lcb);
        x.frame1.add(ask1);
        x.frame1.add(ll);
        x.frame1.add(l1);
        x.frame1.add(l2);
        x.frame1.add(l3);
        x.frame1.add(l4);
        x.frame1.add(l5);
        x.frame1.add(l6);
        x.frame1.add(l7);
        x.frame1.add(l10);
        x.frame1.add(l8);
        x.frame1.add(cb2);
        x.frame1.add(l9);
        x.frame1.add(ch1);
        x.frame1.add(ch2);
        x.frame1.add(ch3);
        x.frame1.add(ch4);
        x.frame1.add(ch5);
        x.frame1.add(b1);
        x.frame1.add(tf3);
        x.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.frame1.setTitle("AIRLINE RESERVATION SYSTEM");
        x.frame1.setSize(1920,1080);
        x.frame1.setVisible(true);
    }
}
public class test_jdbc {
    test_jdbc(){                    //MAIN WINDOW
        JLabel lerror = new JLabel();                              //ERROR LABEL
        JTextField tf1 = new JTextField();                                  //USERNAME TEXTFIELD
        char a = '"';
        JPasswordField tf2 = new JPasswordField();                      //PASSWORD FIELD
        lerror.setBounds(610,500,320,20);
        JFrame frame = new JFrame();
        JLabel l1 = new JLabel("ENTER YOUR DETAILS");
        l1.setFont(new Font("Bahnschrift", Font.BOLD, 50));
        frame.setSize(1920,1080);
        l1.setBounds(460,100,900,80);
        JButton b1 = new JButton("LOGIN");                      //LOGIN BUTTON:B1
        b1.setBounds(730,540,200,80);
        b1.setFont(new Font("Georgia", Font.BOLD, 18));
        b1.addActionListener(new ActionListener(){                      //LOGIN ACTIONLISTENER
            public void actionPerformed(ActionEvent e){
                int flag = 0;
                int uflag = 0;
                try(Connection connec = DriverManager.getConnection(DB_URL,USER,PASS)){
                    Statement st1 = connec.createStatement();
                    String se1 = new String("use air");
                    st1.executeUpdate(se1);
                    Statement st2 = connec.createStatement();
                    String s123 = new String("select * from login;");
                    ResultSet r4 = st2.executeQuery(s123);
                    String cuser = "";
                    String pwd = "";
                    while(r4.next()){
                        cuser = r4.getString("username");
                        pwd = r4.getString("password");
                        if((tf1.getText()).equals(cuser)){
                            uflag = 1;
                            if((tf2.getText()).equals(pwd)){
                                flag = 1;                               
                                break;
                            }
                        }
                    }
                    if(uflag == 0){
                        lerror.setText("USER NOT FOUND");
                        lerror.setForeground(Color.RED);
                    }
                    else{
                        if(flag == 1){
                            lerror.setText("LOG-IN SUCCESSFUL");
                            lerror.setForeground(Color.GREEN);
                            new main_page(cuser);
                            frame.setVisible(false);
                        }
                        else{
                            lerror.setText("PASSWORD INCORRECT!");
                            lerror.setForeground(Color.RED);
                        }
                    }
                }catch(SQLException e2){
                    String a = new String("USERNAME OR PASSWORD NOT FOUND.");
                    lerror.setForeground(Color.RED);
                    lerror.setText(a);
                    System.out.println(e2);
                }
            }
        });
        JLabel l2 = new JLabel("USERNAME: ");
        JLabel l3 = new JLabel("PASSWORD: ");
        l2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        l3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        tf1.setFont(new Font("Bahnschrift", Font.BOLD, 20));    //username
        tf2.setFont(new Font("Bahnschrift", Font.BOLD, 20));    //password
        tf1.setBounds(670,320,250,30);
        tf2.setBounds(670,370,250,30);
        l2.setBounds(515,300,200,80);
        l3.setBounds(515,350,200,80);
        JButton b2 = new JButton("SIGN UP!");                      //SIGNUP BUTTON:B2
        b2.setBounds(500,540,200,80);
        b2.setFont(new Font("Georgia", Font.BOLD, 18));
        b2.addActionListener(new ActionListener(){                      //SIGNUP ACTION LISTENER
            public void actionPerformed(ActionEvent e){
                int flag = 0;
                try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);){
                    Statement stmt1 = conn.createStatement();
                    Statement stmt2 = conn.createStatement();
                    stmt1.executeUpdate("use air") ;
                    String check = new String(tf1.getText());
                    String pcheck = new String(tf2.getText());
                    if(check.isEmpty() || pcheck.isEmpty()){                    
                        lerror.setText("PLEASE ENTER A VALID USERNAME AND PASSWORD");
                        lerror.setForeground(Color.RED);
                    }
                    else{
                        String news = new String("select username from login;");
                        ResultSet r2 = stmt2.executeQuery(news);
                        while(r2.next()){
                            String a = r2.getString("username");
                            if((tf1.getText()).equals(a)){
                                flag = 1;
                                break;
                            }
                        }
                        if(flag == 0){
                            Statement s1 = conn.createStatement();
                            String br = new String("insert into login values ("+a+tf1.getText()+a+","+a+tf2.getText()+a+");");
                            s1.executeUpdate(br);
                            lerror.setText("USER CREATED SUCCESSFULLY!");
                            lerror.setForeground(Color.GREEN);
                        }
                        else{
                            lerror.setText("USERNAME ALREADY EXISTS! ");
                            lerror.setForeground(Color.RED);
                        }
                        tf1.setText("");
                        tf2.setText("");
                    }
                }catch(SQLException e3){
                    System.out.println(e3);
                }
            }
        });
        frame.add(b2);
        frame.add(l1);
        frame.add(l2);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(l3);
        frame.add(b1);
        frame.add(lerror);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("AIRLINE RESERVATION SYSTEM");
        frame.setVisible(true);
    }
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "Aakashisgood@123";
    public static void main(String[] args) throws Exception {           //MAIN METHOD
        String s1 = new String("");
        try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stmt = conn.createStatement();)
        {
            String sql = "CREATE DATABASE Air";
            stmt.executeUpdate(sql);
            s1 ="DATABASE CREATED SUCCESSFULLY";
            System.out.println(s1);
        }catch(SQLException e){
            System.out.println("DATABASE ALREADY CREATED");
        }
        new test_jdbc();
        //new details_page("bruh",2,"student","manipal","home");
        //new seat_select("a",1,"student","A","B","aakash","baang","bing");
        //new payment_select("a",1,"student","A","B","aakash","baang","bing","a1","a2","a3");
        //new card();
        //new final_window("a", 1, "student", "A", "B", "aakash", "baang","bruh", "s67", "s90", "s99");
    }
}