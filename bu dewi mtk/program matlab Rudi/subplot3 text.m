close all;
clear all;
clc;
t =0:.1:2*pi;
y1 = sin(2*t);
y2 = cos(2*t);
plot(t,y1,t,y2)
xlabel('0 \leq \theta < 2\pi')
ylabel('sin 2\theta, cos 2*\theta')
text (1,cos(0.5),'kosinus')
text(3,sin(1),'sinus')
axis tight