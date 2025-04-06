package com.mycompany.property_management.repository;

import com.mycompany.property_management.entity.PropertyEntity;
import com.mycompany.property_management.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {

  //  @Query("SELECT p FROM PropertyEntity p WHERE p.userEntity.id = :userId AND p.title= :title")
  //  List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId,@Param("userId") Long title);

    List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId);
}
