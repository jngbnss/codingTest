#include<bits/stdc++.h>
using namespace std;
string s;
int sum,gap;
int main(){
	cin>>sum>>gap;
//	a+b = sum;
//	a-b = gap
	for(int i=0;i<1000;i++){
		for(int j=0;j<=i;j++){
			if(i+j==sum&&i-j==gap){
				cout<<i<<' '<<j;
				return 0;
			}
		}
	}
	cout<<-1;
	
}