package guru.springframework.sfgspringpetclinic.services;

import guru.springframework.sfgspringpetclinic.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}