#include<bits/stdc++.h>
using namespace std;
int t,n;
string s;

int main(){
	cin>>t;
	while(t--){
		cin>>n;
		vector<string>v,ret;
		for(int i=0;i<n;i++){
			cin>>s;
			v.push_back(s);
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j) continue;
				string temp = v[i]+v[j];
				string temp1 = temp;
				reverse(temp1.begin(),temp1.end());
				if(temp==temp1){
					ret.push_back(temp);
				}
			}
		}
		if(ret.size()) cout<<ret[0]<<'\n';
		else cout<<0<<'\n';
	}
}
			