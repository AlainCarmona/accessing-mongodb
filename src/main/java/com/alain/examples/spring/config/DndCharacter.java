/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alain.examples.spring.config;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author z841158
 */
@Document(collection = "dndCharacter")
public class DndCharacter {
    
    @Id
    private int id;
    private String name;

    public DndCharacter() {
    }

    public DndCharacter(int id) {
        this.id = id;
    }

    @PersistenceConstructor
    public DndCharacter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DndCharacter{" + "id=" + id + ", name=" + name + '}';
    }
    
}
