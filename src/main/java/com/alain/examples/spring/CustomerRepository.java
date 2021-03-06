/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alain.examples.spring;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Z841158
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    
    public Customer findByFirstName(String firstName);
    
    public List<Customer> findByLastName(String lastname);
    
}
