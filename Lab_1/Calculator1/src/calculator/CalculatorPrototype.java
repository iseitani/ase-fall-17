/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author iseitani
 */
public class CalculatorPrototype  implements CalculatorIF{

    @Override
    public int sum(int m, int n) {
    	if(m<0) {
			 m=Math.abs(m);
		 }
		 else if(n<0) {
			 n=Math.abs(n);
		 }
    	for(int i=0; i<n;i++) {
    	m += 1;
    	}
    	return m;
    }

    @Override
    	public int divide (int m, int n){
    	if(m<0) {
   		 m=Math.abs(m);
	   	 }
	   	 else if(n<0) {
	   		 n=Math.abs(n);
	   	 }
            int result = 0;
            while (m>0){
                m-=n;
                result++;
            }
            if (m!=0){
                result -= 1;
            }
            return result;
        }

	@Override
	public int multiply(int m, int n) {
	 if(m<0) {
		 m=Math.abs(m);
	 }
	 else if(n<0) {
		 n=Math.abs(n);
	 }
     int result = 0; 
	 for(int i = 0; i < n; i++) {
				result+=m;
			}
	 return result;
	}

	@Override
	public int subtract(int m, int n) {
		if(m<0) {
			 m=Math.abs(m);
		 }
		 else if(n<0) {
			 n=Math.abs(n);
		 }
		for(int i=0; i<n;i++) {
			m--;
		}
		return m;
	}
    
}
