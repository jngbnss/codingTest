#include<bits/stdc++.h>
using namespace std;
int n,cnt,k;


int main(){
	cin>>n;
	for(int i=1;i<=n;i++){
		cin>>k;
		vector<int>v;
		for(int j=0;j<k;j++){
			int temp;
			cin>>temp;
			v.push_back(temp);
		}
		sort(v.begin(),v.end());
		int gap = 0;
		for(int g=1;g<k;g++){
			gap = max(gap,v[g]-v[g-1]);
//			cout<<g<<" : "<<v[g]<<" : " <<gap<<'\n';
		}
			
		
		cout<<"Class "<<i<<'\n';
		cout<<"Max "<<v[v.size()-1]<<", Min "<<v[0]<<", Largest gap "<<gap<<'\n';
	}
}
