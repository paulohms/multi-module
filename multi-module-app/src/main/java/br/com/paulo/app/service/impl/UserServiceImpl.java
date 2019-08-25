package br.com.paulo.app.service.impl;

import br.com.paulo.app.service.UserService;
import br.com.paulo.model.Mensagem;
import br.com.paulo.model.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Notificador notificador;

    @Override
    public void notifySystem() {
        notificador.notificar(new Mensagem("Assunto teste", "Corpo da mensagem"));
    }

}
