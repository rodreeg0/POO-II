/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01.atividade;

/**
 *
 * @author rodriguh
 */
public class Alerta {
    protected Notificacao notificacao;
    
    public Alerta(Notificacao notificacao){
        this.notificacao = notificacao;
    }
    
    public String dispararAlerta(){
        return this.notificacao.enviar();
    }
}
