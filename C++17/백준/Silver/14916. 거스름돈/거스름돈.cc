#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b;
vector<pair<int,int>>v;

int main(){
	cin>>n;
	
	for(int i=n/5;i>=0;i--){
//		cout<<i<<" : ";
		ret =i;
		int remain=n-(i*5);
//		cout<<remain;
		
		if(remain%2==0){
			ret+=(remain/2);
			cout<<ret;
			return 0;
		}
	}
	cout<<-1;
	
}
	