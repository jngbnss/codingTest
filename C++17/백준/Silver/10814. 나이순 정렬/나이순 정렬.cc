#include<bits/stdc++.h>
using namespace std;
int n,age;
string name;

struct Person{
	int age;
	string name;
	int order;
};

vector<Person>v;
bool cmp(Person a,Person b){
	if(a.age==b.age){
		return a.order<b.order;
	}
	return a.age<b.age;
}
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>age>>name;
		v.push_back({age,name,i});
	}
	sort(v.begin(),v.end(),cmp);
	
	for(auto &p:v){
		cout<<p.age<<' '<<p.name<<'\n';
	}
}