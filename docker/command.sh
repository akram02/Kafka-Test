docker build -t kafka-java:0.0.1 .
docker tag kafka-java:0.0.1 825783678861.dkr.ecr.ap-southeast-1.amazonaws.com/kafka-java:0.0.1
docker push 825783678861.dkr.ecr.ap-southeast-1.amazonaws.com/kafka-java:0.0.1