#include<bits/stdc++.h>
using namespace std;
int c,n,temp;

int main(){
	cin>>c;
	while(c--){
		cin>>n;
		vector<int>v;
		int sum = 0;
		for(int i=0;i<n;i++){
			cin>>temp;
			sum+=temp;
			v.push_back(temp);
		}
		int avg=sum/n;
		int cnt=0;
		for(int i=0;i<n;i++){
			if(v[i]>avg) cnt++;
		}
			
		cout<<fixed<<setprecision(3)<<(double)(100*cnt)/n<<"%"<<'\n';
	}
}