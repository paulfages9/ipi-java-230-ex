package com.ipiecoles.java.java230.repository;

import com.ipiecoles.java.java230.model.Manager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ManagerRepository extends CrudRepository <Manager, Long> {

    @Query("SELECT m FROM Manager m JOIN FETCH m.equipe WHERE m.id = :id")
    Manager findByIdFetchEquipe (@Param("id") Long id);
}
