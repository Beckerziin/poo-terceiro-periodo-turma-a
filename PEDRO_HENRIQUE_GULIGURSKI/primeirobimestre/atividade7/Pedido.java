package primeirobimestre.atividade7;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pedido {
    private Integer id;
    private Date dataCriacao = new Date();
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente clientePedido;
    private Vendedor vendedorPedido;
    private Loja lojaPedido;
    private Item[] itensPedido = new Item[30];

    public Pedido(Integer id, Cliente clientePedido, Vendedor vendedorPedido, Loja lojaPedido , Item[] itensPedido){
        long umDia = 86400000l;
        long dataTresDias = dataCriacao.getTime() + (umDia*3);
        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(dataTresDias);
        this.lojaPedido = lojaPedido;
        this.clientePedido = clientePedido;
        this.vendedorPedido = vendedorPedido;
        this.itensPedido = itensPedido;
    }

    public float calcularValorTotal(){
        float valorTotalPedido = 0.0f;
        for(int i = 0; i <= itensPedido.length;){
            valorTotalPedido = itensPedido[i].getValor();
        }
        return valorTotalPedido%.2f;
    }

    public String gerarDescricaoVenda(){
        String formCriacao = new SimpleDateFormat("dd/MM/yyyy").format(dataCriacao);
        String desc = "Descrição do Pedido: "
            .concat("Data de criação do pedido: "+formCriacao+".")
            .concat("Valor do pedido: "+calcularValorTotal()+".");
        System.out.println(desc);
        return desc;
    }

    public Date getDataPagamento(){
        return dataPagamento;
    }

    public Date setDataPagamento(){
        dataPagamento = new Date();
        return dataPagamento;
    }

    public Date getDataVencimentoReserva(){
        return dataVencimentoReserva;
    }

    public Integer getId(){
        return id;
    }

    public String getCliente(){
        return clientePedido.getNome();
    }

    public String getVendedor(){
        return vendedorPedido.getNome();
    }

    public String getLoja(){
        return lojaPedido.getNomeFantasia();
    }
}