#include<bits/stdc++.h>
using namespace std;
int n,m;
int a,b,c;
int root[100004];

int find(int x){
	if(x==root[x]){
		return x;
	}
	return root[x] = find(root[x]);
}

void unite(int a,int b){
	a = find(a);
	b = find(b);
	if(a!=b){
		root[a] = b;
	}
}

struct Edge{
	int from,to,w;
	bool operator<(const Edge& other) const{
		return w < other.w;
	}
};

vector<Edge>v;
		

int main(){
	cin>>n>>m;
	long long sum = 0;
	for(int i=0;i<m;i++){
		cin>>a>>b>>c;
		v.push_back({a,b,c});
		sum+=c;
	}
	
	long long ret = 0;
	int cnt = 0;
	
	sort(v.begin(),v.end());
	
	
	for(int i=0;i<=n;i++){
		root[i] = i;
	}
	
	for(Edge e:v){
		int from = e.from;
		int to = e.to;
		int w = e.w;
		
		if(find(from)!=find(to)){
			cnt++;
			unite(from,to);
			ret+=w;
			if(cnt==n-1) break;
		}
	}
	if(cnt==n-1){
		cout<<sum-ret;
	}else{
		cout<<-1;
	}
			
	
	
}