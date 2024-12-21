public class CatsAndShelves {
    public static void main(String[] args) {
        System.out.println(solution(324,825));
    }

    public static int solution(int start, int finish) {
        int count = 0;
        int step = start;
        while (step < finish) {
            count++;
            if (finish - step >= 3) {
                step += 3;
            } else {
                step += 1;
            }

        }
        return count;
    }
}
