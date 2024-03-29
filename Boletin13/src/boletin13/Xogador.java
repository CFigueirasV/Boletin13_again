
package boletin13;

class Xogador extends SeleccionFutbol {
  private int dorsal;
    private String demarcacion;

    public Xogador() {
        super();

    }

    public Xogador(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    
    public void jugarPartido() {
        System.out.println("El jugador juega el partido");
    }

    public void entrenar() {

    }

    @Override
    public String toString() {

        return "xogador:" + super.toString() + "\ndorsal=" + dorsal + " \ndemarcacion=" + demarcacion;
    }

    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores"); 
    }
    
}