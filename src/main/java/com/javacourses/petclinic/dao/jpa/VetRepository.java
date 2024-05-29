package com.javadersleri.petclinic.dao.jpa;

import com.javadersleri.petclinic.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {

}
