clear all;
clc;
x=-6:0.2:6;
y=1/sqrt(pi)*exp(-x.^2/2);
plot(x,y,'dr:');