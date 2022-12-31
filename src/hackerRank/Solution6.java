package hackerRank;
import java.util.*;
public class Solution6 {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int len=s.length();
        
        for(int i=0;i<=len;i++){
            for(int j=1;j+i<=len;j++){
                String local=s.substring(i, i+j);
                if(local.length()==k){
                	//System.out.println(local);
                    if(smallest.compareTo(local)>0)smallest=local;
                    else if(largest.compareTo(local)<0) largest=local;
                }
            }
        }
        
        return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
		// smallest and largest lexicographical string created from input S with length K
		/*String S="yousuf mohammad";int K=7,len=S.length();
		List<String> li=new ArrayList<>();
		for(int i=0;i<len;i++) {
			for(int j=1;j+i<len;j++) {
				String local=S.substring(i, i+j);
				if(local.length()==K) li.add(local);
				//System.out.println( local);
			}
		}Collections.sort(li);
		System.out.println(li.get(0)+"\n"+li.get(li.size()-1));*/
		
		String s="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";int k=30;
		String res=getSmallestAndLargest(s, k);
		System.out.println("-------------------------------");
		System.out.println(res);
		/*Expected output
		 * ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
			sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs
		 */
		
	}

}
