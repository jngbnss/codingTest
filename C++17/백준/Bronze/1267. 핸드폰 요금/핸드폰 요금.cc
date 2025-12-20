#include<bits/stdc++.h>
using namespace std;
int n,a,b,c;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		int time;
		cin>>time;
		int temp = time;
		int cnt = temp/30;
		a+=cnt;
		if(30*cnt<=temp){
			a++;
		}
		
		cnt = temp/60;
		b+=cnt;
		if(60*cnt<=temp){
			b++;
		}
//		cout<<b<<'\n';
		
	}
	int A = a*10;
	int B = b*15;
	
	if(A<B) cout<<"Y "<<A;
	else if(A>B) cout<<"M "<<B;
	else cout<<"Y M "<<A;


}