package conceitosOO;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jão Paulo");
        funcionario.setCargo("Vendedor");
        funcionario.setIdade(40);

        System.out.println(funcionario);
    }
}
