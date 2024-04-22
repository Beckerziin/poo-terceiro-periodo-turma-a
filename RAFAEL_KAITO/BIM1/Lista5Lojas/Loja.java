package BIM1.Lista5Lojas;

    import java.util.ArrayList;

public class Loja {
            private String nomeLoja;
            private String razaoSocial;
            private String cnpj;
            private String cidade;
            private String bairro;
            private String rua;
            private ArrayList <Integer> listaClientes = new ArrayList<>();
            private ArrayList <Integer> listaVendedores = new ArrayList<>();


            public Loja(String nomeLoja, String razaoSocial, String cnpj, String cidade, String bairro, String rua,
                    ArrayList<Integer> listaClientes, ArrayList<Integer> listaVendedores) {
                this.nomeLoja = nomeLoja;
                this.razaoSocial = razaoSocial;
                this.cnpj = cnpj;
                this.cidade = cidade;
                this.bairro = bairro;
                this.rua = rua;
                this.listaClientes = listaClientes;
                this.listaVendedores = listaVendedores;
            }


            public int contarClientes(){
                return this.listaClientes.size();
            }


            public int contarVendedores(){
                return this.listaVendedores.size();
            }


            public void apresentarse(){
                System.out.println("Loja " + nomeLoja + ", de cnpj: " + cnpj + ", localizada na cidade de " + cidade + ", " + bairro + ", " + rua);
            }
}
