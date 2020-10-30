package com.konrad.squadrons.dao;

import com.konrad.squadrons.dao.entity.Pilots;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquadronsRepo extends CrudRepository<Pilots, Long> {
}
