#include<bits/stdc++.h>
using namespace std;
long long a,b,c;
vector<long long>v;
int main(){
//	ios_base::sync_with_stdio(false);
//	cin.tie(0);cout.tie(0);
	while(true){
		cin>>a>>b>>c;
		if(a==0&&b==0&&c==0) return 0;
		v.push_back(a*a);	
		v.push_back(b*b);
		v.push_back(c*c);
		sort(v.begin(),v.end());
		
		
//		for(auto i:v){
//			cout<<i<<' ';
//		}cout<<'\n';
		
		if(v[0]+ v[1] == v[2]){
			cout<<"right"<<'\n';
		}else cout<<"wrong"<<'\n';
		v.clear();
	}
}

