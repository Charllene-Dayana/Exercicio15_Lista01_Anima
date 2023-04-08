
//15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no
// mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11%
// para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double horas;
        double horasmes;
        double totalmes;
        double ir;
        double inss;
        double snd;
        double liquido;
        Scanner teclado = new Scanner(System.in);
        System.out.println("quanto você ganha por hora");
        horas = teclado.nextDouble();
        System.out.println("quantas horas você trabalha ao mes?");
        horasmes = teclado.nextDouble();
        totalmes = horasmes * horas;
        System.out.println("total ao mes " + totalmes);
        teclado.close();
        ir = totalmes * 0.11;
        inss = totalmes * 0.08;
        snd = totalmes * 0.05;
        liquido = totalmes * 0.76;
        System.out.println("salario bruto R$: " + totalmes);
        System.out.println("INSS R$: " + inss);
        System.out.println("imposto de renda R$: " + ir);
        System.out.println("sindicato R$: " + snd);
        System.out.println("salario liquido R$: " + liquido);
        teclado.close();
    }
}
