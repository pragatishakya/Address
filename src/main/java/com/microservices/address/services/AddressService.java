package com.microservices.address.services;

import java.util.List;

import com.microservices.address.payload.AddressDto;


public interface AddressService {

	 AddressDto addAddress(AddressDto adDto);
	 AddressDto getAddressById(Integer empId) ;
	 List<AddressDto> getAllAddress();
}
