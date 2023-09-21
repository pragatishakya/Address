package com.microservices.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.address.entities.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
