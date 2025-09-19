public class Acessorio extends Produto {
    private String material;

    public Acessorio(int codigo, String nome, double preco, Categoria categoria, String material) {
        super(codigo, nome, preco, categoria);
        this.material = material;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Acessório: " + getNome()
                         + " | Material: " + material
                         + " | Preço: R$ " + getPreco()
                         + " | Categoria: " + getCategoria());
    }
}
