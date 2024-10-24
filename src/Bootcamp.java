import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Curso> conteudos = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Set<Dev> getDevsInscritos() { return devsInscritos; }
    public Set<Curso> getConteudos() { return conteudos; }
    
    public void adicionarConteudo(Curso conteudo) {
        conteudos.add(conteudo);
    }

    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
    }
    
    @Override
    public String toString() {
        return "Bootcamp: " + nome + ", " + descricao;
    }
}
