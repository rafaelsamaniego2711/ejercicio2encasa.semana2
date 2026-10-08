public class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion() {
        System.out.println("El titulo es : " + titulo);
        System.out.println("El responsable es : " + responsable);
        System.out.println("Las horas estimadas son : " + horasEstimadas);
        System.out.println("El estado de la tarea es : " + completada);
    }

    public void completar() {
        completada = true;
    }

    void mostrarResponsable (){
        System.out.println("El responsable es: " + responsable);
    }

    void mostrarEstado() {
        System.out.println("El estado de la tarea es: " + completada);
    }
}
