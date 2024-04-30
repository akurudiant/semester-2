close all;
clear all;
clc;
m=input('masukkan nilai m:')
n=input('masukkan nilai n:')
H=hilb(m,n)
function H=hilb(m,n)
for i = 1:n
    for j = 1:m
        H(i,j)=1/(i+j);
    end
end
end