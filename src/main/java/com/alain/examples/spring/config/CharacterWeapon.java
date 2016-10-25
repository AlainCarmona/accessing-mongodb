/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alain.examples.spring.config;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author z841158
 */
@Document(collection = "characterWeapons")
public class CharacterWeapon {
    
    @Id
    private int id;
    @DBRef(db = "dndCharacter")
    private DndCharacter character;
    @DBRef(db = "weapons")
    private Weapon weapon;

    public CharacterWeapon() {
    }

    public CharacterWeapon(int id) {
        this.id = id;
    }

    @PersistenceConstructor
    public CharacterWeapon(int id, DndCharacter character, Weapon weapon) {
        this.id = id;
        this.character = character;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DndCharacter getCharacter() {
        return character;
    }

    public void setCharacter(DndCharacter character) {
        this.character = character;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "CharacterWeapon{" + "id=" + id + ", character=" + character + ", weapon=" + weapon + '}';
    }
    
}
