/*Uma agência bancária possui vários tipos de investimentos com rendimentos mensais,
conforme a tabela abaixo:
Valor Mínimo     Descrição            Rentabilidade Mensal
R$ 100,00        Poupança                   0,5%
R$ 1000,00       Fundos de Renda Fixa        1%
R$ 2500,00       CDBs                       1,5%
Programa para solicitar ao usuário o valor que o cliente deseja investir e
calcule e exiba os tipos de aplicação que ele pode fazer e qual será sua rentabilidade
(lucro) em cada uma delas (se for mais de uma). O programa deve repetir o cálculo para
um número indeterminado de clientes. A cada cliente analisado, o programa deverá
perguntar se o usuário deseja analisar a situação de outro cliente. A esta pergunta, o
usuário deverá responder ‘S’ ou ‘N’, o programa não deverá aceitar outras respostas. */

Scanner input = new Scanner (System.in);
	    double valInvest, rent;
	    char resp= 'S';
	    while (resp == 'S') {
	    System.out.print("qual o valor que você deseja investir?");
	    valInvest = input.nextDouble();
	    while (valInvest <= 0) {
	    	System.out.println("valor inválido! informe um valor maior que zero");
	    	valInvest = input.nextDouble();
	    }
	    if (valInvest >= 100) {
	    	System.out.println("você pode aplicar em poupança");
	    	rent = valInvest * 0.005;
	    	System.out.println("rentabilidade: 0,5% ao mês: " + rent);
	    }
	    if (valInvest >= 1000) {
	    	System.out.println("você pode aplicar em fundos de renda fixa");
	    	rent = valInvest * 0.01;
	    	System.out.println("rentabilidade: 0,1% ao mês: " + rent);
	    }
	    if (valInvest >= 2500) {
	    	System.out.println("você pode aplicar em CDBs");
	    	rent = valInvest * 0.015;
	    	System.out.println("rentabilidade: 1,5% ao mês: " + rent);
	    }
	    System.out.println("deseja analisar o investimento de outro cliente? digite S ou N: ");
	    resp = input.next().charAt(0);
	    resp = Character.toUpperCase(resp);
	    while (resp != 'S' && resp != 'N') {
	    	System.out.print("resposta inválida. digite S ou N: ");
	    	resp = input.next().charAt(0);
	    	 resp = Character.toUpperCase(resp);
	    	
	    }
	    }
	}

}

