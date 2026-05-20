#include<iostream>
#include <string>
#include <vector>
#include<algorithm>
using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    int mid = array.size()/2;
    sort(array.begin(),array.end());
    answer = array[mid];
    return answer;
}