package com.cm.cinemaneasymnager.ejb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.cm.cinemaneasymnager.ejb.entity.*;
import com.cm.cinemaneasymnager.ejb.repository.*;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Locale;
import java.util.Optional;

@Service("filmServices")
@Transactional

@RestController
public class FilmServices {

    @Qualifier("filmRepository")
    @Autowired
    private FilmRepository filmRepository;
    @PersistenceContext
    private EntityManager em ;

    public Iterable<Film> getAllFilm(){

    return filmRepository.findAll();
    }


    public Optional<Film> getFilm(Integer id){

    return filmRepository.findById(id);
    }

    public void deleteFilm(Integer id) {

    filmRepository.deleteById(id);
    }

    public Iterable<Film> getFilmsByDay(Date firstDate,Date secondDate){

        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

        return filmRepository.getFilmsOverDay(format);
    }

    public Film saveFilm(Film n) {

        Film film = filmRepository.save(n);
        return film ;
    }

    public Film updateFilmById(Film film) {
        Film merge = em.merge(film);
        return merge;
    }
}
