clear all
close all
clc
pilihan = input ('masukkan nilai 1, atau 2,atau 3 :')
x = -pi:0.01:pi;
switch pilihan
    case 1 
        plot (x,sin(x))
    case 2
        plot(x,cos(x));
    case 3
        plot(x,sin(x),x,cos(x))
    otherwise
        disp('TIDAK ADA PILIHAN')
end