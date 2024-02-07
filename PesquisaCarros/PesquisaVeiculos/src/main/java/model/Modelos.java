package model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.alura.tabelafipe.model.Anos;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(List<Dados> modelos, List<Anos> anos) {

}
