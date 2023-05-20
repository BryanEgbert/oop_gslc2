package players;

public class Enemy extends BaseEnemy {

    public Enemy(int health, int attack) {
        super(health, attack);
    }

    @Override
    public String toString() {

        return "enemy's stats\n\thealth: " + this.getHealth() + "\n\tattack: " + this.getAttack();
    }
    
}
