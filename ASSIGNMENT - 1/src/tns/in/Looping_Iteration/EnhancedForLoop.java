package tns.in.Looping_Iteration;
import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {
		static void enhancedForLoopTest(List<String> arrayList){
			//Enhanced For loop test
			for (String name : arrayList) {
				System.out.println(name);
			}
		}	
	 
		public static void main(String args[]){ 
			 
			List<String> arrayList = new ArrayList<String>();   
		
			arrayList.add("ABC"); 
			arrayList.add("DEF"); 
			arrayList.add("GHI"); 
			arrayList.add("JKL"); 
			arrayList.add("MNO"); 
	        arrayList.add("PQR"); 
		 
			enhancedForLoopTest(arrayList);         	//method call
		}
	}

