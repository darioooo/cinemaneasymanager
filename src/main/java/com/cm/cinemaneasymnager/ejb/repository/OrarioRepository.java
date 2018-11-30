package com.cm.cinemaneasymnager.ejb.repository;

import com.cm.cinemaneasymnager.ejb.entity.Film;
import com.cm.cinemaneasymnager.ejb.entity.Orario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orarioRepository")
public interface OrarioRepository extends CrudRepository<Orario, Integer> {

    @Async
    @Query("select g FROM film  f  inner join f.giorni g inner join g.orari where f.id = :id")
    List<Orario> getOrarioByFilmId(@Param("id") Integer id);




}