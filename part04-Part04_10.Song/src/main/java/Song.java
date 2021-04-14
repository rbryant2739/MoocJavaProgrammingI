/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Song {
    private String name;
    private int length;
    
    public Song(String name, int sLen){
        this.name = name;
        this.length = sLen;        
    }
    
    public String name(){
        return this.name;
    }
    public int length(){
        return this.length;
    }
    
}
