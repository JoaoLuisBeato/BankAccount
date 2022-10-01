public class ContaSimples extends Contas {

    public ContaSimples(String nome, Double numeroConta, Double saldo, String password){
        super(nome, numeroConta, saldo, password);
    }

    @Override
    public void printAccount(){
        System.out.println("\n    Informações da Conta");
        System.out.println("============================\n");
        System.out.println("   Número da Conta: " + this.getnNumeroConta());
        System.out.println("   Nome da Conta: " + this.getNome());
        System.out.println("   Saldo disponível: " + this.getSaldo());
        System.out.println();
    }

    @Override
    public void withdraw(double valor){
        if (this.getSaldo() < valor)
            System.out.println("SALDO INSUFICENTE !");
        else
            this.setSaldo(this.getSaldo()-valor);
    }
}
