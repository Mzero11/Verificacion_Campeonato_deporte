import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Deportista> miembros = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMiembro(Deportista deportista) {
        miembros.add(deportista);
    }

    public void eliminarMiembro(Deportista deportista) {
        miembros.remove(deportista);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Deportista> getMiembros() {
        return miembros;
    }
}
