clear all
clc
x=linspace(0,2*pi,200),
y1=cos(pi*x);
y2=cos(2*pi*x);
y3=cos(3*pi*x)
y4=cos(4*pi*x);
plot(x,y1)
hold on
plot(x,y2)
plot(x,y3)
plot(x,y4)
xlim([0 2*pi])
hold off