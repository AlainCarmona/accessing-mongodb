/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alain.examples.spring;

import com.alain.examples.spring.config.MongoConfig;
import com.alain.examples.spring.config.Weapon;
import com.alain.examples.spring.config.WeaponRepository;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static junit.framework.Assert.assertNotNull;

/**
 *
 * @author z841158
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
public class WeaponRepositoryTest {

    @Autowired
    WeaponRepository repository;
    
    @Test
    public void readAllWeaponTest() {
        List<Weapon> weapons = repository.findAll();
        assertNotNull(weapons);
        System.out.println("Weapons: " + weapons.size());
        System.out.println(weapons);
    }
    
    @Test
    public void createWeaponTest() {
        repository.insert(new Weapon(4, "Arco corto"));
    }

}
