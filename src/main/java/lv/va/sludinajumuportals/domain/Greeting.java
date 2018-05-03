/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.va.sludinajumuportals.domain;

public class Greeting {

    private String name;
    private String surname;
    private long nr;
    private byte age;
    private String slud;
    private long price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public long getNr() {
        return nr;
    }

    public void setNr(long nr) {
        this.nr = nr;
    }
    
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
    
    public String getSlud() {
        return slud;
    }

    public void setSlud(String slud) {
        this.slud = slud;
    }
    
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    
   

}