
public class Calculator {
	
	public float numOne;
	public float numTwo;

	public Calculator () {}
		
		public float getNumOne(){
			return this.numOne;
		}
		
		public float getNumTwo(){
			return this.numTwo;
		}
			
		public void setNumOne(float nOne){
			this.numOne= nOne;
		}
		
		public void setNumTwo(float nTwo){
			this.numOne= nTwo;
		}
	
		public float add(){
			return numOne + numTwo;
		}
		
			
			public float divide(){
				return numOne / numTwo;
				
			}

				public float multiply(){
					return numOne * numTwo;
					
				}
					
					public float subtract(){
						return numOne - numTwo;
						}
}
