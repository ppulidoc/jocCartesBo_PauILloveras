package cat.pulidolloveras.ui;

public class pintarMapa {
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
    public static void pintarMapaIntemig(){
        System.out.println("--------------------------------   PLAYER 2   ------------------------------\n" +
                "-                                                                          -\n" +
                "-                            -       -    - - - - -                        -\n" +
                "-                            -     -     -                                 -\n" +
                "-                            -   -      - - - - -                          -\n" +
                "-                            - -               -                           -\n" +
                "-                            -        - - - - -                            -\n" +
                "-                                                                          -\n" +
                "-                                                                          -\n" +
                "--------------------------------   PLAYER 1   ------------------------------");
    }
    public static void pintarMapaFooter(int vida, int atac, int escut){
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

}
