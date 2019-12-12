package app;

class Character {
    private int lives;
    private boolean isBig;
    private boolean isInvulnerable;

    public Character(int life) {
        this.lives = life;
        System.out.println("Créons Mario avec 3 vies...");
    }

    public static Character createCharacter() {
        return new Character(3);
    }

    public int getLives() {
        return this.lives;
    }

    public int addLife() {
        this.lives++;
        return this.lives;
    }

    public int loseLife() {
        if(this.hasLives()) {
            this.lives--;
        } else {
            System.out.println("Vous n'avez plus de vie...");
        }
        return this.lives;
    }

    public boolean hasLives() {
        return this.lives > 0;
    }

    public boolean getIsBig() {
        return this.isBig;
    }

    public boolean pickUpMushroom() {
        this.isBig = true;
        return this.isBig;
    }

    public Character takeHit() {
        if(!this.isInvulnerable) {
            if(this.isBig) {
                this.isBig = false;
            } else {
                this.loseLife();
            }
        }
        return this;
    }

    public boolean pickUpStar() {
        this.isInvulnerable = true;
        return this.isInvulnerable;
    }

    public boolean invulnerableWearsOff() {
        this.isInvulnerable = false;
        return this.isInvulnerable;
    }

    public boolean getIsInvulnerable() {
        return this.isInvulnerable;
    }

}
