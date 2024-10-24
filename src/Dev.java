import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> conteudosInscritos = new HashSet<>();
    private Set<Curso> conteudosConcluidos = new HashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    // Métodos para se inscrever e progredir
    public void inscreverCurso(Curso curso) {
        conteudosInscritos.add(curso);
    }

    public void progredir() {
        for (Curso curso : conteudosInscritos) {
            conteudosConcluidos.add(curso);
            conteudosInscritos.remove(curso);
            break;
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Set<Curso> getConteudosInscritos() { return conteudosInscritos; }
    public Set<Curso> getConteudosConcluidos() { return conteudosConcluidos; }
    
    @Override
    public String toString() {
        return "Dev: " + nome;
    }
}
