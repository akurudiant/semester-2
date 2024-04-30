clear all
clc
x=linspace(0,2*pi,200),
y1=cos(pi*x);
y2=cos(2*pi*x);
y3=cos(3*pi*x)
y4=cos(4*pi*x);
xlim([0 2*pi])
plot (x,y1,x,y2,x,y3,x,y4)
hold on