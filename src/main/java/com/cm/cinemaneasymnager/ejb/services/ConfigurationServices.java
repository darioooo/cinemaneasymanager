package com.cm.cinemaneasymnager.ejb.services;

import com.cm.cinemaneasymnager.ejb.entity.Configuration;
import com.cm.cinemaneasymnager.ejb.entity.Film;
import com.cm.cinemaneasymnager.ejb.entity.Orario;
import com.cm.cinemaneasymnager.ejb.repository.ConfigurationRepository;
import com.cm.cinemaneasymnager.ejb.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

@Service("configuarationServices")
@Transactional

@RestController
public class ConfigurationServices {

    @Qualifier("configurationRepository")
    @Autowired
    private ConfigurationRepository configurationRepository;
    @PersistenceContext
    private EntityManager em ;

    public Iterable<Configuration> getAllConfig(){

    return configurationRepository.findAll();
    }


    public Optional<Configuration> getConfigurationById(Integer id){

    return configurationRepository.findById(id);
    }

    public void deleteConfiguartion(Integer id) {

        configurationRepository.deleteById(id);
    }


    public Configuration saveConfiguration(Configuration n) {

        Configuration configuration = configurationRepository.save(n);
        return configuration ;
    }

    public Configuration updateConfiguartionById(Configuration config) {
        Configuration merge = em.merge(config);
        return merge;
    }
}
