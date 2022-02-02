/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ali.Warehouse;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author RASHA
 */
public interface KalaRepo extends PagingAndSortingRepository<Kala, Integer>{
    Optional<Kala>findByCodeKala(Integer codekala);
    List<Kala>findAll();
   
}
