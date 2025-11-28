#include<bits/stdc++.h>
using namespace std;
int n,t,ret,cnt,m,temp;
string s;
vector<int>v;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>s;
	for(int i=0;i<s.size();i++){
//		char k = s[i];
		if(s[i]=='c'&&s[i+1]=='='){
			i++;
			cnt++;
		}else if(s[i]=='c'&&s[i+1]=='-'){
			i++;
			cnt++;
		}else if(s[i]=='d'&&s[i+1] == 'z'&&s[i+2]=='='){
			i+=2;
			cnt++;
		}else if(s[i]=='d'&&s[i+1] == '-'){
			i++;
			cnt++;
		}else if(s[i] =='l'&&s[i+1]=='j'){
			i++;
			cnt++;
		}else if(s[i] =='n'&&s[i+1]=='j'){
			i++;
			cnt++;
		}else if(s[i] =='s'&&s[i+1]=='='){
			i++;
			cnt++;
		}else if(s[i] =='z'&&s[i+1]=='='){
			i++;
			cnt++;
		}else cnt++;
	}
	cout<<cnt;
}

