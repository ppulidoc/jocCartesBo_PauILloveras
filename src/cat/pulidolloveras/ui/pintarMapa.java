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

    public static void pintarMapaSencer(String nom, int vida, int atac, int escut, int vida_cpu, int atac_cpu, int escut_cpu){
        pintarMapaCapcelera(vida_cpu, atac_cpu, escut_cpu);
        pintarMapaIntemig(nom);
        pintarMapaFooter(vida, atac, escut);
    }

}
