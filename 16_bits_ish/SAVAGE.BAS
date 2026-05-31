rem Takes 7.3s and returns 2726.9
rem using 4 byte single precision
a = 1
for i = 1 to 2499
a = tan(atn(exp(log(sqr(a*a))))) + 1
next i
print i,a
