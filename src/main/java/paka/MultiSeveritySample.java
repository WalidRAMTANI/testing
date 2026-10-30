package paka;

import java.util.*; // [MINOR] AvoidStarImportCheck : Import en étoile

// [INFO] JavadocCheck : Absence de Javadoc sur la classe
public class MultiSeveritySample {

    // [MAJOR] VisibilityModifierCheck : Champ public non encapsulé
    public int publicVariable = 42;

    // [MINOR] MemberNameCheck : Mauvaise convention de nommage du champ
    private int BadFieldName = 10;

    // [MINOR] LineLengthCheck : Ligne excessivement longue (plus de 80 caractères)
    // Ceci est un commentaire extrêmement long conçu exprès pour dépasser la limite de quatre-vingts caractères fixée par les règles de style standard.

    // [BLOCKER] FinalizersCheck : Utilisation d'une méthode finalize() (risque critique)
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // [BLOCKER] EmptySynchronizedBlockCheck : Bloc synchronisé vide (risque de concurrence/sécurité)
    public void processBlock() {
        synchronized (this) {
            
        }
    }

    // [MAJOR] CyclomaticComplexityCheck : Complexité cyclomatique élevée
    public void complexMethod(int x, int y, int z) {
        if (x > 0) {
            if (y > 0) {
                if (z > 0) {
                    if (x + y > 10) {
                        if (y + z > 10) {
                            System.out.println("Too complex");
                        }
                    }
                }
            }
        }
    }
}
