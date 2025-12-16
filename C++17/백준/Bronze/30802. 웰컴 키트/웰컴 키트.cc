#include<bits/stdc++.h>
using namespace std;
long long n,a,b,c,d,e,f,t,p,sum;
int arr[6];

int main(){
	cin>>n;
	for(int i=0;i<6;i++){
		cin>>arr[i];
	}
	cin>>t>>p;
	for(auto i:arr){
		sum+=i/t;
		if(i%t) sum++;
	}cout<<sum<<'\n';
	
	cout<<n/p<<' '<<n%p;
}
	