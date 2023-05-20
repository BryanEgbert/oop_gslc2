package view;

import players.BaseEnemy;
import players.BasePlayer;
import players.Enemy;
import players.Player;

public class Terminal implements View {

    private BasePlayer player;
    private BaseEnemy enemy;

    public Terminal() {
    }

    @Override
    public void show() {
        player = new Player(10, 2);
        enemy = new Enemy(10, 1);

        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }
    
}
