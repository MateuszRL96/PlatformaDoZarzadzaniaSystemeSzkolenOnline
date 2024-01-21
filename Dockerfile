FROM ubuntu:latest
LABEL authors="matik"

ENTRYPOINT ["top", "-b"]

# Użyj oficjalnego obrazu MySQL
FROM mysql:latest

# Ustaw dane dostępowe do bazy danych
ENV MYSQL_ROOT_PASSWORD=root-password
ENV MYSQL_DATABASE=my-database
ENV MYSQL_USER=my-user
ENV MYSQL_PASSWORD=my-password

# Skopiuj skrypt inicjalizacyjny do kontenera
COPY ./init.sql /docker-entrypoint-initdb.d/

# Otwórz porty
EXPOSE 3306
