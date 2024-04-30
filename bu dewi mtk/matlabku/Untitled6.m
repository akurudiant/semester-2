clear all
close all
clc                                                                             
x=input('masukkan x=')
y=tanda(x);
function y =tanda(x)
if x<0
    y=0
elseif x<=x & x<=1
        y = x
elseif x<=x & x<=2
        y = 2-x
else
        y = -1
end
end
