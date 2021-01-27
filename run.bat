javac -classpath lib/* -d ./bin ./src/restApi/*.java
javac -classpath lib/* -d ./bin ./src/soapTestRunner/*.java
java -cp bin;lib/* org.testng.TestNG testng.xml
