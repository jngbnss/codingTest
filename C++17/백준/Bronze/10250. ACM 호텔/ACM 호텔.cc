#include<bits/stdc++.h>
using namespace std;
int t,h,w,n;

int main(){
	cin>>t;
	while(t--){
		cin>>h>>w>>n;
		int floor =(n%h);
		
		int door = n/h;
		if(floor == 0 ){
			floor = h;
		}else door++;
		cout<<floor*100+door<<'\n';
	}
}