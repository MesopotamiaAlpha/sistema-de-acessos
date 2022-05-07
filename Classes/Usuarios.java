package Classes;


public class Usuarios {
    public String nome;
    public boolean ocupado = false;
    public String cidade;
    public boolean resultado;
    

    public boolean isOcupado(boolean resultado) {
        if (ocupado) {
            System.out.println("O acesso esta ocupado por");
            return true;
        } else {
            System.out.println("O acesso esta livre");
            return false;
        }
    }

}