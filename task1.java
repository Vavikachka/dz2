
// алгоритм сортировки слиянием
import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        genComb(n, k, 0, new ArrayList<>());
        return ans;
    }

    private void genComb(int n, int k, int prevEl, List<Integer> curComb) {
        if (curComb.size() == k) {
            ans.add(new ArrayList<>(curComb));
        }
        for (int i = prevEl + 1; i <= n; i++) {
            curComb.add(i);
            genComb(n, k, i, curComb);
            curComb.remove(curComb.size() - 1);
        }
    }
}
