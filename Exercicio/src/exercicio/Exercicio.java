/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.sql.*;

/**
 *
 * @author elvis
 */


    



public class Exercicio {
    
private final String user="root";
    private final String password="";
    private final String url="jdbc:mysql://localhost:3306/empresa";
    private Connection con;
    private Statement st;
    private ResultSet res;
    
    public void conectar(){
        try {
            con=DriverManager.getConnection(url,user,password);
            st=con.createStatement();
            
            System.out.println("Sucesso na conexão");
            
        } catch (SQLException e) {
            System.out.println("falha na coneão");
        }
    }
    
    public void desconectar(){
        try {
            st.close();
            con.close();
            
            System.out.println("Conexão encerrada");
        } catch (SQLException e) {
            System.out.println("Falha ao desconectar");
        }
    }
    
    public void listar(){
        try {
            
            res=st.executeQuery("SELECT * FROM cadastro ORDER BY id");
            while(res.next()){
                System.out.println("ID:"+  res.getInt("id")+ "Nome: "+ res.getString("nome")
                                   + "Idade: "+ res.getInt("idade")+"Cargo"+ res.getString("cargo")
                                   +"Salario"+res.getFloat("salario"));
                
                       
            }
        } catch (SQLException e) {
            System.out.println("Erro na listagem");
        }
    }
    
    public void pesquisaID (int id){
        try {
            res=st.executeQuery("SELECT * FROM cadastro WHERE id="+id);
            if(res.next()){
                System.out.println("ID:"+  res.getInt("id")+ "Nome: "+ res.getString("nome")
                                   + "Idade: "+ res.getInt("idade")+"Cargo"+ res.getString("cargo")
                                   +"Salario"+res.getFloat("salario"));
               
            }else{
                System.out.println("Não encontro");
            }
        } catch (SQLException e) {
            System.out.println("falha "+ e);
        }
    }
    
   public void insere(String nome, int idade, String cargo, float salario){
        try {
            //System.out.println("INSERT INTO cadastro (nome,idade,cargo,salario) VALUES('"+nome+"',"+idade+","+"'"+cargo+"'"+","+salario);
             st.executeUpdate("ID:"+  res.getInt("id")+ "Nome: "+ res.getString("nome")
                                   + "Idade: "+ res.getInt("idade")+"Cargo"+ res.getString("cargo")
                                   +"Salario"+res.getFloat("salario"));
             
           
        } catch (SQLException e) {
            System.out.println("Erro inserindo: "+e);
        }
    }
   
    public void deleta_reg(String cond){
        try {
            st.executeUpdate("DELETE FROM cadastro WHERE "+cond);
        } catch (SQLException e) {
            System.out.println("Erro deletando: "+e);
        }
    }
   
    public void atualiza_salario(float salario,int id){
        try {
            st.executeUpdate("UPDATE cadastro SET salario="+salario+"WHERE id="+id);
        } catch (SQLException e) {
            System.out.println("Erro atualizando: "+e);
        }
    }
}
