#include<bits/stdc++.h>
using namespace std;
int a,b,c,d,e,cnt,now;
int main(){
	
	cin>>a>>b>>c>>d>>e;
	now = a;
	if(a<0){
		cnt += c*(-a);
		now = 0;
	}
	if(now == 0){
		cnt+=d;
	}
	cnt+= (b-now)*e;

	cout<<cnt;	
}