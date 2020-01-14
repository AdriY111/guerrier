package fr;

public final class App {

    public static void main(final String[] args) {

        int guerrier1Victoire = 0;
        int guerrier2Victoire = 0;

        for (int i = 0; i < 10; i++) {

            Guerrier guerrier1 = new Guerrier();
            guerrier1.init("Adrien", 100.0, 100);

            Guerrier guerrier2 = new Guerrier();
            guerrier2.init("Alexi", 80.0, 110);

            while (guerrier1.estEnVie() && guerrier2.estEnVie()) {
                guerrier1.attaquer(guerrier2);
                System.out.println("La vie du guerrier 1 est : " + guerrier1.getPv() + " La vie du guerrier 2 est : "
                        + guerrier2.getPv());

                // ceci est un getter
            }
            /*
             * guerrier1.afficherStat(); guerrier2.afficherStat();
             */
            System.out.println();

            if (guerrier1.estEnVie()) {
                guerrier1Victoire++;
            } else {
                guerrier2Victoire++;

            }
            System.out.print(guerrier1Victoire);
            System.out.print(" || ");
            System.out.print(guerrier2Victoire);
        }
    }

}