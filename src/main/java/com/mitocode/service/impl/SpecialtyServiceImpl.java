package com.mitocode.service.impl;

import com.mitocode.model.Specialty;
import com.mitocode.repository.IGenericRepo;
import com.mitocode.repository.ISpecialtyRepo;
import com.mitocode.service.ISpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpecialtyServiceImpl extends CRUDImpl<Specialty, Integer> implements ISpecialtyService {

    private final ISpecialtyRepo repo;

    @Override
    protected IGenericRepo<Specialty, Integer> getRepo() {
        return repo;
    }

}