import services.turnos;
import Persona.Persona;
public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.obtenerInformacion();
    }
}
