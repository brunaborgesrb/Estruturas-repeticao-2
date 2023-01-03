/*Refaça o programa da questão anterior de forma que seja calculada e exibida a média e
a situação dos 30 alunos de uma determinada turma. */

Scanner input = new Scanner (System.in);
		double nota1, nota2, media = 0;
		System.out.print("informe a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.print("infome a segunda nota: ");
		nota2 = input.nextDouble();

		while (nota1 > 10 || nota2 > 10) {
			System.out.println("nota inválida! digite uma nota menor ou igual a 10");
			System.out.println("nota 1: ");
			nota1 = input.nextDouble();
			System.out.print("nota 2: ");
			nota2 = input.nextDouble();
		}

		for (int i = 0; i < 30; i = i + 1) {
			
			if (media >= 7) {
				System.out.println("o aluno obteve a média " + media + " e está aprovado");
			} else if (media < 7 && media >= 3) {
				System.out.println("o aluno obteve a média " + media + " e está em recuperação");
			} else {
				System.out.println("o aluno obteve a média " + media + " e está reprovado");
			}
			System.out.print("informe a primeira nota: ");
			nota1 = input.nextDouble();
			if(nota1 > 10) {
				System.out.println("nota inválida! digite uma nota menor ou igual a 10");
				nota1 = input.nextDouble();
			}
			System.out.print("infome a segunda nota: ");
			nota2 = input.nextDouble();
			if(nota2 > 10) {
				System.out.println("nota inválida! digite uma nota menor ou igual a 10");
				nota2 = input.nextDouble();
			}
			media = (nota1 + nota2) / 2;
		}
	}
}

