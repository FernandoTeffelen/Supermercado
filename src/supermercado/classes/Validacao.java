/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado.classes;

/**
 *
 * @author Fernando T.
 */

public class Validacao{                
    
    public boolean validacao(ProdutoEntity produto) {
        return !produto.getNome().isEmpty();
    }          
}
