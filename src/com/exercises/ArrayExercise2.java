package com.exercises;

public class ArrayExercise2 {

	public static void main(String[] args) {
		// sicilNo[2] bileşeninin değerini x değişkenine aktarır; 
		
		int [] sicilNo = new int[] {1234, 2746, 1785, 8732, 1079};
		//int [] sicilNo = new int[5] ;
		sicilNo[2] = 1785;
		
	int	x = sicilNo[2];
		
		x = 1785 ;
		
		
		
		//Aynı veri tipinden iki arrayden birisinin bir bileşeninin değeri ötekinin 
		//bir bileşenine aktarılabilir. 
		
		
		short[] z,y = null ;

		z = new short[] {10,20,30};

		y[2] = z[0];
		
		
		//Aynı veri tipinden iki arrayden birisi ötekine aktarılabilir. Örneğin,

		short[] a,b ;

		a = new short[] {10,20,30};

		b = a ;

		//ataması geçerlidir. Bu atama, b referansının a ile aynı yeri işaret etmesinei sağlar. 
		//Dolayısıyla, aşağıdaki bileşen atamalarının birer birer yaptığı işi tek başına yapar.

		b[0] = a[0];

		b[1] = a[1];

		b[2] = a[2];


		
		

	}

}
