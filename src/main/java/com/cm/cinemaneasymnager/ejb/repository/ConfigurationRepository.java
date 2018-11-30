package com.cm.cinemaneasymnager.ejb.repository;

import com.cm.cinemaneasymnager.ejb.entity.Configuration;
import com.cm.cinemaneasymnager.ejb.entity.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("configurationRepository")
public interface ConfigurationRepository extends CrudRepository<Configuration, Integer> {


}
