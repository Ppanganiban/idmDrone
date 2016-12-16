LIBS = -I/usr/include/libxml2 -lxml2 -g
MODEL = ./model.xml
EXEC = generateur

all: $(EXEC)

debug: $(EXEC).o $(MODEL)
	gdb --args ./$(EXEC) $(MODEL) 
$(EXEC): $(EXEC).o $(MODEL)
	 ./$(EXEC) $(MODEL)

$(EXEC).o: $(EXEC).c
	gcc -o $(EXEC) $(EXEC).c $(LIBS)
	
clean:
	rm genere.c
	rm *.o
