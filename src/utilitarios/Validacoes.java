package utilitarios;

public class Validacoes {

    public static boolean validarData(String data) {
        boolean validar = data.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/-](0?[1-9]|1[012])[\\/-]\\d{4}$");
        return validar;
    }

    public static boolean validarHora(String hora) {
        boolean validar = hora.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
        return validar;
    }

    public static boolean validarPsistolica(String sistolica) {
        boolean validar = sistolica.matches("^(9[0-9]|[1-9][0-9]{2}|2[0-3][0-9]|240)$");
        return validar;
    }

    public static boolean validarPdiastolica(String diastolica) {
        boolean validar = diastolica.matches("^(6[0-9]|[7-9][0-9]|1[0-3][0-9]|140)$");
        return validar;
    }

}
