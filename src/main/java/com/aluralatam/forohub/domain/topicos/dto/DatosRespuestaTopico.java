package com.aluralatam.forohub.domain.topicos.dto;

import com.aluralatam.forohub.domain.topicos.Estado;
import com.aluralatam.forohub.domain.topicos.Topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaDeCreacion,
        Estado status,
        String nombreDeCurso,
        String autorCorreoElectronico
) {
    public DatosRespuestaTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaDeCreacion(),
                topico.getEstado(),
                topico.getNombreDeCurso(),
                topico.getAutor().getCorreoElectronico()
        );
    }
}
