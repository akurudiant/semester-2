clear all;
clc;
x = 0: 0.05 : 2 *pi ;
y = sin (2*pi*x);
plot (x,y)
title('Grafik Fungsi y=sin(2\pix) ');
xlim ([0 2*pi]);
xlabel('x');
ylabel('y');