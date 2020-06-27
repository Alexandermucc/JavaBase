package 斗地主;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<String> poker = new ArrayList<>();


    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    /**
     * 看牌
     */
    public void showPoker() {
        System.out.print(name + "的牌为：");
        System.out.println(poker);
    }
}
