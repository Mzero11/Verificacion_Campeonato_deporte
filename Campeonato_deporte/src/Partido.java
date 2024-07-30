import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private String resultado;

    public Partido(Date fecha, Equipo equipo1, Equipo equipo2) {
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void registrarResultado(int goles1, int goles2) {
        this.golesEquipo1 = goles1;
        this.golesEquipo2 = goles2;
        this.resultado = goles1 + " - " + goles2;
    }

    // Getters y setters
}