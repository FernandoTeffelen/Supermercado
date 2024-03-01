/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author Fernando T.
 */

import supermercado.classes.ProdutoEntity;
import supermercado.classes.ProdutoController;
import supermercado.classes.BancoDados;
import supermercado.classes.Validacao;

public class Supermercado {

    public static void main(String[] args) {
        ProdutoEntity produto = new ProdutoEntity();
        produto.setId(1);
        produto.setNome("Refrigerante");
        produto.setPreco(10.90);
        
        BancoDados b = new BancoDados();
        Validacao v = new Validacao();
        ProdutoController cp = new ProdutoController(v, b);
        cp.salvarProduto(produto);
    }
}
