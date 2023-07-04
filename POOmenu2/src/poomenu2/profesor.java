package poomenu2;

public class profesor {
    //atributos
    private String nombre, materia;
    
    public profesor(String nombre, String materia){
        this.nombre = nombre;
        this.materia = materia;
    }
    
    public String verNombre(){
        return this.nombre;
    }
    
    public String verMateria(){
        return this.materia;
    }
}
