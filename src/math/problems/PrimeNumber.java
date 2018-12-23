package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int num=10000000;

		int count=0;
		for(int i=2; i<num; i++){

			if( num%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			System.out.println("prime num");
		}else{
			System.out.println("Non prime num");
		}

	}

}
