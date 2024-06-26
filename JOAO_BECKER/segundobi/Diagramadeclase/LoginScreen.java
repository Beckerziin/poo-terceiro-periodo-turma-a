package segundobi.Diagramadeclase;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginScreen implements ActionListener{
    User usuario = new User("email@email.com", "usuarioteste", "1234", null); 
    JPasswordField passwordTextField = new JPasswordField();
    JTextField emailTextField = new JTextField();
    JFrame  loginScreen = new JFrame();
//TELA LOGIN
    public LoginScreen(){
        Color colorPricipal = Color.decode("#98E08B");
        Color colorText = Color.decode("#FEFEFE");
        Font fontButton = new Font("Arial", Font.BOLD, 12);
        loginScreen.setTitle("HellPet");
        loginScreen.setSize(800,500);
        loginScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginScreen.setResizable(false);
        loginScreen.setLocationRelativeTo(null);
        loginScreen.getContentPane().setBackground(colorPricipal);
        loginScreen.setVisible(true);


        JButton buttonLogin = new JButton("Entrar");
        buttonLogin.setBounds(300,300, 200, 50);
        buttonLogin.setFont(fontButton);
        buttonLogin.setForeground(colorText);
        buttonLogin.setBackground(colorPricipal);

        buttonLogin.setVisible(true);

        loginScreen.add(buttonLogin);

        JLabel emailText = new JLabel("E-mail:");
        emailText.setFont(new Font("Arial", Font.BOLD, 20));
        emailText.setBounds(250,30, 800, 50);
        emailText.setForeground(colorText);

        loginScreen.add(emailText);
        
        emailTextField.setFont(new Font("Arial", Font.BOLD, 20));
        emailTextField.setBounds(250, 75, 300, 50);
        emailTextField.setForeground(colorText);
        emailTextField.setBackground(colorPricipal);

        loginScreen.add(emailTextField);

        JLabel passwordText = new JLabel("Senha:");
        passwordText.setFont(new Font("Arial", Font.BOLD, 20));
        passwordText.setBounds(250,155, 800, 50);
        passwordText.setForeground(colorText);
        
        loginScreen.add(passwordText);

        passwordTextField.setFont(new Font("Arial", Font.BOLD, 20));
        passwordTextField.setBounds(250, 200, 300, 50);
        passwordTextField.setForeground(colorText);
        passwordTextField.setBackground(colorPricipal);

        loginScreen.add(passwordTextField);

        buttonLogin.addActionListener(this);
    }

    public void buttonLonginAction(ActionListener e){
        if(usuario.getEmail().equals(emailTextField.getText()) && usuario.getPassword().equals(passwordTextField.getText())){
            loginScreen.setVisible(false);
            HomeScren screen = new HomeScren();
        }else{
            passwordTextField.setText("");
            JOptionPane.showMessageDialog(null, "Senha ou e-mail incorretos", "HellPet", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e){
        buttonLonginAction(null);
    }
}
