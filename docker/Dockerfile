FROM docker.elastic.co/elasticsearch/elasticsearch:7.10.0

ENV discovery.type single-node

ENV ELASTIC_PASSWORD 1234

# 한국어 분석기 nori 설치
RUN /usr/share/elasticsearch/bin/elasticsearch-plugin install --batch analysis-nori
