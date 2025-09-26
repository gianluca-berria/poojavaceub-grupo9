import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda{
    private int id;
    private Date data;
    private List<ItemVenda> itens;
    private double valorTotal; 

    public Venda(int id, Date data){
        this.id = id;
        this.data = data;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }
    public void adicionarProduto(Produto p, int qtd){
        ItemVenda item = new ItemVenda(p, qtd);
        this.itens.add(item);
    }
    public void exibirItens() {
    for (ItemVenda item : itens) {
        System.out.println(item.getQuantidade() + "x " + item.getProduto().getNome() + 
                           " (R$ " + item.getProduto().getPreco() + " cada)");
        }
    }
    private double calcularTotal(){
        double total = 0.0;
        for (ItemVenda item : itens){
            total += item.calcularSubtotal();
        }
        this.valorTotal = total;
        return total;
    }
    public double getValorTotal(){
        return calcularTotal();
    }
}
