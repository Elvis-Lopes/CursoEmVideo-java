/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author elvis
 */
public class Conexao {
    public static void main (String [] args){
        
        Exercicio conexao = new Exercicio();
        conexao.conectar();
        conexao.listar();
        conexao.pesquisaID(1);
        conexao.insere("joao", 10, "escravo", (float)150);
        conexao.deleta_reg("cargo=\"escravo\"");
        conexao.atualiza_salario(100, 1);
        conexao.desconectar();
        
        
        
    }
    
    
}
