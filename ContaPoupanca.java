public class ContaPoupanca extends Contas {

    private float juros;

    public ContaPoupanca(String nome, Double numeroConta, Double saldo, String password, float juros){
        super(nome, numeroConta, saldo, password);
        this.setJuros(juros);


    }

    public void setJuros(float num){
        this.juros = num;
    }
    public float getJuros(){
        return this.juros;
    }


    @Override
    public void printAccount(){
        System.out.println("\n    Informações da Conta");
        System.out.println("============================\n");
        System.out.println("Número da Conta: " + this.getnNumeroConta());
        System.out.println("Nome da Conta: " + this.getNome());
        System.out.println("Saldo disponível: " + this.getSaldo());
        System.out.println("Juros da conta: " + this.getJuros());
        System.out.println();
    }

    @Override
    public void withdraw(double valor){
        if (this.getSaldo() < valor)
            System.out.println("SALDO INSUFICENTE !");
        else
            this.setSaldo(this.getSaldo()-valor);
    }

    public void render(){
        this.setSaldo(this.getSaldo()+(this.getSaldo()*this.getJuros()));
    }
}
