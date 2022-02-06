package br.com.jhegnerlabs.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class AprenderCucumberSteps {

    @Dado("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
    }

    @Quando("executá-lo")
    public void executa_lo() {
    }

    @Entao("a especificação deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() {
    }

    private int contador = 0;
    @Dado("que o valor do contador é {int}")
    public void que_o_valor_do_contador_eh(int int1) {
        contador = int1;
    }

    @Quando("eu incrementar em {int}")
    public void eu_incrementar_em(int int1) {
        contador += int1;
    }

    @Entao("o valor do contador sera {int}")
    public void o_valor_do_contador_sera(int int1) {
        Assert.assertEquals(int1, contador);
    }

    @Dado("que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
    public void que_a_entrega_eh_dia(String arg0, String arg1, String arg2) {
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
    }

    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
    public void a_entrega_atrasar_em_dias(Integer arg0, String tempo) {
        System.out.println(arg0);
        System.out.println(tempo);
    }

    @Entao("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void a_entrega_sera_efetuada_em(String arg0) {
        System.out.println(arg0);
    }

    @Dado("^que o ticket( especial)? é (A.\\d{3})$")
    public void que_o_ticket_eh_AF(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }

    @E("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void que_o_valor_da_passagem_eh_r$(int arg1, int arg2) {
        System.out.println(arg1);
        System.out.println(arg2);
    }

    @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
    public void que_o_nome_do_passageiro_eh(String string) {
    }

    @Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void que_o_telefone_do_passageiro_eh(String arg0) {
        System.out.println(arg0);
    }

    @Quando("criar os steps")
    public void criar_os_steps() {
    }

    @Entao("o teste vai funcionar")
    public void o_teste_vai_funcionar() {
    }

}
