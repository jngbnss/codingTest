#include<bits/stdc++.h>
using namespace std;
int a,b,c;

int main(){
	cin>>a>>b>>c;
	int min = b+c;
	a+=(b+c)/60;
	min %= 60;
	if(a>=24){a-=24;}
	cout<<a<<' '<<min;
}