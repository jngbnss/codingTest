#include<bits/stdc++.h>
using namespace std;
vector<string>s(3);
int main(){
	for(int i=0;i<3;i++){
		cin>>s[i];
	}
	
	int n =0;
	for(int i=0;i<3;i++){
		if(isdigit(s[i][0])){
			n = stoi(s[i]) + (3-i);
			break;
		}
	}
	if(n%3==0){
		if(n%5==0) cout<<"FizzBuzz";
		else cout<<"Fizz";
	}else if(n%5==0) cout<<"Buzz";
	else cout<<n;
}
	