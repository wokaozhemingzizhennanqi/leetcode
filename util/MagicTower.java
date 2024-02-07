package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MagicTower {

    public int magicTower(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Integer count = 0;
        Integer hp = 1;
        Integer move = 0;
        for (int num : nums) {
            hp += num;
            if (num <0) {
                priorityQueue.add(num);
                if (hp<=0) {
                    Integer max = priorityQueue.poll();
                    hp -= max;
                    count++;
                    move +=max;
                }
            }
        }
        if (hp + move <=0) {
            return -1;
        }
       return count;
    }



}
