import math as m
from time import perf_counter


def savage():
    a = 1
    for _ in range(2499):
        a = m.tan(m.atan(m.exp(m.log(m.sqrt(a * a))))) + 1
    return a


start = perf_counter()

for _ in range(1000):
    a = savage()

took = perf_counter() - start

print("took", took / 1000, "result=", a)