// https://www.geeksforgeeks.org/problems/anagram-1587115620/1

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length())
          return false;

          // Frequency array to store character counts
          int[] freq = new int[258];

        // Count frequencies for s1
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
        }

        // Count frequencies for s2
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
              return false;
        }
        return true;
    }
}
