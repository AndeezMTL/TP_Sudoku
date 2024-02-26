import static java.lang.System.exit;

public class SudoObj {
    //########################     Création de tableau      ######################
    /*
         :  un tableau 2 dimensions 9x9 de la classe Case.
     */
    //TODO
    public class Case {

        private int valeur;


        public Case(int valeur) {
            this.valeur = valeur;

        }

        public int getValeur() {
            return this.valeur;
        }

    }

    //########################      Création de lignes/colonnes/boites      ####################
    /*
        lignes : Créez un tableau 9x9 du type primitif int qui réplique ce tableau :

        0  1  2  3  4  5  6  7  8
        9  10 11 12 13 14 15 16 17
        18 19 20 21 22 23 24 25 26
        27 28 29 30 31 32 33 34 35
        36 37 38 39 40 41 42 43 44
        45 46 47 48 49 50 51 52 53
        54 55 56 57 58 59 60 61 62
        63 64 65 66 67 68 69 70 71
        72 73 74 75 76 77 78 79 80
     */
    //TODO
    public class SudoObj {
        // ...

        //
        private int[][] lignes;
        private int[][] colonnes;
        private int[][] boites;

        public SudoObj(int[][] tableau) {

        }

        // ...
    }


    /*
        colonnes : Créez un tableau 9x9 du type primitif int qui réplique ce tableau :
            0  9   18  27  36  45  54  63  72
            1  10  19  28  37  46  55  64  73
            2  11  20  29  38  47  56  65  74
            3  12  21  30  39  48  57  66  75
            4  13  22  31  40  49  58  67  76
            5  14  23  32  41  50  59  68  77
            6  15  24  33  42  51  60  69  78
            7  16  25  34  43  52  61  70  79
            8  17  26  35  44  53  62  71  80
     */
    //TODO

    /*
        boites : Créez un tableau 9x9 du type primitif int qui réplique ce tableau :

            0   1   2   9   10  11  18  19  20
            3   4   5   12  13  14  21  22  23
            6   7   8   15  16  17  24  25  26
            27  28  29  36  37  38  45  46  47
            30  31  32  39  40  41  48  49  50
            33  34  35  42  43  44  51  52  53
            54  55  56  63  64  65  72  73  74
            57  58  59  66  67  68  75  76  77
            60  61  62  69  70  71  78  79  80
     */
    //TODO

    /**
     * Cette classe permet de visualiser et résoudre les sudokus
     * @param tableau Le tableau 9x9 contenant les valeurs du sudoku
     */
    public SudoObj(int[][] tableau) {
        //##################      3 - Création des cases dans le tableau avec les valeurs passées en paramètres     ###################
        //Remplir le tableau d'objet Case. N'oubliez pas de mettre les bonnes données dans le constructeur.
        //TODO

            // pour remplir le tableau d'objet Case dans le constructeur

        Case[][] tableau;

            public SudoObj(int[][] tableau) {
            this.tableau = new Case[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    this.tableau[i][j] = new Case(tableau[i][j]);
                }
            }
        }

            // ...
        }



    /**
     *  Affiche un sudoku tel que montré dans l'énoncé du tp
     */
    public void afficheSudoku(){
        // ...

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(this.tableau[i][j].getValeur() + " ");
                }
                System.out.println();
            }
        }

        // ...



        //TODO





    /**
     * Vérifie si le chiffre peut aller dans la ligne. Le chiffre peut aller dans la ligne SSI il n'y est pas déjà présent.
     *
     * @param chiffre
     * @param row index de la ligne où l'on voudrait mettre le chiffre
     * @return true s'il peut être placé à cet endroit, false sinon
     */
    public boolean verifLigne(int chiffre, int row){
        //TODO
        for (int i = 0; i < 9; i++) {
            if (this.tableau[row][i].getValeur() == chiffre) {
                return false;
            }
        }
        return true;
    }

    /**
     * Cette méthode vous est donnée il vous suffit de la décommenter et de vous assurer que le reste de votre code respecte les exigences de l'énoncé de tel sorte qu'il
     * n'y ait pas d'erreur dans ce code. Ne le modifez pas sans me demander si vos changements sont acceptables.
     * Vérifie si le chiffre peut aller dans la colonne. Le chiffre peut aller dans la colonne SSI il n'y est pas déjà présent.
     * @param chiffre
     * @param col index de la colonne où l'on voudrait mettre le chiffre
     * @return true s'il peut être placé à cet endroit, false sinon
     */
    public boolean verifColonne(int chiffre, int col){
        for (int i = 0; i < 9; i++) {
            if (this.tableau[i][col].getValeur() == chiffre) {
                return false;
            }
        }
        return true;
    }

    /**
     * Vérifie si le chiffre peut aller dans la boite. Le chiffre peut aller dans la boite SSI il n'y est pas déjà présent.
     * @param chiffre
     * @param x index de la ligne où l'on voudrait mettre le chiffre
     * @param y index de la colonne où l'on voudrait mettre le chiffre
     * @return true s'il peut être placé à cet endroit, false sinon
     */
    public boolean verifBoite(int chiffre, int x, int y){
       //TODO

            // Calculer les indices de début de la boîte
            int boiteStartX = (x / 3) * 3;
            int boiteStartY = (y / 3) * 3;

            // Parcourir les cellules de la boîte
            for (int i = boiteStartX; i < boiteStartX + 3; i++) {
                for (int j = boiteStartY; j < boiteStartY + 3; j++) {
                    // Vérifier si le chiffre est déjà présent dans la boîte
                    if (this.tableau[i][j].getValeur() == chiffre) {
                        return false;
                    }
                }
            }

            // Si on n'a pas trouvé le chiffre dans la boîte, il peut être placé
            return true;
        }



    /**
     * Vérifie si le sudoku est complet
     * @return true s'il est complet, false sinon
     */




    //******************A FAIRE


    public boolean estComplet(){
        //TODO
        return true;
    }

    //###############################################################

    /**
     * Mets à jour les valeurPossible de la case.
     * Pour chaque valeur possible de la case:
     * Vérifie si cette valeur peut encore aller dans la ligne, la colonne et la boite de cette case. Si oui, alors elle reste true dans valeurPossible. Sinon la tourne à false.
     * Compte le nombre de valeurs possibles pour cette case. S'il n'y a qu'une valeur possible, alors assigne à cette case cette valeur.
     * @param position La case à mettre à jour
     */


    //******************A FAIRE

    public void updateCase(Case position){
        //TODO

    }


    //CODE DONNÉE GRATUIT
    //Ces méthodes vous sont données il vous suffit de les décommenters. Ensuite, assurez que le reste de votre code respecte les exigences de l'énoncé de telle sorte qu'il
    //n'y ait pas d'erreur dans ce code. Ne le modifez pas sans me demander si vos changements sont acceptables.
    /**
     * Vérifie si le chiffre est obligé d'aller sur cette case
     * @param chiffre Entier entre 1 et 9 inclusivement
     * @param x Position en x dans le tableau (numéro de ligne)
     * @param y Position en y dans le tableau (numéro de colonne)
     * @return
     */
