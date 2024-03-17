## Maven

### Criar Projeto

![image](https://github.com/javajdk2023/j212032024/assets/130251409/6f07f9da-c392-411f-ac7b-174b562f452a)

### Configurar Nome do Projeto

![image](https://github.com/javajdk2023/j212032024/assets/130251409/669fb850-7191-411d-a326-ddba1671828d)

### Adicionar Nova Dependência

https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.14.0

![image](https://github.com/javajdk2023/j212032024/assets/130251409/6c60e3ce-c644-4db0-a1f4-8a701571de32)


### Configurar Versão do Java

![image](https://github.com/javajdk2023/j212032024/assets/130251409/309fdef9-97ba-4b0f-976c-9aae4aa13261)


### Versão Final

```
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.com.fuctura</groupId>
	<artifactId>aula1</artifactId>
	<version>0.0.1-SNAPSHOT</version>


	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<version>3.14.0</version>
		</dependency>
	</dependencies>
	
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.11.0</version>
				<configuration>
					<source>17</source>
					<target>17</target>
				</configuration>			
			</plugin>
		</plugins>
	</build>


</project>
```
