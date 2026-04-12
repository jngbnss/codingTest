#include<bits/stdc++.h>
using namespace std;
int a,b,d,e,cnt,now,x,y,n;
char c;
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>c;
		if(c=='D'){
			x++;
		}else{
			y++;
		}
		if(x-y>1||x-y<-1){
			cout<<x<<":"<<y;
			return 0;
		}
	}
	cout<<x<<":"<<y;
	
}