clear all
close all
clc                                                                             
y=input('masukkan y=')
if y<-1
    x=0
elseif y>=-1 & y<=0
        x = 1/2*(y+1)^2
elseif y>0 & y<=1
        x = 1-1/2*(1-y)^2
else
        disp('SALAHHHHH')
        x = 1
end
