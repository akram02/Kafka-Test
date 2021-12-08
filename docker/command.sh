aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/r3g6z8h3
docker build -t kafka-java:0.0.3 .
docker tag kafka-java:0.0.3 public.ecr.aws/r3g6z8h3/kafka-java:0.0.3
docker push public.ecr.aws/r3g6z8h3/kafka-java:0.0.3