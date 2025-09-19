public class ItemVenda{
    private Produto produto;
    private int quantidade;
    private double subtotal;

    public ItemVenda(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = 0.0;
    }
    public double calcularSubtotal(){
        return subtotal = produto.preco * quantidade;
    }
    public Produto getProduto(){
        return this.produto;
    }
    public int getQuantidade(){
        return quantidade;
    }
}