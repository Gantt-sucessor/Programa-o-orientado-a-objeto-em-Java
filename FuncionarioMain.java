public class FuncionarioMain {
    public static void main(String[] args) throws Exception {
       
        Funcionario funcionario = new Funcionario(
            "Gabriel", 5000, 1000, "Tecnico de TI");

        funcionario.mostrarInformacoes();
        funcionario.calculoSalarioReal();
    }
}
