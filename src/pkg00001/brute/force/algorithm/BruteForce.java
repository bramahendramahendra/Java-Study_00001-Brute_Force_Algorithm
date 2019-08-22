/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00001.brute.force.algorithm;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class BruteForce {
    private String t,p;
    private int m, n;
    private static int count;
    
    public BruteForce(String t, String p) {
        this.t=t;
        this.p=p;
        n=t.length( );
        m=p.length( );
    }
    
    public int getNoOfComparisons(){
        return count;
    }
    
    public  int bruteForceMatch() {
        int i,j;
        for(i=0; i<=n-m; i++) {
            for(j=0;j<m;++j)
            {
                count++;
                if(t.charAt(i+j)!=p.charAt(j))
                         break;
            }
            if(j==m)
                return i;
        }
        return -1;
    }
}
