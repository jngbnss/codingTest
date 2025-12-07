#include<bits/stdc++.h>
using namespace std;
long long n1,n2,m1,m2;
string s,a,b;
vector<pair<int,int>>v;
int arr[26];
string ret ="";
int main(){
	cin>>a>>b;
	for(auto i:a){
		n1*=10;
		n2*=10;
		if(i=='5'||i=='6'){
			n1+=5;
			n2+=6;
		}else {
			n1+=i-'0';
			n2+=i-'0';
		}
	}
	for(auto i:b){
		m1*=10;
		m2*=10;
		if(i=='5'||i=='6'){
			m1+=5;
			m2+=6;
		}else {
			m1+=i-'0';
			m2+=i-'0';
		}
	}
	cout<<n1+m1<<' '<<n2+m2;
	
	
	return 0;	
}