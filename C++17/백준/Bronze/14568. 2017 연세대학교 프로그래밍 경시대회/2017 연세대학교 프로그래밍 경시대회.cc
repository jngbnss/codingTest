//a 		b 		c
//even	x+2이상 		x
#include<bits/stdc++.h>
using namespace std;
int a,b,c,n,ret,x;

int main(){
	cin>>n;
	for(int i=2;i<=n;i+=2){
		bool check = true;
		int temp = n-i;
		for(int j=1;j<=n;j++){
			int gap = temp-j;
//			cout<<i<<' '<<gap<<' '<<j<<'\n';
			if(gap>=2+j&& i+j+gap==n) ret++;
		}
	}
	cout<<ret;
}
				
	