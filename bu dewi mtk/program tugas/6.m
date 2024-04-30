clear all;
clc;
a=[6 8 3 4;4 7 6 9;5 9 7 2]
a(3,3)
a(1:3,3)
a(2,:)
a(:,4)
a(2,:)=[]
a(:,1)=[]
a(end,end-1)
a(2,end-2:end-1)
a(end-3:end,end-1:end)
a(end-2,:)
