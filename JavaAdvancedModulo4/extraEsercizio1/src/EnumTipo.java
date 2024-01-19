public enum EnumTipo {
    RIUNIONE("Riunione"),
    COMPLEANNO("Compleanno"),
    PROMEMORIA("Promemoria"),
    ALTRO("Altro");

    private final String nomeTipo;

    EnumTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }
}

