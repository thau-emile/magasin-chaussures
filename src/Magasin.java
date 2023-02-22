package src;

/**
 * Magasin
 */
public class Magasin {

    private String nom;
    private String adresse;
    private Chaussure chaussureEnVitrine;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Chaussure getChaussureEnVitrine() {
        return chaussureEnVitrine;
    }

    public void setChaussureEnVitrine(Chaussure chaussureEnVitrine) {
        this.chaussureEnVitrine = chaussureEnVitrine;
    }

    public static void main(String[] args) {

        Chaussure[] chaussures = new Chaussure[6];
        chaussures[0] = new Chaussure();
        chaussures[1] = new Basket();
        chaussures[2] = new Tennis();
        chaussures[3] = new ChaussureDeVille();
        chaussures[4] = new Escarpin();
        chaussures[5] = new Botte();

        for (Chaussure chaussure : chaussures) {
            chaussure.marche();
        }

        new Basket().marche();

        /*
         * // allez j'ouvre mon propre magasin de chaussures !
         * Magasin monMagasin = new Magasin();
         * monMagasin.setNom("Ma Chaussure, elle assure !");
         * monMagasin.setAdresse("42, rue du Jeu, 31000 TOULOUSE");
         *
         * // tiens, testons un peu de polymorphisme
         * monMagasin.setChaussureEnVitrine(new Basket());
         * monMagasin.getChaussureEnVitrine().marche();
         *
         * // ptit test qu'on stock bien les ref des objets et pas les valeurs
         * Chaussure laChaussureEnQuestion = monMagasin.getChaussureEnVitrine();
         * laChaussureEnQuestion.setNom("La chaussure.");
         * System.out.println("La chaussure en vitrine de mon magasin s'appelle " +
         * monMagasin.getChaussureEnVitrine().getNom());
         */
    }

}