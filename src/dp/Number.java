package dp;
import java.lang.Math;
public class Number {
	private double num;

	public Number(double num) {
		super();
		this.num = num;
	}
	boolean isZero() {
		if(num==0)
			return true;
		return false;
	}
	boolean isPositive() {
		if(num>0)
			return true;
		return false;
	}
	boolean isNegative() {
		if(num<0)
			return true;
		return false;
	}
	boolean isOdd() {
		if(num%2!=0)
			return true;
		return false;
	}
	boolean isEven() {
		if(num%2==0)
			return true;
		return false;
	}
	boolean isPrime() {
		int i=2;
		for(i=0;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	boolean isArmstrong() {
		int len=0;
		int temp=(int)num;
		while(temp>0) {
			temp/=10;
			len++;
		}
		double s=0;
		temp=(int)num;
		while(temp>0) {
			s=s+Math.pow(temp%10,len);
			temp=temp/10;
		}
		if(s==num)
			return true;
		return false;
	}
	
	double getFactorial() {
		double f=1;
		for(int i=1;i<=num;i++)
			f=f*i;
		return f;
	}
	double getSqrt() {
		return Math.sqrt(num);
	}
	double getSqr() {
		return num*num;
	}
	double sumDigits() {
		double s=0;
		double temp=num;
		while(temp>0)
		{
			s+=temp%10;
			temp/=10;
		}
		return temp;
	}
	double getReverse() {
		double r=0,temp=num;
		while(temp>0) {
			r=r*10+temp%10;
			temp/=10;
		}
		return r;
	}
	
	void listFactor() {
		for(int i=2;i<=num;i++)
			if(num%i==0)
				System.out.println(i);
	}
	void dispBinary() {
		int temp=(int)num;
		System.out.println(Integer.toBinaryString(temp));
	}
}
