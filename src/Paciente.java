/*
Clase Paciente.
Atributos privados
• nombre (String)
• edad (int)
• peso (double)
• presionArterial (double)
• estable (boolean)
Métodos propios
Debe implementar los siguientes métodos:
• cumplirAnios() → aumenta la edad en 1.
• aumentarPeso(double cantidad) → incrementa el peso.
• disminuirPeso(double cantidad) → reduce el peso.
• subirPresion(double valor) → aumenta la presión arterial.
• bajarPresion(double valor) → disminuye la presión arterial.
• empeorarEstado() → cambia estable a false.
• mejorarEstado() → cambia estable a true.
• mostrarHistoriaClinica() → muestra toda la información del paciente.
 */
public class Paciente {

    private String nombre;
    private int edad;
    private double peso;
    private double presionArterial;
    private boolean estable;

    //Constructor vacio
    public Paciente() {
    }

    //Constructor
    public Paciente(String nombre, int edad, double peso, double presionArterial, boolean estable) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.presionArterial = presionArterial;
        this.estable = estable;
    }

    //Set and Get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(double presionArterial) {
        this.presionArterial = presionArterial;
    }

    public boolean isEstable() {
        return estable;
    }

    public void setEstable(boolean estable) {
        this.estable = estable;
    }

    //To String

    @java.lang.Override
    public java.lang.String toString() {
        return "Paciente" + + '\n' +
                "   nombre='" + nombre + '\n' +
                "   edad=" + edad + '\n' +
                "   peso=" + peso + + '\n' +
                "   presionArterial=" + presionArterial + + '\n' +
                "   estable=" + estable + '\n' ;
    }

    //Metodos
    /*
    Métodos propios
    Debe implementar los siguientes métodos:
    • cumplirAnios() → aumenta la edad en 1.
    • aumentarPeso(double cantidad) → incrementa el peso.
    • disminuirPeso(double cantidad) → reduce el peso.
    • subirPresion(double valor) → aumenta la presión arterial.
    • bajarPresion(double valor) → disminuye la presión arterial.
    • empeorarEstado() → cambia estable a false.
    • mejorarEstado() → cambia estable a true.
    • mostrarHistoriaClinica() → muestra toda la información del paciente.
     */
    public void cumplirAnios(){
        edad++;
    }

    public void aumentarPeso(double cantidad){
        peso += cantidad;
    }

    public void disminuirPeso(double cantidad){
        peso -= cantidad;
    }

    public void subirPresion(double valor){
        presionArterial += valor;
    }

    public void bajarPresion(double valor){
        presionArterial -= valor;
    }

    public void empeorarEstado(){
        estable=false;
    }

    public void mejorarEstado(){
        estable=true;
    }

    public String mostrarHistoriaClinica(){
        return "Paciente" + + '\n' +
                "   nombre='" + nombre + '\n' +
                "   edad=" + edad + '\n' +
                "   peso=" + peso + + '\n' +
                "   presionArterial=" + presionArterial + + '\n' +
                "   estable=" + estable + '\n' ;
    }
}
