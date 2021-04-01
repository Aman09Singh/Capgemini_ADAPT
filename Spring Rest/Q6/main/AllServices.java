
import org.springframework.stereotype.Service;

@Service
public class AllServices {
	
	public long add(long n1,long n2) {
		return n1+n2;
	}
	public long subtract(long n1,long n2) {
		return n1-n2;
	}
	public long multiply(long n1,long n2) {
		return n1*n2;
	}
	public double division(double n1,double n2) {
		if(n2!=0) {
			return n1/n2;
		}
		return 0;
	}
	public double sqrt(double n) {
		return Math.sqrt(n);
	}
	
}
