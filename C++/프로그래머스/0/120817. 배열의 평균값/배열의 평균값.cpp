#include <string>
#include <vector>

using namespace std;

double solution(vector<int> numbers) {
    double answer = 0;
    for(auto i:numbers){
        answer+=i;
    }
    return answer/numbers.size();
}