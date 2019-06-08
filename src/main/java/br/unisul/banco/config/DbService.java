package br.unisul.banco.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class DbService {


    @Autowired
    public DbService() {
    }

    public void inicializaBancoDeDados() throws ParseException {


    }

}
