package src;

public class Chaussure {

    private String nom;
    private int pointure;
    private boolean gauche;
    private Magasin magasin;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointure() {
        return pointure;
    }

    public void setPointure(int pointure) {
        this.pointure = pointure;
    }

    public boolean isGauche() {
        return gauche;
    }

    public void setGauche(boolean gauche) {
        this.gauche = gauche;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    /**
     * Commentaire de marche()
     */
    public void marche() {

        System.out.println("je marche !");
    }

}
