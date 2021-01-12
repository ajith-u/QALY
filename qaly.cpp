#include <iostream>
#include <iomanip>
using namespace std;

int main() { 
  int n;
  cin>>n;
  if(1<=n && n<=100){
    double q,y;
    double sum=0;bool ch=true;
    for(int i=0;i<n;i++){
      cin>>q>>y;
      if(0<q && q<=1 && 0<y && y<=100)
        sum+=q*y;
      else{
        ch=false;
        break;
      }
    }
    if(ch) cout<<fixed<<setprecision(3)<<sum;
  }
}