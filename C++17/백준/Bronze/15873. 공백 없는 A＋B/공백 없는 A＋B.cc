#include<bits/stdc++.h>
using namespace std;
int n,m,ret;
string s;

int main(){
	cin>>s;
	n=0,m=0,ret=0;
	if(s.size()==2){
		for(auto i:s){
			ret+=i-'0';
		}
	}else if(s.size()==4){
		for(int i=0;i<2;i++){
			n*=10;
			n+=s[i]-'0';
		}for(int i=2;i<4;i++){
			m*=10;
			m+=s[i]-'0';
		}
		ret = n+m;
	}else{
		if(s[1]=='0'){
			for(int i=0;i<2;i++){
				n*=10;
				n+=s[i]-'0';
			}
			m = s[2]-'0';
		}
		else{
			n= s[0]-'0';
			for(int i=1;i<3;i++){
				m*=10;
				m+=s[i]-'0';
			}
		}
		ret = n+m;
	}
	
	cout<<ret;
	
	
}