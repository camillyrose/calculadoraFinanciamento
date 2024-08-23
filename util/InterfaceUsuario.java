package util;


import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        System.out.println("Por favor, digite o valor do imóvel:");
        return this.scanner.nextDouble();
    }

    public int pedirPrazoFinanciamento() {
        System.out.println("Por favor digite o prazo do financiamento:");
        return this.scanner.nextInt();
    }

    public double pedirTaxaJuros() {
        System.out.println("Por favor digite a taxa de juros:");
        return this.scanner.nextDouble();
    }
}
