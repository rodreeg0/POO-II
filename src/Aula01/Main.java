package Aula01;

public class Main {
    public static void main(String[] args){
        NotificacaoInterface n = new Notificacao();
        Alerta a = new Alerta(n);
        System.out.println(a.dispararAlerta());     
    }
}
