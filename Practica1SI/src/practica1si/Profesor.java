/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1si;

/**
 *
 * @author i42sadef
 */
public class Profesor extends Persona {
    private String universidad;
    private int id_profesor;

    public Profesor() {
        this.universidad = "-";
        this.id_profesor = -1;
    }

    public Profesor(String nombre, String apellidos, int edad, String universidad, int id_profesor) {
        super(nombre, apellidos, edad);
        this.universidad = universidad;
        this.id_profesor = id_profesor;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p = new Profesor("Paco", "Pérez", 32, "Universidad de Córdoba", 25);
        
        String out = "El profesor %s %s con edad %d trabaja en %s y tiene id %d\n";
        System.out.format(out, p.getNombre(), p.getApellidos(), p.getEdad(),
                p.getUniversidad(), p.getId_profesor());
    }
}
