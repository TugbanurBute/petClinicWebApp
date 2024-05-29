package com.javadersleri.petclinic.service;

import java.util.List;

import javax.validation.Valid;

import com.javadersleri.petclinic.exception.OwnerNotFoundException;
import com.javadersleri.petclinic.exception.VetNotFoundException;
import com.javadersleri.petclinic.model.Owner;
import com.javadersleri.petclinic.model.Vet;

public interface PetClinicService {
    List<Owner> findOwners();
    List<Owner> findOwners(String lastName);
    Owner findOwner(Long id) throws OwnerNotFoundException;
    void createOwner(@Valid Owner owner);
    void updateOwner(Owner owner);
    void deleteOwner(Long id);
    List<Vet> findVets();
    Vet findVet(Long id) throws VetNotFoundException;
}