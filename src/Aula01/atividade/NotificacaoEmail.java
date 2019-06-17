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
public class NotificacaoEmail extends Notificacao{
    JavaMailApp j = new JavaMailApp();
    public String enviar(){
        j.enviar(); //Email
        return "Notificação enviada por email"; //Console
    }
}
