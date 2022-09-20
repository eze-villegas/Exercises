package EjercisiosOBIntro;
public class Inheritance{

    public static void main(String [] args) {
        Cliente cliente = new Cliente();
        cliente.setCredito(124);;
        cliente.setNombre("Martin");
        cliente.setEdad(24);;
        cliente.setTelefono("1442346845");
        System.out.println(cliente.getCredito()+ " "+cliente.getNombre()+ " "+cliente.getEdad()+" "+cliente.getTelefono());

    }

}
class Persona{
    int edad;
    String nombre;
    String telefono;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona{
    int credito;
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    } 
}

class Trabajador extends Persona {
    int salario;
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}

