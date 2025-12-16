//1
//<=1+6
//<=1+6+12= 19 
//<= 1+ 6+ 12+ 18 = 37
#include<bits/stdc++.h>
using namespace std;
long long n,cnt,temp=1;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		if(temp+i*6<n){
			temp+=i*6;
		}else {
			cout<<i+1;
			break;
		}
	}
}
		