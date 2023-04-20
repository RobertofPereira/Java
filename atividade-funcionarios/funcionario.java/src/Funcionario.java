public class Funcionario {
   private String nome;
   private short chapa;
   private float valorHora;

   public Funcionario(String nome, short chapa, float valorHora) {
    this.nome = nome;
    this.chapa = chapa;
    this.valorHora = valorHora;

    }

    private float calcularDescontoINSS(float salario) {
        return salario * 0.11f;

    }

    private float calcularDescontoIR(float salario) {
        return salario * 0.75f;

    }

    public float calcularSalarioLiquido(short numeroDeHorasTrabalhadas) {
        float salarioBruto = numeroDeHorasTrabalhadas * valorHora;
        float descontoINSS = calcularDescontoINSS(salarioBruto);
        float descontoIR = calcularDescontoIR(salarioBruto);
        float salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        return salarioLiquido;
    }

}


