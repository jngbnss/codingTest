#include<bits/stdc++.h>
using namespace std;
int n,a,b,c,sum;
vector<int>v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	for(int i=0;i<3;i++){
		int temp;
		cin>>temp;
		v.push_back(temp);
		sum+=temp;
	}
	if(sum!=180){
		cout<<"Error";
		return 0;
	}
	bool Eq = true;
	for(auto i:v){
		if(i!=60){
			Eq = false;
			break;
		}
	}
	if(Eq) cout<<"Equilateral";
	else if(v[0]==v[1]) cout<<"Isosceles";
	else if(v[0]==v[2]) cout<<"Isosceles";
	else if(v[1]==v[2]) cout<<"Isosceles";
	else cout<<"Scalene";
	
}