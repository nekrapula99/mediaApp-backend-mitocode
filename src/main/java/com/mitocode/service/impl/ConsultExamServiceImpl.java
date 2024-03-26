package com.mitocode.service.impl;

import com.mitocode.model.ConsultExam;
import com.mitocode.repository.IConsultExamRepo;
import com.mitocode.service.IConsultExamService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsultExamServiceImpl implements IConsultExamService {

    private final IConsultExamRepo repo;

    @Override
    public List<ConsultExam> getExamsByConsultId(Integer id) {
        return repo.getExamsByConsultId(id);
    }
}
