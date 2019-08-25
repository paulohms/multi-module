package br.com.paulo.model;

public class Email implements Notificador {

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("Mensagem por e-mail: " + mensagem);
    }

}
