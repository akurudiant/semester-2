clear all;
clc;
t=0:.01:2*pi;
subplot(2,2,1), plot(sin(t),cos(t))
subplot(2,2,2), plot(sin(t),cos(3*t))
subplot(2,2,3), plot(sin(t),cos(5*t))
subplot(2,2,4), plot(sin(t),cos(7*t))