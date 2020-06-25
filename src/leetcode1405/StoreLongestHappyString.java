package leetcode1405;

public class StoreLongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        
        int size = a + b + c;
        
        // A,B,C will store the number of appear in a row
        int A = 0, B = 0, C = 0;
        
        for(int i = 0; i < size; i++){
        	// Append the most appear one first
            if((a >= c && a >= b && A != 2) || (B == 2 && a > 0) || (C == 2 && a > 0)){
                sb.append("a");
                
                a--;
                A++;
                
                // b and c could append now
                B = 0;
                C = 0;
            } else if((b >= c && b >= a && B != 2) || (A == 2 && b > 0) || (C == 2 && b > 0)){
                sb.append("b");
                
                b--;
                B++;
                
                A = 0;
                C = 0;
            } else if((c >= a && c >= b && C != 2) || (A == 2 && c > 0) || (B == 2 && c > 0)){
                sb.append("c");
                
                c--;
                C++;
                
                A = 0;
                B = 0;
            }
            
            
        }
        
        return sb.toString();
    }
}
