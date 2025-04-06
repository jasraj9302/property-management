package com.mycompany.property_management.repository;

import com.mycompany.property_management.entity.AddressEntity;
import com.mycompany.property_management.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity,Long> {
}
