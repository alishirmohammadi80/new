
package com.ali.Warehouse;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 *
 * @author RASHA
 */
@Entity
@Table(name="KALA")
public class Kala {
    @Id
   
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="CodeKala")
   public Integer codeKala;
    
    @NotNull
    @Column(name="NameKala")
    
      public String nameKala;
    
    @NotNull
    @Column(name="TadadKala")
    public Integer tadadKala;

    public Integer getCodeKala() {
        return codeKala;
    }

    public void setCodeKala(Integer codeKala) {
        this.codeKala = codeKala;
    }

    public String getNameKala() {
        return nameKala;
    }

    public void setNameKala(String nameKala) {
        this.nameKala = nameKala;
    }

    public Integer getTadadKala() {
        return tadadKala;
    }

    public void setTadadKala(Integer tadadKala) {
        this.tadadKala = tadadKala;
    }

    @Override
    public String toString() {
        return "Kala{" + "codeKala=" + codeKala + ", nameKala=" + nameKala + ", tadadKala=" + tadadKala + '}';
    }
    
    
    
}
