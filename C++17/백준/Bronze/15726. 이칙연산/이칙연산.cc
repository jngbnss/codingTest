#include<bits/stdc++.h>
using namespace std;
double a,b,c;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a>>b>>c;
	double temp = a*(b/c);
//	cout<<temp;
	double temp1 = (a/b)*c;
//	cout<<' '<<temp1<<'\n';
	cout<<(int)max(temp,temp1);
	
}