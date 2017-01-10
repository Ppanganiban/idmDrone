LIBS = -I/usr/include/libxml2 -lxml2 -g -pthread -lm -Wall
MODEL = ../tests/src-gen/model.xml
EXEC = generateur
GENEXEC = genere
BIN_PATH = bin
all: $(EXEC) $(GENEXEC)

debug: $(EXEC).o $(MODEL)
	gdb --args ./$(EXEC) $(MODEL) 

$(GENEXEC): genere.c init.c runtime.c at.c update.c
	 gcc -o $(BIN_PATH)/$(GENEXEC) $^ $(LIBS)

$(EXEC): $(EXEC).o $(MODEL)
	 ./$(BIN_PATH)/$(EXEC) $(MODEL)

$(EXEC).o: $(EXEC).c
	gcc -o $(BIN_PATH)/$(EXEC) $(EXEC).c $(LIBS)
	
clean:
	rm bin/*
	rm genere.c
	rm init.c
