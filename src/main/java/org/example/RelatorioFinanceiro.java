package org.example;
import java.util.Observable;

public class RelatorioFinanceiro extends Observable {
    private String nomeRelatorio;
    private String status;
    public RelatorioFinanceiro(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
        this.status = "Em elaboração";
    }
    public void publicar() {
        this.status = "Publicado";
        setChanged();
        notifyObservers();
    }
    public void revisar() {
        this.status = "Revisado";
        setChanged();
        notifyObservers();
    }
    @Override
    public String toString() {
        return "Relatorio{" +
                "nome='" + nomeRelatorio + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public String getStatus() { return status; }
}
