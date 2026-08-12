class Solution {
    public boolean containsNearbyDuplicate(int[] numbers, int maxDistance) {

        // Set to maintain a sliding window of size k
        Set<Integer> windowSet = new HashSet<>();

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {

            // If number already exists in current window → duplicate found
            if (windowSet.contains(numbers[currentIndex])) {
                return true;
            }

            // Add current number to the window
            windowSet.add(numbers[currentIndex]);

            // Maintain window size <= k
            // Remove element that goes out of the allowed range
            if (windowSet.size() > maxDistance) {
                windowSet.remove(numbers[currentIndex - maxDistance]);
            }
        }

        return false; // No duplicates found within distance k
    }
}
