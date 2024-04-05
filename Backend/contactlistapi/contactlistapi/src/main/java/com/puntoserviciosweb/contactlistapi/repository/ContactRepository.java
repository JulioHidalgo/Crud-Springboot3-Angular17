package com.puntoserviciosweb.contactlistapi.repository;

import com.puntoserviciosweb.contactlistapi.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository <Contact, Integer>{
}
