close all;
clear all;
clc;
%===========UAS MATEMATIKA KOMPUTASI===========
%Nama : AHMAD RUDIYANTO
%nim  : 21157201114
%Ilmu Komputer  2021 B

disp('====Menghitung persamaan (f) dengan fungsi logaritma====');

x = input('masukkan nilai x = ');
a = input('masukkan nilai a = ');
b = input('masukkan nilai b = ');
c = input('masukkan nilai c = ');

pembilang = a*x^2 + b*x + c;
penyebut = 4*pi*x^2 + cos(x-2)*pembilang; 
f = (log(pembilang) - sin(pembilang)) / penyebut;
disp('====hasil persamaan f adalah');
f