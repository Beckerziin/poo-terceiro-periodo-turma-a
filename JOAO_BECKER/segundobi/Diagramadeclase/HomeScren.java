package segundobi.Diagramadeclase;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class HomeScren extends JFrame{
    JTextField textFieldTitle = new JTextField();
    JTextField textFieldDiscription = new JTextField();
    JFrame postScreen = new JFrame();
    Color mainColor = Color.decode("#98E08B");
    Color textColor = Color.decode("#FEFEFE");
    JTextArea textAreaPostDiscription = new JTextArea("");
    JLabel labelPostTitle = new JLabel("");
    JLabel labelPostedBy = new JLabel("");
    
//TELA PRINCIPAL
    public HomeScren(){

        Font fontButton = new Font("Arial", Font.BOLD, 12);
        Font fontTitle = new Font("Arial", Font.BOLD, 20);
        setTitle("HellPet");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,800,500);
        panel.setLayout(null);
        panel.setBackground(mainColor);

        labelPostTitle.setFont(fontTitle);
        labelPostTitle.setForeground(textColor);
        labelPostTitle.setBounds(30,0,740,50);

        labelPostedBy.setFont(fontTitle);
        labelPostedBy.setForeground(textColor);
        labelPostedBy.setBounds(30,350,740,50);

        JButton button1 = new JButton("Realizar postagem");
        button1.setFont(fontButton);
        button1.setForeground(textColor);
        button1.setBackground(mainColor);
        button1.setBounds(570,400,200,50);

        textAreaPostDiscription.setFont(fontTitle);
        textAreaPostDiscription.setForeground(textColor);
        textAreaPostDiscription.setBackground(mainColor);
        textAreaPostDiscription.setEditable(false);
        textAreaPostDiscription.setColumns(60);
        textAreaPostDiscription.setRows(5); 
        textAreaPostDiscription.setLineWrap(true);
        textAreaPostDiscription.setWrapStyleWord(true);
        textAreaPostDiscription.setBounds(30, 40,740,310);

        add(panel);
        panel.add(textAreaPostDiscription);
        panel.add(labelPostTitle);
        panel.add(labelPostedBy);
        panel.add(button1);


        button1.addActionListener(this::buttonPost);

    }
    
//POSTAGEM

    public void buttonPost(ActionEvent e){
        textFieldTitle.setText("");
        textFieldDiscription.setText("");
        Font fontBotao = new Font("Arial", Font.BOLD, 12);
        postScreen.setTitle("HellPet");
        postScreen.setSize(800,500);
        postScreen.setResizable(false);
        postScreen.setLocationRelativeTo(null);
        postScreen.getContentPane().setBackground(mainColor);
        postScreen.setVisible(true);
        postScreen.setLayout(null);

        JLabel titleLabel =  new JLabel("Título:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 15));
        titleLabel.setBounds(30,10, 80, 50);
        titleLabel.setForeground(textColor);

        textFieldTitle.setFont(new Font("Arial", Font.PLAIN, 15));
        textFieldTitle.setBounds(30,45, 735, 50);
        textFieldTitle.setForeground(textColor);
        textFieldTitle.setBackground(mainColor);

        JLabel discriptionLabel =  new JLabel("Descrição:");
        discriptionLabel.setFont(new Font("Arial", Font.BOLD, 15));
        discriptionLabel.setBounds(30,100, 80, 50);
        discriptionLabel.setForeground(textColor);

        textFieldDiscription.setFont(new Font("Arial", Font.PLAIN, 15));
        textFieldDiscription.setBounds(30,135, 735, 50);
        textFieldDiscription.setForeground(textColor);
        textFieldDiscription.setBackground(mainColor);

        JButton buttonPost = new JButton("Postar");
        buttonPost.setBounds(30,380, 100, 50);
        buttonPost.setFont(fontBotao);
        buttonPost.setForeground(textColor);
        buttonPost.setBackground(mainColor);

        JButton buttonCancel = new JButton("Cancelar");
        buttonCancel.setBounds(170,380, 100, 50);
        buttonCancel.setFont(fontBotao);
        buttonCancel.setForeground(textColor);
        buttonCancel.setBackground(mainColor);

        postScreen.add(buttonPost);
        postScreen.add(buttonCancel);
        postScreen.add(titleLabel);
        postScreen.add(discriptionLabel);
        postScreen.add(textFieldTitle);
        postScreen.add(textFieldDiscription);

        buttonCancel.addActionListener(this::cancelar);
        buttonPost.addActionListener(this::post);
    }

    public void post(ActionEvent e){
        Post testPost = new Post(textFieldTitle.getText(), textFieldDiscription.getText(), new User("email@email.com", "usuarioteste", "1234", null));
        labelPostTitle.setText(testPost.getTitle());
        textAreaPostDiscription.setText(testPost.getDiscription());
        labelPostedBy.setText("Postado por: "+testPost.getUser().getName());
        postScreen.setVisible(false);    
    }

    public void cancelar(ActionEvent e){
        postScreen.setVisible(false);
    }

}