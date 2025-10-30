package org.example;
import org.example.RelatorioFinanceiro;

import java.util.Observer;
import java.util.Observable;

public class AnalistaFinanceiro implements Observer {
    private String nome;
    private String ultimaNotificacao;
    public AnalistaFinanceiro(String nome) {
        this.nome = nome;
    }
    public void assinar(RelatorioFinanceiro relatorio) {
        relatorio.addObserver(this);
    }
    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
    @Override
    public void update(Observable relatorio, Object arg1) {
        this.ultimaNotificacao = this.nome + ", atualização no " + relatorio.toString();
    }
}
