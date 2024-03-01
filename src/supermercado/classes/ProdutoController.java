/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado.classes;

/**
 *
 * @author Fernando T.
 */

public class ProdutoController {
    Validacao validacao;
    BancoDados bancoDados;

    public ProdutoController(Validacao validacao, BancoDados bancoDados) {
        this.validacao = validacao;
        this.bancoDados = bancoDados;
    }      
    
    public boolean salvarProduto(ProdutoEntity produto) {
        
        if (validacao.validacao(produto)){               
            bancoDados.salvarNoBanco(produto);
            System.out.println("Produto salvo com sucesso");
            return true;
        } else {
            System.out.println("Erro ao salvar produto");
            return false;
        }
    }                 
}
