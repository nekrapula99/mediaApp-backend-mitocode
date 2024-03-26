package com.mitocode.dto;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignsDTO {

    private Integer idSign;

    private PatientDTO patient;

    @NotNull
    private String temperature;

    @NotNull
    private String pulse;

    @NotNull
    private String heartRate;

    @NotNull
    private LocalDateTime date;
}
