package com.cm.cinemaneasymnager.ejb.services;

import com.cm.cinemaneasymnager.ejb.entity.Film;
import com.cm.cinemaneasymnager.ejb.entity.Orario;
import com.cm.cinemaneasymnager.ejb.repository.OrarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service("orarioServices")
@Transactional

@RestController
public class OrarioServices {

    @Qualifier("orarioRepository")
    @Autowired
    private OrarioRepository orarioRepository;
    @PersistenceContext
    private EntityManager em ;

    public Iterable<Orario> getAllOrario(){

    return orarioRepository.findAll();
    }


    public List<Orario> getOrarioByFilmId(Integer id){

    return orarioRepository.getOrarioByFilmId(id);
    }

    public void deleteOrario(Integer id) {

    orarioRepository.deleteById(id);
    }

}
