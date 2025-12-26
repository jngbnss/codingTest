#include<bits/stdc++.h>
using namespace std;
int n,m;
string s;

int main(){
	cin>>n>>m;
	if(n>=m){
		if(m==1||m==2) cout<<"NEWBIE!";
		else cout<<"OLDBIE!";
	}
	else if(n<m) cout<<"TLE!";
	
	
}