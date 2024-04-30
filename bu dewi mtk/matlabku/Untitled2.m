clear all;
clc;
x=input('masukkan x=')
y=tanda(x);
function y =tanda(x)
if x>0
    y=1
elseif x == 0
        y = 0
else
        y = -1
end 
