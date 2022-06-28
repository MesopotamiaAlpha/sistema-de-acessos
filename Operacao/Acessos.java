package Operacao;

import Classes.Usuarios;
import Classes.Contas;
import java.util.Scanner;

public class Acessos {
    public static void main(String[] args) {

        Usuarios pessoa = new Usuarios();
        Usuarios pessoa1 = new Usuarios();
        Contas contas = new Contas();

        //tentando adicionar scanner para setar o usuario usado
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do usuario: ");
        pessoa.setNome(entrada.next());
        System.out.println(pessoa);

        // pessoa.setNome("josé ") ;
        // pessoa.setCidade ("Pato Branco ");
        // pessoa.setOcupado (true);
        // pessoa.setResultado(pessoa.isOcupado(pessoa.getOcupado()));

        // System.out.println(pessoa.getOcupado() + " " + pessoa.getNome(null) + " " + pessoa.getCidade(null) + contas.getConta1(null) + contas.getSenha1(null) +"\n");

        // pessoa1.setNome("Carlos");
        // pessoa1.setCidade("Laranjeiras do sul");
        // pessoa1.setOcupado(false);
        // pessoa1.setResultado(pessoa1.isOcupado(pessoa1.setOcupado(false)));


        // System.out.println(pessoa1.getOcupado() + " " + pessoa1.getNome(null) + " " + pessoa1.getCidade(null) + contas.getConta2(null) + contas.getSenha2(null) +"\n");

    }
}