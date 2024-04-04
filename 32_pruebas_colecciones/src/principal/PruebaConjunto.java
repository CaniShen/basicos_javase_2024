package principal;

import java.util.HashSet;

public class PruebaConjunto {

	public static void main(String[] args) {
			HashSet<Double> nums=new HashSet<Double>();
			nums.add(30.7);
			nums.add(80.0);
			nums.add(21.3);
			for(Double s:nums) {
				s=s+1;// variable local, si se imprime dentro del for, sí se añade.
						// ya que la s es un variable LOCAL, pero no se refiere al 
						//objeto de nums.
			}
			for(Double s:nums) {
				System.out.println(s);
			}
			
	}

}
