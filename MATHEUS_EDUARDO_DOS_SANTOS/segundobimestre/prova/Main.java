package Prova;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] options = { "Listar Pets", "Nova Mensagem", "Sair" };
        int choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Menu de Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        switch (choice) {
            case 0:
                Prova.ListagemPet.main(null);
                break;
            case 1:
                Prova.MensagemPet.main(null);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fechando o programa.");
                System.exit(0);
                break;
            default:

                break;
        }
    }
}
