public class PessoaMain {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa("Gabriel", 20);

        pessoa.exibirInformacoes();
        pessoa.aniversario(); 
        pessoa.exibirInformacoes();
    }
}
