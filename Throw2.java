public class Throw2 {
    public static void main(String[] args) {

        /*
         * Vamos criar variáveis que terão como valor notas de alunos. A
         * nota máxima do aluno deve ser 50, caso esse valor seja
         * ultrapassado, devemos criar e executar uma exception através
         * do throw,
         * 
         */
        int nota1, nota2, res;

        nota1 = 60;
        nota2 = 20;

        /*
         * Agora vamos criar uma estrutura condicional que irá verificar
         * as notas e definir se vai ou não realizar o throw com a
         * exception que nesse caso será IllegalArgumentException
         */

        if (nota1 > 50 || nota2 > 50) {
            throw new IllegalArgumentException("Valor de nota inválido");
        }

        res = nota1 + nota2;
        System.out.println("Nota do Aluno: " + res);

    }

}
