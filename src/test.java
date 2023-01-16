
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class test extends javax.swing.JFrame {

    static int yanit;
    static int kontrol = 0;
    static int ftursayisi = 4;
    static int btursayisi = 4;
 

    public test() {

        super("dünyanın en mütüş kart oyunu");
        // this.setLocationRelativeTo(null);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("CardPictures\\saha.jpg")))));

        } catch (IOException e) {
            e.printStackTrace();

        }
        this.setLayout(new FlowLayout());
        // this.setResizable(false);
        this.pack();
        // this.setVisible(true);

    }

    public static void main(String[] args) {

        test jf = new test();

        JButton kf1button, kf2button, kf3button, kf4button, button5, button6, button7, button8,
                kb1button, kb2button, kb3button, kb4button, button13, button14, button15, button16;

        JPanel pn;

        JLabel jl = new JLabel();
        JLabel skorlabel = new JLabel();
        JLabel skorlabel2 = new JLabel();

        jf.setSize(1750, 950);

        pn = new JPanel();
        pn.setBounds(700, 350, 300, 150);
        pn.setBackground(Color.gray);

        kf1button = new JButton();
        kf1button.setBounds(650, 600, 80, 120);

        kf2button = new JButton();
        kf2button.setBounds(750, 600, 80, 120);

        kf3button = new JButton();
        kf3button.setBounds(850, 600, 80, 120);

        kf4button = new JButton();
        kf4button.setBounds(950, 600, 80, 120);

        button5 = new JButton();
        button5.setBounds(650, 50, 80, 120);

        button6 = new JButton();
        button6.setBounds(750, 50, 80, 120);

        button7 = new JButton();
        button7.setBounds(850, 50, 80, 120);

        button8 = new JButton();
        button8.setBounds(950, 50, 80, 120);

        kb1button = new JButton();
        kb1button.setBounds(100, 600, 80, 120);

        kb2button = new JButton();
        kb2button.setBounds(200, 600, 80, 120);

        kb3button = new JButton();
        kb3button.setBounds(300, 600, 80, 120);

        kb4button = new JButton();
        kb4button.setBounds(400, 600, 80, 120);

        button13 = new JButton();
        button13.setBounds(100, 50, 80, 120);

        button14 = new JButton();
        button14.setBounds(200, 50, 80, 120);

        button15 = new JButton();
        button15.setBounds(300, 50, 80, 120);

        button16 = new JButton();
        button16.setBounds(400, 50, 80, 120);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);

        jf.add(kf1button);
        jf.add(kf2button);
        jf.add(kf3button);
        jf.add(kf4button);
        jf.add(button5);
        jf.add(button6);
        jf.add(button7);
        jf.add(button8);
        jf.add(kb1button);
        jf.add(kb2button);
        jf.add(kb3button);
        jf.add(kb4button);
        jf.add(button13);
        jf.add(button14);
        jf.add(button15);
        jf.add(button16);

        jf.add(pn);

        
        kullanici k1 = new kullanici("alp ve ati");
        bilgisayar b1 = new bilgisayar();

        futbolcu f_1 = new futbolcu("cristiano ronaldo", "real madrid"); //juve ama farklı olsun
        futbolcu f_2 = new futbolcu("wesley sneijder", "galatasaray");
        futbolcu f_3 = new futbolcu("didier drogba", "galatasaray");
        futbolcu f_4 = new futbolcu("neymar", "paris saint germain");
        futbolcu f_5 = new futbolcu("sergio aguero", "manchester city");
        futbolcu f_6 = new futbolcu("çağlar söyüncü", "leicester city");
        futbolcu f_7 = new futbolcu("merih demiral", "juventus");
        futbolcu f_8 = new futbolcu("leo messi", "barcelona");

        futbolcu f_temp = new futbolcu();

        basketbolcu b_1 = new basketbolcu("JOAKIM NOAH", "CHICAGO BULLS");
        basketbolcu b_2 = new basketbolcu("KYLE LOWRY", "TORONTO RAPTORS");
        basketbolcu b_3 = new basketbolcu("PAUL GEORGE", "INDIANA PACERS");
        basketbolcu b_4 = new basketbolcu("BLAKE GRIFFIN", "LA CLIPPERS");
        basketbolcu b_5 = new basketbolcu("STEPHEN CURRY", " GS WARRIORS");
        basketbolcu b_6 = new basketbolcu("LEBRON JAMES", " CLEVELAND CAVALIERS");
        basketbolcu b_7 = new basketbolcu("KEVIN DURANT", "OKC THUNDER");
        basketbolcu b_8 = new basketbolcu("KOBE BRYANT", "LOS ANGELES LAKERS");   //RIP. allah rahmet eylesin

        basketbolcu b_temp = new basketbolcu();

        // sporcu özellikleri atama
        // 1. karsilasma alanlari hepsinin farklı olmalı
        f_1.setPuan(71, 77, 90);
        f_2.setPuan(92, 95, 90);
        f_3.setPuan(83, 86, 90);
        f_4.setPuan(99, 91, 90);
        f_5.setPuan(75, 90, 90);
        f_6.setPuan(80, 65, 90);
        f_7.setPuan(91, 72, 90);
        f_8.setPuan(88, 83, 90);

        b_1.setPuan(79, 90, 90);
        b_2.setPuan(88, 65, 90);
        b_3.setPuan(93, 66, 90);
        b_4.setPuan(96, 70, 90);
        b_5.setPuan(75, 96, 90);
        b_6.setPuan(78, 85, 90);
        b_7.setPuan(85, 82, 90);
        b_8.setPuan(76, 94, 90);

        // futbolcuları diziye atma
        ArrayList<futbolcu> TumFutbolcular = new ArrayList<futbolcu>();

        TumFutbolcular.add(f_1);
        TumFutbolcular.add(f_2);
        TumFutbolcular.add(f_3);
        TumFutbolcular.add(f_4);
        TumFutbolcular.add(f_5);
        TumFutbolcular.add(f_6);
        TumFutbolcular.add(f_7);
        TumFutbolcular.add(f_8);

        ArrayList<basketbolcu> TumBasketbolcular = new ArrayList<basketbolcu>();

        TumBasketbolcular.add(b_1);
        TumBasketbolcular.add(b_2);
        TumBasketbolcular.add(b_3);
        TumBasketbolcular.add(b_4);
        TumBasketbolcular.add(b_5);
        TumBasketbolcular.add(b_6);
        TumBasketbolcular.add(b_7);
        TumBasketbolcular.add(b_8);

        //karıstırma
        for (int i = 0; i < 20; i++) {

            int x = ((int) (Math.random() * 123)) % 8;
            f_temp = TumFutbolcular.get(x);
            b_temp = TumBasketbolcular.get(x);

            TumBasketbolcular.remove(b_temp);
            TumFutbolcular.remove(f_temp);

            int y = ((int) (Math.random() * 123)) % 7;

            TumFutbolcular.add(y, f_temp);
            TumBasketbolcular.add(y, b_temp);

        }

        // sporcuları oyuncu ve pc ye dağıtma
        for (int i = 0; i < 4; i++) { // aynı zamanda karltarın resimlerini de dağıtıyoruz

            k1.setEldeKalanFutbolcular(TumFutbolcular.get(0));
            TumFutbolcular.remove(0);

            if (i == 0) {
                kf1button.setText(k1.eldeKalanFutbolcular.get(i).futbolcuAdi);
                ImageIcon icon1 = new ImageIcon("CardPictures\\" + k1.eldeKalanFutbolcular.get(i).futbolcuAdi + ".jpg");
                kf1button.setIcon(icon1);
            }

            if (i == 1) {
                kf2button.setText(k1.eldeKalanFutbolcular.get(i).futbolcuAdi);
                ImageIcon icon2 = new ImageIcon("CardPictures\\" + k1.eldeKalanFutbolcular.get(i).futbolcuAdi + ".jpg");
                kf2button.setIcon(icon2);
            }

            if (i == 2) {
                kf3button.setText(k1.eldeKalanFutbolcular.get(i).futbolcuAdi);
                ImageIcon icon3 = new ImageIcon("CardPictures\\" + k1.eldeKalanFutbolcular.get(i).futbolcuAdi + ".jpg");
                kf3button.setIcon(icon3);

            }

            if (i == 3) {
                kf4button.setText(k1.eldeKalanFutbolcular.get(i).futbolcuAdi);
                ImageIcon icon4 = new ImageIcon("CardPictures\\" + k1.eldeKalanFutbolcular.get(i).futbolcuAdi + ".jpg");
                kf4button.setIcon(icon4);

            }

            b1.setEldeKalanFutbolcular(TumFutbolcular.get(0));
            TumFutbolcular.remove(0);

            ImageIcon icon5 = new ImageIcon("CardPictures\\black.jpg");
            button5.setIcon(icon5);

            ImageIcon icon6 = new ImageIcon("CardPictures\\black.jpg");
            button6.setIcon(icon6);

            ImageIcon icon7 = new ImageIcon("CardPictures\\black.jpg");
            button7.setIcon(icon7);

            ImageIcon icon8 = new ImageIcon("CardPictures\\black.jpg");
            button8.setIcon(icon8);

            k1.setEldeKalanBasketbolcular(TumBasketbolcular.get(0));
            TumBasketbolcular.remove(0);

            if (i == 0) {
                kb1button.setText(k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi);
                ImageIcon icon9 = new ImageIcon("CardPictures\\" +k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi + ".jpg");
                kb1button.setIcon(icon9);
            }

            if (i == 1) {
                kb2button.setText(k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi);
                ImageIcon icon10 = new ImageIcon("CardPictures\\" +k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi + ".jpg");
                kb2button.setIcon(icon10);
            }

            if (i == 2) {
                kb3button.setText(k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi);
                ImageIcon icon11 = new ImageIcon("CardPictures\\" +k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi + ".jpg");
                kb3button.setIcon(icon11);

            }

            if (i == 3) {
                kb4button.setText(k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi);
                ImageIcon icon12 = new ImageIcon("CardPictures\\" +k1.eldeKalanBasketbolcular.get(i).basketbolcuAdi + ".jpg");
                kb4button.setIcon(icon12);

            }

            b1.setEldeKalanBasketbolcular(TumBasketbolcular.get(0));
            TumBasketbolcular.remove(0);

            ImageIcon icon13 = new ImageIcon("CardPictures\\black.jpg");
            button13.setIcon(icon13);

            ImageIcon icon14 = new ImageIcon("CardPictures\\black.jpg");
            button14.setIcon(icon14);

            ImageIcon icon15 = new ImageIcon("CardPictures\\black.jpg");
            button15.setIcon(icon15);

            ImageIcon icon16 = new ImageIcon("CardPictures\\black.jpg");
            button16.setIcon(icon16);

        }
        
        
        JLabel lbl = new JLabel("karsilasma alani: ");
   

        kf1button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kb1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kb2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kb3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kb4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button13.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button14.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button15.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button16.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanFutbolcular.get(0).kartOynandi_mi == false && kontrol % 2 == 0) || ( k1.eldeKalanFutbolcular.get(0).kartOynandi_mi == false && btursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;
                
                    
                  kf1button.setLocation(750, 365);
                    yanit = b1.fkartsec(b1.eldeKalanFutbolcular);

                    switch (yanit) {

                        case 0:
                            button5.setLocation(870, 365);
                            button5.setText(b1.eldeKalanFutbolcular.get(0).futbolcuAdi);
                            ImageIcon icon5 = new ImageIcon("CardPictures\\" + b1.eldeKalanFutbolcular.get(0).futbolcuAdi + ".jpg");
                            button5.setIcon(icon5);
                            break;
                        case 1:
                            button6.setLocation(870, 365);
                            button6.setText(b1.eldeKalanFutbolcular.get(1).futbolcuAdi);
                            ImageIcon icon6 = new ImageIcon("CardPictures\\" + b1.eldeKalanFutbolcular.get(1).futbolcuAdi + ".jpg");
                            button6.setIcon(icon6);
                            break;
                        case 2:
                            button7.setLocation(870, 365);

                            button7.setText(b1.eldeKalanFutbolcular.get(2).futbolcuAdi);
                            ImageIcon icon7 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(2).futbolcuAdi + ".jpg");
                            button7.setIcon(icon7);
                            break;
                        case 3:
                            button8.setLocation(870, 365);

                            button8.setText(b1.eldeKalanFutbolcular.get(3).futbolcuAdi);
                            ImageIcon icon8 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(3).futbolcuAdi + ".jpg");
                            button8.setIcon(icon8);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (ftursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanFutbolcular.get(0).getPuan(karsilasmaalani) > b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(0).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        ftursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanFutbolcular.get(0).getPuan(karsilasmaalani) < b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(0).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        ftursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kf1button.setBounds(650, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.
                        switch (yanit) {

                            case 0:
                                button5.setBounds(650, 50, 80, 120);
                                break;
                            case 1:
                                button6.setBounds(750, 50, 80, 120);
                                break;
                            case 2:
                                button7.setBounds(850, 50, 80, 120);
                                break;
                            case 3:
                                button8.setBounds(950, 50, 80, 120);
                                break;

                        }
                    }

                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);

                }
 String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else   if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                     else{ l = new JLabel("BERABERE!");}
                    
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        kf2button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kb1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kb2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kb3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kb4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button13.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button14.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button15.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button16.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanFutbolcular.get(1).kartOynandi_mi == false && kontrol % 2 == 0) || ( k1.eldeKalanFutbolcular.get(1).kartOynandi_mi == false && btursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;

                    kf2button.setLocation(750, 365);
                    yanit = b1.fkartsec(b1.eldeKalanFutbolcular);

                    switch (yanit) {

                        case 0:
                            button5.setLocation(870, 365);
                            button5.setText(b1.eldeKalanFutbolcular.get(0).futbolcuAdi);
                            ImageIcon icon5 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(0).futbolcuAdi + ".jpg");
                            button5.setIcon(icon5);
                            break;
                        case 1:
                            button6.setLocation(870, 365);
                            button6.setText(b1.eldeKalanFutbolcular.get(1).futbolcuAdi);
                            ImageIcon icon6 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(1).futbolcuAdi + ".jpg");
                            button6.setIcon(icon6);
                            break;
                        case 2:
                            button7.setLocation(870, 365);

                            button7.setText(b1.eldeKalanFutbolcular.get(2).futbolcuAdi);
                            ImageIcon icon7 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(2).futbolcuAdi + ".jpg");
                            button7.setIcon(icon7);
                            break;
                        case 3:
                            button8.setLocation(870, 365);

                            button8.setText(b1.eldeKalanFutbolcular.get(3).futbolcuAdi);
                            ImageIcon icon8 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(3).futbolcuAdi + ".jpg");
                            button8.setIcon(icon8);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (ftursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanFutbolcular.get(1).getPuan(karsilasmaalani) > b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(1).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        ftursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanFutbolcular.get(1).getPuan(karsilasmaalani) < b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(1).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        ftursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kf2button.setBounds(750, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.

                        switch (yanit) {

                            case 0:
                                button5.setBounds(650, 50, 80, 120);
                                break;
                            case 1:
                                button6.setBounds(750, 50, 80, 120);
                                break;
                            case 2:
                                button7.setBounds(850, 50, 80, 120);
                                break;
                            case 3:
                                button8.setBounds(950, 50, 80, 120);
                                break;

                        }
                    }
                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);
                }
 String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else   if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                     else{ l = new JLabel("BERABERE!");}
                    
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        kf3button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kb1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kb2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kb3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kb4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button13.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button14.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button15.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button16.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanFutbolcular.get(2).kartOynandi_mi == false && kontrol % 2 == 0) || ( k1.eldeKalanFutbolcular.get(2).kartOynandi_mi == false && btursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;

                    kf3button.setLocation(750, 365);
                    yanit = b1.fkartsec(b1.eldeKalanFutbolcular);

                    switch (yanit) {

                        case 0:
                            button5.setLocation(870, 365);
                            button5.setText(b1.eldeKalanFutbolcular.get(0).futbolcuAdi);
                            ImageIcon icon5 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(0).futbolcuAdi + ".jpg");
                            button5.setIcon(icon5);
                            break;
                        case 1:
                            button6.setLocation(870, 365);
                            button6.setText(b1.eldeKalanFutbolcular.get(1).futbolcuAdi);
                            ImageIcon icon6 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(1).futbolcuAdi + ".jpg");
                            button6.setIcon(icon6);
                            break;
                        case 2:
                            button7.setLocation(870, 365);

                            button7.setText(b1.eldeKalanFutbolcular.get(2).futbolcuAdi);
                            ImageIcon icon7 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(2).futbolcuAdi + ".jpg");
                            button7.setIcon(icon7);
                            break;
                        case 3:
                            button8.setLocation(870, 365);

                            button8.setText(b1.eldeKalanFutbolcular.get(3).futbolcuAdi);
                            ImageIcon icon8 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(3).futbolcuAdi + ".jpg");
                            button8.setIcon(icon8);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (ftursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanFutbolcular.get(2).getPuan(karsilasmaalani) > b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(2).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        ftursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanFutbolcular.get(2).getPuan(karsilasmaalani) < b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(2).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        ftursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kf3button.setBounds(850, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.
                        switch (yanit) {

                            case 0:
                                button5.setBounds(650, 50, 80, 120);
                                break;
                            case 1:
                                button6.setBounds(750, 50, 80, 120);
                                break;
                            case 2:
                                button7.setBounds(850, 50, 80, 120);
                                break;
                            case 3:
                                button8.setBounds(950, 50, 80, 120);
                                break;

                        }
                    }
                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);
                }
 String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else   if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                     else{ l = new JLabel("BERABERE!");}
                    
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        kf4button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kb1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kb2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kb3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kb4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanBasketbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button13.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button14.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button15.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button16.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanFutbolcular.get(3).kartOynandi_mi == false && kontrol % 2 == 0) || ( k1.eldeKalanFutbolcular.get(3).kartOynandi_mi == false && btursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;

                    kf4button.setLocation(750, 365);
                    yanit = b1.fkartsec(b1.eldeKalanFutbolcular);

                    switch (yanit) {

                        case 0:
                            button5.setLocation(870, 365);
                            button5.setText(b1.eldeKalanFutbolcular.get(0).futbolcuAdi);
                            ImageIcon icon5 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(0).futbolcuAdi + ".jpg");
                            button5.setIcon(icon5);
                            break;
                        case 1:
                            button6.setLocation(870, 365);
                            button6.setText(b1.eldeKalanFutbolcular.get(1).futbolcuAdi);
                            ImageIcon icon6 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(1).futbolcuAdi + ".jpg");
                            button6.setIcon(icon6);
                            break;
                        case 2:
                            button7.setLocation(870, 365);

                            button7.setText(b1.eldeKalanFutbolcular.get(2).futbolcuAdi);
                            ImageIcon icon7 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(2).futbolcuAdi + ".jpg");
                            button7.setIcon(icon7);
                            break;
                        case 3:
                            button8.setLocation(870, 365);

                            button8.setText(b1.eldeKalanFutbolcular.get(3).futbolcuAdi);
                            ImageIcon icon8 = new ImageIcon("CardPictures\\" +b1.eldeKalanFutbolcular.get(3).futbolcuAdi + ".jpg");
                            button8.setIcon(icon8);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (ftursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanFutbolcular.get(3).getPuan(karsilasmaalani) > b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(3).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        ftursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanFutbolcular.get(3).getPuan(karsilasmaalani) < b1.eldeKalanFutbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanFutbolcular.get(3).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanFutbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        ftursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kf4button.setBounds(950, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.
                        switch (yanit) {

                            case 0:
                                button5.setBounds(650, 50, 80, 120);
                                break;
                            case 1:
                                button6.setBounds(750, 50, 80, 120);
                                break;
                            case 2:
                                button7.setBounds(850, 50, 80, 120);
                                break;
                            case 3:
                                button8.setBounds(950, 50, 80, 120);
                                break;

                        }
                    }
                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);
                }
 String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else   if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                     else{ l = new JLabel("BERABERE!");}
                    
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        
        kb1button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kf1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kf2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kf3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kf4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button5.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button6.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button7.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button8.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanBasketbolcular.get(0).kartOynandi_mi == false && kontrol % 2 == 1) ||  (k1.eldeKalanBasketbolcular.get(0).kartOynandi_mi == false &&ftursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;

                    kb1button.setLocation(750, 365);
                    yanit = b1.bkartsec(b1.eldeKalanBasketbolcular);

                    switch (yanit) {

                        case 0:
                            button13.setLocation(870, 365);
                            button13.setText(b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi);
                            ImageIcon icon13 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi + ".jpg");
                            button13.setIcon(icon13);
                            break;
                        case 1:
                            button14.setLocation(870, 365);
                            button14.setText(b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi);
                            ImageIcon icon14 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi + ".jpg");
                            button14.setIcon(icon14);
                            break;
                        case 2:
                            button15.setLocation(870, 365);
                            button15.setText(b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi);
                            ImageIcon icon15 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi + ".jpg");
                            button15.setIcon(icon15);
                            break;
                        case 3:
                            button16.setLocation(870, 365);
                            button16.setText(b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi);
                            ImageIcon icon16 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi + ".jpg");
                            button16.setIcon(icon16);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (btursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanBasketbolcular.get(0).getPuan(karsilasmaalani) > b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(0).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        btursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanBasketbolcular.get(0).getPuan(karsilasmaalani) < b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(0).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        btursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kb1button.setBounds(100, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.
                        switch (yanit) {

                            case 0:
                                button13.setBounds(100, 50, 80, 120);
                                break;
                            case 1:
                                button14.setBounds(200, 50, 80, 120);
                                break;
                            case 2:
                                button15.setBounds(300, 50, 80, 120);
                                break;
                            case 3:
                                button16.setBounds(400, 50, 80, 120);
                                break;

                        }
                    }
                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);
                }

                String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                      else{ l = new JLabel("BERABERE!");}
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        kb2button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kf1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kf2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kf3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kf4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button5.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button6.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button7.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button8.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanBasketbolcular.get(1).kartOynandi_mi == false && kontrol % 2 == 1) || (k1.eldeKalanBasketbolcular.get(1).kartOynandi_mi == false &&ftursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;

                    kb2button.setLocation(750, 365);
                    yanit = b1.bkartsec(b1.eldeKalanBasketbolcular);

                    switch (yanit) {

                        case 0:
                            button13.setLocation(870, 365);
                            button13.setText(b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi);
                            ImageIcon icon13 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi + ".jpg");
                            button13.setIcon(icon13);
                            break;
                        case 1:
                            button14.setLocation(870, 365);
                            button14.setText(b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi);
                            ImageIcon icon14 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi + ".jpg");
                            button14.setIcon(icon14);
                            break;
                        case 2:
                            button15.setLocation(870, 365);
                            button15.setText(b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi);
                            ImageIcon icon15 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi + ".jpg");
                            button15.setIcon(icon15);
                            break;
                        case 3:
                            button16.setLocation(870, 365);
                            button16.setText(b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi);
                            ImageIcon icon16 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi + ".jpg");
                            button16.setIcon(icon16);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (btursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanBasketbolcular.get(1).getPuan(karsilasmaalani) > b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(1).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        btursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanBasketbolcular.get(1).getPuan(karsilasmaalani) < b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(1).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        btursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kb2button.setBounds(200, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.
                        switch (yanit) {

                            case 0:
                                button13.setBounds(100, 50, 80, 120);
                                break;
                            case 1:
                                button14.setBounds(200, 50, 80, 120);
                                break;
                            case 2:
                                button15.setBounds(300, 50, 80, 120);
                                break;
                            case 3:
                                button16.setBounds(400, 50, 80, 120);
                                break;
                        }
                    }
                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);
                }
                String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else  if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                        else{ l = new JLabel("BERABERE!");}
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        kb3button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kf1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kf2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kf3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kf4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button5.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button6.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button7.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button8.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanBasketbolcular.get(2).kartOynandi_mi == false && kontrol % 2 == 1) || (k1.eldeKalanBasketbolcular.get(2).kartOynandi_mi == false &&ftursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;

                    kb3button.setLocation(750, 365);
                    yanit = b1.bkartsec(b1.eldeKalanBasketbolcular);

                    switch (yanit) {

                        case 0:
                            button13.setLocation(870, 365);
                            button13.setText(b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi);
                            ImageIcon icon13 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi + ".jpg");
                            button13.setIcon(icon13);
                            break;
                        case 1:
                            button14.setLocation(870, 365);
                            button14.setText(b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi);
                            ImageIcon icon14 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi + ".jpg");
                            button14.setIcon(icon14);
                            break;
                        case 2:
                            button15.setLocation(870, 365);
                            button15.setText(b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi);
                            ImageIcon icon15 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi + ".jpg");
                            button15.setIcon(icon15);
                            break;
                        case 3:
                            button16.setLocation(870, 365);
                            button16.setText(b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi);
                            ImageIcon icon16 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi + ".jpg");
                            button16.setIcon(icon16);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (btursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanBasketbolcular.get(2).getPuan(karsilasmaalani) > b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(2).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        btursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanBasketbolcular.get(2).getPuan(karsilasmaalani) < b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(2).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        btursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kb3button.setBounds(300, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.
                        switch (yanit) {

                            case 0:
                                button13.setBounds(100, 50, 80, 120);
                                break;
                            case 1:
                                button14.setBounds(200, 50, 80, 120);
                                break;
                            case 2:
                                button15.setBounds(300, 50, 80, 120);
                                break;
                            case 3:
                                button16.setBounds(400, 50, 80, 120);
                                break;
                        }
                    }
                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);
                }

                String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else   if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                     else{ l = new JLabel("BERABERE!");}
                    
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        kb4button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 4; i++) {
                    if (k1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            kf1button.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            kf2button.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            kf3button.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            kf4button.setLocation(1050, 365);
                        }

                    }
                    if (b1.eldeKalanFutbolcular.get(i).kartOynandi_mi == true) {
                        if (i == 0) {
                            button5.setLocation(1050, 365);
                        }

                        if (i == 1) {
                            button6.setLocation(1050, 365);
                        }

                        if (i == 2) {
                            button7.setLocation(1050, 365);
                        }

                        if (i == 3) {
                            button8.setLocation(1050, 365);
                        }

                    }

                }

                if ((k1.eldeKalanBasketbolcular.get(3).kartOynandi_mi == false && kontrol % 2 == 1) || (k1.eldeKalanBasketbolcular.get(3).kartOynandi_mi == false &&ftursayisi==0))// kart oynanmadıysa calıstır yoksa elleme.
                {
                    kontrol++;

                    kb4button.setLocation(750, 365);
                    yanit = b1.bkartsec(b1.eldeKalanBasketbolcular);

                    switch (yanit) {

                        case 0:
                            button13.setLocation(870, 365);
                            button13.setText(b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi);
                            ImageIcon icon13 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(0).basketbolcuAdi + ".jpg");
                            button13.setIcon(icon13);
                            break;
                        case 1:
                            button14.setLocation(870, 365);
                            button14.setText(b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi);
                            ImageIcon icon14 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(1).basketbolcuAdi + ".jpg");
                            button14.setIcon(icon14);
                            break;
                        case 2:
                            button15.setLocation(870, 365);
                            button15.setText(b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi);
                            ImageIcon icon15 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(2).basketbolcuAdi + ".jpg");
                            button15.setIcon(icon15);
                            break;
                        case 3:
                            button16.setLocation(870, 365);
                            button16.setText(b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi);
                            ImageIcon icon16 = new ImageIcon("CardPictures\\" +b1.eldeKalanBasketbolcular.get(3).basketbolcuAdi + ".jpg");
                            button16.setIcon(icon16);
                            break;
                        default:
                            break;
                    }

                    int karsilasmaalani;

                    if (btursayisi == 1) {
                        karsilasmaalani = 1;
                    } // 1 - 1 kart kaldıysa karsilasma alani 1 yapıyoruz. 1 alandaki bütün degerler farklı olsun
                    else {
                        karsilasmaalani = (((int) (Math.random() * 123) % 3)) + 1;
                    } // karsılasma özelliği belirleme 
                    System.out.println("secilen sporcular " + karsilasmaalani + ". alanda karsilasacaktir\n");

                    String alan = Integer.toString(karsilasmaalani);

                    lbl.setText("secilen özellik ->" + alan);
                    lbl.setBounds(750, 150, 2000, 300);
                    lbl.setFont(new Font("", Font.BOLD, 30));
                    lbl.setForeground(Color.blue);

                    if (k1.eldeKalanBasketbolcular.get(3).getPuan(karsilasmaalani) > b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(3).setkartOynandi_mi(true);         // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        k1.setSkor();
                        btursayisi--;            // kullanıcı +10p
                        System.out.print("tebrikler +10 puan kazandınız");

                    } else if (k1.eldeKalanBasketbolcular.get(3).getPuan(karsilasmaalani) < b1.eldeKalanBasketbolcular.get(yanit).getPuan(karsilasmaalani)) {

                        k1.eldeKalanBasketbolcular.get(3).setkartOynandi_mi(true); // kartlar kullanildi olarak isaretleniyor
                        b1.eldeKalanBasketbolcular.get(yanit).setkartOynandi_mi(true);

                        b1.setSkor();// pc +10p
                        btursayisi--;

                        System.out.print("turu kaybettin! pc +10 puan kazandı");

                    } else {
                        System.out.print("durum berabere! kartlar geri verildi");
                        kb4button.setBounds(400, 600, 80, 120);//beraberlik duurmu, kartlar geri çekilir.
                        switch (yanit) {

                            case 0:
                                button13.setBounds(100, 50, 80, 120);
                                break;
                            case 1:
                                button14.setBounds(200, 50, 80, 120);
                                break;
                            case 2:
                                button15.setBounds(300, 50, 80, 120);
                                break;
                            case 3:
                                button16.setBounds(400, 50, 80, 120);
                                break;
                        }
                    }
                    String skork = Integer.toString(k1.getSkor());

                    skorlabel.setText("user: " + skork);
                    skorlabel.setBounds(1200, 400, 2000, 300);
                    skorlabel.setFont(new Font("", Font.BOLD, 30));
                    skorlabel.setForeground(Color.blue);

                    String skorb = Integer.toString(b1.getSkor());

                    skorlabel2.setText("pc: " + skorb);
                    skorlabel2.setBounds(1200, 10, 2000, 300);
                    skorlabel2.setFont(new Font("", Font.BOLD, 30));
                    skorlabel2.setForeground(Color.blue);
                }

                 String struser = Integer.toString(k1.getSkor());
                String strpc = Integer.toString(b1.getSkor());

                if (k1.getSkor() + b1.getSkor() == 80) {   //skoru yeni bir ekranda yazdıracak  toplamları 80 olunca

                    System.out.print("\n oyun bitmistir puaniniz => " + k1.getSkor());
                    System.out.print("\n pc nin puanini => " + b1.getSkor());

                    JFrame jfson = new JFrame();
                    jfson.setSize(750, 750);

                    JLabel l = new JLabel();

                    if (k1.getSkor() > b1.getSkor()) {
                        l = new JLabel(k1.kullaniciAdi + " kazandı" + "\n\n" + " puan: " + struser);
                    }

                    else   if (k1.getSkor() < b1.getSkor()) {
                        l = new JLabel(b1.oyuncuAdi + " kazandı" + "\n\n" + " puan: " + strpc);
                    }
                     else{ l = new JLabel("BERABERE!");}
                    
                    l.setBounds(150, 150, 2000, 300);
                    l.setFont(new Font("", Font.BOLD, 35));
                    l.setForeground(Color.RED);
                    //resim falan eklenip guzellestirilebilir.

                    jfson.add(l);
                    jfson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jfson.setLayout(null);
                    jfson.setVisible(true);

                }
            }
        });

        jf.add(lbl);
        jf.add(skorlabel);
        jf.add(skorlabel2);

    }

}
