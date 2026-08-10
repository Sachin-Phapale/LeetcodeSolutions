public class Solution {
    public int maxNumberOfBalloons(String text) {
        // Create a frequency map for the input string
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Store the required frequencies of each character in 'balloon'
        String balloon = "balloon";

        // Calculate the max number of "balloon" words
        int maxBalloons = Integer.MAX_VALUE;
        Map<Character, Integer> balloonFreq = new HashMap<>();
        for (char c : balloon.toCharArray()) {
            balloonFreq.put(c, balloonFreq.getOrDefault(c, 0) + 1);
        }

        // Calculate the max possible number of "balloon" we can form
        for (Map.Entry<Character, Integer> e : balloonFreq.entrySet()) {
            char key = e.getKey();
            int count = e.getValue();
            maxBalloons = Math.min(maxBalloons, freqMap.getOrDefault(key, 0) / count);
        }

        return maxBalloons;
    }
}