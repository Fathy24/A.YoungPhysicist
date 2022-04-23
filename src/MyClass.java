import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class MyClass {
  public String equilibrium(){
      int n,x,y,z, sumX=0, sumY=0, sumZ =0;
      Scanner input = new Scanner(System.in);
      n = input.nextInt();
      while(n>0){
        x= input.nextInt();
          if( x<-100 || x>100)
              throw new IllegalArgumentException("x out of bound");
        y= input.nextInt();
          if( y<-100 || y>100)
              throw new IllegalArgumentException("y out of bound");
        z = input.nextInt();
          if( z<-100 || z>100)
              throw new IllegalArgumentException("z out of bound");
        sumX += x;
        sumY += y;
        sumZ += z;
        n--;
      }
      if(sumX ==0 && sumY ==0 && sumZ==0)
          return "yes";
      else return "no";
  }
}
