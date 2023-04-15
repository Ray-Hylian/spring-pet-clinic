package fr.rachidboughelam.springpetclinic.services;

import fr.rachidboughelam.springpetclinic.model.Owner;

import java.util.List;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }
