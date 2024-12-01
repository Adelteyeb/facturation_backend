package com.mohamedAdel.facturation.dto;

import com.mohamedAdel.facturation.entite.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clientdto {

	private Long id;

    private String nom;
    private String matriculefiscale;
    private Integer numroTel ;
    
    
    public static Client toEntity(Clientdto clientdto) {
        return Client.builder()
                .id(clientdto.getId())
                .nom(clientdto.getNom())
                .matriculefiscale(clientdto.getMatriculefiscale())
                .numroTel(clientdto.getNumroTel())
                .build();
    }
    public static Clientdto fromEntity(Client client) {
        return Clientdto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .matriculefiscale(client.getMatriculefiscale())
                .numroTel(client.getNumroTel())
                .build();
    }

}