//    public boolean positionnementObligatoire(int chiffre, int x, int y){
//        chiffre--;
//        int[] lineArray = this.lignes[this.tableau[x][y].getLigne()];
//        int sommeLine = 0;
//        for (int pos:lineArray) {
//            if(this.tableau[pos/9][pos%9].getValeurPossible(chiffre)){
//                sommeLine++;
//            }
//        }
//
//        int[] colArray = this.colonnes[this.tableau[x][y].getColonne()];
//        int sommeCol = 0;
//        for (int pos:colArray) {
//            if(this.tableau[pos/9][pos%9].getValeurPossible(chiffre)){
//                sommeCol++;
//            }
//        }
//
//        int[] boxArray = this.boites[this.tableau[x][y].getBoite()];
//        int sommeBox = 0;
//        for (int pos:boxArray) {
//            if(this.tableau[pos/9][pos%9].getValeurPossible(chiffre)) {
//                sommeBox++;
//            }
//        }
//
//        if (sommeLine == 1 || sommeBox == 1 || sommeCol == 1){
//            return true;
//        }
//        return false;
//    }
//    /**
//     * Parcours le tableau une fois et fait une mise à jour des valeurs possibles de chaque case 1 fois.
//     */
//    public void updateTableauOnce(){
//
//        for(int i = 0; i < 81; i++){
//            if(this.tableau[i/9][i%9].getIsSet()){
//                continue;
//            }
//            else
//                updateCase(this.tableau[i/9][i%9]);
//
//        }
//        for(int i = 0; i < 81; i++){
//            if(this.tableau[i/9][i%9].getIsSet()){
//                continue;
//            }
//            for(int j = 0; j < 9; j++){
//                if(this.tableau[i/9][i%9].getValeurPossible(j)) {
//                    if (positionnementObligatoire(j + 1, (int) (i / 9), (int)(i % 9))) {
//                        this.tableau[i/9][i%9].setValeur(j+1);
//                        break;
//                    }
//                }
//            }
//        }
//
//    }
//
//
//    /*
//            Faire une boucle infinie qui :
//            Compte le nombre d'itérations.
//            Vérifie si le sudoku est complété et si oui sort de la boucle
//
//    */
//    public void resoudreSudoku(){
//        int compteur = 0;
//        String msg = "Le sudoku est résolu après ";
//        while(true){
//            if(estComplet()){
//                break;
//            }
//
//                /*
//                    Cette partie est un code pour débugger. Lorsque vous êtes certain que tous se passe bien, vous pouvez le retirer ou pas.
//                    Vous pouvez aussi modifier le 20 par le chiffre de votre choix pour arrêter votre code à l'instant voulu.
//                */
//            //####################################
//            if(compteur > 20){
//                msg = "Le programme s'est arrêté au bout de ";
//                break;
//            }
//            //#####################################
//
//            /*
//               Écris où nous sommes rendu
//               Affiche le sudoku
//               Fais une fois la MAJ de toutes les cases
//             */
//            System.out.println("#############   " + compteur + "e MAJ   #############\n");
//            afficheSudoku();
//            updateTableauOnce();
//            System.out.println("");
//            compteur++;
//        }
//
//        // Affiche le message à la fin de la boucle ainsi qu'une idée de combien d'itérations ont été effectué, puis affiche le sudoku
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println(msg + compteur + " mises à jour\n");
//        afficheSudoku();
//
//    }
}

