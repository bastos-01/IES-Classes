# Lab1.3 - Introdução ao Docker

## Instalação do docker:

	Veirificação inicial do docker:
		$docker --version
		$docker run hello-world

	Verificar as imagens que estão a correr do docker:
		$docker ps --all

## Orientation and Setup:

	Exemplo de um rep "node-bulletin-board":
		$git clone https://github.com/dockersamples/node-bulletin-board
        $cd node-bulletin-board/bulletin-board-app   
	
	Build da imagem do Docker:
		$docker build --tag bulletinboard:1.0 .

	Correr a imagem criada como container:
		$docker run --publish 8000:8080 --detach --name bb bulletinboard:1.0
	
	Stop the container:
		$docker stop bb
	
	Remove the container:
		$docker rm bb (use opetion --force to stop and remove it)

## Listar todos os processos ativos do Docker:

	$docker ps --all

## Portainer:

	Correr um servidor portainer:
		$docker volume create portainer_data
    	$docker run -d -p 8000:8000 -p 9000:9000 --name=portainer --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer-ce

## PostgreSQL:

	Build da imagem do dockerfile:
		$docker build -t eg_postgresql .
	
	Correr o container:
		$docker run --rm -P --name pg_test eg_postgresql

	Container linking:
		$docker run --rm -t -i --link pg_test:pg eg_postgresql bash
		postgres@7ef98b1b7243:/$ psql -h $PG_PORT_5432_TCP_ADDR -p $PG_PORT_5432_TCP_PORT -d docker -U docker --password

	Conectar do meu localhost:
		$psql -h localhost -p 49153 -d docker -U docker --password

	O último passo, no meu caso, não consegui fazer pois dava-me sempre o erro (mesmo mudando o porto para o que o serviço estava publicado):
		
		psql: could not connect to server: Connection refused
		Is the server running on host "localhost" (127.0.0.1) and accepting
		TCP/IP connections on port 32771?
		could not connect to server: Cannot assign requested address
		Is the server running on host "localhost" (::1) and accepting
		TCP/IP connections on port 32771?
		
## Docker compose:

	Start na aplicação:
		$ docker-compose up
		$ docker-compose up -d (detached mode, corre em background)
	
	Ver quais estão a correr:
		$docker-compose ps
	
	Ver as environment variables no web service:
		$docker-compose run web env

	Ver lista de comandos possíveis:
		$docker-compose --help

	Parar o serviço:
		$ docker-compose stop

	Remover todos os containers e limpar os volumes:
		$ docker-compose down --volumes


## Relevância do comando "docker container ls --all":
	Lista todos os containers do docker criados e os seus IDs e portos, bem como outras informações relevantes

## Relevância da configuração de volumes para um container de base de dados:
	É uma forma de assegurar os dados guardados na base de dados, pois assim é seguro fazer reboot ao sistema. Apagando o container os dados não são apagados.



	
