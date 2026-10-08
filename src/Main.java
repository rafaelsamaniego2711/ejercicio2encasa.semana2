public class Main {
    public static void main (String[] args) {
        Tarea tarea1 = new Tarea();
        tarea1.titulo = "Resumen";
        tarea1.responsable = "Juan Perez";
        tarea1.horasEstimadas = 1.5;
        tarea1.completada = false;

        Tarea tarea2 = new Tarea();
        tarea2.titulo = "Mapa conceptual";
        tarea2.responsable = "Jaime Lopez";
        tarea2.horasEstimadas = 1.0;
        tarea2.completada = false;

        Tarea tarea3 = new Tarea();
        tarea3.titulo = "Lluvia de ideas";
        tarea3.responsable = "Lusiana Diaz";
        tarea3.horasEstimadas = 0.5;
        tarea3.completada = false;

        tarea1.mostrarInformacion();
        System.out.println();
        tarea2.mostrarInformacion();
        System.out.println();
        tarea3.mostrarInformacion();
        System.out.println();

        tarea3.completar();

        System.out.println("----Estado actualizado----");
        System.out.println();
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();



    }
}
