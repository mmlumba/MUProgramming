male('John Washington').
male('Augustine Warner').
male('William Ball').
male('Lawrence Washington').
male('Joseph Ball').
male('Augustine Washington').
male('Butler Washington').
male('lawrence washington').
male('augustine washington').
male('George Washington').
male('Samuel Washington').
male('John Augustine Washington').
male('Charles Washington').
female('Anne Pope').
female('Mildred Reade').
female('Hannah Atheroid').
female('Mildred Warner').
female('Mary Johnson').
female('Jane Butler').
female('Jane Washington').
female('Mary Ball').
female('Betty Washington').
female('Mildred Washington').
female('Martha Dandrige').
father('John Washington','Lawrence Washington').
father('Augustine Warner','Mildred Warner').
father('William Ball','Joseph Ball').
father('Lawrence Washington','Augustine Washington').
father('Joseph Ball','Mary Ball').
father('Augustine Washington','Butler Washington').
father('Augustine Washington','lawrence washington').
father('Augustine Washington','augustine washington').
father('Augustine Washington','Jane Washington').
father('Augustine Washington','George Washington').
father('Augustine Washington','Betty Washington').
father('Augustine Washington','Samuel Washington').
father('Augustine Washington','John Augustine Washington').
father('Augustine Washington','Charles Washington').
father('Augustine Washington','Mildred Washington').
mother('Ann Pope','Lawrence Washington').
mother('Mildred Reade','Mildred Warner').
mother('Hannah Atheroid','Joseph Ball').
mother('Mildred Warner','Augustine Washington').
mother('Mary Johnson','Mary Ball').
mother('Jane Butler','Butler Washington').
mother('Jane Butler','lawrence washington').
mother('Jane Butler','augustine washington').
mother('Jane Butler','Jane Washington').
mother('Mary Ball','George Washington').
mother('Mary Ball','Betty Washington').
mother('Mary Ball','Samuel Washington').
mother('Mary Ball','John Augustine Washington').
mother('Mary Ball','Charles Washington').
mother('Mary Ball','Mildred Washington').
married('Ann Pope','John Washington').
married('Mildred Reade','Augustine Warner').
married('Hannah Atheroid','William Ball').
married('Mildred Warner','Lawrence Washington').
married('Mary Johnson','Joseph Ball').
married('Jane Butler','Augustine Washington').
married('Mary Ball','Augustine Washington').
married('Martha Dandrige','George Washington').
parent(X,Y,Z) :- father(X,Z),mother(Y,Z).
grandparent(X,Y,Z) :- parent(X,Y,V),father(V,Z);parent(X,Y,W),mother(W,Z).
greatgrandparent(X,Y,Z) :- grandparent(X,Y,T),father(T,Z);grandparent(X,Y,U),mother(U,Z).
%sibling(X,Y) :- mother(M,X),mother(M,Y),father(F,X),father(F,Y),not(X=Y).
sibling('Betty Washington','George Washington').
sibling('Samuel Washington','George Washington').
sibling('John Augustine Washington','George Washington').
sibling('Charles Washington','George Washington').
sibling('Mildred Washington','George Washington').
half('Butler Washington','George Washington').
half('lawrence washington','George Washington').
half('augustine washington','George Washington').
half('Jane Washington','George Washington').