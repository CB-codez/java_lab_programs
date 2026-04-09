public class Mfreq {

    public static char MostFrequent(StringBuffer sb) {
        // Convert StringBuffer to String for easier processing
        String str = sb.toString();
        
        // Array to store the frequency of each character (assuming ASCII character set)
        int[] frequency = new int[256];
        
        // Traverse the string and increment the count for each character's ASCII value
        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);
            frequency[charAtIndex]++;
        }
        
        int maxCount = -1;
        char mostFrequentChar = ' '; // Initialize with a default value
        
        // Find the character with the maximum frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequentChar = (char) i;
            }
        }
        
        return mostFrequentChar;
    }

    public static void main(String[] args) {
        StringBuffer inputBuffer = new StringBuffer("programmingisfun");
        char mostFrequent = MostFrequent(inputBuffer);
        System.out.println("The original string is: " + inputBuffer);
        System.out.println("The most frequently occurring character is: " + mostFrequent);
    }
}
