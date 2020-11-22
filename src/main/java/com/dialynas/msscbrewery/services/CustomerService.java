package com.dialynas.msscbrewery.services;

import com.dialynas.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customerDto);

    void updateCustomer(UUID customerId, CustomerDTO customerDto);

    void deleteById(UUID customerId);
}
