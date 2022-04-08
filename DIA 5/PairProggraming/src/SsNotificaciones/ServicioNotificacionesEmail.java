package SsNotificaciones;

public class ServicioNotificacionesEmail implements ServicioNotifiaciones {
    @Override
    public void sendNotificacion(String medio) {
        medio = "email";
    }

}
