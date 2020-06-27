package 斗地主;

import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {

        //创建扑克牌对象
        Poker p = new Poker();
        ArrayList<String> poker = new ArrayList<>();
        p.ZhuangPai(poker);
        System.out.println("初始牌面");
        System.out.println(poker);
        System.out.println("扑克牌的长度为" + poker.size());
        p.XiPai(poker);
        System.out.println("洗牌后的牌面");
        System.out.println(poker);
        //创建玩家对象和底牌
        Player player1 = new Player("1号玩家");
        Player player2 = new Player("2号玩家");
        Player player3 = new Player("3号玩家");
        Player DiPai = new Player("底牌");
        System.out.println("进行发牌操作");
        p.FaPai(poker, player1, player2, player3, DiPai);
        System.out.println("查看各个玩家的牌面");
        player1.showPoker();
        //System.out.println(player1.name + player1.poker.size());
        player2.showPoker();
        //System.out.println(player2.name + player2.poker.size());
        player3.showPoker();
        //System.out.println(player3.name + player3.poker.size());
        DiPai.showPoker();
    }
}
