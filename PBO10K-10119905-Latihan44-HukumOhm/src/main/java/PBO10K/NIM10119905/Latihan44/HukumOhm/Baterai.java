/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan44.HukumOhm;

/**
 *
 * @author aruma
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        
    }
    
    public Baterai (float kuatArus, float hambatan){
        this.hambatan =hambatan;
        this.kuatArus =kuatArus;
    }
    
    public float getKuatArus(){
    return kuatArus;
    }
    
    public float getHambatan(){
    return hambatan;
    }
    
    public float hitungTegangan(){
    return kuatArus*hambatan;    
    }
}
