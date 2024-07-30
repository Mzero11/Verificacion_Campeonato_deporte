
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear equipos y agregar deportistas
        List<Equipo> equipos = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese el nombre del equipo " + i + ": ");
            String nombreEquipo = scanner.nextLine();
            Equipo equipo = new Equipo(nombreEquipo);

            System.out.println("Ingrese el número de jugadores para " + nombreEquipo + ": ");
            int numJugadores = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            for (int j = 1; j <= numJugadores; j++) {
                System.out.println("Ingrese el nombre del jugador " + j + ": ");
                String nombreJugador = scanner.nextLine();
                System.out.println("Ingrese la edad del jugador " + j + ": ");
                int edadJugador = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese el género del jugador " + j + ": ");
                String generoJugador = scanner.nextLine();
                System.out.println("Ingrese la posición del jugador " + j + ": ");
                String posicionJugador = scanner.nextLine();

                Deportista deportista = new Deportista(nombreJugador, edadJugador, generoJugador, posicionJugador);
                equipo.agregarMiembro(deportista);
            }
            equipos.add(equipo);
        }

        // Crear campeonato
        CampeonatoFutbol campeonato = new CampeonatoFutbol("Campeonato Local", new Date(), new Date());

        // Inscribir equipos en el campeonato
        for (Equipo equipo : equipos) {
            campeonato.inscribirEquipo(equipo);
        }

        // Programar un partido
        Partido partido = new Partido(new Date(), equipos.get(0), equipos.get(1));
        campeonato.programarPartido(partido);

        // Registrar resultado del partido
        System.out.println("Ingrese el resultado del partido:");
        System.out.println("Goles de " + equipos.get(0).equipogetNombre() + ": ");
        int golesEquipo1 = scanner.nextInt();
        System.out.println("Goles de " + equipos.get(1).getNombre() + ": ");
        int golesEquipo2 = scanner.nextInt();
        partido.registrarResultado(golesEquipo1, golesEquipo2);

        // Mostrar resultado del partido
        System.out.println("Resultado del partido: " + partido.getResultado());

        // Actualizar estadísticas del campeonato
        EstadisticasFutbol estadisticas = new EstadisticasFutbol();
        estadisticas.actualizarTablaPosiciones(partido);
        estadisticas.actualizarEstadisticasIndividuales(partido);

        System.out.println("Partido registrado y estadísticas actualizadas.");
    }
}