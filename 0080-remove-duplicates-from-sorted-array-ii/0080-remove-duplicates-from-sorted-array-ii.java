class Solution {

    public int removeDuplicates(int[] numbers) {

        // If array contains two or fewer elements,
        // all elements are already valid.
        if (numbers.length <= 2) {
            return numbers.length;
        }

        // Position where the next valid element
        // should be placed.
        int writeIndex = 2;

        // Start checking from the third element.
        for (int readIndex = 2; readIndex < numbers.length; readIndex++) {

            /*
             * Compare current element with the element
             * two positions before writeIndex.
             *
             * If they are different, then current element
             * has appeared less than two times.
             */
            if (numbers[readIndex] != numbers[writeIndex - 2]) {

                // Place current element at writeIndex.
                numbers[writeIndex] = numbers[readIndex];

                // Move write pointer.
                writeIndex++;
            }
        }

        // writeIndex represents the new length.
        return writeIndex;
    }
}