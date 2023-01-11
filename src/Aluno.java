public class Aluno {
    private int idade;
    private String nome;
    private String cpf;
    private String email;
    private String curso;
    Endereço endereço;

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade ;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf =cpf ;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email =email ;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public Endereço getEndereço(){
        return this.endereço;
    }
    public void setEndereço(Endereço endereço){
        this.endereço = endereço;
    }
}
