package br.com.projeto.screenflix.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSeries(@JsonAlias("Title")String titulo,
                         @JsonAlias("imdbRating")Double avaliacao,
                         @JsonAlias("totalSeasons") Integer numeroTemporadas) {
}
