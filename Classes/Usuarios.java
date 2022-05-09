package Classes;


public class Usuarios {
    private String nome;
    private boolean ocupado = false;
    private String cidade;
    private boolean resultado;
    

    public boolean isOcupado(boolean resultado) {
        if (ocupado) {
            System.out.println("O acesso esta ocupado por");
            return true;
        } else {
            System.out.println("O acesso esta livre");
            return false;
        }
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public String setNome(String Nome){
        this.nome = Nome;
        return this.nome;
    }

    public boolean getOcupado() {
        return this.ocupado;
    }

    public boolean setOcupado(boolean Ocupado){
        this.ocupado = Ocupado;
        return this.ocupado;
    }

    public String getCidade(String cidade) {
        return this.cidade;
    }

    public String setCidade(String Cidade){
        this.cidade = Cidade;
        return this.cidade;
    }

    public boolean getResultado(boolean resultado) {
        return this.resultado;
    }

    public boolean setResultado(boolean Resultado){
        this.resultado = Resultado;
        return this.resultado;
    }

    
}