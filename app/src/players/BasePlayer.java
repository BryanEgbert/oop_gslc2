package players;

public abstract class BasePlayer {
    private int health;
    private int attack;

    public BasePlayer(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void attack(BaseEnemy enemy) {}
    
    public int getHealth() { return this.health; }
    public void setHealth(int health) { this.health = health; }
    public int getAttack() { return this.attack; }
    public void setAttack(int attack) { this.attack = attack; }
}
