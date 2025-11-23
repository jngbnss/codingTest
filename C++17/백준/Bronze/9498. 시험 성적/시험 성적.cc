#include<bits/stdc++.h>
using namespace std;
int n,a,b,ret;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a;
	if(a>=90) cout<<"A";
	else if(a>=80) cout<<"B";
	else if(a>=70) cout<<"C";
	else if(a>=60) cout<<"D";
	else cout<<"F";
}