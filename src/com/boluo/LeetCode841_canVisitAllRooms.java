package boluo;

import java.util.*;

/**
 * 有 N 个房间，开始时你位于 0 号房间。每个房间有不同的号码：0，1，2，...，N-1，并且房间里可能有一些钥匙能使你进入下一个房间。
 * 在形式上，对于每个房间 i 都有一个钥匙列表 rooms[i]，每个钥匙 rooms[i][j] 由 [0,1，...，N-1] 中的一个整数表示，其中 N = rooms.length。 钥匙 rooms[i][j] = v 可以打开编号为 v 的房间。
 * 最初，除 0 号房间外的其余所有房间都被锁住。
 * 你可以自由地在房间之间来回走动。
 * 如果能进入每个房间返回 true，否则返回 false。
 * <p>
 * 输入：[[1,3],[3,0,1],[2],[0]]
 * 输出：false
 * 解释：我们不能进入 2 号房间。
 */
public class LeetCode841_canVisitAllRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (Objects.isNull(rooms)) return true;

        // 用来存放钥匙
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        // 存放走过的房间
        Set<Integer> set = new HashSet<>();
        while (!stack.empty()) {
            int key = stack.pop();
            set.add(key);
            if (rooms.get(key) != null) {
                for (Integer in : rooms.get(key)) {
                    if (!set.contains(in)) stack.push(in);
                }
            }
        }
        return set.size() == rooms.size();
    }

    public boolean canVisitAllRooms_lambda(List<List<Integer>> rooms) {
        return dfs(rooms, 0, new HashSet<>()) == rooms.size();
    }

    private int dfs(List<List<Integer>> rooms, int room, HashSet<Integer> res) {
        res.add(room);
        rooms.get(room)
                .stream()
                .filter(r -> !res.contains(r))  // 这里会过滤出, 有效的房间的钥匙
                .forEach(r -> dfs(rooms, r, res));  // 下一步会把房间钥匙加到res中

        return res.size();
    }

}
