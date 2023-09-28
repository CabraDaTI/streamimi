package io.cabradati.streamimi.rest.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MidiaDto {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("duracao")
    private Double duracao;


}
