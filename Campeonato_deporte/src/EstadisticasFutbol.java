import java.util.ArrayList;
import java.util.List;

public class EstadisticasFutbol {
    private List<TablaPosiciones> tablaPosiciones = new ArrayList<>();
    private List<EstadisticaIndividualFutbol> estadisticasIndividuales = new ArrayList<>();

    public void actualizarTablaPosiciones(Partido partido) {
        Equipo equipo1 = partido.getEquipo1();
        Equipo equipo2 = partido.getEquipo2();
        int golesEquipo1 = partido.getGolesEquipo1();
        int golesEquipo2 = partido.getGolesEquipo2();

        TablaPosiciones posicionEquipo1 = obtenerOcrearPosicion(equipo1);
        TablaPosiciones posicionEquipo2 = obtenerOcrearPosicion(equipo2);

        if (golesEquipo1 > golesEquipo2) {
            posicionEquipo1.setPartidosGanados(posicionEquipo1.getPartidosGanados() + 1);
            posicionEquipo1.setPuntos(posicionEquipo1.getPuntos() + 3);
            posicionEquipo2.setPartidosPerdidos(posicionEquipo2.getPartidosPerdidos() + 1);
        } else if (golesEquipo1 < golesEquipo2) {
            posicionEquipo2.setPartidosGanados(posicionEquipo2.getPartidosGanados() + 1);
            posicionEquipo2.setPuntos(posicionEquipo2.getPuntos() + 3);
            posicionEquipo1.setPartidosPerdidos(posicionEquipo1.getPartidosPerdidos() + 1);
        } else {
            posicionEquipo1.setPartidosEmpatados(posicionEquipo1.getPartidosEmpatados() + 1);
            posicionEquipo1.setPuntos(posicionEquipo1.getPuntos() + 1);
            posicionEquipo2.setPartidosEmpatados(posicionEquipo2.getPartidosEmpatados() + 1);
            posicionEquipo2.setPuntos(posicionEquipo2.getPuntos() + 1);
        }

        posicionEquipo1.setGolesAFavor(posicionEquipo1.getGolesAFavor() + golesEquipo1);
        posicionEquipo1.setGolesEnContra(posicionEquipo1.getGolesEnContra() + golesEquipo2);

        posicionEquipo2.setGolesAFavor(posicionEquipo2.getGolesAFavor() + golesEquipo2);
        posicionEquipo2.setGolesEnContra(posicionEquipo2.getGolesEnContra() + golesEquipo1);
    }

    private TablaPosiciones obtenerOcrearPosicion(Equipo equipo) {
        for (TablaPosiciones posicion : tablaPosiciones) {
            if (posicion.getEquipo().equals(equipo)) {
                return posicion;
            }
        }
        TablaPosiciones nuevaPosicion = new TablaPosiciones();
        nuevaPosicion.setEquipo(equipo);
        tablaPosiciones.add(nuevaPosicion);
        return nuevaPosicion;
    }

    public void actualizarEstadisticasIndividuales(Partido partido) {
    }

    public List<TablaPosiciones> getTablaPosiciones() {
        return tablaPosiciones;
    }

    public List<EstadisticaIndividualFutbol> getEstadisticasIndividuales() {
        return estadisticasIndividuales;
    }
}
