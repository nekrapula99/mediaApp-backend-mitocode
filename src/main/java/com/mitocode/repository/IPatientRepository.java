package com.mitocode.repository;

import com.mitocode.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository  extends JpaRepository<Patient, Integer> {

    //Patient sayHello(Patient patient);
}
