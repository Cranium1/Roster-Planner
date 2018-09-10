************************************************************************
file with basedata            : md355_.bas
initial value random generator: 1810649233
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  22
horizon                       :  170
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     20      0       23        1       23
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          2           5   6
   3        3          3          11  13  16
   4        3          3           7  10  19
   5        3          3           7   8  17
   6        3          3           7   8   9
   7        3          1          15
   8        3          3          18  19  20
   9        3          3          11  13  16
  10        3          1          18
  11        3          1          12
  12        3          3          14  17  21
  13        3          2          15  21
  14        3          1          15
  15        3          1          20
  16        3          2          18  20
  17        3          1          19
  18        3          1          21
  19        3          1          22
  20        3          1          22
  21        3          1          22
  22        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     2       0    1    9    7
         2     3       2    0    4    7
         3    10       1    0    4    6
  3      1     5       0    5    6   10
         2     6       4    0    5   10
         3     7       2    0    3    9
  4      1     6       0    6    6    9
         2     8       6    0    5    8
         3    10       5    0    4    8
  5      1     1       0    9    5    6
         2     5       8    0    5    5
         3     9       7    0    3    4
  6      1     3       0    5    9    2
         2     6       0    5    6    2
         3    10       4    0    4    1
  7      1     1       0    2    3    7
         2     5       7    0    3    5
         3     6       6    0    3    4
  8      1     4       0    8    7    8
         2     7       7    0    7    5
         3    10       7    0    6    3
  9      1     3       9    0    5    6
         2     8       0    3    4    5
         3     8       8    0    4    5
 10      1     2       9    0   10    6
         2     8       0    7   10    6
         3    10       0    6   10    5
 11      1     3       0    5    5    2
         2     7       0    5    4    2
         3     8       9    0    1    2
 12      1     2       5    0    6    7
         2     8       0    7    6    6
         3    10       0    6    6    5
 13      1     6       0    8    9    4
         2     9       6    0    7    4
         3    10       0    5    6    3
 14      1     4       0    3    8    9
         2     8       8    0    3    8
         3     8       0    3    6    9
 15      1     3       0    4    4   10
         2     4       9    0    3    8
         3     8       6    0    3    5
 16      1     3       7    0    6    7
         2     4       7    0    4    7
         3     8       0    4    3    6
 17      1     3       0    6    8   10
         2     5       0    5    8    9
         3     6       5    0    7    8
 18      1     2       5    0    7    8
         2     5       0    7    4    7
         3     7       0    7    2    7
 19      1     7       0    6   10    7
         2     7       8    0    7    7
         3     8       7    0    2    7
 20      1     2       0    8    8    9
         2     8       0    5    4    5
         3     9       4    0    3    3
 21      1     1       0    5    7    8
         2     2       0    4    4    8
         3     8       0    4    4    7
 22      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   27   20   95  115
************************************************************************
