class Solution {
    public List<Integer> lexicalOrder(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            solve(n, i, list);
        }

        return list;
    }

    public void solve(int n, int ans, List<Integer> list) {

        if (ans > n) {
            return;
        }

        list.add(ans);

        for (int i = 0; i < 10; i++) {
            solve(n, ans * 10 + i, list);
        }
    }
}