public class App 
{
    public static void main( String[] args )
    {
        Funcionario f1 = new Funcionario(100,"Ze Luis Cunha", 1000.0);

        System.out.println(f1);
        System.out.println(f1.getInss());
        System.out.println(f1.getIRPF());
        System.out.println(f1.getSalarioLiquido());
    }
}
