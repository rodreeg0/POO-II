package Aula04MVC.ProjetoVendas.DTO;

/**
 *
 * @author rodriguh
 */
public class Produto {
    private int id;
    private int estoque;
    private String descricao;
    private float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    /**
     * Valor usado por padrão no combobox
     *
     * @return String nome
     */
    @Override
    public String toString() {
        return this.getDescricao();
    }
}
