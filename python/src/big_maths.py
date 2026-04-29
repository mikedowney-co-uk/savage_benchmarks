from mpmath import mp
from time import perf_counter


def savage2():
    a = 1
    for _ in range(2499):
        a = mp.tan(mp.atan(mp.exp(mp.log(mp.sqrt(a * a))))) + 1
    return a


start = perf_counter()

mp.dps = 100
for _ in range(100):
    a = savage2()

took = perf_counter() - start

print("took", took / 100, "result=", a)