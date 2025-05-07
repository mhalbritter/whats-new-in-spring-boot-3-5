# What's new in Spring Boot 3.5

## How to export Docker container into a file

```
docker create docker.io/library/boot-three-five:0.0.1-SNAPSHOT
docker export $CONTAINER_ID -o out.tar
```
