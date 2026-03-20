#include<bits/stdc++.h>
using namespace std;
int a,b,c,n,m,ret;
int main(){
	while(true){
		vector<int>v;
		cin>>a>>b>>c;
		if(a==0&&b==0&&c==0){
			return 0;
		}
		v.push_back(a);
		v.push_back(b);
		v.push_back(c);
		sort(v.begin(),v.end());
		
		if(v[2]>=v[0]+v[1]){
			cout<<"Invalid\n";
		}
		else if(a==b&&b==c){
			cout<<"Equilateral\n";
		}else if(a!=b&&b!=c&&c!=a){
			cout<<"Scalene"<<'\n';
		}else{
			cout<<"Isosceles\n";
		}
	}
}