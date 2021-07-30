package easy;

public class L997Improvised {
    public int findJudge(int n, int[][] trust) {
        int [] indegrees=new int[n+1];
        int[] outdegrees=new int[n+1];

        for (int[] connections: trust){
            indegrees[connections[1]]++;
            outdegrees[connections[0]]++;
        }
        for (int i:indegrees)
        System.out.println("--"+i);
        for (int i: outdegrees)
        System.out.println(i);

        for (int i = 1; i <= n; i++) {
            if ((indegrees[i] == n - 1) && outdegrees[i] == 0)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        L997Improvised obj=new L997Improvised();
        System.out.println(obj.findJudge(4,new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }
}
