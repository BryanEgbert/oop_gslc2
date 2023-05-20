package players;

public abstract class BaseEnemy {
    private int health;
    private int attack;

    public BaseEnemy(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void attack(BasePlayer player) {}

    public int getHealth() { return this.health; }
    public void setHealth(int health) { this.health = health; }
    public int getAttack() { return this.attack; }
    public void setAttack(int attack) { this.attack = attack; }
}
