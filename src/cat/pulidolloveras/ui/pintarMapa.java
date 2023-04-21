package cat.pulidolloveras.ui;

public class pintarMapa {
    /**
     * @param vida
     * @param atac
     * @param escut
     * Aquest mèdote pinta la capçelera del mapa (Es a dir la zona de joc que veurem gràficament )
     * i ens introdueix els valors necessaris de la partida com son la vida, l'atac i l'escut.
     */
    public static void pintarMapaCapcelera(int vida, int atac, int escut){
        System.out.printf("*--------------------------------------------------------------------------*\n" +
                "-                               PS            ATK           SHIELD         -\n" +
                "-                          ************   ************   ************      -\n" +
                "-                          *          *   *          *   *          *      -\n" +
                "- --> PS : %d             *          *   *          *   *          *      -\n" +
                "- --> ATK: %d              *   %d    *   *    %d    *   *     %d    *      -\n" +
                "- --> SHIELD: %d            *          *   *          *   *          *      -\n" +
                "-                          ************   ************   ************      -\n" +
                "-                                                                          -\n",vida,atac,vida, atac, escut, escut);//psCartesJ1,atkCartesJ1,shieldCartesJ1 );
    }

    /**
     * @param nom
     * Aquesta funció només pinta la part intermitja del mapa
     */
    public static void pintarMapaIntemig(String nom){
        System.out.printf("--------------------------------   CPU   ------------------------------\n" +
                "-                                                                          -\n" +
                "-                            -       -    - - - - -                        -\n" +
                "-                            -     -     -                                 -\n" +
                "-                            -   -      - - - - -                          -\n" +
                "-                            - -               -                           -\n" +
                "-                            -        - - - - -                            -\n" +
                "-                                                                          -\n" +
                "-                                                                          -\n" +
                "--------------------------------   %s   ------------------------------", nom);
    }

    /**
     * @param vida
     * @param atac
     * @param escut
     * Al igual que la primera funcio de pintar mapa que hi ha a dalt, aquesta el que fa és
     * pintar el footer on tammbé li entrarem valors que en aquest cas son del jugador i no
     * de la CPU.
     */
    public static void pintarMapaFooter(int vida, int atac, int escut){
        System.out.println();
        System.out.printf("-                               PS            ATK           SHIELD         -\n" +
                "-                          ************   ************   ************      -\n" +
                "-                          *          *   *          *   *          *      -\n" +
                "- --> PS : %d             *          *   *          *   *          *      -\n" +
                "- --> ATK: %d              *   %d    *   *    %d    *   *     %d    *      -\n" +
                "- --> SHIELD: %d            *          *   *          *   *          *      -\n" +
                "-                          ************   ************   ************      -\n" +
                "-                                                                          -\n" +
                "-                                               @byPulido&Lloveras Company -\n" +
                "*--------------------------------------------------------------------------*",vida,atac,vida, atac, escut, escut); //psCartesJ2,atkCartesJ2,shieldCartesJ2);
    }

    /**
     * @param nom
     * @param vida
     * @param atac
     * @param escut
     * @param vida_cpu
     * @param atac_cpu
     * @param escut_cpu
     * En aquesat funcio recopilem les tres funcions anteriors per tal de fer el codi main més  eficient i
     * menys carregat, es a dir més nte i entenible a l'hora de programmar, en aquesta funcio liu entrarem tots
     * els valors dels dos jugadors tant CPU com player.
     */
    public static void pintarMapaSencer(String nom, int vida, int atac, int escut, int vida_cpu, int atac_cpu, int escut_cpu){
        pintarMapaCapcelera(vida_cpu, atac_cpu, escut_cpu);
        pintarMapaIntemig(nom);
        pintarMapaFooter(vida, atac, escut);
    }

}
