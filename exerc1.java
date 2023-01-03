/*A nota de um aluno em uma disciplina é a média aritmética das notas de suas duas
avaliações parciais. Se a média do aluno for maior ou igual a sete, o aluno está aprovado.
Se a média do aluno for menor que três, o aluno está reprovado. Se a média do aluno for
menor que sete e maior ou igual a três, o aluno irá para a recuperação. Implemente um
programa para solicitar ao usuário as notas das duas avaliações parciais e calcular a
média de um aluno de uma determinada disciplina e informar sua situação final. */

Scanner input = new Scanner (System.in);
    	double nota1, nota2, media = 0;
    	System.out.print("informe a primeira nota: ");
    	nota1 = input.nextDouble();
    	System.out.print("infome a segunda nota: ");
    	nota2 = input.nextDouble();
   	 
   	 
    	while (nota1 > 10 || nota2 > 10) {
   		 System.out.println("nota inválida! digite uma nota menor ou igual a 10");
   		 System.out.println ("nota 1: ");
   		 nota1 = input.nextDouble();
   		 System.out.print("nota 2: ");
   		 nota2 = input.nextDouble();
    	}
   	 
    	media = (nota1 + nota2) /2;
   	 
    	if(media >= 7) {
         	System.out.print("o aluno obteve a média " + media + " e está aprovado");
    	}
    	else if (media < 7 && media >= 3) {
   		 System.out.print("o aluno obteve a média " + media + " e está em recuperação");
    	}
    	else {
   		 System.out.print("o aluno obteve a média " + media + " e está reprovado");
    	}

	}

}
