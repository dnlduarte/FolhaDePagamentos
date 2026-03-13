package br.com.fiap.main;
import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args){
        FolhaDePagamento folha = new FolhaDePagamento();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        String auxiliar;
        try {
            //leitura das informaçoes

            auxiliar = JOptionPane.showInputDialog("Digite o Salário Bruto: ");
            salarioBruto = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite numero de Dependentes: ");
            numeroDeDependentes = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o desconto INSS: ");
            descontoINSS = Double.parseDouble(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o valor do Plano de Saúde: ");
            valorPlanoDeSaude = Double.parseDouble(auxiliar);

            //armazenar valores nos respectiveis atributos

            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependetes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;

            //exibindo info e resultados

            String mensagem = String.format("Salário Bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f%%\nPlano de Saúde: R$ %.2f\nSalario Liquido: R$ %.2f", folha.salarioBruto, folha.numeroDeDependetes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());
            JOptionPane.showMessageDialog(null,mensagem);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Formato incorreto");
        }
    }
}
