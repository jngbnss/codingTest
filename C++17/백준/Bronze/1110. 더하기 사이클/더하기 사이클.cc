#include<bits/stdc++.h>
using namespace std;
int n,target,a,b,cnt,temp,prev;
int main(){
	cin>>n;
	target = n;
	//26
	b = n%10;
	a = n/10;
	temp = b*10+(a+b)%10;
//	cout<<temp<<'\n';
	while(true){
		cnt++;
		if(temp==target){
			cout<<cnt;
			return 0;
		}
		b = temp%10;
		a = temp/10;
//		cout<<a<<' '<<b<<'\n';
		temp = b*10+(a+b)%10;
//		cout<<temp<<" : "<<cnt<<'\n';
	}
	
}