package com.mycompany.property_management.repository;

import com.mycompany.property_management.entity.PropertyEntity;
import com.mycompany.property_management.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {

}
