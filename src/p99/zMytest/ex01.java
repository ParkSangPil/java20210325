package p99.zMytest;

public class ex01 {
	public static void main(String[] args) {
//		for(int i = 0;i<3;i++) {
//			for(int j = 0;j<11;j++) {
//				System.out.println(j);
//				if(j==5) {
//					break;
//				}
//			}
//		}
	
	
//	String skill = "abcd";
//	String[] skill_trees = {"a","abc"};
//	
//	System.out.println(skill.length());
//	System.out.println(skill_trees.length);
//	
//	System.out.println(skill_trees[0].length());
//	
//	if(4 == skill.length()) {
//		System.out.println("Sang");
//	}
//		int count = 0;
//		
//		for(int i = 0;i<=10;i++) {
//			if(i%2==0) {
//				count++;
//			}
//		}
//	int answer = 4-count;
//	System.out.println(answer);
	
	
	
	

//	String skill = "CBD";
//	String[] skill_trees = {"BACDE","CBADF","AECB","BDA"};
//		int answer1 = 0;
//
//		for (int j = 0; j < skill_trees.length; j++) {
////		for (int j = 0; j < 1; j++) {
//			// skill_trees 의 j번째 요소 뽑기
//			int book = skill_trees[j].length();
//			
//			boolean a1 = true;
//			boolean b1 = false;
//
//			for (int i = 0; i < skill.length(); i++) {
//				// skill 하나씩 빼는거
//				char a = skill.charAt(i);
//
//				for (int k = 0; k < book; k++) {
////					 skill_trees의 j번째에서 하나 씩 대조해 보는거
//					while (b1) {
//						if (a == skill_trees[j].charAt(k)) {
//							b1 = false;
//							answer1++;
//							break;
//						} else {
//							break;
//						}
//					}
//					while (a1) {
//						if (a == skill_trees[j].charAt(k)) {
//							book = k;
//							a1 = false;
//							b1 = true;
//							System.out.println(j+"번째 에서 "+ skill_trees[j].charAt(k) +"발견!");
//							System.out.println("최대값 "+book+" 로 정정");
//							break;
//						} else {
//							break;
//						}
//					}
//				}
//			}
//		}
//		System.out.println(skill_trees.length - answer1);
////		return answer1;
		
		
		
		
		
//		String a = "abcdef";
//		String b = "ab";
//		
//		System.out.println(a.indexOf(b));
		
		
		
		
//		String a = "";
//		String b = "123456789";
//		
//		for(int i = 0 ; i<b.length();i++) {
//			a += b.charAt(i);
//		}
//		
//		System.out.println(a);
//		
		
		
		
		
//			int w = 8;
//			int h = 12;
//
//	        long answer = w*h;
//	        int minti = 0;
//	        int leng = 0;
//	        if(w>h){leng = w;}else{leng = h;}
//	        
//	        for(int i = 1 ; i <= leng ; i++){
//	            if((w%i==0) && (h%i==0)){
//	                minti = i;
//	            }
//	        }
//	        System.out.println(minti);
	        
//	        return answer;
		
		
		
		
		
		
		
		
		
		int n = 10;
		int[] stones = {1,4,9,10};
		int range = 1;
		
        int[] ans = new int[n];
        
        for(int stone : stones){
        	
//        	for (int i = (stone-1) - range; i <= (stone-1) + range; i++) {
//        		if (i >= 0 && i < n) {
//        			ans[i] = 1;
//        		}
//        	}
        	
        	if(!(stone-1 <= 0)) {
        		ans[stone-range-1] = 1;
        	}
            ans[stone-1] = 1;
            if(!(stone >= n)) {
            	ans[stone+range-1] = 1;
            }
            
            
        }
        
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
	}
}