package com.mitocode.exception;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomErrorResponse {

    private LocalDateTime dateTime;
    private String message;
    private String details;
}
