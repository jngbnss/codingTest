#include<bits/stdc++.h>
using namespace std;
int n,temp;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		
		vector<int>v;
		for(int j=0;j<10;j++){
			cin>>temp;
			v.push_back(temp);
		}
		sort(v.rbegin(),v.rend());
		cout<<v[2]<<'\n';
	}
}
		
		