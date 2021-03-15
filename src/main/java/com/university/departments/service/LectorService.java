package com.university.departments.service;

import com.university.departments.model.Lector;
import java.util.List;

public interface LectorService {
    List<Lector> getLectorsByName(String name);
}
