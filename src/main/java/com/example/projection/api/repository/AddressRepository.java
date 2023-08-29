package com.example.projection.api.repository;

import com.example.projection.api.model.Address;
import com.example.projection.api.view.AddressView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AddressRepository extends Repository<Address,Long> {
    List<AddressView> getAddressByState(String state);
    
}
