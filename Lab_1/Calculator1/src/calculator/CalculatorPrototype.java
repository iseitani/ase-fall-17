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
        for(int i=0; i<n;i++){
            m+=1;
        }
        return m;
    }

    @Override
    public int divide(int m, int n) {
        int counter=0;
        while(m>0){
            m-=n;
            counter++;
        }
        if(m!=0){
            counter-=1;
        }
        return counter;
    }

    @Override
    public int multi(int m, int n) {
       return sum(m,n)*n;
    }
    
}
