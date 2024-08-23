package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args ) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> ListasDeFinanciamentos = new ArrayList<>();

        double taxaJuros = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamentoEmAnos, taxaJuros);
        ListasDeFinanciamentos.add(financiamento);


        if (ListasDeFinanciamentos.contains(financiamento)) {
            System.out.println("Adicionado com sucesso!");
        } else {
            System.out.println("Erro ao adicionar a lista.");
        }
    System.out.println("Valor do pagamento mensal: R$ + String.format(%.2f\n", financiamento.calcularPagamentoMensal()));
        System.out.println("Valor do pagamento anual total: R$ + String.format %.2f\n", financiamento.calcularTotalPagamento()));
    }
}