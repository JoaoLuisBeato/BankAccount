import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opn_menu, opn_gerente, opn_cliente, i=1;
        String nome="0", senha="0", senha_teste, senha_nova;
        double numeroConta=1, saldo=0, limite, num_teste, valor;
        float juros=0;
        Contas[] array = new Contas[20];

        do {
            do {
                Menssagem_inicial();
                opn_menu = read.nextInt();
            } while (opn_menu!=1 && opn_menu!=2 && opn_menu!=0);

            if(opn_menu == 1) {
                do {
                    Menu_gerente();
                    opn_gerente = read.nextInt();
                    if (opn_gerente == 1) {
                        System.out.print("\nInsira o Nome: ");
                        nome = read.next();
                        read.nextLine();
                        System.out.print("Insira uma senha: ");
                        senha = read.next();
                        read.nextLine();
                        System.out.print("Insira o saldo Inicial: ");
                        saldo = read.nextDouble();
                        System.out.print("Numero da conta: " + i + "\n");
                        array[i] = new ContaSimples(nome, numeroConta, saldo, senha);
                        numeroConta++;
                        i++;
                    } else if (opn_gerente == 2) {
                        System.out.print("\nInsira o Nome: ");
                        nome = read.next();
                        read.nextLine();
                        System.out.print("Insira uma senha: ");
                        senha = read.next();
                        System.out.print("Insira o saldo inicial: ");
                        saldo = read.nextDouble();
                        System.out.print("Insira o limite: ");
                        limite = read.nextDouble();
                        System.out.print("Numero da conta: " + i + "\n");

                        array[i] = new ContaEspecial(nome, numeroConta, saldo, senha, limite);
                        numeroConta++;
                        i++;
                    } else if (opn_gerente == 3) {
                        System.out.print("Insira o Nome: ");
                        nome = read.next();
                        read.nextLine();
                        System.out.print("Insira uma senha: ");
                        senha = read.next();
                        read.nextLine();
                        System.out.print("Insira o saldo inicial: ");
                        saldo = read.nextDouble();
                        System.out.print("Insira o juros: ");
                        juros = read.nextFloat();
                        System.out.print("Numero da conta: " + i + "\n");

                        array[i] = new ContaPoupanca(nome, numeroConta, saldo, senha, juros);
                        numeroConta++;
                        i++;
                    }
            } while ((opn_gerente != 1 && opn_gerente != 2 && opn_gerente != 3) && opn_gerente != 0);


            } else if (opn_menu == 2) {

                System.out.print("\n   Insira o número da conta: ");
                num_teste = read.nextDouble();
                System.out.print("   Insira a senha: ");
                senha_teste = read.next();

                if ((array[(int) num_teste].Pass()).equals(senha_teste)) {
                    do {

                        Menu_cliente();
                        opn_cliente = read.nextInt();

                        if (opn_cliente == 1) {
                            System.out.print("\n Digite o valor do saque: R$");
                            valor = read.nextDouble();
                            array[(int) num_teste].withdraw(valor);
                        }

                        if (opn_cliente == 2) {
                            System.out.print("\n Digite o valor do depósito: R$");
                            valor = read.nextDouble();
                            array[(int) num_teste].deposit(valor);
                        }

                        if (opn_cliente == 3) {
                            array[(int) num_teste].printAccount();
                        }

                        if (opn_cliente == 4) {
                            System.out.print("\n Digite a senha atual: ");
                            senha_teste = read.next();
                            System.out.print(" Digite a nova senha: ");
                            senha_nova = read.next();
                            array[(int) num_teste].ChangePassoword(senha_teste, senha_nova);
                        }

                    }while (opn_cliente != 0);

                } else {
                    System.out.print("\n SENHA INCORRETA !");
                }
            }

        } while(opn_menu!=0);

        System.exit(0);
    }

    public static void  Menssagem_inicial(){
        System.out.println("\n       MENU INICIAL    ");
        System.out.print("==========================\n\n");
        System.out.print("   1 -> Gerente\n");
        System.out.print("   2 -> Cliente\n");
        System.out.print("   0 -> Sair\n");
        System.out.print("   Opção: ");
    }

    public static void Menu_gerente(){
        System.out.println("\n       MENU GERENTE    ");
        System.out.print("==========================\n\n");
        System.out.print("   1 -> Criar Conta Simples \n");
        System.out.print("   2 -> Criar Conta Especial\n");
        System.out.print("   3 -> Criar Conta Poupança\n" );
        System.out.print("   0 -> Sair\n" );
        System.out.print("   Opção: " );
    }

    public static void Menu_cliente(){
        System.out.println("\n       MENU CLIENTE    ");
        System.out.print("==========================\n\n");
        System.out.print("   1 -> Realizar saque\n");
        System.out.print("   2 -> Realizar depósito\n");
        System.out.print("   3 -> Informações Gerais\n" );
        System.out.print("   4 -> Alterar senha\n" );
        System.out.print("   0 -> Sair\n" );
        System.out.print("   Opção: " );
    }

}
