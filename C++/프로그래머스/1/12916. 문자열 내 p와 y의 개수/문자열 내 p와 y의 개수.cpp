#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    int cntp = 0;
    int cnty=0;
    bool answer = false;
    for(auto i:s){
        if(i=='p'||i=='P') cntp++;
        if(i=='y'||i=='Y') cnty++;
    }
    if(cntp==cnty) answer = true;


    return answer;
}