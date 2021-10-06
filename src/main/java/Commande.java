public class Commande {
    private int id;
    private Produit leProduit;
    private float prixHt;
    private String conditionnement;
    private int quantite;
    private String dateConditionnment;
    private String dateEnvoi;

    public Commande(int id, Produit leProduit, float prixHt, String conditionnement, int quantite, String dateConditionnment, String dateEnvoi) {
        this.id = id;
        this.leProduit = leProduit;
        this.prixHt = prixHt;
        this.conditionnement = conditionnement;
        this.quantite = quantite;
        this.dateConditionnment = dateConditionnment;
        this.dateEnvoi = dateEnvoi;
    }

    public int getId() {
        return id;
    }

    public Produit getLeProduit() {
        return leProduit;
    }

    public float getPrixHt() {
        return prixHt;
    }

    public String getConditionnement() {
        return conditionnement;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getDateConditionnment() {
        return dateConditionnment;
    }

    public String getDateEnvoi() {
        return dateEnvoi;
    }

    public EnCours() { // Stocke les données de l'objet dans la base de données.


    }

    public XmlCommande() {

    }
}
