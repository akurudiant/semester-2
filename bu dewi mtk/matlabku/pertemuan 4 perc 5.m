clear all
clc
x=linspace(0,2*pi,200),
subplot(2,2,1),
y1=cos(pi*x);
plot(x,y1)
xlim([0,2*pi])
title('Grafik fungsi y=sin\pi x')
subplot(2,2,2)
y2=cos(2*pi*x);
plot(x,y2)
xlim([0 2*pi])
title('Grafik Fungsi y = sin 2\pi x')
subplot(2,2,3)
y3=cos(3*pi*x)
plot(x,y3)
xlim([0 2*pi])
title ('Grafik fungsi y=sin 3\pi x')
subplot(2,2,4)
y4=cos(4*pi*x);
plot(x,y4)
xlim([0 2*pi])
title('Grafik fungsi y=sin 4\pi x')
