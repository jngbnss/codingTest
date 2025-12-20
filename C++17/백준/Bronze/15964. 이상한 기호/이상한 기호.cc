#include<bits/stdc++.h>
using namespace std;
long long a,b;

long long go(long long a,long long b){
	return(a+b)*(a-b);
}
int main(){
	cin>>a>>b;
	cout<<go(a,b);
}