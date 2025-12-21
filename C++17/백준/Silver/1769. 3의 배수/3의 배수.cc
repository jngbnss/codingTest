#include<bits/stdc++.h>
using namespace std;
string s;
long long cnt,n;

int main(){
	cin>>s;
	if(s.size()==1){
		n=s[0]-'0';
	}
	while(s.size()>1){
		cnt++;
		n = 0;
		for(auto i:s){
//			cout<<(i)<<'\n';
			n+=(i-'0');
		}
//		cout<<n<<' '<<cnt<<'\n';
		s=to_string(n);
	}
	cout<<cnt<<'\n';
	if(n%3==0) cout<<"YES";
	else cout<<"NO";
		
}