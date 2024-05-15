package ATIVIDADE_5;

public class Endereco {

    String estado;
    String cidade;
    String bairro;
    String numero;
    String complemento;

    public Endereco(String estado, String cidade, String bairro, String numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        System.out.println("Endereço: " + this.estado + ", " + this.cidade + ", " + this.bairro + ", " + this.numero
                + ", " + this.complemento);
    }
}
