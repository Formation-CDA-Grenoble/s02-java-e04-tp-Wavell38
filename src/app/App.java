package app;

import app.Character;

public class App {
    public static void main(String[] args) throws Exception {
        Character mario;
        
        /*
        * 1. Dieu créa Mario
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        mario = Character.createCharacter();
        test("mario.getLives()", mario.getLives(), 3);



        /*
        * 2. C'est la vie
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        mario = Character.createCharacter();
        System.out.println("Ajoutons une vie à Mario...");
        mario.addLife();
        test("mario.getLives()", mario.getLives(), 4);
        test("mario.hasLives()", mario.hasLives(), true);
        System.out.println("Puis faisons-lui en perdre une...");
        mario.loseLife();
        test("mario.getLives()", mario.getLives(), 3);
        test("mario.hasLives()", mario.hasLives(), true);
        System.out.println("Maintenant, on lui en prend 3...");
        mario.loseLife();
        mario.loseLife();
        mario.loseLife();
        test("mario.getLives()", mario.getLives(), 0);
        test("mario.hasLives()", mario.hasLives(), false);



        /*
        * 3. Petit Mario deviendra grand
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        mario = Character.createCharacter();
        test("mario.getIsBig()", mario.getIsBig(), false);
        System.out.println("Mario ramasse un champignon...");
        mario.pickUpMushroom();
        test("mario.getIsBig()", mario.getIsBig(), true);
        System.out.println("Mario ramasse un autre champignon...");
        mario.pickUpMushroom();
        test("mario.getIsBig()", mario.getIsBig(), true);
        System.out.println("Mario prend un coup...");
        mario.takeHit();
        test("mario.getIsBig()", mario.getIsBig(), false);
        System.out.println("Mario prend un autre coup...");
        mario.takeHit();
        test("mario.getIsBig()", mario.getIsBig(), false);
        test("mario.getLives()", mario.getLives(), 2);



        /*
        * 4. La tête dans les étoiles
        * =====================================================================
        * Décommente le code ci-dessous lorsque tu atteins cette partie
        */
        mario = Character.createCharacter();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        System.out.println("Mario ramasse une étoile...");
        mario.pickUpStar();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), true);
        System.out.println("Mario prend un coup...");
        mario.takeHit();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), true);
        test("mario.getLives()", mario.getLives(), 3);
        System.out.println("L'effet de l'étoile se dissipe...");
        mario.invulnerableWearsOff();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        System.out.println("Mario prend un coup...");
        mario.takeHit();
        test("mario.getIsInvulnerable()", mario.getIsInvulnerable(), false);
        test("mario.getLives()", mario.getLives(), 2);
    }

    private static boolean isEqual(Object value1, Object value2) {
        return (value1 == value2) ? true: false;     
    }

    private static void test(String text, Object result, Object expected) {
        if(App.isEqual(result, expected)) {
            System.out.println("L'appel  "+ text +"  renvoie: "+ result +". (valeur attendue: "+ expected +") C'est bon! ☑️");
        } else {
            System.out.println("L'appel  "+ text +"  renvoie: "+ result +". (valeur attendue: "+ expected +")  Encore un coup des Illuminati... ❔");
        }
    }
}