package sqrt;

public class main {
	 
	public static void main(String[] args) {
		double a = 3;
		double b = 2.5;
		double c = -0.5;
		double d;
		
		d=(b*b)-(4*a*c);
				
		double x = Math.sqrt(d);
		
		 if(((a==0) & (b==0) & (c==0)) || ((a==0) & (b == 0))) {
		      System.out.println("x1=");
		      System.out.println("x2=");
		      return;
		    }
		    
		    if((a==0) & (b != 0)) {
		      if(c == 0) {
		        double x1 = 0.0;
		        System.out.println("x1="+x1);
		        System.out.println("x2="+x1);
		        return;
		      }
		      else if(c != 0) {
		        double x1 = -(c/b);
		        System.out.println("x1="+x1);
		        System.out.println("x2"+x1);
		        return;
		      }
		      return;
		    }
		
		 if(d < 0) {
		      System.out.println("x1="+"\n");
		      System.out.println("x2="+"\n");
		      return;
		    }
		    
		      if(d >= 0) {
		      double x1 = (-b + x) /(2 * a);
		      double x2 = (-b - x) /(2 * a);
		      System.out.print("x1="+x1+"\n");
		      System.out.println("x2="+x2);
		      return;
		    }

	}

}
