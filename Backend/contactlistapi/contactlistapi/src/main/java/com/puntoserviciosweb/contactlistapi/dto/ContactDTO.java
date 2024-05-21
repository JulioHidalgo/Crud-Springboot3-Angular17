package com.puntoserviciosweb.contactlistapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
public class ContactDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Email(message = "El email es inválido")
    @NotBlank(message = "El email es obligatorio")
    private String email;
}
