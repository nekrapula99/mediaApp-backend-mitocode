package com.mitocode.service.impl;

import com.mitocode.model.Signs;
import com.mitocode.repository.IGenericRepo;
import com.mitocode.repository.ISignsRepo;
import com.mitocode.service.ISignsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignsServiceImpl extends CRUDImpl<Signs, Integer> implements ISignsService {

    private final ISignsRepo repo;

    @Override
    protected IGenericRepo<Signs, Integer> getRepo() {
        return repo;
    }

}
