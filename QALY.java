import java.util.Scanner;

public class QALY{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int n=kb.nextInt();
    if(1<=n && n<=100){
      double q,y;
      double sum=0;boolean ch=true;
      for(int i=0;i<n;i++){
        q=kb.nextDouble();
        y=kb.nextDouble();
        if(0<q && q<=1 && 0<y && y<=100)
          sum+=q*y;
        else{
          ch=false;
          break;
        }
      }
      if(ch) System.out.format("%.3f",sum);
    }
  }  
} 