#include <string>
#include <vector>

using namespace std;

int gcd(int n,int m){
    if(n==0) return m;
    return gcd(m%n,n);
}

vector<int> solution(int n, int m) {
    vector<int> answer;
    answer.push_back(gcd(n,m));
    answer.push_back(n*(m/gcd(n,m)));
    return answer;
}