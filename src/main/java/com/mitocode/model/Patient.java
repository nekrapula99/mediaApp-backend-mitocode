package com.mitocode.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
/*@Getter
@Setter
@ToString
@EqualsAndHashCode*/
@Entity//(name = "pa") //JQPL FROM pa p WHERE p.name = ?
//@Table(name = "tlb_patient", schema = "sistemas")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPatient;

    @Column(nullable = false, length = 70) //, name = "xyz")
    private String firstName; //camelCase //lowerCamelCase || BD snake _

    @Column(nullable = false, length = 70)
    private String lastName;

    @Column(nullable = false, length = 8)
    private String dni;

    @Column(length = 150)
    private String address;

    @Column(nullable = false, length = 9)
    private String phone;

    @Column(nullable = false, length = 55)
    private String email;

}
