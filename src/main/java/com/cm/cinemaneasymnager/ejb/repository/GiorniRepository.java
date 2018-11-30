package com.cm.cinemaneasymnager.ejb.repository;

import com.cm.cinemaneasymnager.ejb.entity.Film;
import com.cm.cinemaneasymnager.ejb.entity.Giorni;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("giorniRepository")
public interface GiorniRepository extends CrudRepository<Giorni, Integer> {


}
