/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ali.Warehouse;

import java.util.List;

/**
 *
 * @author RASHA
 */
public interface KalaService {
    List<Kala> getAll();
    Kala addKala (Kala kala);
  String deletKala(int id);
 
  
}
