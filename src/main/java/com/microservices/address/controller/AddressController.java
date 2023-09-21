package com.microservices.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.address.payload.AddressDto;
import com.microservices.address.services.AddressService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addService;

	@PostMapping("/add")
	public ResponseEntity<AddressDto> addAddress(@Valid @RequestBody AddressDto addDto){
		AddressDto createdAddDto = this.addService.addAddress(addDto);
		return new ResponseEntity<>(createdAddDto , HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{empId}")
	public ResponseEntity<AddressDto> getAddressById(@PathVariable Integer empId){
		return ResponseEntity.ok(this.addService.getAddressById(empId));
	}
	
	@GetMapping("/")
	public ResponseEntity<List<AddressDto>> getAllAddress(){
		return ResponseEntity.ok(this.addService.getAllAddress());
	}
	
}
