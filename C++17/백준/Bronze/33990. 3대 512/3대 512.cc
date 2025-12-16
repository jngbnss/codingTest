#include<bits/stdc++.h>
using namespace std;
int n,a,b,c;
vector<int>v;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b>>c;
		int temp = a+b+c;
//		cout<<temp<<'\n';
		if(temp>511){
			v.push_back(temp);
		}
	}
	sort(v.begin(),v.end());
	
	if(v.size()) cout<<v[0];
	else cout<<-1;
}