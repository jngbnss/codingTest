#include<bits/stdc++.h>
using namespace std;
long long n,f,ret;

int main(){
	cin>>n>>f;
	n /=100;
	n*=100;
//	cout<<n<<'\n';
	for(int i=0;i<100;i++){
		if( (n+i)%f==0){
			if(i<10){
				cout<<0<<i;
				return 0;
			}else{
				cout<<i;
				return 0;
			}
		}
	}
}