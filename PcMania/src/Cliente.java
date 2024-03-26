public class Cliente {
    public String nome; //nome do cliente
    public long cpf; //CPF do cliente

    public Cliente(String nome, long cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(float total, float valor){

        total = total + valor;
        return total;
    }
}