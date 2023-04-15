package fr.rachidboughelam.springpetclinic.repositories;

import fr.rachidboughelam.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
