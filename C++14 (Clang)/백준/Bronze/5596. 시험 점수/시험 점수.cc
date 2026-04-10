#include<bits/stdc++.h>
using namespace std;
int sum1,sum2,a,b,c,d;
int main(){
	for(int i=0;i<4;i++){
		cin>>a;
		sum1+=a;
	}
	
	for(int i=0;i<4;i++){
		cin>>a;
		sum2+=a;
	}
	cout<<max(sum1,sum2);
}