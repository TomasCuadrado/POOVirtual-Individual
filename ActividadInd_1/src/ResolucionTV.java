public enum ResolucionTV {
    HD("720p"),
    FULL_HD("1080p"),
    UHD_4K("4K"),
    UHD_8K("8K");

    private final String valor;

    ResolucionTV(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
