package players;

public class Player extends BasePlayer {
    public Player(int health, int attack) {
        super(health, attack);
    }

    @Override
    public void attack(BaseEnemy enemy) {
        enemy.setHealth(enemy.getHealth() - super.getAttack());
    }

    @Override
    public String toString() {

        return "player's stats\n\thealth: " + this.getHealth() + "\n\tattack: " + this.getAttack();
    }
}
