#include<bits/stdc++.h>
using namespace std;
int n,m,k,j,cnt;
	

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	cin>>j;
	int l = 1;
	int r = l+m-1;
	
	for(int i=0;i<j;i++){
		int next;
		cin>>next;
		if(next>r){
			int gap = next-r;
			cnt+= gap;
			r += gap;
			l += gap;
			r = min(r,n);
			l = min(l,n);
		}else if(next<l){
			int gap =l-next; 
			cnt+= gap;
			l-= gap;
			r-= gap;
			l = max(1,l);
			r = max(1,r);
		}
//		cout<<"l : "<<l<<",r : "<<r<<"cnt: "<<cnt<<'\n';
	}
	cout<<cnt;
}
	
	
