circle(X,AREA) :- AREA is (X*X*3.14159).
square(X,AREA) :- AREA is (X*X).
rectangle(X,Y,AREA) :- AREA is (X*Y).
triangle(X,Y,AREA) :- AREA is (0.5*X*Y).
parallelogram(X,Y,AREA) :- AREA is (X*Y).
ellipse(X,Y,AREA) :- AREA is (3.14159*X*Y).
trapezoid(X,Y,Z,AREA) :- AREA is (0.5*(X+Y)*Z).
loop_area :- repeat,
write('Enter shape: '), read(A),
	(A == 'circle' ->
		write('Enter radius: '), read(R),
		circle(R,Y), write(Y), nl,
		write('Enter 1 to continue 0 to exit: '), read(C), (C==0);
	A == 'square',
		write('Enter size: '), read(R),
		square(R,Y), write(Y), nl,
		write('Enter 1 to continue 0 to exit: '), read(C), (C==0);
	A == 'rectangle', 
		write('Enter width: '), read(R),
		write('Enter height: '), read(S),
		rectangle(R,S,Y), write(Y), nl,
		write('Enter 1 to continue 0 to exit: '), read(C), (C==0);
	A == 'triangle', 
		write('Enter base: '), read(R),
		write('Enter height: '), read(S),
		triangle(R,S,Y), write(Y), nl,
		write('Enter 1 to continue 0 to exit: '), read(C), (C==0);
	A == 'parallelogram', 
		write('Enter base: '), read(R),
		write('Enter height: '), read(S),
		parallelogram(R,S,Y), write(Y), nl,
		write('Enter 1 to continue 0 to exit: '), read(C), (C==0);
	A == 'ellipse', 
		write('Enter major axis: '), read(R),
		write('Enter minor axis: '), read(S),
		ellipse(R,S,Y), write(Y), nl,
		write('Enter 1 to continue 0 to exit: '), read(C), (C==0);
	A == 'trapezoid', 
		write('Enter side one: '), read(R),
		write('Enter side two: '), read(S),
		write('Enter height: '), read(T),
		trapezoid(R,S,T,Y), write(Y), nl,
		write('Enter 1 to continue 0 to exit: '), read(C), (C==0)).