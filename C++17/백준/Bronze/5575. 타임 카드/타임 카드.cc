#include<bits/stdc++.h>
using namespace std;
int a,b,c,d,e,f;
string s;
vector<int>v;
int main(){
	for(int i=0;i<3;i++){
		cin>>a>>b>>c>>d>>e>>f;
		int ret =d*3600+e*60+f - a*3600-b*60-c;
		cout<<ret/3600<<' ';
		ret%=3600;
		cout<<ret/60<<' ';
		ret%=60;
		cout<<ret<<'\n';
	}
	
}