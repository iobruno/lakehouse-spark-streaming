# Lakehouse + Spark Structured Streaming + Catalog

Spark application meant to continuously readStream the files on a local/hdfs path, and push it to Kafka topic.    
Then, use Kafka as the Source for Structured Streaming, and Sink it to Apache Iceberg Tables

## Tech Stack
- Scala 2.13 (JDK 11 / 17)
- Spark 3.3.2
- Confluent Kafka

## Up & Running

### Devel environments:

**1.** Start up Kafka Cluster and external dependencies with:

1.1. For a single-broker setup, without Confluent REST-Proxy, run

```shell
make minimal-setup 
```

1.2. Alternatively, for a multi-broker setup, with all features, run full-setup instead:
```shell
make full-setup
```

**2.** Build the fat-jar artifact with:
```shell
make fatjar
```

**3.** Then, to get the app running locally:
```shell
make run
```

## Todo:
- [x] Setup a local Kafka Cluster (Single and Multi-broker)
- [ ] Read Stream of files from local/hdfs path into Spark DataFrame
- [ ] Sink Spark DataFrame to Kafka
- [ ] Use Kafka as the Source for Spark Structured Streaming
- [ ] Sink Data to Delta/Iceberg Tables 
- [ ] Build a Data Catalog on top of Delta/Iceberg
