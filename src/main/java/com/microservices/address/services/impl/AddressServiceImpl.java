package com.microservices.address.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.address.entities.Address;
import com.microservices.address.payload.AddressDto;
import com.microservices.address.repository.AddressRepo;
import com.microservices.address.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepo addRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public AddressDto addAddress(AddressDto adDto) {
		Address add=this.dtoToAdd(adDto);
		Address savedAdd=this.addRepo.save(add);
		return this.addToDto(savedAdd);
	}

	@Override
	public AddressDto getAddressById(Integer empId) {
		Address add = this.addRepo.findById(empId).orElseThrow();
		return this.addToDto(add);
	}

	@Override
	public List<AddressDto> getAllAddress() {
		List<Address> add=this.addRepo.findAll();
		List<AddressDto> addDto= add.stream().map(e-> this.addToDto(e)).collect(Collectors.toList());
		return addDto;
	}
	
	public AddressDto addToDto(Address add) {
		AddressDto addDto = this.modelMapper.map(add, AddressDto.class);
		return addDto;
	}
	
	public Address dtoToAdd(AddressDto addDto) {
		Address add= this.modelMapper.map(addDto , Address.class) ;
		return add;
	}

}
