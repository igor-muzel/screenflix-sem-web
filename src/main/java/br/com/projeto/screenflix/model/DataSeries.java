package br.com.projeto.screenflix.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DateSeries(@JsonAlias("Title")String titulo,
                         @JsonAlias("imdbRating")Double avaliacao,
                         @JsonAlias("totalSeasons") Integer numeroTemporadas) {
}
