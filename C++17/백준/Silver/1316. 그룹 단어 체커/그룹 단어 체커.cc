#include<bits/stdc++.h>
using namespace std;
int n,t,ret,cnt,m,temp;
string s;
vector<int>v;



int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	
	while(n--){
		bool check = true;
		map<char,int>mp;
		char now ;
		cin>>s;
		for(auto i:s){
			if(mp[i]!=0){
				if(i==now) continue;
				else{
					check = false;
					break;
				}
			}
			
			now = i;
			mp[i]++;
		}
		if(check) cnt++;
	}
	cout<<cnt;
			
	
}

