package com.cm.cinemaneasymnager.ejb.services;

import com.cm.cinemaneasymnager.ejb.entity.Film;
import com.cm.cinemaneasymnager.ejb.entity.Giorni;
import com.cm.cinemaneasymnager.ejb.repository.FilmRepository;
import com.cm.cinemaneasymnager.ejb.repository.GiorniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@Service("giorniServices")
@Transactional

@RestController
public class GiorniServices {

    @Qualifier("giorniRepository")
    @Autowired
    private GiorniRepository giorniRepository;


    public Iterable<Giorni> getAllGiorni(){

    return giorniRepository.findAll();
    }

}
