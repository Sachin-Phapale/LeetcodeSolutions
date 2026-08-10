class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                // Increment count by occurrences seen so far
                count += map.get(num);
                // Increment occurrence count in map
                map.put(num, map.get(num) + 1);
            } else {
                // First occurrence, add to map
                map.put(num, 1);
            }
        }
        return count;
    }
}
