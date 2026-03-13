package br.com.fiap.bean;

public class FolhaDePagamento {
    public double salarioBruto;
    public double descontoINSS;
    public double valorPlanoDeSaude;
    public int numeroDeDependetes;

    public double calcularSalarioLiquido(){
        double desconto1, desconto2, salarioLiquido;
        desconto1 = salarioBruto * (descontoINSS / 100);
        desconto2 = valorPlanoDeSaude * (numeroDeDependetes + 1);
        salarioLiquido = salarioBruto - (desconto1 + desconto2);
        return salarioLiquido;
    }
}
