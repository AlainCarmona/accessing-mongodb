/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alain.examples.spring.config;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author z841158
 */
public interface CharacterWeaponRepository extends MongoRepository<CharacterWeapon, Integer> {
    
}
