# Gestão da build com Maven

## Preparar o ambiente para usar Maven

    Depois de realizar a instalação do maven, para verificar a sua versão:
        $mvn --version
    
    Para criar um novo projeto em Maven:
        $mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
        $mvn package
        $java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App

    O pom.xml contém a configuração do projeto, sendo um ficheiro muito importante.

    Archtype - É um plugin que define e cria um projeto baseado num modelo base. É uma maneira consistente de criar templates de projetos da mesma maneira. Assim, fornece uma maneira rápida e fácil de criar um projeto.

    Groupid - Nome que identifica unicamente um projeto dentro dos diversos. Deve seguir as regras dos nomes dos pacotes de Java, podendo criar os subgrupos que forem necessários.

    Artifactid - Nome do ficheiro jar, ou seja, nome do projeto.

## MyWeatherRadar 

    Correr o projeto:
        $mvn clean package
        $mvn exec:java -Dexec.mainClass="weather.WeatherStarter"
    
    Gerar um site com a documentação:
        $mvn site

## Maven goals

    Um maven goal é uma tarefa específica, ou seja, qualquer Build phase é constituída por uma sequência de maven goals. 
    Ao correr uma build phase, todos os seus maven goals são corridos sempre com a mesma ordem.



