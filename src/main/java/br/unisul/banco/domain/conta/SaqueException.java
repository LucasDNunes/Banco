package br.unisul.banco.domain.conta;

import br.unisul.banco.core.support.MessageBundle;

public class SaqueException extends RuntimeException {
    public SaqueException(Double valorAtual) {
        super(MessageBundle.getMessage("exception.SaqueException", valorAtual));
    }
}
