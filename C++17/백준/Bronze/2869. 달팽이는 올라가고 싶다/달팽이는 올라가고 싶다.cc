#include<bits/stdc++.h>
using namespace std;
long long a,b,v,ret,cnt;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a>>b>>v;
	ret = v-a;
	int day = a-b;
	cnt = ret/day;
	if(ret%day) cnt++;
	cout<<cnt+1;
	}
