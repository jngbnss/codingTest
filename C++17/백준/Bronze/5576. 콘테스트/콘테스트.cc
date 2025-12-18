#include<bits/stdc++.h>
using namespace std;
int n,temp,y,x;
vector<int>a,b;

int main(){
	for(int i=0;i<10;i++){
		cin>>temp;
		a.push_back(temp);
	}
	
	for(int i=0;i<10;i++){
		cin>>temp;
		b.push_back(temp);
	}
	
	sort(a.rbegin(),a.rend());
	sort(b.rbegin(),b.rend());
	for(int i=0;i<3;i++){
		y+=a[i];
		x+=b[i];
	}
	cout<<y<<' '<<x;
}
		