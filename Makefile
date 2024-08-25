clean:
	rm -rf *.class
	rm -rf challenges/*/*.class
	rm -rf challenges/*.class
	rm -rf constant/*.class

compile:
	javac Hello.java

run:
	java Hello