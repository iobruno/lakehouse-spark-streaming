# Lakehouse + Spark Structured Streaming + Catalog

[![CC BY-SA 4.0][cc-by-sa-shield]][cc-by-sa]

This is a pet project meant to explore Apache Icerberg Tables to build a Lakehouse, Spark Structured Streaming using Minio,  
Kafka and Iceberg as Sources and Sinks for data  And finally build a Data Catalog on top of the Iceberg Tables using a Hive backend

## Tech Stack
- Scala 2.13 (JDK 11 / 17)
- Spark 3.3.2
- Confluent Kafka
- Apache Iceberg
- Minio (Object Storage)


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


## License

This work is licensed under a
[Creative Commons Attribution-ShareAlike 4.0 International License][cc-by-sa].

[![CC BY-SA 4.0][cc-by-sa-image]][cc-by-sa]

[cc-by-sa]: http://creativecommons.org/licenses/by-sa/4.0/
[cc-by-sa-image]: https://licensebuttons.net/l/by-sa/4.0/88x31.png
[cc-by-sa-shield]: https://img.shields.io/badge/License-CC%20BY--SA%204.0-lightgrey.svg