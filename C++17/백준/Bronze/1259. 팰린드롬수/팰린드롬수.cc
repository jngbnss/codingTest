#include<bits/stdc++.h>
using namespace std;
int n,m,sum,temp;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	while(true){
		string s;
		cin>>s;
		if(s=="0") return 0;
		string s1 = s;
		reverse(s.begin(),s.end());
		if(s==s1) cout<<"yes\n";
		else cout<<"no\n";
	}
}