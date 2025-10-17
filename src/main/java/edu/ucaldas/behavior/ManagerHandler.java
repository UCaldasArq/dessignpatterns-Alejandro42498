package edu.ucaldas.behavior;

public class ManagerHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        String normalized = (request == null) ? "" : request.trim().toLowerCase();


        if (normalized.contains("avanzada") || normalized.contains("avanzado")) {
            return "Atendido por Gerente";
        }

        if (next != null) {
            return next.handleRequest(request);
        }

        return "No se puede atender la solicitud.";
    }
}
