package brasil.python.site.exercicios;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeUsuario;
        String senha;

        System.out.println("Digite um Nome de Usuário e Senha");
        System.out.println("Nome de Usuário: ");
        nomeUsuario = scan.nextLine();
        System.out.println("Senha: ");
        senha = scan.nextLine();

        while (nomeUsuario.equalsIgnoreCase(senha)) {
                System.out.println("A Senha não pode ser igual ao Nome de Usuário, digite novamente");
                System.out.print("Senha: ");
                senha = scan.nextLine();
            }
    }

}
