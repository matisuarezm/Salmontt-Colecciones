package model;

//Incluye al menos tres atributos con sus métodos getters, setters y toString().
public class ProduccionCultivos {

    private String id;
    private String nombreCentro;
    private String comuna;
    private double toneladas;

    public ProduccionCultivos(){}

    public ProduccionCultivos (String id, String nombreCentro, String comuna, double toneladas){
        this.id = id;
        this.nombreCentro = nombreCentro;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    public String getId() {
        return id;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public String getComuna() {

        return comuna;
    }

    public double getToneladas() {

        return toneladas;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombreCentro(String nombreCentro) {

        this.nombreCentro = nombreCentro;
    }

    public void setComuna(String comuna) {

        this.comuna = comuna;
    }

    public void setToneladas(double toneladas) {

        this.toneladas = toneladas;
    }

    @Override
    public String toString(){
        return "Centro de Cultivo\n" +
                "ID: " + getId() + '\n' +
                "Nombre: " + getNombreCentro() + '\n' +
                "Comuna: " + getComuna() + '\n' +
                "Producción (t): " + getToneladas() + '\n';

    }
}
