package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

public class Curso extends Conteudo{
    private @Getter @Setter int cargaHoraria;

    @Override
    public Double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo=" + getTitulo() +
                ", Descrição=" + getDescricao() +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
