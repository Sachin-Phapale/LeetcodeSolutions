class Solution {
    public boolean isIsomorphic(String source, String target) {

        // If lengths are different, they cannot be isomorphic
        if (source.length() != target.length()) {
            return false;
        }

        // Map to store character mapping from source → target
        Map<Character, Character> characterMapping = new HashMap<>();

        for (int index = 0; index < source.length(); index++) {

            char sourceChar = source.charAt(index);
            char targetChar = target.charAt(index);

            // If source character is not yet mapped
            if (!characterMapping.containsKey(sourceChar)) {

                // If target character is already mapped to some other character
                // then mapping would not be one-to-one
                if (characterMapping.containsValue(targetChar)) {
                    return false;
                }

                // Create new mapping
                characterMapping.put(sourceChar, targetChar);
            } 
            else {
                // If mapping exists, verify it matches current target character
                if (characterMapping.get(sourceChar) != targetChar) {
                    return false;
                }
            }
        }

        return true;
    }
}