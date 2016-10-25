/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alain.examples.spring;

import com.alain.examples.spring.config.CharacterWeapon;
import com.alain.examples.spring.config.CharacterWeaponRepository;
import com.alain.examples.spring.config.DndCharacter;
import com.alain.examples.spring.config.MongoConfig;
import com.alain.examples.spring.config.Weapon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author z841158
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
public class CharacterWeaponRepositoryTest {
    
    @Mock
    CharacterWeaponRepository repository;
    
    @Test
    public void createCharacterWeaponTest() {
        repository.insert(new CharacterWeapon(1002, new DndCharacter(1), new Weapon(1)));
        System.out.println("Se insertó con éxito el arma 1002...");
        System.out.println(repository.findAll());
    }
    
    @Test
    public void readAllCharacterWeapons() {
        System.out.println("Armas de personajes: ");
        System.out.println(repository.findAll());
    }
    
}
