package br.com.dio.desafio.dominio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            conteudosInscritos.remove(conteudo.get());
            conteudosConcluidos.add(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum bootcamp.");
        }
    }

    public Double calcularTotalXp() {
        return conteudosConcluidos.stream()
                .mapToDouble(c -> c.calcularXP())
                .sum();
    }
}
