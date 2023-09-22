package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemsList;

    public CarrinhoDeCompras() {
        this.itemsList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemsList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsARemover = new ArrayList<>();
        for(Item i: itemsList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemsARemover.add(i);
            }
        }
        itemsList.removeAll(itemsARemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        for(Item i: itemsList) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemsList);
    }
}
