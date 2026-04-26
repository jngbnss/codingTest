import sys
a, b = map(int, sys.stdin.readline().split())

q, r = divmod(a, b)

# 나머지가 0보다 작으면 (b가 음수일 때 발생 가능)
if r < 0:
    # 나머지에 |b|를 더하고 몫에 1을 더해줌 (b가 음수이므로)
    q += 1
    r -= b

print(q)
print(r)