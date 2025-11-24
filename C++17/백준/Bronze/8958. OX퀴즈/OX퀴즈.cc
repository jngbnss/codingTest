#include<bits/stdc++.h>
using namespace std;
int n,ret,a,b,idx,mn=1e9,mx=-1e9,temp,cnt;
string s;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	
	while(n--){
		cin>>s;
		char prev = 'X';
		ret = 0;
		for(int i=0;i<s.size();i++){
			if(s[i]=='O'){
				if(prev!='O'){
					cnt = 1;
					ret+=cnt;
					prev ='O';
				}else{
					cnt++;
					ret+=cnt;
				}
			}else{
				prev = 'X';
				cnt = 0;
			}
		}
		cout<<ret<<'\n';
	}
			
			
}