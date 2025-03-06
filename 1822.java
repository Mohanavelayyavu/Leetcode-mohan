import java.util.PriorityQueue;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length, m = tasks.length;
        int[] result = new int[m];

        PriorityQueue<int[]> available = new PriorityQueue<>((a, b) -> 
            a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])
        );

        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            available.offer(new int[]{servers[i], i});
        }

        int time = 0;

        for (int i = 0; i < m; i++) {
            time = Math.max(time, i);

            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                int[] server = busy.poll();
                available.offer(new int[]{server[1], server[2]});
            }

            if (available.isEmpty()) {
                time = busy.peek()[0];
                while (!busy.isEmpty() && busy.peek()[0] <= time) {
                    int[] server = busy.poll();
                    available.offer(new int[]{server[1], server[2]});
                }
            }

            int[] server = available.poll();
            result[i] = server[1];
            busy.offer(new int[]{time + tasks[i], server[0], server[1]});
        }

        return result;
    }
}
