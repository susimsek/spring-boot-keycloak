# Spring Boot Keycloak 
> This is spring boot keycloak rest endpoint security example.
![Spring Boot Keycloak](https://techragesh.com/wp-content/uploads/2019/01/springboot-keycloak.png)
## Prerequisites

* Jdk 1.8
* Maven 3.x
* Docker 19.03.x
* Docker Compose 1.25.x

## Installation
```sh
sudo bash -c 'cat << EOF >> /etc/hosts
127.0.0.1 keycloak
EOF'
```

```sh
sudo chmod +x build.sh
```
```sh
./build.sh
```

```sh
docker-compose up -d
```

## Notes

> Keycloak access should be 'keycloak' instead of localhost

## Used Technologies

* Spring Boot 2.2.6
* Keycloak

