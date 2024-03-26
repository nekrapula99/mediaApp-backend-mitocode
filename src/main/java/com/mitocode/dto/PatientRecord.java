package com.mitocode.dto;

import jakarta.validation.constraints.Email;

public record PatientRecord(
        Integer idPatient,
        String firstName,
        String lastName,
        String dni,
        String address,
        String phone,
        String email

) {
}
