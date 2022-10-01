public class ContaEspecial extends Contas{

    private double limite;

    public ContaEspecial(String nome, Double numeroConta, Double saldo, String password, double limite){
        super(nome, numeroConta, saldo, password);
        this.setLimite(limite);
    }

    public void setLimite(double num){
        this.limite = num;
    }
    public double getLimite(){
        return this.limite;
    }

    @Override
    public void printAccount(){
        System.out.println("\n    Informações da Conta");
        System.out.println("============================\n");
        System.out.println("Número da Conta: " + this.getnNumeroConta());
        System.out.println("Nome da Conta: " + this.getNome());
        System.out.println("Saldo disponível: " + this.getSaldo());
        System.out.println("Limite: " + this.getLimite());
        System.out.println();
    }

    @Override
    public void withdraw(double valor){
        if ((this.getSaldo()+this.getLimite()) < valor)
            System.out.println(" SALDO INSUFICENTE !");
        else
            this.setSaldo(this.getSaldo()-valor);
    }
}
