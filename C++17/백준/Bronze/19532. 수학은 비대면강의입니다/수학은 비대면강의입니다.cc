#include<bits/stdc++.h>
using namespace std;
long long a,b,c,d,e,f;
vector<int>v;
int main(){
	cin>>a>>b>>c>>d>>e>>f;
	for(int i=-999;i<1000;i++){
		for(int j=-999;j<1000;j++){
			if(a*i+b*j==c){
				if(d*i+e*j==f){
					cout<<i<<' '<<j;
					return 0;
				}
			}
		}
	}
		
}