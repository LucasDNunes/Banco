package br.unisul.banco.core.exception;

import br.unisul.banco.core.support.MessageBundle;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RegistroNaoEncontradoException extends RuntimeException {
    public RegistroNaoEncontradoException(String entidade, Object id) {
        super(MessageBundle.getMessage("exception.RegistroNaoEncontradoException", entidade, id));
    }
}
