package ar.com.ada.online.second.HarryPotter;

public class Varita {

    String name;
    Integer ptosDano;
    Boolean disponible;

    public Varita(String name, Integer ptosDano, Boolean disponible) {
        this.name = name;
        this.ptosDano = ptosDano;
        this.disponible = disponible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPtosDano(Integer ptosDano) {
        this.ptosDano = ptosDano;
    }

    public Integer getPtosDano() {
        return ptosDano;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Boolean getDisponible() {
        return disponible;
    }
}
