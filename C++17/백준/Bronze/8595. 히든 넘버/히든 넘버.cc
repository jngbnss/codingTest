#include<bits/stdc++.h>
using namespace std;
long long n,ret,temp;
string s;
int main(){
	cin>>n;
	cin>>s;
	
	for(int i=0;i<n;i++){
		if( (s[i]-'0')>=0&&s[i]-'0'<10){
			temp*=10;
//			cout<<temp<<'\n';
			temp+=s[i]-'0';
		}
		else{
			ret+=temp;
			temp = 0;
		}
	}
	ret+=temp;
	cout<<ret;
}