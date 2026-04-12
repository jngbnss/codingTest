#include<bits/stdc++.h>
using namespace std;
int a,b,d,e,cnt,now,x=1,y=1,n;
char c;
int main(){
	cin>>n>>a>>b;
	for(int i=0;i<n;i++){
		x+=a;
		y+=b;
		
		if(x<y){
			swap(x,y);
		}
		if(x==y){
			y--;
		}
//		cout<<x<<' '<<y<<'\n';
	}
	cout<<x<<' '<<y<<'\n';
	
}