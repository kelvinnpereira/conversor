docker rmi kelvinnpereira/conversor-build
docker rmi kelvinnpereira/conversor-test
docker build --no-cache -t kelvinnpereira/conversor-build -f Dockerfile.build .
docker build --no-cache -t kelvinnpereira/conversor-test -f Dockerfile.test .
docker run --rm kelvinnpereira/conversor-build
docker run --rm kelvinnpereira/conversor-test