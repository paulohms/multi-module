package br.com.paulo.model;

public class Sms implements Notificador {

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("Mensagem por SMS: " + mensagem);
    }

}