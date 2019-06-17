/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05.Atividade;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rodriguh
 */
public class Conexao {
    
    private static Conexao con;
    final static String NOME_DO_BANCO = "mvc";
    
    private Conexao(){
        
    }
    
    public static Conexao getInstance(){
        if(con==null)
            con = new Conexao();
        return con;
    }
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+NOME_DO_BANCO;
            return DriverManager.getConnection(url, "root", "");
        }catch(Exception e){
            System.err.println("Erro: "+e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
