clear all
clc
x= 0: 0.05:2*pi;
y=sin(2*pi*x);
plot(x,y)
title('Grafik Fungsi y=sin(2\pi x)');
xlim([0 2*xpi])
xlabel('x');
ylabel('y');