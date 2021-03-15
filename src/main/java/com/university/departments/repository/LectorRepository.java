package com.university.departments.repository;

import com.university.departments.model.Lector;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LectorRepository extends JpaRepository<Lector, Long> {
    @Query("FROM Lector l WHERE l.name LIKE :name")
    Optional<List<Lector>> findAllByTemplate(String name);
}
