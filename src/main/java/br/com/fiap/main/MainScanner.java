package br.com.fiap.main;
import br.com.fiap.bean.FolhaDePagamento;
import java.util.Scanner;

public class MainScanner {
        public static void main(String[] args){
            FolhaDePagamento folha = new FolhaDePagamento();
            double salarioBruto, descontoINSS, valorPlanoDeSaude;
            int numeroDeDependentes;
            Scanner scan;
            try {
                scan = new Scanner(System.in);

                //leitura das informaçoes
                System.out.println("Digite o salario bruto: ");
                salarioBruto = scan.nextDouble();

                System.out.println("Digite desconto INSS: ");
                descontoINSS = scan.nextDouble();

                System.out.println("Digite valor do plano de saude: ");
                valorPlanoDeSaude = scan.nextDouble();

                System.out.println("Digite o numero de dependetes: ");
                numeroDeDependentes = scan.nextInt();

                //armazenar valores nos respectiveis atributos

                folha.salarioBruto = salarioBruto;
                folha.numeroDeDependetes = numeroDeDependentes;
                folha.descontoINSS = descontoINSS;
                folha.valorPlanoDeSaude = valorPlanoDeSaude;

                //exibindo informaçoes e resultados

                System.out.printf("Salário Bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f%%\nPlano de Saúde: R$ %.2f\nSalario Liquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependetes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
            } catch (Exception e){
                System.out.println("Formato Incorreto!");
            }

        }
}
