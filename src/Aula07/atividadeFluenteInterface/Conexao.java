/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07.atividadeFluenteInterface;

/**
 *
 * @author rodriguh
 */
public class Conexao {
    String host;
    int porta;
    String user;
    String pass;
    
    public Conexao conectarEm(String host){
        this.host = host;
        return this;
    }
    
    public Conexao pelaPorta(int porta){
        this.porta = porta;
        return this;
    }
    
    public Conexao usandoUsuario(String usuario){
        this.user = usuario;
        return this;
    }
    
    public Conexao comSenha(String pass){
        this.pass = pass;
        return this;
    }

    @Override
    public String toString() {
        return "Conexao{" + "host=" + host + ", porta=" + porta + ", user=" + user + ", pass=" + pass + '}';
    }
    
}
