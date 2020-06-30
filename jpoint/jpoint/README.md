# Build
mvn clean package && docker build -t com.airhacks/jpoint .

# RUN

docker rm -f jpoint || true && docker run -d -p 8080:8080 -p 4848:4848 --name jpoint com.airhacks/jpoint 

# System Test

Switch to the "-st" module and perform:

mvn compile failsafe:integration-test