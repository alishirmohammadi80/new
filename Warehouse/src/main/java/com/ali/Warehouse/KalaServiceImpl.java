
package com.ali.Warehouse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RASHA
 */
@Service
public class KalaServiceImpl implements KalaService{
// List<Kala> list=new ArrayList();
    @Autowired
 KalaRepo kalaRepo;
    @Override
    public List<Kala> getAll() {
       return kalaRepo.findAll();
    }

    @Override
    public Kala addKala(Kala kala) {
        kalaRepo.save(kala);
        return kala;
    }

    @Override
    public String deletKala(int codeKala) {
         for (Kala kala : kalaRepo.findAll()) {
            if (kala.getCodeKala()==codeKala) {
              kalaRepo.delete(kala);
          break;  }
        }
        return "Delet shod";
    }


    }
    

