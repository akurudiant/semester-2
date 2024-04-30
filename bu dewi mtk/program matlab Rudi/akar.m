close all;
clear all;
clc;
a=input('masukkan nilai a=');
b=input('masukkan nilai b=');
c=input('masukkan nilai c=');
akar1=(-b+sqrt(b*2-4*c))/(2*a);
akar2=(-b-sqrt(b*2-4*c))/(2*a);
akarnya=[akar1;akar2]