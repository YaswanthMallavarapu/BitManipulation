class Solution {
    public static void solve(int nums[], List<List<Integer>> result, List<Integer> answer, int i) {
        if (i == nums.length) {
            result.add(new ArrayList<>(answer));
            return;
        } else {
            answer.add(nums[i]);
            solve(nums, result, answer, i + 1);
            answer.remove(answer.size() - 1);
            solve(nums, result, answer, i + 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        int sets = 1 << nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < sets; i++) {
            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    ans.add(nums[j]);
                }
            }
            res.add(new ArrayList<>(ans));
        }
        return res;
    }
}