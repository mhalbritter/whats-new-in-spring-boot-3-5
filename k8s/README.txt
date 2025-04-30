1. k3d cluster create mycluster --registry-create mycluster-registry
2. docker ps | grep -i registry
3. docker tag docker.io/library/boot-three-five:0.0.1-SNAPSHOT localhost:38345/library/boot-three-five:0.0.1-SNAPSHOT
4. docker push localhost:38345/library/boot-three-five:0.0.1-SNAPSHOT
5. Update port in deployment.yaml
5. kubectl apply -f deployment.yaml
