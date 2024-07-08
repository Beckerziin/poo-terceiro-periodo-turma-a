package Prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class MensagemPet {
    public static void main(String[] args) {
        String mensagem = msgPet();
        if (mensagem != null) {
            String substringMensagem = mensagem.length() > 200 ? mensagem.substring(0, 200) : mensagem;
            JOptionPane.showMessageDialog(null, substringMensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static String msgPet() {
        try {
            String id = JOptionPane.showInputDialog("Digite o Id do pet");
            if (id.length() != 1) {
                JOptionPane.showMessageDialog(null, "Informe o Id do pet.", "Erro", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            String nome = JOptionPane.showInputDialog("Digite o Nome do pet");
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe um nome válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            String imagem = JOptionPane.showInputDialog("Digite a URL da foto:");
            if (imagem.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe uma imagem válida.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            ;
            String mensagem = JOptionPane.showInputDialog("Digite a sua mensagem");
            if (mensagem.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe uma mensagem válida.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            URL url = new URL("https://poo-exam.vercel.app/api/messages");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                    "  \"id\": \"" + id + "\",\r\n" + //
                    "  \"description\": \"" + mensagem + "\",\r\n" + //
                    "  \"name\": \"" + nome + "\",\r\n" + //
                    "  \"imageUrl\": \"" + imagem + "\"\r\n" + //
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(
            new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line.trim());
            }

            reader.close();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
