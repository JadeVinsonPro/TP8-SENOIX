public class Produit {
    private String variete;
    private String type;
    private int calibre;

    public Produit(String variete, String type, int calibre) {
        this.variete = variete;
        this.type = type;
        this.calibre = calibre;
    }

    public String getVariete() {
        return variete;
    }

    public void setVariete(String variete) {
        this.variete = variete;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }
}
