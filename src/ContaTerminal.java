package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("CONTA BANCO");
		System.out.println();
		System.out.println("número da Conta: (1234)");
		numero = sc.nextInt();

		System.out.println("número da Agência: (123-8)");
		agencia = sc.next();

		System.out.println(" nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println(" saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();
	}

}
