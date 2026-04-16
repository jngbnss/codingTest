#include <iostream>
#include <algorithm>

using namespace std;

typedef long long ll;

struct Point {
    ll x, y;
    // 좌표 비교를 위한 연산자 오버로딩
    bool operator<=(const Point& other) const {
        if (x != other.x) return x <= other.x;
        return y <= other.y;
    }
};

// CCW 함수
int ccw(Point a, Point b, Point c) {
    ll res = (a.x * b.y + b.x * c.y + c.x * a.y) - (b.x * a.y + c.x * b.y + a.x * c.y);
    if (res > 0) return 1;      // 반시계
    else if (res < 0) return -1; // 시계
    else return 0;               // 일직선
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    Point A, B, C, D;
    cin >> A.x >> A.y >> B.x >> B.y;
    cin >> C.x >> C.y >> D.x >> D.y;

    int abc = ccw(A, B, C);
    int abd = ccw(A, B, D);
    int cda = ccw(C, D, A);
    int cdb = ccw(C, D, B);

    // 두 선분이 일직선상에 있는 경우
    if (abc * abd == 0 && cda * cdb == 0) {
        // 정렬을 통해 비교하기 쉽게 만듦
        if (B <= A) swap(A, B);
        if (D <= C) swap(C, D);
        
        // 겹치는지 확인
        if (A <= D && C <= B) cout << 1 << "\n";
        else cout << 0 << "\n";
    }
    // 일반적인 교차 조건
    else if (abc * abd <= 0 && cda * cdb <= 0) {
        cout << 1 << "\n";
    }
    else {
        cout << 0 << "\n";
    }

    return 0;
}