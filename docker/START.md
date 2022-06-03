```
docker build --tag elasticsearch:laster ./docker/.
```

```
docker network create elastic
```

```
docker run -d --name es01 --net elastic -p 9200:9200 -p 9300:9300 -t elasticsearch:laster 
```

```
docker run -d --name es01 --net elastic -p 9200:9200 -p 9300:9300 -e ELASTIC_PASSWORD="1234" -it docker.elastic.co/elasticsearch/elasticsearch:8.2.2
```

```
docker cp es01:/usr/share/elasticsearch/config/certs/http_ca.crt .
```

```
curl --cacert http_ca.crt -u elastic https://localhost:9200
```

```
docker container exec -it es01 bash
```


```
docker pull docker.elastic.co/kibana/kibana:7.3.1

docker run -d --network elastic --link es01 --name elk-k -p 5601:5601 -t docker.elastic.co/kibana/kibana:7.3.1
```


```
 docker pull docker.elastic.co/logstash/logstash:7.3.1
 
 docker run -d --network elastic --link es01 --name elk-l -p 5044:5044  -t docker.elastic.co/logstash/logstash:7.3.1
```
