package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        String normalized = (request == null) ? "" : request.trim().toLowerCase();


        if (normalized.contains("intermedia") || normalized.contains("intermedio")) {
            return "Atendido por Supervisor";
        }

        if (next != null) {
            return next.handleRequest(request);
        }

        return "No se puede atender la solicitud.";
    }
}

