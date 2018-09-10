************************************************************************
file with basedata            : mf25_.bas
initial value random generator: 1674310106
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  32
horizon                       :  251
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     30      0       26        2       26
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          3           5   6  13
   3        3          3           5  16  28
   4        3          2           7  12
   5        3          3           8   9  10
   6        3          3           8  11  22
   7        3          2          15  24
   8        3          3          12  14  19
   9        3          3          17  21  29
  10        3          2          15  18
  11        3          2          12  17
  12        3          2          15  18
  13        3          2          25  31
  14        3          2          18  23
  15        3          2          20  21
  16        3          2          17  21
  17        3          2          19  27
  18        3          2          26  27
  19        3          1          30
  20        3          1          30
  21        3          2          26  27
  22        3          1          29
  23        3          2          24  26
  24        3          1          30
  25        3          1          28
  26        3          1          31
  27        3          1          31
  28        3          1          29
  29        3          1          32
  30        3          1          32
  31        3          1          32
  32        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     1       9    0    0    9
         2     3       6    0    7    0
         3     7       3    0    0    6
  3      1     1       0    9    6    0
         2     8       0    8    0    6
         3    10       2    0    0    5
  4      1     4       0    8    5    0
         2     9       0    5    4    0
         3    10       2    0    2    0
  5      1     2       5    0    0    7
         2     8       5    0    3    0
         3     9       4    0    0    5
  6      1     2       0    9    6    0
         2     2       6    0    0   10
         3     5       0   10    4    0
  7      1     1       0    8    0   10
         2     3       0    5    3    0
         3     6      10    0    0   10
  8      1     7       0   10    9    0
         2     7       3    0    0   10
         3    10       3    0    9    0
  9      1     7       0    4    7    0
         2    10       1    0    0    7
         3    10       0    3    0    4
 10      1     6       0    8    9    0
         2     8       9    0    8    0
         3     9       9    0    0    4
 11      1     4       0    7    0    6
         2    10       9    0    5    0
         3    10       4    0    0    5
 12      1     3       4    0    9    0
         2     4       0    9    0    9
         3     9       0    8    0    8
 13      1     2       0    9    0    4
         2     3       9    0    0    4
         3    10       0    3    0    1
 14      1     2       6    0    6    0
         2     3       0   10    0    5
         3     4       6    0    0    4
 15      1     4       8    0    7    0
         2     7       8    0    4    0
         3    10       7    0    0    6
 16      1     2       6    0    0    5
         2     6       4    0    0    4
         3     8       3    0    2    0
 17      1     9       0    4   10    0
         2     9       0    5    0    3
         3    10       3    0   10    0
 18      1     2       0    6    0    2
         2     5       0    3    0    2
         3     6       0    1    5    0
 19      1     1       7    0    0    5
         2     3       0    6    9    0
         3     5       0    5    4    0
 20      1     4       0    6    6    0
         2     4       6    0    0    6
         3     8       0    7    0    3
 21      1     3       6    0    0    4
         2     4       0    8    0    2
         3     8       6    0    0    2
 22      1     1       8    0    6    0
         2     3       2    0    0    8
         3     4       0    1    5    0
 23      1     2       8    0    0    3
         2     5       7    0    7    0
         3     9       5    0    0    2
 24      1     6       0    9    0    7
         2     7       8    0    5    0
         3    10       0    9    5    0
 25      1     3       0    9    5    0
         2     9       0    7    0    7
         3     9       0    6    4    0
 26      1     2       0    5    0    3
         2     9       0    4    3    0
         3    10       8    0    2    0
 27      1     2       5    0    0    6
         2    10       0   10    0    4
         3    10       3    0    7    0
 28      1     7       9    0    0    8
         2     8       8    0    7    0
         3     9       8    0    5    0
 29      1     4       0   10    0    4
         2     7       0    8    6    0
         3     9       0    7    5    0
 30      1     3       0    3    0    4
         2     7       3    0    0    4
         3     9       2    0   10    0
 31      1     4       7    0    9    0
         2     6       0    9    0    8
         3     8       2    0    8    0
 32      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   16   15  179  176
************************************************************************
