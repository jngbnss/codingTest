#include<bits/stdc++.h>
using namespace std;
int n;

int main(){
	cin>>n;
	n = 1000-n;
	
	int ret = 0;
	ret += n/500;
	n%=500;
	
	
	ret += n/100;
	n%=100;
	
	
	ret += n/50;
	n%=50;
	
	
	ret += n/10;
	n%=10;
	
	
	ret += n/5;
	n%=5;
	
	
	ret += n/1;
	n%=1;
	
	cout<<ret;
}