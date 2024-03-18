public class Empresa {

    String nome;
    String cnpj;
    String endereco;
    int funcionarioDisponiveis;

    Empresa empresa = new Empresa();


    void mostrarinfo(){
        System.out.println("Nome da empresa: "+ empresa.nome);
        System.out.println("CNPJ: "+ empresa.cnpj);
        System.out.println("Endereço da empresa: "+ empresa.endereco);
    }

    void adicionarFuncionario(Funcionario funcionario){

    }

    void alocarFuncionario(){

    }

    float contarFuncionariosDisponiveis(){

        return 0;
    }
}
