LIBS = -I/usr/include/libxml2 -lxml2
MODEL = ../tests/src-gen/model.xml
EXEC = generateur
all: $(EXEC)

$(EXEC): $(EXEC).o $(MODEL)
	./$(EXEC) $(MODEL)

$(EXEC).o: $(EXEC).c
	gcc -o $(EXEC) $(EXEC).c $(LIBS)
	
clean:
	rm genere.c
	rm *.o
