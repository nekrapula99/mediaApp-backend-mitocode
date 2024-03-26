package com.mitocode.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolDTO {

    private Integer idRole;

    @NotNull
    private String name;

    @NotNull
    private String description;

}
