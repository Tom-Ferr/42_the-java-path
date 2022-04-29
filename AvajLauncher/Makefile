
DIR		=	srcs/

FILES	=	Main.java Aircraft.java Ballon.java Flyable.java Helicopter.java JetPlane.java\
			Coordinates.java

SRCS	=	$(addprefix ${DIR}, ${FILES})

CLSS	=	${SRCS:.java=.class}


%.class:	%.java
			javac $<

all:		${CLSS}
			java -classpath ${DIR} Main

clean:
			rm -fr ${CLSS}

re:			clean all