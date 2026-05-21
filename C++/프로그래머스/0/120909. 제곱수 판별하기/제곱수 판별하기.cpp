#include <string>
#include <vector>
#include<cmath>

using namespace std;

int solution(int n) {
    int answer = 2;
    int k  = sqrt(n);
    int y = k*k;
    if(y==n) answer = 1;
    return answer;
}