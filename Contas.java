public abstract class Contas {
    private String senha;
    private String nome;
    private Double numeroConta;
    private Double saldo;
    //private  openingdate;

    public Contas(String nome, Double numeroConta, Double saldo, String password){
        this.setNome(nome);
        this.setNumeroConta(numeroConta);
        this.setSaldo(saldo);
        this.senha = password;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double p_saldo) {
        this.saldo = p_saldo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String p_nome) {
        this.nome = p_nome;
    }

    public double getnNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(double p_numeroConta) {
        this.numeroConta = p_numeroConta;
    }

    public String Pass(){
        return this.senha;
    }

    public void ChangePassoword(String Old, String New){
        if(Old.equals(this.senha)){
            this.senha = New;
            System.out.println("---> Senha Alterada !");
        } else{
            System.out.println("\n Senha Incorreta \n");
        }
    }

    public abstract void printAccount();

    public abstract void withdraw(double valor);

    public void deposit(double valor){
        this.setSaldo(this.getSaldo()+valor);
    }
}
