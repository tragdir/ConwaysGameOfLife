CC = javac
RUN = java
GAME = GameOfLife
WINDOW = Window
BOARD = Board
ALL-CLASSES = $(GAME).class $(WINDOW).class $(BOARD).class
ALL-TARGETS = $(GAME) $(WINDOW) $(BOARD)

all: $(GAME).java $(WINDOW).java $(BOARD).java
	export DISPLAY=:0
	$(CC) $(GAME).java $(WINDOW).java $(BOARD).java

game: $(GAME).java
	$(CC) $(GAME).java

window: $(WINDOW).java
	$(CC) $(WINDOW).java

board: $(BOARD).java
	$(CC) $(BOARD).java

run: $(ALL-CLASSES)
	$(RUN) $(GAME)

