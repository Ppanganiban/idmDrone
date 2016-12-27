LIBS = -I/usr/include/libxml2 -lxml2 -g -pthread
MODEL = ./model.xml
EXEC = generateur
GENEXEC = genere
all: $(EXEC) $(GENEXEC)

debug: $(EXEC).o $(MODEL)
	gdb --args ./$(EXEC) $(MODEL) 
$(GENEXEC): genere.c init.c runtime.c
	 gcc -o $(GENEXEC) $^

$(EXEC): $(EXEC).o $(MODEL)
	 ./$(EXEC) $(MODEL)

$(EXEC).o: $(EXEC).c
	gcc -o $(EXEC) $(EXEC).c $(LIBS)
	
clean:
	rm genere.c
	rm *.o
