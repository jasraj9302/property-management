package com.mycompany.property_management.service;

import com.mycompany.property_management.dto.PropertyDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PropertyService {

     PropertyDTO saveProperty(PropertyDTO propertyDTO);
     List<PropertyDTO> getAllProperties();
     PropertyDTO updateProperty(PropertyDTO propertyDTO,Long propertyId);
     PropertyDTO updatePropertyDescription(PropertyDTO propertyDTO, Long propertyId);
     PropertyDTO updatePropertyPrice(PropertyDTO propertyDTO, Long propertyId);
     void deleteProperty(Long propertyId);
}
