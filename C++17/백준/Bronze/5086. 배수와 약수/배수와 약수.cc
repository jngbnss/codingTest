#include<bits/stdc++.h>
using namespace std;
int n,a,b;
map<char,int>mp;


int main(){
	while(true){
		cin>>a>>b;
		if(a==0&&b==0) return 0;
		if(b%a==0) cout<<"factor\n";
		else if(a%b==0) cout<<"multiple\n";
		else cout<<"neither\n";
	}
}