package PboTuKel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MainProg implements ActionListener{

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {

        JPanel panel = new JPanel(); // inisialisasi JPanel dengan nama panel
        JFrame frame = new JFrame(); // inisialisasi JFrame dengan nama frame
        frame.setSize(350,200); // membuat frame dengan ukuran 350 x 200 px
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Kotak Username //
        userLabel = new JLabel("User"); // membuat label user
        userLabel.setBounds(10,20,80,25); // mengatur posisi dan membuat ukuran label user
        panel.add(userLabel);

        userText = new JTextField(20); // membuat kolom untuk mengisi user id
        userText.setBounds(100,20,165,25); // mengatur posisi dan membuat ukuran kolom pengisian
        panel.add(userText);

        // Kotak Password //
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // tombol login //
        button = new JButton("Login"); // membuat button login
        button.setBounds(10,80,80,25); // mengatur posisi dan ukuran botton
        button.addActionListener((ActionListener) new MainProg()); // membuat botton interaktif
        panel.add(button);

        success = new JLabel(); // membuat panel tulisan jika login berhasil
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) { // berfungsi sebagai aksi saat tombol login diketik

        clsMain objMain = new clsMain(); // inisialisasi clsMain dengan objMain
        Menu objMenu = new Menu();
        String IdUser = userText.getText();
        String PassUser = passwordText.getText();
        System.out.println("==== Kasir Cinema EKEKWAN ====");
        System.out.println("Username : " + IdUser);
        System.out.println("Password : " + PassUser);

        if(IdUser.equals(objMain.IdUser()) && PassUser.equals(objMain.PassUser())){

            success.setText("Login Successfull!");
            objMenu.MenuPil();

        }else{
            JOptionPane.showMessageDialog(null,"Password Salah Coba Lagi","Warning",JOptionPane.ERROR_MESSAGE);
            success.setText("Wrong Password");

        }

    }
}
