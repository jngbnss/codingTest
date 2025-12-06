#include<bits/stdc++.h>
using namespace std;
int h,m;

int main(){
	cin>>h>>m;
	if(m>45){
		cout<<h<<' '<<m-45;
	}
	else if(m==45){
		cout<<h<<' '<<0;
	}
	else{
		if(h>0){
			cout<<h-1<<' '<<m+15;
		}else{
			cout<<23<<' '<<m+15;
		}
	}
}