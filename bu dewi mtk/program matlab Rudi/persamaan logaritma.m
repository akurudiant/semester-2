close all;
clear all;
clc;

prompt = {'input nilai x :','input nilai a :','input nilai b :','input nilai c :'};
dlg_title = 'imput Variable';
data = inputdlg(prompt, dlg_title);
[x, a, b, c] = data{:};

x = str2double(x);
a = str2double(a);
b = str2double(b);
c = str2double(c);

pembilang = a*x^2 + b*x + c;
penyebut = 4*pi*x^2 + cos(x-2)*pembilang;

f = (log(pembilang) - sin(pembilang)) / penyebut;
msg = sprintf('hasil perhitungan f adalah %f',f);
msgbox(msg,'hasil perhitungan')