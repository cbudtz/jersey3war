package rest;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Patient {
    private String name;

    public Patient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
