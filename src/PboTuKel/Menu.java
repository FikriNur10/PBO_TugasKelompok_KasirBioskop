package PboTuKel;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;



public class Menu extends Component implements ActionListener{

    private static JButton film1;
    private static JButton film2;
    private static JButton film3;
    private static JButton film4;
    private static JButton Keluar;

    public void MenuPil(){

        JFrame frame = new JFrame(" ZZE - Daftar Film");
        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60, 10, 40, 10));
        frame.add(panel);

        // film 1 button //
        film1 = new JButton(); // image description and put image
        film1.setPreferredSize(new Dimension(120,30));
        film1.setText("Squid Game");
        film1.setActionCommand(Actions.film1.name());
        film1.addActionListener((ActionListener) new Menu());
        panel.add(film1);

        // film 2 //
        film2 = new JButton(); // image description and put image
        film2.setPreferredSize(new Dimension(120,30));
        film2.setActionCommand(Actions.film2.name());
        film2.addActionListener((ActionListener) new Menu());
        film2.setText("Joker 2019");
        panel.add(film2);

        // film 3 //
        film3 = new JButton(); // image description and put image
        film3.setPreferredSize(new Dimension(120,30));
        film3.setActionCommand(Actions.film3.name());
        film3.addActionListener((ActionListener) new Menu());
        film3.setText("Avangers : End Game");
        panel.add(film3);

        // film 4 //
        film4 = new JButton(); // image description and put image
        film4.setPreferredSize(new Dimension(120,30));
        film4.setActionCommand(Actions.film4.name());
        film4.addActionListener((ActionListener) new Menu());
        film4.setText("Superman");
        panel.add(film4);

        // Quit //
        Keluar = new JButton();
        Keluar.setPreferredSize(new Dimension(120,30));
        Keluar.setActionCommand(Actions.Keluar.name());
        Keluar.addActionListener((ActionListener) new Menu());
        Keluar.setText("Quit");
        panel.add(Keluar);

        frame.setVisible(true);

    }

    public void actionPerformed(java.awt.event.ActionEvent evt){
        clsMain objMain = new clsMain();
        if(evt.getActionCommand() == Actions.film1.name()){

            String JumTiket = JOptionPane.showInputDialog("Masukan Jumlah Tiket : ");
            System.out.println("Nama Film : Squid Game");
            String NamaFilm = "Squid Game";
            System.out.println("Masukan Jumlah Tiket : " + JumTiket);
            objMain.JumTiket = Integer.parseInt(JumTiket);
            System.out.println("Total Harga : " + objMain.HitungHarga());
            JOptionPane.showMessageDialog(null,"\nPembayaran" + "\nTotal Tiket : " + JumTiket + "\nJumlah yang harus dibayar : " + objMain.HitungHarga(),"Bayar",JOptionPane.INFORMATION_MESSAGE);
            String Uang = JOptionPane.showInputDialog("Masukan Jumlah Uang : ");
            System.out.println("Masukan Jumlah Uang : " + Uang);
            objMain.Uang = Integer.parseInt(Uang);
            System.out.println("Total Kembalian : " + objMain.Kembalian());
            JOptionPane.showMessageDialog(null,"\n\t ===== Struk ===== " + "\nFilm : " + NamaFilm + "\nJumlah Tiket : " + JumTiket + "\nTotal Harga : " + objMain.HitungHarga() + "\nTotal Bayar : " + Uang +"\nKembalian : "+ objMain.Kembalian(),"Pembayaran",JOptionPane.INFORMATION_MESSAGE);

        }else if (evt.getActionCommand() == Actions.film2.name()){

            String JumTiket = JOptionPane.showInputDialog("Masukan Jumlah Tiket : ");
            System.out.println("Nama Film : Joker 2019");
            System.out.println("Masukan Jumlah Tiket : " + JumTiket);
            objMain.JumTiket = Integer.parseInt(JumTiket);
            String NamaFilm = "Joker 2019";
            System.out.println("Masukan Jumlah Tiket : " + JumTiket);
            objMain.JumTiket = Integer.parseInt(JumTiket);
            System.out.println("Total Harga : " + objMain.HitungHarga());
            JOptionPane.showMessageDialog(null,"\nPembayaran" + "\nTotal Tiket : " + JumTiket + "\nJumlah yang harus dibayar : " + objMain.HitungHarga(),"Bayar",JOptionPane.INFORMATION_MESSAGE);
            String Uang = JOptionPane.showInputDialog("Masukan Jumlah Uang : ");
            System.out.println("Masukan Jumlah Uang : " + Uang);
            objMain.Uang = Integer.parseInt(Uang);
            System.out.println("Total Kembalian : " + objMain.Kembalian());
            JOptionPane.showMessageDialog(null,"\n\t ===== Struk ===== " + "\nFilm : " + NamaFilm + "\nJumlah Tiket : " + JumTiket + "\nTotal Harga : " + objMain.HitungHarga() + "\nTotal Bayar : " + Uang +"\nKembalian : "+ objMain.Kembalian(),"Pembayaran",JOptionPane.INFORMATION_MESSAGE);

        }else if(evt.getActionCommand() == Actions.film3.name()){

            String JumTiket = JOptionPane.showInputDialog("Masukan Jumlah Tiket : ");
            System.out.println("Nama Film : Avangers : End Game");
            System.out.println("Masukan Jumlah Tiket : " + JumTiket);
            objMain.JumTiket = Integer.parseInt(JumTiket);
            String NamaFilm = "Avengers : End Game";
            System.out.println("Masukan Jumlah Tiket : " + JumTiket);
            objMain.JumTiket = Integer.parseInt(JumTiket);
            System.out.println("Total Harga : " + objMain.HitungHarga());
            JOptionPane.showMessageDialog(null,"\nPembayaran" + "\nTotal Tiket : " + JumTiket + "\nJumlah yang harus dibayar : " + objMain.HitungHarga(),"Bayar",JOptionPane.INFORMATION_MESSAGE);
            String Uang = JOptionPane.showInputDialog("Masukan Jumlah Uang : ");
            System.out.println("Masukan Jumlah Uang : " + Uang);
            objMain.Uang = Integer.parseInt(Uang);
            System.out.println("Total Kembalian : " + objMain.Kembalian());
            JOptionPane.showMessageDialog(null,"\n\t ===== Struk ===== " + "\nFilm : " + NamaFilm + "\nJumlah Tiket : " + JumTiket + "\nTotal Harga : " + objMain.HitungHarga() + "\nTotal Bayar : " + Uang +"\nKembalian : "+ objMain.Kembalian(),"Pembayaran",JOptionPane.INFORMATION_MESSAGE);


        }else if(evt.getActionCommand() == Actions.film4.name()){
            String JumTiket = JOptionPane.showInputDialog("Masukan Jumlah Tiket : ");
            System.out.println("Nama Film : Superman");
            System.out.println("Masukan Jumlah Tiket : " + JumTiket);
            objMain.JumTiket = Integer.parseInt(JumTiket);
            String NamaFilm = "Superman";
            System.out.println("Masukan Jumlah Tiket : " + JumTiket);
            objMain.JumTiket = Integer.parseInt(JumTiket);
            System.out.println("Total Harga : " + objMain.HitungHarga());
            JOptionPane.showMessageDialog(null,"\nPembayaran" + "\nTotal Tiket : " + JumTiket + "\nJumlah yang harus dibayar : " + objMain.HitungHarga(),"Bayar",JOptionPane.INFORMATION_MESSAGE);
            String Uang = JOptionPane.showInputDialog("Masukan Jumlah Uang : ");
            System.out.println("Masukan Jumlah Uang : " + Uang);
            objMain.Uang = Integer.parseInt(Uang);
            System.out.println("Total Kembalian : " + objMain.Kembalian());
            JOptionPane.showMessageDialog(null,"\n\t ===== Struk ===== " + "\nFilm : " + NamaFilm + "\nJumlah Tiket : " + JumTiket + "\nTotal Harga : " + objMain.HitungHarga() + "\nTotal Bayar : " + Uang +"\nKembalian : "+ objMain.Kembalian(),"Pembayaran",JOptionPane.INFORMATION_MESSAGE);

        }

        do{

            System.exit(0);

        }while(evt.getActionCommand() == Actions.Keluar.name());

    }

    private enum Actions {
        film1,
        film2,
        film3,
        film4,
        Keluar
    }
}
