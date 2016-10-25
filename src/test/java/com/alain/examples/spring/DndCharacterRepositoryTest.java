/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alain.examples.spring;

import com.alain.examples.spring.config.DndCharacter;
import com.alain.examples.spring.config.DndCharacterRepository;
import com.alain.examples.spring.config.MongoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author z841158
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
public class DndCharacterRepositoryTest {
    
    @Autowired
    DndCharacterRepository repository;
    
    @Test
    public void createDndCharacterTest() {
        repository.insert(new DndCharacter(1, "Orestes"));
    }
    
}
