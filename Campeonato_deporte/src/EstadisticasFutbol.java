import java.util.ArrayList;
import java.util.List;

public class EstadisticasFutbol {
    private List<TablaPosiciones> tablaPosiciones = new ArrayList<>();
    private List<EstadisticaIndividualFutbol> estadisticasIndividuales = new ArrayList<>();

    public void actualizarTablaPosiciones(Partido partido) {
        // Lógica para actualizar la tabla de posiciones
    }

    public void actualizarEstadisticasIndividuales(Partido partido) {
        // Lógica para actualizar las estadísticas individuales
    }

    public List<TablaPosiciones> getTablaPosiciones() {
        return tablaPosiciones;
    }

    public List<EstadisticaIndividualFutbol> getEstadisticasIndividuales() {
        return estadisticasIndividuales;
    }

    // Getters y setters adicionales según necesidad
}