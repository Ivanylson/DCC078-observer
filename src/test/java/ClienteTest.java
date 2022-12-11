import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveNotificarCliente(){
        Empresa empresa = new Empresa("Empresa 1", "Gerente 1");
        Cliente cliente1 = new Cliente("Cliente 1");
         cliente1.answerForm(empresa);
        empresa.novaResposta();
        assertEquals("Cliente 1, respondeu a pesquisa da empresa Empresa 1, gerente: Gerente 1", cliente1.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes(){
        Empresa empresa = new Empresa("Empresa 1", "Gerente 1");
        Cliente cliente1 = new Cliente("Cliente1");
        Cliente cliente2 = new Cliente("Cliente2");
        cliente1.answerForm(empresa);
        cliente2.answerForm(empresa);
        empresa.novaResposta();
        assertEquals("Cliente1, respondeu a pesquisa da empresa Empresa 1, gerente: Gerente 1", cliente1.getUltimaNotificacao());
        assertEquals("Cliente2, respondeu a pesquisa da empresa Empresa 1, gerente: Gerente 1", cliente2.getUltimaNotificacao());
    }

    @Test
    void deveNaoNotificarCliente(){
        Empresa empresa = new Empresa("Empresa 1", "Gerente 1");
        Cliente cliente = new Cliente("Cliente1");
        empresa.novaResposta();
        assertEquals(null, cliente.getUltimaNotificacao());
    }
}