package 斗地主;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Poker {


    //有什么牌
    private String[] color = {"♤", "♢", "♣", "♡"}; //牌的花色
    private String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"}; //什么牌
    private String[] DXW = {"大王", "小王"};

    //功能

    /**
     * 1. 装牌
     * 2. 洗牌
     * 3. 发牌
     */

    // 1. 装牌
    public ArrayList<String> ZhuangPai(ArrayList<String> poker) {
        for (int i = 0; i < color.length; i++) {
            for (int i1 = 0; i1 < number.length; i1++) {
                poker.add(color[i] + number[i1]);
            }
        }
        poker.add(DXW[0]);
        poker.add(DXW[1]);
        return poker;
    }

    //2. 洗牌
    public void XiPai(ArrayList<String> poker) {
        Collections.shuffle(poker);
    }

    //3. 发牌
    public void FaPai(ArrayList<String> poker, Player player1, Player player2, Player player3, Player DiPai) {
        for (int i = 0; i < poker.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.poker.add(poker.get(i));
            }
            if (i % 3 == 1) {
                player2.poker.add(poker.get(i));
            }
            if (i % 3 == 2) {
                player3.poker.add(poker.get(i));
            }
        }
        for (int i = poker.size() - 1; i >= poker.size() - 3; i--) {
            DiPai.poker.add(poker.get(i));
        }

    }
}
