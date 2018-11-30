package com.cm.cinemaneasymnager.ejb.repository;

import com.cm.cinemaneasymnager.ejb.entity.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository("filmRepository")
public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Async
    @Query("select f FROM film  f  inner join f.giorni g where g.giorno  >= :data ")
    List<Film> getFilmsOverDay(@Param("data") String data);



}
