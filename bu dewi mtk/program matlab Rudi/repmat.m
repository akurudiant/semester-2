close all;
clear all;
clc;
a=[2 2 1 1 ; 1 3 8 7]
b=[a;a.*a; a+2*a; [0 0 0 1;1 0 0 0]]
c=repmat(a,3,2)
d=repmat(b,3,2)