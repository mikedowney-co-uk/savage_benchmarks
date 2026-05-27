rem Takes 3m46  and returns 2500.000000008
rem Using 8 byte double precision
a# = 1
for i = 1 to 2499
a# = tan(atn(exp(log(sqr(a#*a#))))) + 1#
next i
print i, a#
