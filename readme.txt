descarga la imagen de docker.
docker pull postgres:latest

levantar este contenedor en docker.

docker run --name postgres-db -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=mi_basedatos -p 5432:5432   -v mi_volumen_postgres:/var/lib/postgresql/data -d postgres



