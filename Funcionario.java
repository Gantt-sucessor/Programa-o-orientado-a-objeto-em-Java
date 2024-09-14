public class Funcionario {
    
    String nome;
    double salario, salarioliquido, desconto;
    String cargofuncionario;

    public Funcionario(String nome, double salario, double desconto,String cargofuncionario){

        this.nome = nome;
        this.salario = salario;
        this.desconto = desconto;
        this.cargofuncionario =  cargofuncionario;

    }
    public void mostrarInformacoes(){
        System.out.println("Nome do funcionário: "+nome);
        System.out.println("Salario sem descontos: "+salario);
        System.out.println("Quantos de desconto seu salario tem: "+desconto);
        System.out.println("Qual o cargo do funcionário: "+cargofuncionario);

    }

    public void calculoSalarioReal(){

        salarioliquido = salario - desconto;
        System.out.println("Novo salario ficou: "+salarioliquido);

    }

    public String getNome(){

        return nome;

    }
    public void setNome(String nome){

        this.nome = nome;
        
    }
    public double getSalario(){

        return salario;

    }
    public void setSalario(double salario){

        this.salario = salario;

    }

    public double getSalarioLiquido(){

        return salarioliquido;

    }

    public void setSalarioLiquido(double salarioliquido){
        this.salarioliquido = salarioliquido;

    }
    public double getDesconto(){

        return desconto;

    }

    public void setDesconto(double desconto){

        this.desconto = desconto;

    }
    public String getCargoFuncionario(){

        return cargofuncionario;

    }
    public void setCargoFuncionario(String cargofuncionario){

        this.cargofuncionario = cargofuncionario;
    }

}
