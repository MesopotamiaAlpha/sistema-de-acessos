package Operacao;

import Classes.Usuarios;

public class Acessos {
    public static void main(String[] args) {

        Usuarios pessoa = new Usuarios();
        Usuarios pessoa1 = new Usuarios();
        

        pessoa.nome = "josé";
        pessoa.cidade = "Pato Branco";
        pessoa.ocupado = true;
        pessoa.resultado = pessoa.isOcupado(pessoa.ocupado);

        System.out.println(pessoa.ocupado + " " + pessoa.nome + " " + pessoa.cidade+"\n");

        pessoa1.nome = "Carlos";
        pessoa1.cidade = "Laranjeiras do sul";
        pessoa1.ocupado = false;
        pessoa1.resultado = pessoa1.isOcupado(pessoa1.ocupado);


        System.out.println(pessoa1.ocupado + " " + pessoa1.nome + " " + pessoa1.cidade+"\n");

    }
}