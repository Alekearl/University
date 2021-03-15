package com.university.departments.service.impl;

import com.university.departments.model.Lector;
import com.university.departments.repository.LectorRepository;
import com.university.departments.service.LectorService;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectorServiceImpl implements LectorService {
    private final LectorRepository repository;

    @Autowired
    public LectorServiceImpl(LectorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Lector> getLectorsByName(String temple) {
        return repository.findAllByTemplate("%" + temple + "%")
                .orElseThrow(() -> new NoSuchElementException("Can't find lectors like "
                        + temple + "."));
    }
}
