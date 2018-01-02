public class LowestCost{

    //不可达记为INF
    //不可记为Integer.MAX_VALUE,再加cost会变成负数，影响结果
    final static int INF = 999999;

    //下标与名称的映射
    static  Map<Integer,String> map = new HashMap<>();

    //用二位数组邻接矩阵表示有向加权图，下标表示边，值表示权
    //以行为边的起点，列为边的终点
    //INF表示不可达
    static int[][] graph = {
            {INF,6,2,INF},
            {INF,INF,INF,1},
            {INF,3,INF,5},
            {INF,INF,INF,INF}
    };

    static int[] costs = {
            INF, //start
            6, //A
            2, //B
            INF //end
    };

    static int[] parents = {
            INF, //start 的起点
            0, //A的起点
            0, //B的起点
            -1  //end的起点
    };

    //记录是否处理过，处理过 记为1
    static int[] proceessed = {
            0,
            0,
            0,
            0
    };

    public static void main(String[] args) {
        map.put(0,"start");
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"end");

        int node = findLowestCostNode(costs);
        while (node != 0) {
            int cost = costs[node];

            for (int i = 0; i < graph[node].length; i++) {
                int newCost = cost + graph[node][i];
                if (costs[i] > newCost){
                    costs[i] = newCost;
                    parents[i] = node;
                }
            }
            proceessed[node] = 1;
            node = findLowestCostNode(costs);
        }

        //最终输出parents表，即可得出花费最少路线
        for (int i = 0; i < parents.length; i++) {
            System.out.print(map.get(i)+" ");
            System.out.println(map.get(parents[i]));

        }

    }

    //返回花费最少的节点（下标）
    public static int findLowestCostNode(int[] costs) {
        int lowCost = Integer.MAX_VALUE;
        int lowCostNode = 0;
        for (int i = 0; i < costs.length; i++) {
            int cost = costs[i];
            if (cost < lowCost && proceessed[i] == 0) {
                lowCost = cost;
                lowCostNode = i;
            }
        }
        return lowCostNode;
    }
    
}