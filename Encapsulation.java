package EjercisiosOBIntro;
public class Encapsulation {
    public static void main (String [] args){
        Persona persona = new Persona();
        persona.setNombre("Martin");
        System.out.println(persona.getNombre());
        persona.setEdad(21);
        System.out.println(persona.getEdad());
        persona.setTelefono("1442346845");
        System.out.println(persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }
}
