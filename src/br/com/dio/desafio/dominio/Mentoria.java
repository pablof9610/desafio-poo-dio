package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private @Getter @Setter LocalDate data;

    @Override
    public Double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo=" + getTitulo() +
                ", Descrição=" + getDescricao() +
                ", Data=" + data +
                '}';
    }
}
