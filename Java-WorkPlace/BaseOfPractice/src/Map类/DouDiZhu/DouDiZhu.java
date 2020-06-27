package Map类.DouDiZhu;

import java.util.*;

public class DouDiZhu {

    public static void main(String[] args) {


        poker();
        pokerSuper();
        pokerSuperDoubble();

    }

    private static void pokerSuperDoubble() {
        System.out.println("进阶版");
        long fistTime = System.currentTimeMillis();

        //1.装牌
        List<String> colors = List.of("♡", "♦", "♤", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        List<Integer> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        int index = 0;
        map.put(index, "大王");list.add(index++);
        map.put(index, "小王");list.add(index++);
        for (String color : colors) {
            for (String number : numbers) {
                map.put(index,color+number);
                list.add(index++);
            }
        }

        System.out.println("初始牌面为" + map);

        //2.洗牌
        Collections.shuffle(list);


        //3.发牌
        List<Integer> DiPai = new ArrayList<>();
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i > 50) {
                DiPai.add(list.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(list.get(i));
                } else if (i % 3 == 1) {
                    player2.add(list.get(i));
                } else {
                    player3.add(list.get(i));
                }
            }
        }

        //4.看牌
        //1.排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(DiPai);

        showPoker("玩家1",player1,map);
        showPoker("玩家2",player2,map);
        showPoker("玩家3",player3,map);
        showPoker("底牌",DiPai,map);

        long lastTime = System.currentTimeMillis();
        System.out.println("程序总用时" + (lastTime - fistTime) + "毫秒");
    }



    private static void pokerSuper() {

        System.out.println("改进版");
        long fistTime = System.currentTimeMillis();

        //1.装牌
        List<String> colors = List.of("♡", "♦", "♤", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        List<Integer> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "大王");list.add(0);
        map.put(1, "小王");list.add(1);
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                map.put(i * 4 + j + 2 , colors.get(j) + numbers.get(i));
                list.add(i * 4 + j + 2);
            }
        }

        System.out.println("初始牌面为" + map);

        //2.洗牌
        Collections.shuffle(list);


        //3.发牌
        List<Integer> DiPai = new ArrayList<>();
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i > 50) {
                DiPai.add(list.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(list.get(i));
                } else if (i % 3 == 1) {
                    player2.add(list.get(i));
                } else {
                    player3.add(list.get(i));
                }
            }
        }

        //4.看牌
        //1.排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(DiPai);


        System.out.println("玩家1的牌为");
        for (int i = 0; i < player1.size(); i++) {
            System.out.print(map.get(player1.get(i)) + " ");
        }
        System.out.println();

        System.out.println("玩家2的牌为");
        for (int i = 0; i < player2.size(); i++) {
            System.out.print(map.get(player2.get(i)) + " ");
        }
        System.out.println();

        System.out.println("玩家3的牌为");
        for (int i = 0; i < player3.size(); i++) {
            System.out.print(map.get(player3.get(i)) + " ");
        }

        System.out.println();

        System.out.println("底牌为");
        for (int i = 0; i < DiPai.size(); i++) {
            System.out.print(map.get(DiPai.get(i)) + " ");
        }


        System.out.println();
        long lastTime = System.currentTimeMillis();
        System.out.println("程序总用时" + (lastTime - fistTime) + "毫秒");



    }

    private static void poker() {
        long fistTime = System.currentTimeMillis();

        //1.装牌
        List<String> colors = List.of("♡", "♦", "♤", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "大王");
        map.put(1, "小王");
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                map.put(i * 4 + j + 2 , colors.get(j) + numbers.get(i));
            }
        }

        System.out.println("初始牌面为" + map);

        //2.洗牌
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }

        Collections.shuffle(list);


        //3.发牌
        List<Integer> DiPai = new ArrayList<>();
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i > 50) {
                DiPai.add(list.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(list.get(i));
                } else if (i % 3 == 1) {
                    player2.add(list.get(i));
                } else {
                    player3.add(list.get(i));
                }
            }
        }

        //4.看牌
        //1.排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(DiPai);


        System.out.println("玩家1的牌为");
        for (int i = 0; i < player1.size(); i++) {
            System.out.print(map.get(player1.get(i)) + " ");
        }

        System.out.println("玩家2的牌为");
        for (int i = 0; i < player2.size(); i++) {
            System.out.print(map.get(player2.get(i)) + " ");
        }

        System.out.println("玩家3的牌为");
        for (int i = 0; i < player3.size(); i++) {
            System.out.print(map.get(player3.get(i)) + " ");
        }

        System.out.println("底牌为");
        for (int i = 0; i < DiPai.size(); i++) {
            System.out.print(map.get(DiPai.get(i)) + " ");
        }


        long lastTime = System.currentTimeMillis();
        System.out.println("程序总用时" + (lastTime - fistTime) + "毫秒");

    }

    private static void showPoker(String name,List<Integer> player,Map<Integer,String> map) {
        System.out.println(name + "的牌为");
        for (int i = 0; i < player.size(); i++) {
            System.out.print(map.get(player.get(i)) + " ");
        }
        System.out.println();
    }

}

