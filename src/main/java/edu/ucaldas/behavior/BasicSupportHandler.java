package edu.ucaldas.behavior;

public class BasicSupportHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        String normalized = (request == null) ? "" : request.trim().toLowerCase();


        if (normalized.contains("básica") || normalized.contains("basica")) {
            return "Atendido por Soporte Básico";
        }


        if (next != null) {
            return next.handleRequest(request);
        }

        return "No se puede atender la solicitud.";
    }
}
