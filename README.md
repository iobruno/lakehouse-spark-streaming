# Spark Structured Streaming (ETL) + Catalog

Spark application meant to continuously readStream the files on a local/hdfs path, and push it to Kafka topic.    
Then, use Kafka as the Source for Structured Streaming, and Sink it to Apache Iceberg Tables

## Tech Stack
- Scala 2.13 (JDK 11)
- Spark 3.3.2
- Confluent Kafka

## Todo:
- [x] Setup a local Kafka Cluster (Single and Multi-broker)
- [ ] Read Stream of files from local/hdfs path into Spark DataFrame
- [ ] Sink Spark DataFrame to Kafka
- [ ] Use Kafka as the Source for Spark Structured Streaming
- [ ] Sink Data to Delta/Iceberg Tables 
- [ ] Build a Data Catalog on top of Delta/Iceberg
