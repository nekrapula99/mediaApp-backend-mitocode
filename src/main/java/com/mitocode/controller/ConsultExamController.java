package com.mitocode.controller;

import com.mitocode.dto.ConsultExamDTO;
import com.mitocode.model.ConsultExam;
import com.mitocode.service.IConsultExamService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/consultexams")
@RequiredArgsConstructor
public class ConsultExamController {

    @Qualifier("defaultMapper")
    private final ModelMapper mapper;
    private final IConsultExamService service;

    @GetMapping("/{idConsult}")
    public ResponseEntity<List<ConsultExamDTO>> getConsultsById(@PathVariable("idConsult") Integer idConsult){
        List<ConsultExam> list = service.getExamsByConsultId(idConsult);
        List<ConsultExamDTO> lstDTO = mapper.map(list, new TypeToken<List<ConsultExamDTO>>() {}.getType());

        return ResponseEntity.ok(lstDTO);
    }

}


