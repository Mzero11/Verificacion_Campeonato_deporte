
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CampeonatoFutbol {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Equipo> equipos = new ArrayList<>();
    private List<Partido> partidos = new ArrayList<>();
    private EstadisticasFutbol estadisticas;

    public CampeonatoFutbol(String nombre, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void inscribirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void programarPartido(Partido partido) {
        partidos.add(partido);
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    // Getters y setters adicionales según necesidad
}
