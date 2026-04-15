import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private BigDecimal orcamento;
    private String descricao;

    private List<Ator> atores = new ArrayList<>();
    private Diretor diretor;

    //constructor


    public Filme(String nome, LocalDate dataLancamento, BigDecimal orcamento, String descricao, List<Ator> atores, Diretor diretor) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.atores = atores;
        this.diretor = diretor;
    }
    public Filme(){}

    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }


    public void adicionarAtor(Ator ator){
        this.getAtores().add(ator);
    }


}
