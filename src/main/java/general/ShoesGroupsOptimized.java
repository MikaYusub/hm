package general;

public class ShoesGroupsOptimized {
    public static void main(String[] args) {
        String s = "RLRLRRRLLRRLRLLL";
        System.out.println(calc(s));
    }
    public static int calc(String origin) {
        int groups = 0;
        int count = 0;

        for (int i = 0; i < origin.length(); i++) {
            char c = origin.charAt(i);
            switch (c) {
                case 'L': count++; break;
                case 'R': count--; break;
            }
            if (count == 0) groups++;
        }
        return groups;
    }
}