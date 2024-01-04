public class Funcionario {
    public static final double LIMITE_INSS = 5000.0;
    public static final double PERCENT_INSS = 0.045;
    public static final double LIMITE_IRPF = 2500.0;
    public static final double PERCENT_IRPF = 0.20;
    
    private int matricula;
    private String nome;
    private double salarioBase;
    
    public Funcionario(int matricula, String nome, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getInss(){
        if (this.getSalarioBase() <= Funcionario.LIMITE_INSS){
            return this.getSalarioBase() * Funcionario.PERCENT_INSS;
        }else{
            return (Funcionario.LIMITE_INSS * Funcionario.PERCENT_INSS);
        }
    }

    public double getIRPF(){
        if (this.getSalarioBase() <= Funcionario.LIMITE_IRPF){
            return 0.0;
        }
        double dif = this.getSalarioBase() - Funcionario.LIMITE_IRPF;
        return dif * Funcionario.PERCENT_IRPF;
    }

    public double getSalarioLiquido(){
        return this.getSalarioBase() - this.getInss() - this.getIRPF();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" [matricula=" + matricula + ", nome=" + nome + ", salarioBase=" + salarioBase + "]";
    }
}
