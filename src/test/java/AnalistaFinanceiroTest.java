import org.example.AnalistaFinanceiro;
import org.example.RelatorioFinanceiro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnalistaFinanceiroTest {
    @Test
    void deveNotificarUmAnalista() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro("Balanço Patrimonial");
        AnalistaFinanceiro analista = new AnalistaFinanceiro("Joana");
        analista.assinar(relatorio);
        relatorio.publicar();
        assertEquals("Joana, atualização no Relatorio{nome='Balanço Patrimonial', status='Publicado'}", analista.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAnalistas() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro("Fluxo de Caixa");
        AnalistaFinanceiro analista1 = new AnalistaFinanceiro("Carlos");
        AnalistaFinanceiro analista2 = new AnalistaFinanceiro("Leila");
        analista1.assinar(relatorio);
        analista2.assinar(relatorio);
        relatorio.revisar();
        assertEquals("Carlos, atualização no Relatorio{nome='Fluxo de Caixa', status='Revisado'}", analista1.getUltimaNotificacao());
        assertEquals("Leila, atualização no Relatorio{nome='Fluxo de Caixa', status='Revisado'}", analista2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarAnalistaNaoAssinante() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro("Investimentos");
        AnalistaFinanceiro analista = new AnalistaFinanceiro("Paulo");
        relatorio.publicar();
        assertNull(analista.getUltimaNotificacao());
    }
}
