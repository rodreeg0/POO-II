package Aula01.atividade;

public class Main {
    public static void main(String[] args){
        Notificacao n = new NotificacaoEmail();
        Alerta a = new Alerta(n);
        System.out.println(a.dispararAlerta());     
    }
}
