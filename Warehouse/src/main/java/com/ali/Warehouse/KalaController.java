
package com.ali.Warehouse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RASHA
 */
@RestController
public class KalaController {
    @Autowired
    KalaServiceImpl kalaImpl;
      @GetMapping("/showAll") 
    public List<Kala>getAllData(){
        return kalaImpl.getAll();
    }
    @PostMapping("/addKala")
    public String postData(@RequestBody Kala param){
        kalaImpl.addKala(param);
        return "اضافه شد:"+kalaImpl.addKala(param);
    }
    @GetMapping("delet/{id}")
    public String Delet(@PathVariable("id")int id){
        kalaImpl.deletKala(id);
        return "کالای مورد نظر شما حذف گردید";
        
    }

}
