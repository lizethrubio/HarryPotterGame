package ar.com.ada.online.second.HarryPotter.SuperClass;

public class Hechizos {

    String name;
    Integer type; //1.Ataque 2.Defensa 3.Recuperacion
    Integer ptosEnergiaMagica;
    public Integer ptosDanos;
    public Integer ptosEnergiaMagicaRecuperados;
    public Integer ptosVida;



    public String getName(){
       return name;
    }

    public void setName(String name1){
        name = name1;
    };

    public Hechizos(){}

    public Hechizos(String name, Integer type, Integer ptosEnergiaMagica) {
        this.name = name;
        this.type = type;
        this.ptosEnergiaMagica = ptosEnergiaMagica;
    }

    public Integer getType() {
        return type;
    }

    public Integer getPtosEnergiaMagica() {
        return ptosEnergiaMagica;
    }

    public void setPtosEnergiaMagica(Integer ptosEnergiaMagica) {
        this.ptosEnergiaMagica = ptosEnergiaMagica;
    }

    public Boolean suficienteEnergiaMagica (Personaje personaje){
        if (personaje.getEnergiaMagica()<ptosEnergiaMagica){
            return false;
            //no tiene suficiente energia para el hechizo
        }else{
            return true;
            // descontar energia magica
        }
    }

    public void setPtosDanos(Integer ptosDanos) {
        this.ptosDanos = ptosDanos;
    }

    public void setPtosVida(Integer ptosVida) {
        this.ptosVida = ptosVida;
    }

    public void setPtosEnergiaMagicaRecuperados(Integer ptosEnergiaMagicaRecuperados) {
        this.ptosEnergiaMagicaRecuperados = ptosEnergiaMagicaRecuperados;
    }
}
