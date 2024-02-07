import util.MagicTower;

public class LeetCode {

    public static void main(String[] args) {
        int[] nums = new int[]{-200,-300,400,0};

        MagicTower magicTower = new MagicTower();
        int i = magicTower.magicTower(nums);

        System.out.println(i);
    }
}
