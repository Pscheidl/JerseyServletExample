/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pscheidl.jerseyweb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Greeting {

    private String greeting;

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public Greeting() {
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}
